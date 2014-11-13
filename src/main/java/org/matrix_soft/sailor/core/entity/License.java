package org.matrix_soft.sailor.core.entity;

import javax.persistence.*;

/**
 * Created by SERGE on 13.11.2014.
 */
@Entity
@Table(name = "licenses")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "SERIAL_NUMBER", nullable = false, length = 10)
    private String serial;

    @ManyToOne
    @JoinColumn(name = "OWNER", nullable = false)
    private User owner;

    @Column(name = "USER_COUNT", nullable = false)
    private int userCount;

    @Enumerated(EnumType.STRING)
    @Column(name = "LICENSE_STATUS", nullable = false)
    private LicenseStatus status = LicenseStatus.ACTIVE;

    @Version
    @Column(name = "VERSION")
    private int version;

    public int getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public LicenseStatus getStatus() {
        return status;
    }

    public void setStatus(LicenseStatus status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
