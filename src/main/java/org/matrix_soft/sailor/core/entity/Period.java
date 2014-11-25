package org.matrix_soft.sailor.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by Matrix on 25.11.2014.
 */
@JsonSerialize
public class Period {

    @JsonProperty("id")
    private int logicalRef;

    @JsonProperty("firm")
    private int firmNr;

    @JsonIgnore
    private int nr;

    @JsonProperty("status")
    private boolean active;

    @JsonProperty("startDate")
    private long begDate;

    @JsonProperty("endDate")
    private long endDate;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getBegDate() {
        return begDate;
    }

    public void setBegDate(long begDate) {
        this.begDate = begDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }
}
