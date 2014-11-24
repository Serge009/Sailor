
package org.matrix_soft.sailor.soap.units;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitSetLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitSetLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitSetRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LineNR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MainUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConvFact1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ConvFact2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GlobalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitSetLine", propOrder = {
    "logicalRef",
    "code",
    "name",
    "unitSetRef",
    "lineNR",
    "mainUnit",
    "convFact1",
    "convFact2",
    "globalCode"
})
public class UnitSetLine {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UnitSetRef")
    protected int unitSetRef;
    @XmlElement(name = "LineNR")
    protected int lineNR;
    @XmlElement(name = "MainUnit")
    protected int mainUnit;
    @XmlElement(name = "ConvFact1")
    protected int convFact1;
    @XmlElement(name = "ConvFact2")
    protected int convFact2;
    @XmlElement(name = "GlobalCode")
    protected String globalCode;

    /**
     * Gets the value of the logicalRef property.
     * 
     */
    public int getLogicalRef() {
        return logicalRef;
    }

    /**
     * Sets the value of the logicalRef property.
     * 
     */
    public void setLogicalRef(int value) {
        this.logicalRef = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the unitSetRef property.
     * 
     */
    public int getUnitSetRef() {
        return unitSetRef;
    }

    /**
     * Sets the value of the unitSetRef property.
     * 
     */
    public void setUnitSetRef(int value) {
        this.unitSetRef = value;
    }

    /**
     * Gets the value of the lineNR property.
     * 
     */
    public int getLineNR() {
        return lineNR;
    }

    /**
     * Sets the value of the lineNR property.
     * 
     */
    public void setLineNR(int value) {
        this.lineNR = value;
    }

    /**
     * Gets the value of the mainUnit property.
     * 
     */
    public int getMainUnit() {
        return mainUnit;
    }

    /**
     * Sets the value of the mainUnit property.
     * 
     */
    public void setMainUnit(int value) {
        this.mainUnit = value;
    }

    /**
     * Gets the value of the convFact1 property.
     * 
     */
    public int getConvFact1() {
        return convFact1;
    }

    /**
     * Sets the value of the convFact1 property.
     * 
     */
    public void setConvFact1(int value) {
        this.convFact1 = value;
    }

    /**
     * Gets the value of the convFact2 property.
     * 
     */
    public int getConvFact2() {
        return convFact2;
    }

    /**
     * Sets the value of the convFact2 property.
     * 
     */
    public void setConvFact2(int value) {
        this.convFact2 = value;
    }

    /**
     * Gets the value of the globalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalCode() {
        return globalCode;
    }

    /**
     * Sets the value of the globalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalCode(String value) {
        this.globalCode = value;
    }

    @Override
    public String toString() {
        return "UnitSetLine{" +
                "logicalRef=" + logicalRef +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unitSetRef=" + unitSetRef +
                ", lineNR=" + lineNR +
                ", mainUnit=" + mainUnit +
                ", convFact1=" + convFact1 +
                ", convFact2=" + convFact2 +
                ", globalCode='" + globalCode + '\'' +
                '}';
    }
}
