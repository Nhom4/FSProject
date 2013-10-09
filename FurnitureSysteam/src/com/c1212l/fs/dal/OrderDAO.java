/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Order;
import java.sql.CallableStatement;
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
        ResultSet rs = stt.executeQuery("select * from Order");
        ArrayList<Order> result = new ArrayList<Order>();
        while(rs.next()){
            Order order = new Order();
            order.setOrdID(rs.getString("cOrdID"));
            order.setCusID(rs.getString("cCusID"));
            order.setOrdDate(rs.getDate("dOrdDate"));
            order.setOrdTotalPrice(rs.getInt("iOrdTotalPrice"));
            order.setVAT(rs.getInt("iVAT"));
            order.setStatus(rs.getString("cStatus"));
            order.setEmpID(rs.getString("cEmpID"));
            result.add(order);
        }
        closeConnection();
        return result;
        
    }
    
    public void addOrder(Order order) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcInsertOrder(?,?,?,?,?)}");
            cs.setString(1, order.getOrdID());
            cs.setString(2, order.getCusID());
            cs.setDate(3, order.getOrdDate());
            cs.setInt(4, order.getOrdTotalPrice());
            cs.setInt(5, order.getVAT());
            cs.setString(6, order.getStatus());
            cs.setString(7, order.getEmpID());
            cs.executeUpdate();
            closeConnection();
    }
    
    public void updateOrder(Order order) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateOrder(?,?,?,?,?,?)}");
        cs.setString(1, order.getOrdID());
        cs.setString(2, order.getCusID());
        cs.setDate(3, order.getOrdDate());
        cs.setInt(4, order.getOrdTotalPrice());
        cs.setInt(5, order.getVAT());
        cs.setString(6, order.getStatus());
        cs.setString(7, order.getEmpID());
        cs.executeUpdate();
        closeConnection();
    }
    
    public void deleteOrder(Order order) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeleteOrder(?)}");
            cs.setString(1, order.getOrdID());
            cs.executeUpdate();
        closeConnection();
    }
}
