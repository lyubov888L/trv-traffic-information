//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:34:40 PM UTC 
//


package se.trixon.trv_traffic_information.railroad.railcrossing.v1_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for geometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geometry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SWEREF99TM" type="{}WKT_SWEREF99TM" minOccurs="0"/&gt;
 *         &lt;element name="WGS84" type="{}WKT_WGS84" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geometry", propOrder = {
    "sweref99TM",
    "wgs84"
})
public class Geometry {

    @XmlElement(name = "SWEREF99TM")
    protected String sweref99TM;
    @XmlElement(name = "WGS84")
    protected String wgs84;

    /**
     * Gets the value of the sweref99TM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWEREF99TM() {
        return sweref99TM;
    }

    /**
     * Sets the value of the sweref99TM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWEREF99TM(String value) {
        this.sweref99TM = value;
    }

    /**
     * Gets the value of the wgs84 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWGS84() {
        return wgs84;
    }

    /**
     * Sets the value of the wgs84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWGS84(String value) {
        this.wgs84 = value;
    }

}
