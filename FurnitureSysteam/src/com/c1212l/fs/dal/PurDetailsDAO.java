/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.bean.PurchaseDetail;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author KimDong
 */
public class PurDetailsDAO {
    public ArrayList<PurDetails> getAllPurDetails() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("select * from PurDetails");
        ArrayList<PurDetails> result = new ArrayList<PurDetails>();
        while(rs.next()){
            PurDetails purdetails = new PurDetails();
            purdetails.setPurID(rs.getString("cPurID"));
            purdetails.setPurQuantity(rs.getString("iPurQuantity"));
            purdetails.setPurPrice(rs.getInt("cPurPrice"));
            result.add(purdetails);
        }
        closeConnection();
        return result;
        
    }
    
    
}

