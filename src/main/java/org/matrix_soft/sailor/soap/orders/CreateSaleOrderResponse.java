
package org.matrix_soft.sailor.soap.orders;

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
 *         &lt;element name="CreateSaleOrderResult" type="{http://tempuri.org/}ServiceResult" minOccurs="0"/>
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
    "createSaleOrderResult"
})
@XmlRootElement(name = "CreateSaleOrderResponse")
public class CreateSaleOrderResponse {

    @XmlElement(name = "CreateSaleOrderResult")
    protected ServiceResult createSaleOrderResult;

    /**
     * Gets the value of the createSaleOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResult }
     *     
     */
    public ServiceResult getCreateSaleOrderResult() {
        return createSaleOrderResult;
    }

    /**
     * Sets the value of the createSaleOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResult }
     *     
     */
    public void setCreateSaleOrderResult(ServiceResult value) {
        this.createSaleOrderResult = value;
    }

}
