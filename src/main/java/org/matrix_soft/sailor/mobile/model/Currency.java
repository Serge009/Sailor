package org.matrix_soft.sailor.mobile.model;
public class Currency extends DefaultData {

    public Currency() {};

    public Currency(int id,
             int serverId,
             String name,
             int version,
             int status) {
        super(id, serverId, name, version, status);
    }
}
