/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Admin;
import com.c1212l.fs.bean.Employee;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Luu Bi
 */
public class AdminDAO extends ConnectionTool {
      public Admin getAdminById(int id) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Adm where cAdmID = " + id );
            Admin admin = new Admin();
            if (rs.next()) {
               admin.setAdminID(rs.getInt("cAdmID"));
               admin.setAdminName(rs.getString("vAdmName"));
               admin.setAdminAddress(rs.getString("vAdmAddress"));
               admin.setAdminPhone(rs.getString("cAdmPhone"));
            }
            closeConnection();
            return admin;
        } catch (Exception ex) {
            return null;
        }
     }
}
