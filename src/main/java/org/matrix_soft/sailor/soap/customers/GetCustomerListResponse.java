
package org.matrix_soft.sailor.soap.customers;

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
 *         &lt;element name="GetCustomerListResult" type="{http://tempuri.org/}CustomerServiceResult" minOccurs="0"/>
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
    "getCustomerListResult"
})
@XmlRootElement(name = "GetCustomerListResponse")
public class GetCustomerListResponse {

    @XmlElement(name = "GetCustomerListResult")
    protected CustomerServiceResult getCustomerListResult;

    /**
     * Gets the value of the getCustomerListResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerServiceResult }
     *     
     */
    public CustomerServiceResult getGetCustomerListResult() {
        return getCustomerListResult;
    }

    /**
     * Sets the value of the getCustomerListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerServiceResult }
     *     
     */
    public void setGetCustomerListResult(CustomerServiceResult value) {
        this.getCustomerListResult = value;
    }

}
