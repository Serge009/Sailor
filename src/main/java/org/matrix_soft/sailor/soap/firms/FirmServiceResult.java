
package org.matrix_soft.sailor.soap.firms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirmServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirmServiceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceResult">
 *       &lt;sequence>
 *         &lt;element name="FirmCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirmList" type="{http://tempuri.org/}ArrayOfFirm_" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirmServiceResult", propOrder = {
    "firmCount",
    "firmList"
})
public class FirmServiceResult
    extends ServiceResult
{

    @XmlElement(name = "FirmCount")
    protected int firmCount;
    @XmlElement(name = "FirmList")
    protected ArrayOfFirm firmList;

    /**
     * Gets the value of the firmCount property.
     * 
     */
    public int getFirmCount() {
        return firmCount;
    }

    /**
     * Sets the value of the firmCount property.
     * 
     */
    public void setFirmCount(int value) {
        this.firmCount = value;
    }

    /**
     * Gets the value of the firmList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFirm }
     *     
     */
    public ArrayOfFirm getFirmList() {
        return firmList;
    }

    /**
     * Sets the value of the firmList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFirm }
     *     
     */
    public void setFirmList(ArrayOfFirm value) {
        this.firmList = value;
    }

}
