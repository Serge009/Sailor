
package org.matrix_soft.sailor.soap.firm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Period_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BegDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period_", propOrder = {
    "logicalRef",
    "firmNr",
    "nr",
    "active",
    "begDate",
    "endDate"
})
public class Period {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "FirmNr")
    protected int firmNr;
    @XmlElement(name = "Nr")
    protected int nr;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "BegDate")
    protected long begDate;
    @XmlElement(name = "EndDate")
    protected long endDate;

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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the begDate property.
     * 
     */
    public long getBegDate() {
        return begDate;
    }

    /**
     * Sets the value of the begDate property.
     * 
     */
    public void setBegDate(long value) {
        this.begDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     */
    public long getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     */
    public void setEndDate(long value) {
        this.endDate = value;
    }

}
