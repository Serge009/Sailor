
package org.matrix_soft.sailor.soap.firm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Firm_ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Firm_">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PeriodList" type="{http://tempuri.org/}ArrayOfPeriod_" minOccurs="0"/>
 *         &lt;element name="DivisionList" type="{http://tempuri.org/}ArrayOfDivision_" minOccurs="0"/>
 *         &lt;element name="FactoryList" type="{http://tempuri.org/}ArrayOfFactory_" minOccurs="0"/>
 *         &lt;element name="DepartmentList" type="{http://tempuri.org/}ArrayOfDepartment_" minOccurs="0"/>
 *         &lt;element name="WareHouseList" type="{http://tempuri.org/}ArrayOfWareHouse_" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Firm_", propOrder = {
    "logicalRef",
    "nr",
    "name",
    "periodList",
    "divisionList",
    "factoryList",
    "departmentList",
    "wareHouseList"
})
public class Firm {

    @XmlElement(name = "LogicalRef")
    protected int logicalRef;
    @XmlElement(name = "Nr")
    protected int nr;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PeriodList")
    protected ArrayOfPeriod periodList;
    @XmlElement(name = "DivisionList")
    protected ArrayOfDivision divisionList;
    @XmlElement(name = "FactoryList")
    protected ArrayOfFactory factoryList;
    @XmlElement(name = "DepartmentList")
    protected ArrayOfDepartment departmentList;
    @XmlElement(name = "WareHouseList")
    protected ArrayOfWareHouse wareHouseList;

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
     * Gets the value of the nr property.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
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
     * Gets the value of the periodList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeriod }
     *     
     */
    public ArrayOfPeriod getPeriodList() {
        return periodList;
    }

    /**
     * Sets the value of the periodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeriod }
     *     
     */
    public void setPeriodList(ArrayOfPeriod value) {
        this.periodList = value;
    }

    /**
     * Gets the value of the divisionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDivision }
     *     
     */
    public ArrayOfDivision getDivisionList() {
        return divisionList;
    }

    /**
     * Sets the value of the divisionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDivision }
     *     
     */
    public void setDivisionList(ArrayOfDivision value) {
        this.divisionList = value;
    }

    /**
     * Gets the value of the factoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFactory }
     *     
     */
    public ArrayOfFactory getFactoryList() {
        return factoryList;
    }

    /**
     * Sets the value of the factoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFactory }
     *     
     */
    public void setFactoryList(ArrayOfFactory value) {
        this.factoryList = value;
    }

    /**
     * Gets the value of the departmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartment }
     *     
     */
    public ArrayOfDepartment getDepartmentList() {
        return departmentList;
    }

    /**
     * Sets the value of the departmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartment }
     *     
     */
    public void setDepartmentList(ArrayOfDepartment value) {
        this.departmentList = value;
    }

    /**
     * Gets the value of the wareHouseList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWareHouse }
     *     
     */
    public ArrayOfWareHouse getWareHouseList() {
        return wareHouseList;
    }

    /**
     * Sets the value of the wareHouseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWareHouse }
     *     
     */
    public void setWareHouseList(ArrayOfWareHouse value) {
        this.wareHouseList = value;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "logicalRef=" + logicalRef +
                ", nr=" + nr +
                ", name='" + name + '\'' +
                ", periodList=" + periodList +
                ", divisionList=" + divisionList +
                ", factoryList=" + factoryList +
                ", departmentList=" + departmentList +
                ", wareHouseList=" + wareHouseList +
                '}';
    }
}
