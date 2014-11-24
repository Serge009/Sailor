
package org.matrix_soft.sailor.soap.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CyphCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SellVat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReturnVat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnitSetRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "logicalRef",
    "cardType",
    "code",
    "name",
    "speCode",
    "cyphCode",
    "classType",
    "vat",
    "paymentRef",
    "modifiedDate",
    "sellVat",
    "returnVat",
    "unitSetRef",
    "version"
})
public class Product {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "CardType")
    protected int cardType;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "SpeCode")
    protected String speCode;
    @XmlElement(name = "CyphCode")
    protected String cyphCode;
    @XmlElement(name = "ClassType")
    protected int classType;
    @XmlElement(name = "Vat")
    protected int vat;
    @XmlElement(name = "PaymentRef")
    protected int paymentRef;
    @XmlElement(name = "ModifiedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "SellVat")
    protected int sellVat;
    @XmlElement(name = "ReturnVat")
    protected int returnVat;
    @XmlElement(name = "UnitSetRef")
    protected int unitSetRef;
    @XmlElement(name = "Version")
    protected long version;

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
     * Gets the value of the speCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeCode() {
        return speCode;
    }

    /**
     * Sets the value of the speCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeCode(String value) {
        this.speCode = value;
    }

    /**
     * Gets the value of the cyphCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyphCode() {
        return cyphCode;
    }

    /**
     * Sets the value of the cyphCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyphCode(String value) {
        this.cyphCode = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     */
    public int getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     */
    public void setClassType(int value) {
        this.classType = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     */
    public int getVat() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     */
    public void setVat(int value) {
        this.vat = value;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     */
    public int getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     */
    public void setPaymentRef(int value) {
        this.paymentRef = value;
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
     * Gets the value of the sellVat property.
     * 
     */
    public int getSellVat() {
        return sellVat;
    }

    /**
     * Sets the value of the sellVat property.
     * 
     */
    public void setSellVat(int value) {
        this.sellVat = value;
    }

    /**
     * Gets the value of the returnVat property.
     * 
     */
    public int getReturnVat() {
        return returnVat;
    }

    /**
     * Sets the value of the returnVat property.
     * 
     */
    public void setReturnVat(int value) {
        this.returnVat = value;
    }

    /**
     * Gets the value of the unitSetRef property.
     * 
     */
    public int getUnitSetRef() {
        return unitSetRef;
    }

    /**
     * Sets the value of the unitSetRef property.
     * 
     */
    public void setUnitSetRef(int value) {
        this.unitSetRef = value;
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

    @Override
    public String toString() {
        return "Product{" +
                "logicalRef=" + logicalRef +
                ", cardType=" + cardType +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", speCode='" + speCode + '\'' +
                ", cyphCode='" + cyphCode + '\'' +
                ", classType=" + classType +
                ", vat=" + vat +
                ", paymentRef=" + paymentRef +
                ", modifiedDate=" + modifiedDate +
                ", sellVat=" + sellVat +
                ", returnVat=" + returnVat +
                ", unitSetRef=" + unitSetRef +
                ", version=" + version +
                '}';
    }
}
