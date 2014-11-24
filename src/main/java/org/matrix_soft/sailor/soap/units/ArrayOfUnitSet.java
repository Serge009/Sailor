
package org.matrix_soft.sailor.soap.units;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitSet" type="{http://tempuri.org/}UnitSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitSet", propOrder = {
    "unitSet"
})
public class ArrayOfUnitSet {

    @XmlElement(name = "UnitSet", nillable = true)
    protected List<UnitSet> unitSet;

    /**
     * Gets the value of the unitSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitSet }
     * 
     * 
     */
    public List<UnitSet> getUnitSet() {
        if (unitSet == null) {
            unitSet = new ArrayList<UnitSet>();
        }
        return this.unitSet;
    }

}
