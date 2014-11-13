package org.matrix_soft.sailor.core.entity;

import javax.persistence.*;

/**
 * Created by SERGE on 13.11.2014.
 */
@Entity
@Table(name = "sessions")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "SESSION_ID")
    private String sessionId;

    @ManyToOne
    @JoinColumn(name = "DEVICE", nullable = false)
    private Device device;

    @Enumerated(EnumType.STRING)
    @Column(name = "SESSION_STATUS", nullable = false)
    private SessionStatus sessionStatus = SessionStatus.ACTIVE;

    @Version
    @Column(name = "VERSION", nullable = false)
    private int version;

    public int getId() {
        return id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public SessionStatus getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
