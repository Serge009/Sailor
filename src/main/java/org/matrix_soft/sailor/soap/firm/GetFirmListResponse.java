
package org.matrix_soft.sailor.soap.firm;

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
 *         &lt;element name="GetFirmListResult" type="{http://tempuri.org/}FirmServiceResult" minOccurs="0"/>
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
    "getFirmListResult"
})
@XmlRootElement(name = "GetFirmListResponse")
public class GetFirmListResponse {

    @XmlElement(name = "GetFirmListResult")
    protected FirmServiceResult getFirmListResult;

    /**
     * Gets the value of the getFirmListResult property.
     * 
     * @return
     *     possible object is
     *     {@link FirmServiceResult }
     *     
     */
    public FirmServiceResult getGetFirmListResult() {
        return getFirmListResult;
    }

    /**
     * Sets the value of the getFirmListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirmServiceResult }
     *     
     */
    public void setGetFirmListResult(FirmServiceResult value) {
        this.getFirmListResult = value;
    }

}
