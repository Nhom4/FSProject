/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Employee;
import com.c1212l.fs.bean.Order;
import com.c1212l.fs.bean.Product;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import sun.jdbc.odbc.OdbcDef;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class OrderDAO extends ConnectionTool {
    public ArrayList<Order> getAllOrder() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("select * from Orders");
        ArrayList<Order> result = new ArrayList<Order>();
        while(rs.next()){
            Order order = new Order();
            order.setOrdID(rs.getString("cOrdID"));
            order.setCusID(rs.getString("cCusID"));
            order.setOrdDate(rs.getDate("dOrdDate"));
            order.setOrdTotalPrice(rs.getInt("iOrdTotalPrice"));
            order.setStatus(rs.getInt("cStatus"));
            order.setEmpID(rs.getString("cEmpID"));
            result.add(order);
        }
        closeConnection();
        return result;
        
    }
    
    public void addOrder(Order order) throws ClassNotFoundException, Exception {
            initConnection();            
            CallableStatement cs = conn.prepareCall("{call prcInsertOrders(?,?,?,?)}");
            /*cs.setString(1, order.getOrdID());
            cs.setString(2, order.getCusID());
            cs.setDate(3, order.getOrdDate());
            cs.setInt(4, order.getOrdTotalPrice());
            cs.setString(6, order.getStatus());
            cs.setString(7, order.getEmpID());
            * */
            cs.setString(1, order.getCusID());
            cs.setDate(2, order.getOrdDate());
            cs.setInt(3, order.getStatus());
            cs.setString(4, order.getEmpID());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void updateOrder(Order order) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateOrders(?,?,?,?,?)}");
        cs.setString(1, order.getOrdID());
        cs.setDate(2, order.getOrdDate());
        cs.setString(3, order.getCusID());
        cs.setInt(4, order.getStatus());
        cs.setString(5, order.getEmpID());
        cs.executeUpdate();
        closeConnection();
    }
    
    public void deleteOrder(Order order) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from OrdDetails where  cOrdID = ?");
        pstmt.setString(1, order.getOrdID());
         if (pstmt.executeQuery().next()) {
             error+="Error: This order made at least one orderdetails";
         }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeleteOrders(?)}");
            cs.setString(1, order.getOrdID());
            cs.executeUpdate();
        }
          else {
            throw new Exception(error);
        }
        closeConnection();
    }
    
    public ArrayList<Order> searchPurchaseID(String orderID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Orders " + orderID);
        ArrayList<Order> result = new ArrayList<Order>();
        while (rs.next()) {
            Order order = new Order();
            order.setOrdID(rs.getString("cOrdID"));
            order.setCusID(rs.getString("cCusID"));
            order.setOrdDate(rs.getDate("dOrdDate"));
            order.setOrdTotalPrice(rs.getInt("iOrdTotalPrice"));
            order.setStatus(rs.getInt("cStatus"));
            order.setEmpID(rs.getString("cEmpID"));
            result.add(order);
        }
        closeConnection();
        return result;
    }
     public Customer getCustomerID (String customerName) throws ClassNotFoundException,SQLException
     {
         initConnection();
         Statement stt = conn.createStatement();
         ResultSet rs = stt.executeQuery("Select * from Customer where vCusName="+"'"+customerName+"'");
         Customer customer = new Customer();
         while(rs.next())
         {
              customer.setCustomerID(rs.getString("cCusID"));
         }
         closeConnection();
         return customer;
                 
     }
}
