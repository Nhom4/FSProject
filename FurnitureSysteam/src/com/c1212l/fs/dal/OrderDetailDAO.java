/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Order;
import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.bean.Product;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class OrderDetailDAO extends ConnectionTool {
    public ArrayList<OrderDetail> getAllOrderDetail() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("select * from OrdDetails");
        ArrayList<OrderDetail> result = new ArrayList<OrderDetail>();
        while(rs.next()){
            OrderDetail orderdetail = new OrderDetail();
            orderdetail.setOrdID(rs.getString("cOrdID"));
            orderdetail.setProID(rs.getString("cProID"));
            orderdetail.setOrdQuantity(rs.getInt("iOrdQuantity"));
            orderdetail.setOrdPrice(rs.getInt("iOrdPrice"));
            orderdetail.setVAT(rs.getInt("iVAT"));
            result.add(orderdetail);
        }
        closeConnection();
        return result;
        
    }
    
    public void addOrderDetail(OrderDetail orderdetail) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcInsertOrdDetails(?,?,?,?,?)}");
            cs.setString(1, orderdetail.getOrdID());
            cs.setString(2, orderdetail.getProID());
            cs.setInt(3, orderdetail.getOrdQuantity());
            cs.setInt(4, orderdetail.getOrdPrice());
            cs.setInt(5, orderdetail.getVAT());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void updateOrderDetail(OrderDetail orderdetail) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcUpdateOrdDetails(?,?,?,?,?)}");
            cs.setString(1, orderdetail.getOrdID());
            cs.setString(2, orderdetail.getProID());
            cs.setInt(3, orderdetail.getOrdQuantity());
            cs.setInt(4, orderdetail.getOrdPrice());
            cs.setInt(5, orderdetail.getVAT());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void deleteOrderDetail(OrderDetail orderdetail) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeleteOrdDetails(?,?)}");
            cs.setString(1, orderdetail.getOrdID());
            cs.setString(2, orderdetail.getProID());
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
