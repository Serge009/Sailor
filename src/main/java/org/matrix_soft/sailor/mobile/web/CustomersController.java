package org.matrix_soft.sailor.mobile.web;

import org.matrix_soft.sailor.soap.customers.Customer;
import org.springframework.stereotype.Controller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

/**
 * Created by Matrix on 19.11.2014.
 */
@Controller("/mobile/customers")
public class CustomersController {

    @WebMethod(action = "/")
    public List<Customer> getCustomersList(@WebParam String sessionId) {
        return null;
    }
}
