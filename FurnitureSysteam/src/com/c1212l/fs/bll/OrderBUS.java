/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Order;
import com.c1212l.fs.dal.OrderDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class OrderBUS {
    OrderDAO orderDAO = null;
    public OrderBUS(){
        orderDAO = new OrderDAO();
    }
    public ArrayList<Order> getAllOrder() throws ClassNotFoundException, SQLException{
        return orderDAO.getAllOrder();
    }
    
    public void addOrder(String cusID,Date ordDate,int ordTotalPrice,int VAT,String Status, String empID) throws ClassNotFoundException, Exception{
        Order order = new Order();
        order.setCusID(cusID);
        order.setOrdDate(ordDate);
        order.setOrdTotalPrice(ordTotalPrice);
        order.setVAT(VAT);
        order.setStatus(Status);
        order.setEmpID(empID);
        orderDAO.addOrder(order);
    }
    
    public void updateOrder(String ordID,String cusID,Date ordDate,int ordTotalPrice,int VAT,String Status, String empID) throws ClassNotFoundException, Exception{
        Order order = new Order();
        order.setOrdID(ordID);
        order.setCusID(cusID);
        order.setOrdDate(ordDate);
        order.setOrdTotalPrice(ordTotalPrice);
        order.setVAT(VAT);
        order.setStatus(Status);
        order.setEmpID(empID);
        orderDAO.addOrder(order);
    }
    
    public void deleteOrder(String ordID) throws ClassNotFoundException, Exception{
        Order order= new Order();
        order.setOrdID(ordID);
        orderDAO.deleteOrder(order);
    }
}
