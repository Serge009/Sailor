package org.matrix_soft.sailor.mobile.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.matrix_soft.sailor.core.entity.Customer;

import java.util.List;

/**
 * Created by Matrix on 01.12.2014.
 */
@JsonSerialize
public class Data {

    @JsonSerialize
    @JsonProperty("customers")
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
