package org.matrix_soft.sailor.mobile.adapter.impl;

import org.matrix_soft.sailor.core.entity.Department;
import org.matrix_soft.sailor.mobile.adapter.DepartmentAdapter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@Service
public class DepartmentAdapterImpl implements DepartmentAdapter {
    @Override
    public List<Department> adaptDepartments(List<org.matrix_soft.sailor.soap.firms.Department> soapDepartments) {
        List<Department> departments = new ArrayList<>();

        for (org.matrix_soft.sailor.soap.firms.Department soapDepartment : soapDepartments) {
            Department department = new Department();

            department.setName(soapDepartment.getName());
            department.setFirmNr(soapDepartment.getFirmNr());
            department.setLogicalRef(soapDepartment.getLogicalRef());
            department.setNr(soapDepartment.getNr());

            departments.add(department);
        }

        return departments;
    }
}
