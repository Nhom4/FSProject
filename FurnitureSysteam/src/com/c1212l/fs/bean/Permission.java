/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Permission {
    private String permissionID;
    private String permissionName;

    public String getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(String permissionID) {
        this.permissionID = permissionID;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
    public Vector getVector() {
        Vector result = new Vector();
        result.add(permissionID);
        result.add(permissionName);
        return result;
    }
}
