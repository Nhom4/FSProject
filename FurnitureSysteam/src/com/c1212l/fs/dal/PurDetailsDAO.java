/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.PurchaseDetail;
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
public class PurDetailsDAO extends ConnectionTool {
    public ArrayList<PurchaseDetail> getAllPurDetails() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("select * from PurDetails");
        ArrayList<PurchaseDetail> result = new ArrayList<PurchaseDetail>();
        while(rs.next()){
            PurchaseDetail purdetails = new PurchaseDetail();
            purdetails.setPurID(rs.getString("cPurID"));
            purdetails.setPurQuantity(rs.getInt("iPurQuantity"));
            purdetails.setPurPrice(rs.getInt("iPurPrice"));
            purdetails.setVAT(rs.getInt("iVAT"));
            result.add(purdetails);
        }
        closeConnection();
        return result;
        
    }
    
    public void addPurDetail(PurchaseDetail purDetail) throws ClassNotFoundException, Exception {
            initConnection();
//              String error = "";
//            PreparedStatement pstmt = conn.prepareStatement("select * from Product where cPurID = ? and cProID = ?");
//            pstmt.setString(1,purDetail.getPurID());
//            pstmt.setString(2, purDetail.getProID());
//            if (pstmt.executeQuery().next()) {
//                error += "Error: Duplicate purDetail\n";
//            }
//            if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcInsertPurDetails(?,?,?,?,?)}");
            cs.setString(1, purDetail.getPurID());
            cs.setString(2, purDetail.getProID());
            cs.setInt(3, purDetail.getPurQuantity());
            cs.setInt(4, purDetail.getPurPrice());
            cs.setInt(5, purDetail.getVAT());
            cs.executeUpdate();
//             } else {
//                throw new Exception(error);
//            }
            closeConnection();
    }
    
    public void updatePurDetail(PurchaseDetail purDetail) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcUpdatePurDetails(?,?,?,?,?)}");
            cs.setString(1, purDetail.getPurID());
            cs.setString(2, purDetail.getProID());
            cs.setInt(3, purDetail.getPurQuantity());
            cs.setInt(4, purDetail.getPurPrice());
            cs.setInt(5, purDetail.getVAT());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void deletePurDetail(PurchaseDetail purdetail) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeletePurDetails(?,?)}");
            cs.setString(2, purdetail.getProID());
            cs.setString(1, purdetail.getPurID());
            cs.executeUpdate();
        closeConnection();
    }
 public Product getProductID (String productName) throws ClassNotFoundException,SQLException
     {
         initConnection();
         Statement stt = conn.createStatement();
         ResultSet rs = stt.executeQuery("Select * from Product where vProName="+"'"+productName+"'");
         Product product = new Product();
         while(rs.next())
         {
              product.setProductID(rs.getString("cProID"));
         }
         closeConnection();
         return product;
                 
     }
  
}

