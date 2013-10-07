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
public class Vendor {
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;
    private String vendorFax;
    private String vendorEmail;

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorFax() {
        return vendorFax;
    }

    public void setVendorFax(String vendorFax) {
        this.vendorFax = vendorFax;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }
    public Vector getVector() {
        Vector result = new Vector();
        result.add(vendorID);
        result.add(vendorName);
        result.add(vendorAddress);
        result.add(vendorPhone);
        result.add(vendorFax);
        result.add(vendorEmail);
        return result;
    }
    
}
