package org.matrix_soft.sailor.soap.managers;

import org.matrix_soft.sailor.soap.customers.Customer;
import org.matrix_soft.sailor.soap.customers.CustomerService;
import org.matrix_soft.sailor.soap.customers.CustomerServiceResult;
import org.matrix_soft.sailor.soap.customers.CustomerServiceSoap;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Matrix on 20.11.2014.
 */
@Service
public class CustomerServiceManager {

    CustomerServiceSoap customerServiceSoap;

    @PostConstruct
    private void init() {
        CustomerService customerService = new CustomerService();
        customerServiceSoap = customerService.getCustomerServiceSoap();
    }

    public List<Customer> getCustomersList(String sessionId, long version/*timestamp*/) {
        CustomerServiceResult customerList = customerServiceSoap.getCustomerList(sessionId, 1416268800);
        return customerList.getCustomerList().getCustomer();
    }
}
