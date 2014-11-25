
package org.matrix_soft.sailor.soap.firms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Division_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Division_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Division_", propOrder = {
    "logicalRef",
    "firmNr",
    "nr",
    "name"
})
public class Division {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "FirmNr")
    protected int firmNr;
    @XmlElement(name = "Nr")
    protected int nr;
    @XmlElement(name = "Name")
    protected String name;

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
     * Gets the value of the firmNr property.
     * 
     */
    public int getFirmNr() {
        return firmNr;
    }

    /**
     * Sets the value of the firmNr property.
     * 
     */
    public void setFirmNr(int value) {
        this.firmNr = value;
    }

    /**
     * Gets the value of the nr property.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
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

}
