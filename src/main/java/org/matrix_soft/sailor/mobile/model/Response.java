package org.matrix_soft.sailor.mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.*;

public class Response {

       @Expose
       @SerializedName("error") private java.lang.Error mError;
       @Expose @SerializedName("data")  private Data mData;

    public Response() {};

    public java.lang.Error getError() {
        return mError;
    }

    public void setError(java.lang.Error error) {
        mError = error;
    }

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }
}
