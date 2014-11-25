package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Factory;
import org.matrix_soft.sailor.mobile.adapter.FactoryAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class FactoryAdapterImpl implements FactoryAdapter {
    @Override
    public List<Factory> adaptFactories(List<org.matrix_soft.sailor.soap.firms.Factory> soapFactories) {
        List<Factory> factories = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.Factory soapFactory : soapFactories) {
            Factory factory = new Factory();

            factory.setName(soapFactory.getName());
            factory.setFirmNr(soapFactory.getFirmNr());
            factory.setLogicalRef(soapFactory.getLogicalRef());
            factory.setNr(soapFactory.getNr());

            factories.add(factory);
        }

        return factories;
    }
}
