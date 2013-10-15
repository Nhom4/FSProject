/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.OrderDetail;
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
            CallableStatement cs = conn.prepareCall("{call prcInsertPurDetail(?,?,?,?,?)}");
            cs.setString(1, purDetail.getPurID());
            cs.setString(2, purDetail.getProID());
            cs.setInt(3, purDetail.getPurQuantity());
            cs.setInt(4, purDetail.getPurPrice());
            cs.setInt(5, purDetail.getVAT());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void updatePurDetail(PurchaseDetail purDetail) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcUpdatePurDetail(?,?,?,?,?)}");
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
            CallableStatement cs = conn.prepareCall("{call prcDeletePurDetail(?)}");
            cs.setString(1, purdetail.getPurID());
            cs.executeUpdate();
        closeConnection();
    }
    
  
}

