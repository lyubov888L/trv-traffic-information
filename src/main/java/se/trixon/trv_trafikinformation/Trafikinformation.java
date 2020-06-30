/*
 * Copyright 2020 Patrik Karlström.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.trixon.trv_trafikinformation;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Patrik Karlström
 */
public class Trafikinformation {

    private final HashMap<Class, Unmarshaller> mClassToUnmarshaller = new HashMap<>();
    private final HttpClient mHttpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
    private final Jarnvag mJarnvag = new Jarnvag();
    private String mKey = "";
    private int mTimeout = 5000;
    private String mUrl = "https://api.trafikinfo.trafikverket.se/v2/data.xml";
    private final String requestTemplate = "<REQUEST>\n"
            + "  <LOGIN authenticationkey=\"%s\" />\n"
            + "  <QUERY%s>\n"
            + "    %s\n"
            + "  </QUERY>\n"
            + "</REQUEST>";

    public Trafikinformation() {
    }

    public TreeMap<String, String> createQueryAttributes() {
        return new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public HttpResponse<String> getHttpResponse(String requestString) throws IOException, InterruptedException {
        Logger.getLogger(Trafikinformation.class.getName()).log(Level.INFO, requestString);

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestString))
                .uri(URI.create(mUrl))
                .header("Content-Type", "text/xml")
                .timeout(Duration.ofMillis(mTimeout))
                .build();

        HttpResponse<String> response = mHttpClient.send(request, HttpResponse.BodyHandlers.ofString());

        return response;
    }

    public String getKey() {
        return mKey;
    }

    public <T> T getResponse(Class<T> clazz, File file) throws IOException, InterruptedException, JAXBException {
        return ((JAXBElement<T>) getUnmarshaller(clazz).unmarshal(file)).getValue();
    }

    public <T> T getResponse(Class<T> clazz, String queryDetails, File file) throws IOException, InterruptedException, JAXBException {
        HttpResponse<String> r = getHttpResponse(queryDetails);
        String s = r.body();

        if (file != null) {
            Files.writeString(file.toPath(), s, Charset.forName("utf-8"), new OpenOption[]{java.nio.file.StandardOpenOption.TRUNCATE_EXISTING, java.nio.file.StandardOpenOption.CREATE});
        }

        return ((JAXBElement<T>) getUnmarshaller(clazz).unmarshal(new StringReader(s))).getValue();
    }

    public int getTimeout() {
        return mTimeout;
    }

    public String getUrl() {
        return mUrl;
    }

    public Jarnvag jarnvag() {
        return mJarnvag;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public void setTimeout(int timeout) {
        mTimeout = timeout;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    private String getRequest(TreeMap<String, String> queryAttributes, String objecttype, String schemaversion, String queryDetails) {
        if (queryAttributes == null) {
            queryAttributes = createQueryAttributes();
        }
        queryAttributes.putIfAbsent("objecttype", objecttype);
        queryAttributes.putIfAbsent("schemaversion", schemaversion);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : queryAttributes.entrySet()) {
            sb.append(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }

        return String.format(requestTemplate, mKey, sb.toString(), queryDetails);
    }

    private Unmarshaller getUnmarshaller(Class clazz) {
        Unmarshaller unmarshaller = mClassToUnmarshaller.computeIfAbsent(clazz, k -> {
            try {
                return JAXBContext.newInstance(k).createUnmarshaller();
            } catch (JAXBException ex) {
                Logger.getLogger(Trafikinformation.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        });

        return unmarshaller;
    }

    public class Jarnvag {

        public List<se.trixon.trv_trafikinformation.jarnvag.trainmessage.v1_6.RESULT> getTrainMessageResults(TreeMap<String, String> queryAttributes, String queryDetails, File file) throws IOException, InterruptedException, JAXBException {
            return getResponse(se.trixon.trv_trafikinformation.jarnvag.trainmessage.v1_6.RESPONSE.class,
                    getRequest(queryAttributes, "TrainMessage", "1.6", queryDetails), file).getRESULT();
        }

        public List<se.trixon.trv_trafikinformation.jarnvag.trainmessage.v1_6.RESULT> getTrainMessageResults(File file) throws IOException, InterruptedException, JAXBException {
            return getResponse(se.trixon.trv_trafikinformation.jarnvag.trainmessage.v1_6.RESPONSE.class,
                    file).getRESULT();
        }

        public List<se.trixon.trv_trafikinformation.jarnvag.trainstation.v1.RESULT> getTrainStationResults(TreeMap<String, String> queryAttributes, String queryDetails, File file) throws IOException, InterruptedException, JAXBException {
            return getResponse(se.trixon.trv_trafikinformation.jarnvag.trainstation.v1.RESPONSE.class,
                    getRequest(queryAttributes, "TrainStation", "1", queryDetails), file).getRESULT();
        }

        public List<se.trixon.trv_trafikinformation.jarnvag.trainstation.v1.RESULT> getTrainStationResults(File file) throws IOException, InterruptedException, JAXBException {
            return getResponse(se.trixon.trv_trafikinformation.jarnvag.trainstation.v1.RESPONSE.class,
                    file).getRESULT();
        }
    }
}
