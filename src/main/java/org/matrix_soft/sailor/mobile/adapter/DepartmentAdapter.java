package org.matrix_soft.sailor.mobile.adapter;

import org.matrix_soft.sailor.core.entity.Department;

import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
public interface DepartmentAdapter {
    public List<Department> adaptDepartments(List<org.matrix_soft.sailor.soap.firms.Department> soapDepartments);
}
