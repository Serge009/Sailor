
package org.matrix_soft.sailor.soap.units;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitSetLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitSetLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitSetLine" type="{http://tempuri.org/}UnitSetLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitSetLine", propOrder = {
    "unitSetLine"
})
public class ArrayOfUnitSetLine {

    @XmlElement(name = "UnitSetLine", nillable = true)
    protected List<UnitSetLine> unitSetLine;

    /**
     * Gets the value of the unitSetLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSetLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSetLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitSetLine }
     * 
     * 
     */
    public List<UnitSetLine> getUnitSetLine() {
        if (unitSetLine == null) {
            unitSetLine = new ArrayList<UnitSetLine>();
        }
        return this.unitSetLine;
    }

    @Override
    public String toString() {
        return "ArrayOfUnitSetLine{" +
                "unitSetLine=" + unitSetLine +
                '}';
    }
}
