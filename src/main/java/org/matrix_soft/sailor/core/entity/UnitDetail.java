package org.matrix_soft.sailor.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by Matrix on 24.11.2014.
 */
@JsonSerialize
public class UnitDetail {
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
    @JsonProperty("from")
    private int from;

    @JsonSerialize
    @JsonProperty("to")
    private int to;

    @JsonSerialize
    @JsonProperty("main")
    private boolean main;

    @JsonIgnore
    private Unit unit;

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

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnitDetail that = (UnitDetail) o;

        if (from != that.from) return false;
        if (id != that.id) return false;
        if (main != that.main) return false;
        if (status != that.status) return false;
        if (to != that.to) return false;
        if (version != that.version) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (!unit.equals(that.unit)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + status;
        result = 31 * result + from;
        result = 31 * result + to;
        result = 31 * result + (main ? 1 : 0);
        result = 31 * result + unit.hashCode();
        return result;
    }
}
