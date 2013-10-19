/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Admin;
import com.c1212l.fs.bean.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luu Bi
 */
public class LoginDAO extends ConnectionTool {

    public Admin getAdmin(String email, String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Admin admin = new Admin();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From Adm where cAdmEmail =" + "'" + email + "' and cAdmPassword =" + "'" + password + "'");
        if (rs.next()) {
               admin.setAdminID(rs.getInt("cAdmID"));
               admin.setEmail(rs.getString("cAdmEmail"));
               admin.setAdminName(rs.getString("vAdmName"));
               admin.setAdminAddress(rs.getString("vAdmAddress"));
               admin.setAdminPhone(rs.getString("cAdmPhone"));
        }
        closeConnection();
        return admin;
    }

    public Employee getEmployee(String email, String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Employee employee = new Employee();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * From Employee where cEmpEmail =" + "'" + email + "' and cEmpPassword =" + "'" + password + "'");
        if (rs.next()) {
                employee.setEmpEmail(rs.getString("cEmpEmail"));
                employee.setEmpPassword(rs.getString("cEmpPassword"));
                employee.setEmpID(rs.getString("cEmpID"));
                employee.setEmpName(rs.getString("vEmpName"));
                employee.setEmpAddress(rs.getString("vEmpAddress"));
                employee.setEmpPhone(rs.getString("cEmpPhone"));
                employee.setEmpEmail(rs.getString("cEmpEmail"));
                employee.setEmpPassword(rs.getString("cEmpPassword"));
        }
        closeConnection();
        return employee;
    }
}