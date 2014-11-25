package org.matrix_soft.sailor.soap.managers;

import org.matrix_soft.sailor.soap.products.ArrayOfProduct;
import org.matrix_soft.sailor.soap.products.Product;
import org.matrix_soft.sailor.soap.products.ProductService;
import org.matrix_soft.sailor.soap.products.ProductServiceSoap;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class ProductServiceManager {

    private ProductServiceSoap productServiceSoap;

    @PostConstruct
    private void init() {
        ProductService productService = new ProductService();
        productServiceSoap = productService.getProductServiceSoap();
    }

    public List<Product> getProducts(String sessionId, long version) {
        ArrayOfProduct productList = productServiceSoap.getProductList(sessionId, version).getProductList();
        return productList.getProduct();
    }
}
