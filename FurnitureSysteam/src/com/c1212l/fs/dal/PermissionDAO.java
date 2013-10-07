/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Permission;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class PermissionDAO extends ConnectionTool {
      public ArrayList<Permission> getAllPermission() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Permission");
        ArrayList<Permission> result = new ArrayList<Permission>();
        while (rs.next()) {
            Permission permission = new Permission();
            permission.setPermissionID(rs.getString("cPerID"));
            permission.setPermissionName(rs.getString("vPerName"));
            result.add(permission);
        }
        closeConnection();
        return result;
    }
       public void addPermission(Permission permission) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcInsertPermisson(?)}");
            cs.setString(1, permission.getPermissionName() );
            cs.executeUpdate();
            closeConnection();
    }
       public void updatePermission(Permission permission) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdatePermission(?,?)}");
        cs.setString(1, permission.getPermissionID());
        cs.setString(2, permission.getPermissionName());
        cs.executeUpdate();
        closeConnection();
    }
     public void deletePermission(Permission permission) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeletePermission(?)}");
            cs.setString(1,permission.getPermissionID());
            cs.executeUpdate();
        closeConnection();
    }
}
