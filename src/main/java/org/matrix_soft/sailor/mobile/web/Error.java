package org.matrix_soft.sailor.mobile.web;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Matrix on 01.12.2014.
 */
public class Error {

    @JsonProperty("code")
    private int code;

    @JsonProperty("msg")
    private String msg;

    public Error() {

    }

    public String toString() {
        return "Code: "+code+" Msg: "+msg;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}