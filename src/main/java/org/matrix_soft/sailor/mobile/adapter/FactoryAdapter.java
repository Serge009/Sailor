package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Factory;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface FactoryAdapter {
    public List<Factory> adaptFactories(List<org.matrix_soft.sailor.soap.firms.Factory> soapFactories);
}
