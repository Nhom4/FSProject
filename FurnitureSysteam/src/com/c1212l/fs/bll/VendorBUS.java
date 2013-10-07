/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Vendor;
import com.c1212l.fs.dal.CustomerDAO;
import com.c1212l.fs.dal.VendorDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class VendorBUS {
       VendorDAO vendorDAO = null;
       public VendorBUS(){
             vendorDAO = new VendorDAO();
}
       public ArrayList<Vendor> getAllVendor() throws ClassNotFoundException, SQLException{
        return vendorDAO.getAllVendor();
       }
       public void addVendor(String vendorName,String vendorAddress,String vendorPhone,String vendorFax,String vendorEmail) throws ClassNotFoundException, Exception{
        Vendor vendor = new Vendor();
        vendor.setVendorName(vendorName);
        vendor.setVendorAddress(vendorAddress);
        vendor.setVendorPhone(vendorPhone);
        vendor.setVendorFax(vendorFax);
        vendor.setVendorEmail(vendorEmail);
        vendorDAO.addVendor(vendor);
    }
}
