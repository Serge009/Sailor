
package org.matrix_soft.sailor.soap.firms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetFirmResult" type="{http://tempuri.org/}FirmServiceResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getFirmResult"
})
@XmlRootElement(name = "GetFirmResponse")
public class GetFirmResponse {

    @XmlElement(name = "GetFirmResult")
    protected FirmServiceResult getFirmResult;

    /**
     * Gets the value of the getFirmResult property.
     * 
     * @return
     *     possible object is
     *     {@link FirmServiceResult }
     *     
     */
    public FirmServiceResult getGetFirmResult() {
        return getFirmResult;
    }

    /**
     * Sets the value of the getFirmResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmServiceResult }
     *     
     */
    public void setGetFirmResult(FirmServiceResult value) {
        this.getFirmResult = value;
    }

}
