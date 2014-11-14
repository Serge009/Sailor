package org.matrix_soft.sailor.mobile.model;

import javax.validation.constraints.NotNull;

/**
 * Created by Matrix on 14.11.2014.
 */
public class LoginModel {

    @NotNull
    private String email;

    @NotNull
    private String password;

    private String license;

    private String uuid;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", license='" + license + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
