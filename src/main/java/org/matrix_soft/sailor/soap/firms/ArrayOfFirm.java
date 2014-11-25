
package org.matrix_soft.sailor.soap.firms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFirm_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFirm_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Firm_" type="{http://tempuri.org/}Firm_" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFirm_", propOrder = {
    "firm"
})
public class ArrayOfFirm {

    @XmlElement(name = "Firm_", nillable = true)
    protected List<Firm> firm;

    /**
     * Gets the value of the firm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Firm }
     * 
     * 
     */
    public List<Firm> getFirm() {
        if (firm == null) {
            firm = new ArrayList<Firm>();
        }
        return this.firm;
    }

}
