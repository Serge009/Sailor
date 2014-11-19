
package org.matrix_soft.sailor.soap.customers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerServiceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceResult">
 *       &lt;sequence>
 *         &lt;element name="CustomerCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CustomerList" type="{http://tempuri.org/}ArrayOfCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerServiceResult", propOrder = {
    "customerCount",
    "customerList"
})
public class CustomerServiceResult
    extends ServiceResult
{

    @XmlElement(name = "CustomerCount")
    protected int customerCount;
    @XmlElement(name = "CustomerList")
    protected ArrayOfCustomer customerList;

    /**
     * Gets the value of the customerCount property.
     * 
     */
    public int getCustomerCount() {
        return customerCount;
    }

    /**
     * Sets the value of the customerCount property.
     * 
     */
    public void setCustomerCount(int value) {
        this.customerCount = value;
    }

    /**
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public ArrayOfCustomer getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public void setCustomerList(ArrayOfCustomer value) {
        this.customerList = value;
    }

}
