package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Warehouse;
import org.matrix_soft.sailor.mobile.adapter.WarehouseAdapter;
import org.matrix_soft.sailor.soap.firms.WareHouse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class WarehouseAdapterImpl implements WarehouseAdapter {
    @Override
    public List<Warehouse> adaptWarehouses(List<WareHouse> soapWarehouses) {
        List<Warehouse> warehouses = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.WareHouse soapWarehouse : soapWarehouses) {
            Warehouse warehouse = new Warehouse();

            warehouse.setName(soapWarehouse.getName());
            warehouse.setFirmNr(soapWarehouse.getFirmNr());
            warehouse.setLogicalRef(soapWarehouse.getLogicalRef());
            warehouse.setNr(soapWarehouse.getNr());

            warehouses.add(warehouse);
        }

        return warehouses;
    }
}
