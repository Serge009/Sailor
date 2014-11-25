package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.core.entity.Product;
import org.matrix_soft.sailor.core.entity.Unit;
import org.matrix_soft.sailor.mobile.service.ProductsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@RestController
public class ProductController {

    @Inject
    private ProductsService productsService;

    @RequestMapping("/mobile/products")
    public List<Product> getProducts() {
        return productsService.getProducts();
    }
}
