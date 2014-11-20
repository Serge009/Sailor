package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.core.entity.Customer;
import org.matrix_soft.sailor.mobile.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 19.11.2014.
 */
@RestController
public class CustomersController {

    @Inject
    CustomerService service;

    @RequestMapping("/mobile/customers")
    public List<Customer> getCustomersList() {
        return service.getCustomers();
    }
}
