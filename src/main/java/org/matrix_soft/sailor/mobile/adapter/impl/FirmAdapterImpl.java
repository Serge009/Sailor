package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Firm;
import org.matrix_soft.sailor.mobile.adapter.*;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class FirmAdapterImpl implements FirmAdapter {

    @Inject
    private DepartmentAdapter departmentAdapter;

    @Inject
    private DivisionAdapter divisionAdapter;

    @Inject
    private FactoryAdapter factoryAdapter;

    @Inject
    private PeriodAdapter periodAdapter;

    @Inject
    private WarehouseAdapter warehouseAdapter;

    @Override
    public List<Firm> adaptFirms(List<org.matrix_soft.sailor.soap.firms.Firm> soapFirms) {
        List<Firm> firms = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.Firm soapFirm : soapFirms) {
            firms.add(adaptFirm(soapFirm));
        }

        return firms;
    }

    private Firm adaptFirm(org.matrix_soft.sailor.soap.firms.Firm soapFirm) {
        Firm firm = new Firm();

        firm.setLogicalRef(soapFirm.getLogicalRef());
        firm.setName(soapFirm.getName());
        firm.setNr(soapFirm.getNr());
        firm.setDepartments(departmentAdapter.adaptDepartments(soapFirm.getDepartmentList().getDepartment()));
        firm.setDivisions(divisionAdapter.adaptDivisions(soapFirm.getDivisionList().getDivision()));
        firm.setFactories(factoryAdapter.adaptFactories(soapFirm.getFactoryList().getFactory()));
        firm.setPeriods(periodAdapter.adaptPeriods(soapFirm.getPeriodList().getPeriod()));
        firm.setWarehouses(warehouseAdapter.adaptWarehouses(soapFirm.getWareHouseList().getWareHouse()));

        return firm;
    }
}
