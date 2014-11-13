package org.matrix_soft.sailor.core.entity;

import javax.persistence.*;

/**
 * Created by SERGE on 13.11.2014.
 */
@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "UUID", nullable = false, length = 255)
    private String uuid;

    @ManyToOne
    @JoinColumn(name = "LICENSE")
    private License license;

    @ManyToOne
    @JoinColumn(name = "USER", nullable = false)
    private User mobileUser;

    @Version
    @Column(name = "VERSION")
    private int version;

    public int getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public User getMobileUser() {
        return mobileUser;
    }

    public void setMobileUser(User mobileUser) {
        this.mobileUser = mobileUser;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
