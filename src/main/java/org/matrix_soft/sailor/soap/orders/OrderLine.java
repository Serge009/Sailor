
package org.matrix_soft.sailor.soap.orders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MasterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VatRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitConv1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnitConv2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLine", propOrder = {
    "type",
    "masterCode",
    "quantity",
    "price",
    "vatRate",
    "unitCode",
    "unitConv1",
    "unitConv2",
    "dueDate"
})
public class OrderLine {

    @XmlElement(name = "Type")
    protected int type;
    @XmlElement(name = "MasterCode")
    protected String masterCode;
    @XmlElement(name = "Quantity")
    protected double quantity;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "VatRate")
    protected double vatRate;
    @XmlElement(name = "UnitCode")
    protected String unitCode;
    @XmlElement(name = "UnitConv1")
    protected int unitConv1;
    @XmlElement(name = "UnitConv2")
    protected int unitConv2;
    @XmlElement(name = "DueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the masterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCode() {
        return masterCode;
    }

    /**
     * Sets the value of the masterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCode(String value) {
        this.masterCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     */
    public double getVatRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     */
    public void setVatRate(double value) {
        this.vatRate = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitConv1 property.
     * 
     */
    public int getUnitConv1() {
        return unitConv1;
    }

    /**
     * Sets the value of the unitConv1 property.
     * 
     */
    public void setUnitConv1(int value) {
        this.unitConv1 = value;
    }

    /**
     * Gets the value of the unitConv2 property.
     * 
     */
    public int getUnitConv2() {
        return unitConv2;
    }

    /**
     * Sets the value of the unitConv2 property.
     * 
     */
    public void setUnitConv2(int value) {
        this.unitConv2 = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

}
