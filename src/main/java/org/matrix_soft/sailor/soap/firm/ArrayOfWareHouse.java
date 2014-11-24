
package org.matrix_soft.sailor.soap.firm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWareHouse_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWareHouse_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WareHouse_" type="{http://tempuri.org/}WareHouse_" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWareHouse_", propOrder = {
    "wareHouse"
})
public class ArrayOfWareHouse {

    @XmlElement(name = "WareHouse_", nillable = true)
    protected List<WareHouse> wareHouse;

    /**
     * Gets the value of the wareHouse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wareHouse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWareHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WareHouse }
     * 
     * 
     */
    public List<WareHouse> getWareHouse() {
        if (wareHouse == null) {
            wareHouse = new ArrayList<WareHouse>();
        }
        return this.wareHouse;
    }

}
