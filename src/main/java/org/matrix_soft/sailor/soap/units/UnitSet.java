
package org.matrix_soft.sailor.soap.units;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UnitSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UnitSetLineList" type="{http://tempuri.org/}ArrayOfUnitSetLine" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitSet", propOrder = {
    "logicalRef",
    "cardType",
    "code",
    "name",
    "specialCode",
    "modifiedDate",
    "version",
    "unitSetLineList"
})
public class UnitSet {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "CardType")
    protected int cardType;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SpecialCode")
    protected String specialCode;
    @XmlElement(name = "ModifiedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "Version")
    protected long version;
    @XmlElement(name = "UnitSetLineList")
    protected ArrayOfUnitSetLine unitSetLineList;

    /**
     * Gets the value of the logicalRef property.
     * 
     */
    public int getLogicalRef() {
        return logicalRef;
    }

    /**
     * Sets the value of the logicalRef property.
     * 
     */
    public void setLogicalRef(int value) {
        this.logicalRef = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     */
    public int getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     */
    public void setCardType(int value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the specialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCode() {
        return specialCode;
    }

    /**
     * Sets the value of the specialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCode(String value) {
        this.specialCode = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the unitSetLineList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitSetLine }
     *     
     */
    public ArrayOfUnitSetLine getUnitSetLineList() {
        return unitSetLineList;
    }

    /**
     * Sets the value of the unitSetLineList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitSetLine }
     *     
     */
    public void setUnitSetLineList(ArrayOfUnitSetLine value) {
        this.unitSetLineList = value;
    }

    @Override
    public String toString() {
        return "UnitSet{" +
                "logicalRef=" + logicalRef +
                ", cardType=" + cardType +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", specialCode='" + specialCode + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", version=" + version +
                ", unitSetLineList=" + unitSetLineList +
                '}';
    }
}
