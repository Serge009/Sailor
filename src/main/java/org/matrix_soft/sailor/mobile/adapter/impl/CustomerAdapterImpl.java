package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Customer;
import org.matrix_soft.sailor.mobile.adapter.CustomerAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 20.11.2014.
 */
@Service
public class CustomerAdapterImpl implements CustomerAdapter {
    @Override
    public List<Customer> adaptCustomers(List<org.matrix_soft.sailor.soap.customers.Customer> soapCustomers) {
        ArrayList<Customer> customers = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.customers.Customer soapCustomer : soapCustomers) {
            customers.add(adaptCustomer(soapCustomer));
        }

        return customers;
    }

    private Customer adaptCustomer(org.matrix_soft.sailor.soap.customers.Customer soapCustomer) {
        Customer customer = new Customer();

        System.err.println(soapCustomer);

        try {
            customer.setLatitude(Float.parseFloat(soapCustomer.getDistrictCode1()));
            customer.setLongitude(Float.parseFloat(soapCustomer.getDistrictCode2()));
        } catch (NumberFormatException e) {
            //NOP
        }

        customer.setName(soapCustomer.getDefinition());

        return customer;
    }
}
