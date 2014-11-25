package org.matrix_soft.sailor.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matrix on 25.11.2014.
 */
@JsonSerialize
public class Firm {

    @JsonProperty("id")
    private int logicalRef;

    @JsonIgnore
    private int nr;

    @JsonProperty("name")
    private String name;

    @JsonProperty("periods")
    private List<Period> periods = new ArrayList<>();

    @JsonProperty("divisions")
    private List<Division> divisions = new ArrayList<>();

    @JsonProperty("factories")
    private List<Factory> factories = new ArrayList<>();

    @JsonProperty("departments")
    private List<Department> departments = new ArrayList<>();

    @JsonProperty("warehouses")
    private List<Warehouse> warehouses = new ArrayList<>();

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    public List<Factory> getFactories() {
        return factories;
    }

    public void setFactories(List<Factory> factories) {
        this.factories = factories;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public void addPeriod(Period period) {
        this.periods.add(period);
    }

    public void addDivision(Division division) {
        this.divisions.add(division);
    }

    public void addFactory(Factory factory) {
        this.factories.add(factory);
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public void addWarehouse(Warehouse warehouse) {
        this.warehouses.add(warehouse);
    }
}
