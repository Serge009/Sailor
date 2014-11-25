package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Product;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface ProductAdapter {
    public List<Product> adaptProducts(List<org.matrix_soft.sailor.soap.products.Product> soapProducts);
}
