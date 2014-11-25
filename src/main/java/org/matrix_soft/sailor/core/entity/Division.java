package org.matrix_soft.sailor.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by Matrix on 25.11.2014.
 */
@JsonSerialize
public class Division {

    @JsonProperty("id")
    private int logicalRef;

    @JsonProperty("firm")
    private int firmNr;

    @JsonIgnore
    private int nr;

    @JsonProperty("name")
    private String name;

    public int getLogicalRef() {
        return logicalRef;
    }

    public void setLogicalRef(int logicalRef) {
        this.logicalRef = logicalRef;
    }

    public int getFirmNr() {
        return firmNr;
    }

    public void setFirmNr(int firmNr) {
        this.firmNr = firmNr;
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
}
