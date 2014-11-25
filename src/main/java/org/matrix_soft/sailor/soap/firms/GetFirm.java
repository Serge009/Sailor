
package org.matrix_soft.sailor.soap.firms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmNr" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "password",
    "adminUserName",
    "adminUserPassword",
    "firmNr"
})
@XmlRootElement(name = "GetFirm")
public class GetFirm {

    protected String password;
    protected String adminUserName;
    protected String adminUserPassword;
    protected int firmNr;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the adminUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUserName() {
        return adminUserName;
    }

    /**
     * Sets the value of the adminUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUserName(String value) {
        this.adminUserName = value;
    }

    /**
     * Gets the value of the adminUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUserPassword() {
        return adminUserPassword;
    }

    /**
     * Sets the value of the adminUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUserPassword(String value) {
        this.adminUserPassword = value;
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

}
