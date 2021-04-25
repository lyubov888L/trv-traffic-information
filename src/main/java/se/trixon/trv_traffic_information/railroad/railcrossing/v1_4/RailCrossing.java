//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.29 at 02:34:40 PM UTC 
//


package se.trixon.trv_traffic_information.railroad.railcrossing.v1_4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RailCrossing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailCrossing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataLastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LevelCrossingId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RailwayRouteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadRouteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfTracks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperatingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrainFlow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PortalHeightLeft" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PortalHeightRight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RoadNameAlternative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadNameOfficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadProfileCrossCurve" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadProfileCrest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadProfileSteepSlope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadProtectionAddition" type="{}RoadProtectionAddition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoadProtectionBase" type="{}RoadProtectionBase" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackPortion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Meter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Kilometer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Geometry" type="{}geometry" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailCrossing", propOrder = {
    "dataLastUpdated",
    "deleted",
    "objectId",
    "levelCrossingId",
    "railwayRouteId",
    "roadRouteId",
    "numberOfTracks",
    "operatingMode",
    "trainFlow",
    "portalHeightLeft",
    "portalHeightRight",
    "roadNameAlternative",
    "roadNameOfficial",
    "roadProfileCrossCurve",
    "roadProfileCrest",
    "roadProfileSteepSlope",
    "roadProtectionAddition",
    "roadProtectionBase",
    "trackPortion",
    "meter",
    "kilometer",
    "geometry",
    "modifiedTime"
})
public class RailCrossing {

    @XmlElement(name = "DataLastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataLastUpdated;
    @XmlElement(name = "Deleted")
    protected Boolean deleted;
    @XmlElement(name = "ObjectId")
    protected Integer objectId;
    @XmlElement(name = "LevelCrossingId")
    protected int levelCrossingId;
    @XmlElement(name = "RailwayRouteId")
    protected String railwayRouteId;
    @XmlElement(name = "RoadRouteId")
    protected String roadRouteId;
    @XmlElement(name = "NumberOfTracks")
    protected Integer numberOfTracks;
    @XmlElement(name = "OperatingMode")
    protected String operatingMode;
    @XmlElement(name = "TrainFlow")
    protected Integer trainFlow;
    @XmlElement(name = "PortalHeightLeft")
    protected Double portalHeightLeft;
    @XmlElement(name = "PortalHeightRight")
    protected Double portalHeightRight;
    @XmlElement(name = "RoadNameAlternative")
    protected String roadNameAlternative;
    @XmlElement(name = "RoadNameOfficial")
    protected String roadNameOfficial;
    @XmlElement(name = "RoadProfileCrossCurve")
    protected Integer roadProfileCrossCurve;
    @XmlElement(name = "RoadProfileCrest")
    protected Integer roadProfileCrest;
    @XmlElement(name = "RoadProfileSteepSlope")
    protected Integer roadProfileSteepSlope;
    @XmlElement(name = "RoadProtectionAddition")
    protected List<RoadProtectionAddition> roadProtectionAddition;
    @XmlElement(name = "RoadProtectionBase")
    protected List<RoadProtectionBase> roadProtectionBase;
    @XmlElement(name = "TrackPortion")
    protected Integer trackPortion;
    @XmlElement(name = "Meter")
    protected Integer meter;
    @XmlElement(name = "Kilometer")
    protected Integer kilometer;
    @XmlElement(name = "Geometry")
    protected Geometry geometry;
    @XmlElement(name = "ModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTime;

    /**
     * Gets the value of the dataLastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLastUpdated() {
        return dataLastUpdated;
    }

    /**
     * Sets the value of the dataLastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLastUpdated(XMLGregorianCalendar value) {
        this.dataLastUpdated = value;
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
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectId(Integer value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the levelCrossingId property.
     * 
     */
    public int getLevelCrossingId() {
        return levelCrossingId;
    }

    /**
     * Sets the value of the levelCrossingId property.
     * 
     */
    public void setLevelCrossingId(int value) {
        this.levelCrossingId = value;
    }

    /**
     * Gets the value of the railwayRouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailwayRouteId() {
        return railwayRouteId;
    }

    /**
     * Sets the value of the railwayRouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailwayRouteId(String value) {
        this.railwayRouteId = value;
    }

    /**
     * Gets the value of the roadRouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadRouteId() {
        return roadRouteId;
    }

    /**
     * Sets the value of the roadRouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadRouteId(String value) {
        this.roadRouteId = value;
    }

    /**
     * Gets the value of the numberOfTracks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfTracks() {
        return numberOfTracks;
    }

    /**
     * Sets the value of the numberOfTracks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfTracks(Integer value) {
        this.numberOfTracks = value;
    }

    /**
     * Gets the value of the operatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingMode() {
        return operatingMode;
    }

    /**
     * Sets the value of the operatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingMode(String value) {
        this.operatingMode = value;
    }

    /**
     * Gets the value of the trainFlow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrainFlow() {
        return trainFlow;
    }

    /**
     * Sets the value of the trainFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrainFlow(Integer value) {
        this.trainFlow = value;
    }

    /**
     * Gets the value of the portalHeightLeft property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPortalHeightLeft() {
        return portalHeightLeft;
    }

    /**
     * Sets the value of the portalHeightLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPortalHeightLeft(Double value) {
        this.portalHeightLeft = value;
    }

    /**
     * Gets the value of the portalHeightRight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPortalHeightRight() {
        return portalHeightRight;
    }

    /**
     * Sets the value of the portalHeightRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPortalHeightRight(Double value) {
        this.portalHeightRight = value;
    }

    /**
     * Gets the value of the roadNameAlternative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNameAlternative() {
        return roadNameAlternative;
    }

    /**
     * Sets the value of the roadNameAlternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNameAlternative(String value) {
        this.roadNameAlternative = value;
    }

    /**
     * Gets the value of the roadNameOfficial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNameOfficial() {
        return roadNameOfficial;
    }

    /**
     * Sets the value of the roadNameOfficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNameOfficial(String value) {
        this.roadNameOfficial = value;
    }

    /**
     * Gets the value of the roadProfileCrossCurve property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadProfileCrossCurve() {
        return roadProfileCrossCurve;
    }

    /**
     * Sets the value of the roadProfileCrossCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadProfileCrossCurve(Integer value) {
        this.roadProfileCrossCurve = value;
    }

    /**
     * Gets the value of the roadProfileCrest property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadProfileCrest() {
        return roadProfileCrest;
    }

    /**
     * Sets the value of the roadProfileCrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadProfileCrest(Integer value) {
        this.roadProfileCrest = value;
    }

    /**
     * Gets the value of the roadProfileSteepSlope property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadProfileSteepSlope() {
        return roadProfileSteepSlope;
    }

    /**
     * Sets the value of the roadProfileSteepSlope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadProfileSteepSlope(Integer value) {
        this.roadProfileSteepSlope = value;
    }

    /**
     * Gets the value of the roadProtectionAddition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadProtectionAddition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadProtectionAddition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadProtectionAddition }
     * 
     * 
     */
    public List<RoadProtectionAddition> getRoadProtectionAddition() {
        if (roadProtectionAddition == null) {
            roadProtectionAddition = new ArrayList<RoadProtectionAddition>();
        }
        return this.roadProtectionAddition;
    }

    /**
     * Gets the value of the roadProtectionBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roadProtectionBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadProtectionBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoadProtectionBase }
     * 
     * 
     */
    public List<RoadProtectionBase> getRoadProtectionBase() {
        if (roadProtectionBase == null) {
            roadProtectionBase = new ArrayList<RoadProtectionBase>();
        }
        return this.roadProtectionBase;
    }

    /**
     * Gets the value of the trackPortion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackPortion() {
        return trackPortion;
    }

    /**
     * Sets the value of the trackPortion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackPortion(Integer value) {
        this.trackPortion = value;
    }

    /**
     * Gets the value of the meter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeter() {
        return meter;
    }

    /**
     * Sets the value of the meter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeter(Integer value) {
        this.meter = value;
    }

    /**
     * Gets the value of the kilometer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKilometer() {
        return kilometer;
    }

    /**
     * Sets the value of the kilometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKilometer(Integer value) {
        this.kilometer = value;
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

}
