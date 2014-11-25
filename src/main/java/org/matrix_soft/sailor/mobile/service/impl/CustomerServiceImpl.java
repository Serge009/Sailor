package org.matrix_soft.sailor.mobile.service.impl;

import org.matrix_soft.sailor.core.entity.Customer;
import org.matrix_soft.sailor.mobile.adapter.CustomerAdapter;
import org.matrix_soft.sailor.mobile.service.CustomerService;
import org.matrix_soft.sailor.soap.managers.CustomerServiceManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Matrix on 20.11.2014.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    //TODO:
    private String sessionId = "992e2581-c9f6-4350-ad1e-f97104dfa3a9";

    @Inject
    private CustomerServiceManager manager;

    @Inject
    private CustomerAdapter adapter;

    @Override
    public List<Customer> getCustomers() {
        List<org.matrix_soft.sailor.soap.customers.Customer> soapCustomers = manager.getCustomersList(sessionId, 0);
        return adapter.adaptCustomers(soapCustomers);
    }
}
