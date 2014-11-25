package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Product;
import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.mobile.adapter.ProductAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class ProductAdapterImpl implements ProductAdapter {

    @Override
    public List<Product> adaptProducts(List<org.matrix_soft.sailor.soap.products.Product> soapProducts) {
        List<Product> products = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.products.Product soapProduct : soapProducts) {
            Product product = new Product();

            //TODO: remove this
            Unit unit = new Unit();
            unit.setId(soapProduct.getUnitSetRef());

            product.setId(soapProduct.getLogicalRef());
            product.setUnit(unit);
            product.setName(soapProduct.getName());
            product.setCode(soapProduct.getCode());
            product.setDescription("Default description!");
            product.setVat(soapProduct.getVat());

            products.add(product);
        }

        return products;
    }
}
