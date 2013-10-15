/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.dal.CustomerDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author KimDong
 */
public class CustomerBUS {
       CustomerDAO customerDAO = null;
       public CustomerBUS(){
             customerDAO = new CustomerDAO();
}
       public ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException{
        return customerDAO.getAllCustomer();
       }
       public void addVendor(String customerName,String gender,String address,String phone,String email) throws ClassNotFoundException, Exception{
        Customer customer=new Customer();
        customer.setCustomerName(customerName);
        customer.setGender(gender);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setEmail(email);
        customerDAO.addCustomer(customer);
    }
      public void updateCustomer(String customerID, String customerName,String gender,String address,String phoneNumber,String email) throws ClassNotFoundException, Exception{
        Customer customer = new Customer();
        customer.setCustomerID(customerID);
        customer.setCustomerName(customerName);
        customer.setGender(gender);
        customer.setAddress(address);
        customer.setPhone(phoneNumber);
        customer.setEmail(email);
        customerDAO.updateCustomer(customer);
    }  
      public void deleteCustomer(String customerID) throws ClassNotFoundException, Exception{
        Customer customer= new Customer();
        customer.setCustomerID(customerID);
        customerDAO.deleteCustomer(customer);
    }
     
    public ArrayList<Customer> searchCustomerID(String customerID) throws ClassNotFoundException, SQLException {
        return customerDAO.searchCustomerID(customerID);
    }
    public ArrayList<Customer> searchCustomerName(String customerName) throws ClassNotFoundException, SQLException {
        return customerDAO.searchCustomerName(customerName);
    }
}
