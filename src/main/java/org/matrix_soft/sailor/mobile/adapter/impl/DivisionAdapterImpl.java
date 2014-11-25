package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Division;
import org.matrix_soft.sailor.mobile.adapter.DivisionAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class DivisionAdapterImpl implements DivisionAdapter {
    @Override
    public List<Division> adaptDivisions(List<org.matrix_soft.sailor.soap.firms.Division> soapDivisions) {
        List<Division> divisions = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.Division soapDivision : soapDivisions) {
            Division department = new Division();

            department.setName(soapDivision.getName());
            department.setFirmNr(soapDivision.getFirmNr());
            department.setLogicalRef(soapDivision.getLogicalRef());
            department.setNr(soapDivision.getNr());

            divisions.add(department);
        }

        return divisions;
    }
}
