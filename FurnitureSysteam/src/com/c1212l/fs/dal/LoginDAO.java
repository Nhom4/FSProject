/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Login;
import com.c1212l.fs.bean.Employee;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thuy_Sociu
 */
public class LoginDAO extends ConnectionTool {
    public Login getLogin(String email,String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Adm where cAdmEmail="+"'"+email+"'and cAdmPassword="+"'"+password+"'");
        Login login = new Login();
        while (rs.next()) {
            login.setId(rs.getString("cAdmID"));
            login.setEmail(rs.getString("cAdmEmail"));
            login.setPassword(rs.getString("cAdmPassword"));
            login.setAddress(rs.getString("vAdmAddress"));
            login.setName(rs.getString("vAdmName"));
            login.setPhone(rs.getString("cAdmPhone"));
        }
        closeConnection();
        return login;
    }
        public Employee getEmployee(String email,String password) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Employee where cEmpEmail = "+"'"+email+"'and cEmpPassword="+"'"+password+"'");
        Employee employee = new Employee();
        while (rs.next()) {
            employee.setEmpID(rs.getString("cEmpID"));
            employee.setEmpEmail(rs.getString("cEmpEmail"));
            employee.setEmpPassword(rs.getString("cEmpPassword"));
            employee.setEmpAddress(rs.getString("vEmpAddress"));
            employee.setEmpName(rs.getString("vEmpName"));
            employee.setEmpPhone(rs.getString("cEmpEmail"));
        }
        closeConnection();
        return employee;
    }
}

