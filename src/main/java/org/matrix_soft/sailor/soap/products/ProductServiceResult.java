
package org.matrix_soft.sailor.soap.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductServiceResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}ServiceResult">
 *       &lt;sequence>
 *         &lt;element name="ProductCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductList" type="{http://tempuri.org/}ArrayOfProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductServiceResult", propOrder = {
    "productCount",
    "productList"
})
public class ProductServiceResult
    extends ServiceResult
{

    @XmlElement(name = "ProductCount")
    protected int productCount;
    @XmlElement(name = "ProductList")
    protected ArrayOfProduct productList;

    /**
     * Gets the value of the productCount property.
     * 
     */
    public int getProductCount() {
        return productCount;
    }

    /**
     * Sets the value of the productCount property.
     * 
     */
    public void setProductCount(int value) {
        this.productCount = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProduct }
     *     
     */
    public ArrayOfProduct getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProduct }
     *     
     */
    public void setProductList(ArrayOfProduct value) {
        this.productList = value;
    }

}
