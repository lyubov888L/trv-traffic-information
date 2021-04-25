//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:44:43 PM UTC 
//


package se.trixon.trv_traffic_information.road.surface.measurementdata100.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESULT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RESULT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasurementData100" type="{}MeasurementData100" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ERROR" type="{}ERROR" minOccurs="0"/&gt;
 *         &lt;element name="INFO" type="{}INFO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RESULT", propOrder = {
    "measurementData100",
    "error",
    "info"
})
public class RESULT {

    @XmlElement(name = "MeasurementData100")
    protected List<MeasurementData100> measurementData100;
    @XmlElement(name = "ERROR")
    protected ERROR error;
    @XmlElement(name = "INFO")
    protected INFO info;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the measurementData100 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementData100 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementData100().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementData100 }
     * 
     * 
     */
    public List<MeasurementData100> getMeasurementData100() {
        if (measurementData100 == null) {
            measurementData100 = new ArrayList<MeasurementData100>();
        }
        return this.measurementData100;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ERROR }
     *     
     */
    public ERROR getERROR() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERROR }
     *     
     */
    public void setERROR(ERROR value) {
        this.error = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link INFO }
     *     
     */
    public INFO getINFO() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFO }
     *     
     */
    public void setINFO(INFO value) {
        this.info = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
