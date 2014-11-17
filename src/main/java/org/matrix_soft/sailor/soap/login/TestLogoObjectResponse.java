
package org.matrix_soft.sailor.soap.login;

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
 *         &lt;element name="TestLogoObjectResult" type="{http://tempuri.org/}LoginServiceResult" minOccurs="0"/>
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
    "testLogoObjectResult"
})
@XmlRootElement(name = "TestLogoObjectResponse")
public class TestLogoObjectResponse {

    @XmlElement(name = "TestLogoObjectResult")
    protected LoginServiceResult testLogoObjectResult;

    /**
     * Gets the value of the testLogoObjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginServiceResult }
     *     
     */
    public LoginServiceResult getTestLogoObjectResult() {
        return testLogoObjectResult;
    }

    /**
     * Sets the value of the testLogoObjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginServiceResult }
     *     
     */
    public void setTestLogoObjectResult(LoginServiceResult value) {
        this.testLogoObjectResult = value;
    }

}
