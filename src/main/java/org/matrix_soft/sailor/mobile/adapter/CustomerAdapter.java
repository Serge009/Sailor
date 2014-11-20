package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Customer;

import java.util.List;

/**
 * Created by Matrix on 20.11.2014.
 */
public interface CustomerAdapter {
    public List<Customer> adaptCustomers(List<org.matrix_soft.sailor.soap.customers.Customer> soapCustomers);
}
