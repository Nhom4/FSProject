/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Vendor;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class VendorDAO extends ConnectionTool {
     public ArrayList<Vendor> getAllVendor() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Vendor");
        ArrayList<Vendor> result = new ArrayList<Vendor>();
        while (rs.next()) {
            Vendor vendor = new Vendor();
            vendor.setVendorID(rs.getString("cVenID"));
            vendor.setVendorName(rs.getString("vVenName"));
            vendor.setVendorAddress(rs.getString("vVenAddress"));
            vendor.setVendorPhone(rs.getString("cVenPhone"));
            vendor.setVendorFax(rs.getString("cVenFax"));
            vendor.setVendorEmail(rs.getString("cVenEmail"));
            result.add(vendor);
        }
        closeConnection();
        return result;
    }
    public void addVendor(Vendor vendor) throws ClassNotFoundException, Exception {
       initConnection();
       CallableStatement cs = conn.prepareCall("{call prcInsertVendor(?,?,?,?,?)}");
       cs.setString(1, vendor.getVendorName());
       cs.setString(2, vendor.getVendorAddress());
       cs.setString(3, vendor.getVendorPhone());
       cs.setString(4, vendor.getVendorFax());
       cs.setString(5, vendor.getVendorEmail());
       cs.executeUpdate();
       closeConnection();
    }
}
