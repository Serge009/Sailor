
package org.matrix_soft.sailor.soap.units;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitSetServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitSetServiceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceResult">
 *       &lt;sequence>
 *         &lt;element name="UnitSetCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UnitSetList" type="{http://tempuri.org/}ArrayOfUnitSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitSetServiceResult", propOrder = {
    "unitSetCount",
    "unitSetList"
})
public class UnitSetServiceResult
    extends ServiceResult
{

    @XmlElement(name = "UnitSetCount")
    protected int unitSetCount;
    @XmlElement(name = "UnitSetList")
    protected ArrayOfUnitSet unitSetList;

    /**
     * Gets the value of the unitSetCount property.
     * 
     */
    public int getUnitSetCount() {
        return unitSetCount;
    }

    /**
     * Sets the value of the unitSetCount property.
     * 
     */
    public void setUnitSetCount(int value) {
        this.unitSetCount = value;
    }

    /**
     * Gets the value of the unitSetList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnitSet }
     *     
     */
    public ArrayOfUnitSet getUnitSetList() {
        return unitSetList;
    }

    /**
     * Sets the value of the unitSetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnitSet }
     *     
     */
    public void setUnitSetList(ArrayOfUnitSet value) {
        this.unitSetList = value;
    }

}
