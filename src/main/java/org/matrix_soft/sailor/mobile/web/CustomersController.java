package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.core.entity.Customer;
import org.matrix_soft.sailor.mobile.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/mobile/customers", method = RequestMethod.POST)
    public Response getCustomersList() {
        Data data = new Data();
        data.setCustomers(service.getCustomers());
        Response response = new Response();
        response.setData(data);
        return response;
    }

    @RequestMapping(value = "/mobile/customers", method = RequestMethod.GET)
    public Response getPostCustomersList() {
        Data data = new Data();
        data.setCustomers(service.getCustomers());
        Response response = new Response();
        response.setData(data);
        return response;
    }
}
