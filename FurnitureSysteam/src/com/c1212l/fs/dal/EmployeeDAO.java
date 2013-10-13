/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Employee;
import com.c1212l.fs.bean.Permission;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Vendor;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class EmployeeDAO extends ConnectionTool {
    public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Employee");
        ArrayList<Employee> result = new ArrayList<Employee>();
        while (rs.next()) {
            Employee employee = new Employee();
            employee.setEmpID(rs.getString("cEmpID"));
            employee.setPerID(rs.getString("cPerID"));
            employee.setEmpName(rs.getString("vEmpName"));
            employee.setEmpAddress(rs.getString("vEmpAddress"));
            employee.setEmpPhone(rs.getString("cEmpPhone"));
            employee.setEmpEmail(rs.getString("cEmpEmail"));
            employee.setEmpPassword(rs.getString("cEmpPassword"));
            result.add(employee);
        }
        closeConnection();
        return result;
    }
    public void addEmployee(Employee employee) throws ClassNotFoundException, Exception {
            initConnection();
            String error = "";
            PreparedStatement pstmt = conn.prepareStatement("select * from Employee where cEmpPhone = ?");
            pstmt.setString(1, employee.getEmpPhone());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate phone number\n";
            }
            pstmt = conn.prepareStatement("select * from Employee where cEmpEmail = ?");
            pstmt.setString(1, employee.getEmpEmail());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate employee email\n";
            }
            if (error.equals("")) {
                CallableStatement cs = conn.prepareCall("{call prcInsertEmployee(?,?,?,?,?,?)}");
                cs.setString(1, employee.getPerID());
                cs.setString(2,employee.getEmpName());
                cs.setString(3,employee.getEmpAddress());
                cs.setString(4,employee.getEmpPhone());
                cs.setString(5,employee.getEmpEmail());
                cs.setString(6,employee.getEmpPassword());
                cs.executeUpdate();
            } else {
                throw new Exception(error);
            }
            closeConnection();
    }
     public void updateEmployee(Employee employee) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateEmployee(?,?,?,?,?)}");
        cs.setString(1,employee.getEmpID());
        cs.setString(2, employee.getPerID());
        cs.setString(3,employee.getEmpName());
        cs.setString(4,employee.getEmpAddress());
        cs.setString(5,employee.getEmpPhone());
        cs.setString(6,employee.getEmpEmail());
        cs.setString(7,employee.getEmpPassword());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteEmployee(Employee  employee) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from Purchase where  cEmpID = ?");
        pstmt.setString(1,employee.getEmpID());
        if (pstmt.executeQuery().next()) {
            error += "Error: This employee made at least one purchase\n";
        }
        pstmt = conn.prepareStatement("select * from Orders where  cEmpID = ?");
        pstmt.setString(1, employee.getEmpID());
         if (pstmt.executeQuery().next()) {
             error+="Error: This product made at least one orders";
         }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeleteEmployee(?)}");
            cs.setString(1,employee.getEmpID());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }
     public Employee getEmployeeById(String employeeID) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Employee where cEmpID = " + employeeID);
            Employee employee = null;
            if (rs.next()) {
                employee = new Employee();
                employee.setEmpID(rs.getString("cEmpID"));
                employee.setEmpName(rs.getString("vEmpName"));
            }
            closeConnection();
            return employee;
        } catch (Exception ex) {
            return null;
        }
     }
    public Permission getPermissionID (String permissionName) throws ClassNotFoundException,SQLException
     {
         initConnection();
         Statement stt = conn.createStatement();
         ResultSet rs = stt.executeQuery("Select * from Permission where vPerName="+"'"+permissionName+"'");
         Permission permission = new Permission();
         while(rs.next())
         {
              permission.setPermissionID(rs.getString("cPerID"));
         }
         closeConnection();
         return permission;
                 
     }
    
     public ArrayList<Employee> searchEmployeeID(String empID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Employee " + empID);
        ArrayList<Employee> result = new ArrayList<Employee>();
        while (rs.next()) {
            Employee employee = new Employee();
            employee.setEmpID(rs.getString("cEmpID"));
            employee.setPerID(rs.getString("cPerID"));
            employee.setEmpName(rs.getString("vEmpName"));
            employee.setEmpAddress(rs.getString("vEmpAddress"));
            employee.setEmpPhone(rs.getString("cEmpPhone"));
            employee.setEmpEmail(rs.getString("cEmpEmail"));
            employee.setEmpPassword(rs.getString("cEmpPassword"));
            result.add(employee);
        }
        closeConnection();
        return result;
    }
     
     public ArrayList<Employee> searchEmployeeName(String empName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Employee " + empName);
        ArrayList<Employee> result = new ArrayList<Employee>();
        while (rs.next()) {
            Employee employee = new Employee();
            employee.setEmpID(rs.getString("cEmpID"));
            employee.setPerID(rs.getString("cPerID"));
            employee.setEmpName(rs.getString("vEmpName"));
            employee.setEmpAddress(rs.getString("vEmpAddress"));
            employee.setEmpPhone(rs.getString("cEmpPhone"));
            employee.setEmpEmail(rs.getString("cEmpEmail"));
            employee.setEmpPassword(rs.getString("cEmpPassword"));
            result.add(employee);
        }
        closeConnection();
        return result;
    }

}
