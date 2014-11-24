package org.matrix_soft.sailor.core.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Matrix on 24.11.2014.
 */
@JsonSerialize
public class Unit {

    @JsonSerialize
    @JsonProperty("id")
    private int id;

    @JsonSerialize
    @JsonProperty("name")
    private String name;

    @JsonSerialize
    @JsonProperty("version")
    private long version;

    @JsonSerialize
    @JsonProperty("status")
    private int status = 1;

    @JsonSerialize
    @JsonProperty("unit_details")
    private Set<UnitDetail> unitDetails = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<UnitDetail> getUnitDetails() {
        return unitDetails;
    }

    public void setUnitDetails(Set<UnitDetail> unitDetails) {
        this.unitDetails = unitDetails;
    }

    public void addUnitDetail(UnitDetail unitDetail) {
        unitDetail.setUnit(this);
        this.unitDetails.add(unitDetail);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unit unit = (Unit) o;

        if (id != unit.id) return false;
        if (status != unit.status) return false;
        if (version != unit.version) return false;
        if (name != null ? !name.equals(unit.name) : unit.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + status;
        return result;
    }
}
