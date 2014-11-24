
package org.matrix_soft.sailor.soap.products;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductList }
     * 
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link ProductServiceResult }
     * 
     */
    public ProductServiceResult createProductServiceResult() {
        return new ProductServiceResult();
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

}
