package org.matrix_soft.sailor.mobile.model;
public class Unit extends DefaultData {

    public Unit() {};

    public Unit(int id,
         int serverId,
         String name,
         int version,
         int status) {
       super(id, serverId, name, version, status);
    }

}
