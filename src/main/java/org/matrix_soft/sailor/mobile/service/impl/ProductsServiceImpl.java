package org.matrix_soft.sailor.mobile.service.impl;

import org.matrix_soft.sailor.core.entity.Product;
import org.matrix_soft.sailor.mobile.adapter.ProductAdapter;
import org.matrix_soft.sailor.mobile.service.ProductsService;
import org.matrix_soft.sailor.soap.managers.ProductServiceManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class ProductsServiceImpl implements ProductsService {

    //TODO:
    private String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

    @Inject
    private ProductServiceManager productServiceManager;

    @Inject
    private ProductAdapter productAdapter;

    @Override
    public List<Product> getProducts() {
        List<org.matrix_soft.sailor.soap.products.Product> products = productServiceManager.getProducts(sessionId, 0);
        return productAdapter.adaptProducts(products);
    }
}
