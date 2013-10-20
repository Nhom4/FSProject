/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Permission;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Purchase;
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
public class PurchaseDAO extends ConnectionTool {
    public ArrayList<Purchase> getAllPurchase() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Purchase");
        ArrayList<Purchase> result = new ArrayList<Purchase>();
        while (rs.next()) {
            Purchase purchase = new Purchase();
            purchase.setPurID(rs.getString("cPurID"));
            purchase.setPurDate(rs.getDate("dPurDate"));
            purchase.setPurTotalPrice(rs.getInt("iPurTotalPrice"));
            purchase.setStatus(rs.getInt("cStatus"));
            purchase.setEmpID(rs.getString("cEmpID"));
            result.add(purchase);
        }
        closeConnection();
        return result;
    }
    public void addPurchase(Purchase purchase) throws ClassNotFoundException, Exception {
            initConnection();
//            String error = "";
//            PreparedStatement pstmt = conn.prepareStatement("select * from Purchase where cPurTotalPrice = ?");
//            pstmt.setInt(1, purchase.getPurTotalPrice());
//            if (pstmt.executeQuery().next()) {
//                error += "Error: Duplicate total price number\n";
//            }
//          PreparedStatement  pstmt = conn.prepareStatement("select * from Purchase where cStatus = ?");
//            pstmt.setString(1, purchase.getStatus());
//            if (pstmt.executeQuery().next()) {
//                error += "Error: Duplicate purchase status\n";
//            }
//            if (error.equals("")) {
                CallableStatement cs = conn.prepareCall("{call prcInsertPurchase(?,?,?)}");
                cs.setDate(1,purchase.getPurDate());
                cs.setInt(2,purchase.getStatus());
                cs.setString(3,purchase.getEmpID());
                cs.executeUpdate();
//            } else {
//                throw new Exception(error);
//            }
            closeConnection();
    }
    public void updatePurchase(Purchase purchase) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdatePurchase(?,?,?)}");
                cs.setString(1,purchase.getPurID());
                cs.setDate(2,purchase.getPurDate());
//                cs.setInt(3,purchase.getPurTotalPrice());
                cs.setInt(3,purchase.getStatus());
                cs.setString(4,purchase.getEmpID());
                cs.executeUpdate();
        closeConnection();
    }
    public void deletePurchase(Purchase  purchase) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from PurDetails where  cPurID = ?");
        pstmt.setString(1, purchase.getPurID());
         if (pstmt.executeQuery().next()) {
             error+="Error: This purchase made at least one purchasedetails";
         }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeletePurchase(?)}");
            cs.setString(1,purchase.getPurID());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
        closeConnection();
    }
    public Purchase getPurchaseById(String purchaseID) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Purchase where cEmpID = " + purchaseID);
            Purchase purchase = null;
            if (rs.next()) {
                purchase = new Purchase();
                purchase.setPurID(rs.getString("cPurID"));
                purchase.setPurDate(rs.getDate("cPurDate"));
            }
            closeConnection();
            return purchase;
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
    
    public ArrayList<Purchase> searchPurchaseID(String purchaseID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Purchase " + purchaseID);
        ArrayList<Purchase> result = new ArrayList<Purchase>();
        while (rs.next()) {
            Purchase purchase = new Purchase();
            purchase.setPurID(rs.getString("cPurID"));
            purchase.setPurDate(rs.getDate("dPurDate"));
            purchase.setPurTotalPrice(rs.getInt("iPurTotalPrice"));
            purchase.setStatus(rs.getInt("cStatus"));
            purchase.setEmpID(rs.getString("cEmpID"));
            result.add(purchase);
        }
        closeConnection();
        return result;
    }
   public Product getCustomerID (String customerName) throws ClassNotFoundException,SQLException
     {
         initConnection();
         Statement stt = conn.createStatement();
         ResultSet rs = stt.executeQuery("Select * from Customer where vCusName="+"'"+customerName+"'");
         Product product = new Product();
         while(rs.next())
         {
              product.setProductID(rs.getString("cCusID"));
         }
         closeConnection();
         return product;
                 
     }  
}


