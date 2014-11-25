package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Warehouse;
import org.matrix_soft.sailor.soap.firms.WareHouse;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface WarehouseAdapter {
    public List<Warehouse> adaptWarehouses(List<WareHouse> soapWarehouses);
}
