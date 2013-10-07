/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Permission;
import com.c1212l.fs.dal.CustomerDAO;
import com.c1212l.fs.dal.PermissionDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class PermissionBUS {
           PermissionDAO permissionDAO = null;
       public PermissionBUS(){
             permissionDAO = new PermissionDAO();
}
       public ArrayList<Permission> getAllPermission() throws ClassNotFoundException, SQLException{
        return permissionDAO.getAllPermission();
       }
       public void addPermission(String permissionName) throws ClassNotFoundException, Exception{
        Permission permission=new Permission();
        permission.setPermissionID(permissionName);
        permissionDAO.addPermission(permission);
    }
      public void updatePermission(String permissionID,String permissionName) throws ClassNotFoundException, Exception{
        Permission permission = new Permission();
        permission.setPermissionID(permissionID);
        permission.setPermissionName(permissionName);
        permissionDAO.updatePermission(permission);
    }  
      public void deleteCustomer(String permissionID) throws ClassNotFoundException, Exception{
        Permission permission= new Permission();
        permission.setPermissionID(permissionID);
        permissionDAO.deletePermission(permission);
    }
}
