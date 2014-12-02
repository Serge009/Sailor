package org.matrix_soft.sailor.mobile.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Matrix on 01.12.2014.
 */
public class Response {
    @JsonProperty("data")
    private Data data;

    @JsonProperty("error")
    private Error error = new Error();

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
