/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Customer;
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
       String error = "";
            PreparedStatement pstmt = conn.prepareStatement("select * from Vendor where vVenName = ?");
            pstmt.setString(1, vendor.getVendorName());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate Vendor name\n";
            }
            if (error.equals("")) {
       CallableStatement cs = conn.prepareCall("{call prcInsertVendor(?,?,?,?,?)}");
       cs.setString(1, vendor.getVendorName());
       cs.setString(2, vendor.getVendorAddress());
       cs.setString(3, vendor.getVendorPhone());
       cs.setString(4, vendor.getVendorFax());
       cs.setString(5, vendor.getVendorEmail());
       cs.executeUpdate();
       } else {
                throw new Exception(error);
            }
       closeConnection();
    }
      public void updateVendor(Vendor vendor) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateVendor(?,?,?,?,?,?)}");
        cs.setString(1, vendor.getVendorID());
        cs.setString(2,vendor.getVendorName());
        cs.setString(3, vendor.getVendorAddress());
        cs.setString(4, vendor.getVendorPhone());
        cs.setString(5,vendor.getVendorFax());
        cs.setString(6, vendor.getVendorEmail());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteVendor(Vendor vendor) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from Product where  cVenID = ?");
        pstmt.setString(1, vendor.getVendorID());
        if (pstmt.executeQuery().next()) {
            error += "Error: This vendor made at least one Product\n";
        }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeleteVendor(?)}");
            cs.setString(1,vendor.getVendorID());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }
   public Vendor getVendorById(String vendorID) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Vendor where cVenID = " +"'"+ vendorID+"'");
            Vendor vendor = null;
            if (rs.next()) {
                vendor = new Vendor();
                vendor.setVendorID(rs.getString("cVenID"));
                vendor.setVendorName(rs.getString("vVenName"));
            }
            closeConnection();
            return vendor;
        } catch (Exception ex) {
            return null;
        }
    }
    public ArrayList<Vendor> searchVendorName(String vendorName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Vendor " + vendorName);
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
      public ArrayList<Vendor> searchVendorID(String vendorID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Vendor " + vendorID);
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
}
