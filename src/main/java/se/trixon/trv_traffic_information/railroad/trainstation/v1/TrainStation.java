//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:42:27 PM UTC 
//


package se.trixon.trv_traffic_information.railroad.trainstation.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrainStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainStation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Advertised" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AdvertisedLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdvertisedShortLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountyNo" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Geometry" type="{}Geometry" minOccurs="0"/&gt;
 *         &lt;element name="LocationInformationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlatformLine" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Prognosticated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainStation", propOrder = {
    "advertised",
    "advertisedLocationName",
    "advertisedShortLocationName",
    "countryCode",
    "countyNo",
    "deleted",
    "geometry",
    "locationInformationText",
    "locationSignature",
    "modifiedTime",
    "platformLine",
    "prognosticated"
})
public class TrainStation {

    @XmlElement(name = "Advertised")
    protected Boolean advertised;
    @XmlElement(name = "AdvertisedLocationName")
    protected String advertisedLocationName;
    @XmlElement(name = "AdvertisedShortLocationName")
    protected String advertisedShortLocationName;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "CountyNo", type = Integer.class)
    protected List<Integer> countyNo;
    @XmlElement(name = "Deleted")
    protected Boolean deleted;
    @XmlElement(name = "Geometry")
    protected Geometry geometry;
    @XmlElement(name = "LocationInformationText")
    protected String locationInformationText;
    @XmlElement(name = "LocationSignature")
    protected String locationSignature;
    @XmlElement(name = "ModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTime;
    @XmlElement(name = "PlatformLine")
    protected List<String> platformLine;
    @XmlElement(name = "Prognosticated")
    protected Boolean prognosticated;

    /**
     * Gets the value of the advertised property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Sets the value of the advertised property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Gets the value of the advertisedLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisedLocationName() {
        return advertisedLocationName;
    }

    /**
     * Sets the value of the advertisedLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisedLocationName(String value) {
        this.advertisedLocationName = value;
    }

    /**
     * Gets the value of the advertisedShortLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvertisedShortLocationName() {
        return advertisedShortLocationName;
    }

    /**
     * Sets the value of the advertisedShortLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvertisedShortLocationName(String value) {
        this.advertisedShortLocationName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countyNo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyNo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyNo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCountyNo() {
        if (countyNo == null) {
            countyNo = new ArrayList<Integer>();
        }
        return this.countyNo;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the geometry property.
     * 
     * @return
     *     possible object is
     *     {@link Geometry }
     *     
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * Sets the value of the geometry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geometry }
     *     
     */
    public void setGeometry(Geometry value) {
        this.geometry = value;
    }

    /**
     * Gets the value of the locationInformationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationInformationText() {
        return locationInformationText;
    }

    /**
     * Sets the value of the locationInformationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationInformationText(String value) {
        this.locationInformationText = value;
    }

    /**
     * Gets the value of the locationSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSignature() {
        return locationSignature;
    }

    /**
     * Sets the value of the locationSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSignature(String value) {
        this.locationSignature = value;
    }

    /**
     * Gets the value of the modifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedTime() {
        return modifiedTime;
    }

    /**
     * Sets the value of the modifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedTime(XMLGregorianCalendar value) {
        this.modifiedTime = value;
    }

    /**
     * Gets the value of the platformLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platformLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlatformLine() {
        if (platformLine == null) {
            platformLine = new ArrayList<String>();
        }
        return this.platformLine;
    }

    /**
     * Gets the value of the prognosticated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrognosticated() {
        return prognosticated;
    }

    /**
     * Sets the value of the prognosticated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrognosticated(Boolean value) {
        this.prognosticated = value;
    }

}
