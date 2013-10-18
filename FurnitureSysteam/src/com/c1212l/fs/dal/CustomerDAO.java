/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Customer;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author KimDong
 */
public class CustomerDAO extends ConnectionTool{
        public ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Customer");
        ArrayList<Customer> result = new ArrayList<Customer>();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rs.getString("cCusID"));
            customer.setCustomerName(rs.getString("vCusName"));
            customer.setGender(rs.getString("cCusSex"));
            customer.setAddress(rs.getString("vCusAddress"));
            customer.setPhone(rs.getString("cCusPhone"));
            customer.setEmail(rs.getString("cCusEmail"));
            result.add(customer);
        }
        closeConnection();
        return result;
    }
       public void addCustomer(Customer customer) throws ClassNotFoundException, Exception {
            initConnection();
            String error = "";
            PreparedStatement pstmt = conn.prepareStatement("select * from Customer where vCusName = ?");
            pstmt.setString(1, customer.getCustomerName());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate Customer name\n";
            }
            if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcInsertCustomer(?,?,?,?,?)}");
            cs.setString(1, customer.getCustomerName());
            cs.setString(2, customer.getGender());
            cs.setString(3, customer.getAddress());
            cs.setString(4, customer.getPhone());
            cs.setString(5,customer.getEmail());
            cs.executeUpdate();
            } else {
                throw new Exception(error);
            }
            closeConnection();
    }
       public void updateCustomer(Customer customer) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateCustomer(?,?,?,?,?,?)}");
        cs.setString(1, customer.getCustomerID());
        cs.setString(2, customer.getCustomerName());
        cs.setString(3, customer.getGender());
        cs.setString(4, customer.getAddress());
        cs.setString(5, customer.getPhone());
        cs.setString(6, customer.getEmail());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteCustomer(Customer customer) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeleteCustomer(?)}");
            cs.setString(1, customer.getCustomerID());
            cs.executeUpdate();
        closeConnection();
    }
     
     public ArrayList<Customer> searchCustomerID(String customerID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Customer " + customerID);
        ArrayList<Customer> result = new ArrayList<Customer>();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rs.getString("cCusID"));
            customer.setCustomerName(rs.getString("vCusName"));
            customer.setGender(rs.getString("cCusSex"));
            customer.setAddress(rs.getString("vCusAddress"));
            customer.setPhone(rs.getString("cCusPhone"));
            customer.setEmail(rs.getString("cCusEmail"));
            result.add(customer);
        }
        closeConnection();
        return result;
    }
     
     public ArrayList<Customer> searchCustomerName(String customerName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Customer " + customerName);
        ArrayList<Customer> result = new ArrayList<Customer>();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rs.getString("cCusID"));
            customer.setCustomerName(rs.getString("vCusName"));
            customer.setGender(rs.getString("cCusSex"));
            customer.setAddress(rs.getString("vCusAddress"));
            customer.setPhone(rs.getString("cCusPhone"));
            customer.setEmail(rs.getString("cCusEmail"));
            result.add(customer);
        }
        closeConnection();
        return result;
    }
}
