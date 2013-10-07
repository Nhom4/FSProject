/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.util.Vector;

/**
 *
 * @author KimDong
 */
public class Customer {
    private String customerID ;
    private String customerName;
    private String gender;
    private String address;
    private String email;
    private String phone;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
        public Vector getVector() {
        Vector result = new Vector();
        result.add(customerID);
        result.add(customerName);
        result.add(gender);
        result.add(address);
        result.add(phone);
        result.add(email);
        return result;
    }

}
