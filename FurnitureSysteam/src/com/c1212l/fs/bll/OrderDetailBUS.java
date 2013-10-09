/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.dal.OrderDetailDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class OrderDetailBUS {
    OrderDetailDAO orderDetailDAO = null;
    public OrderDetailBUS(){
        orderDetailDAO = new OrderDetailDAO();
    }
    public ArrayList<OrderDetail> getAllOrderDetail() throws ClassNotFoundException, SQLException{
        return orderDetailDAO.getAllOrderDetail();
    }
    
    public void addOrderDetail(String ordID, String proID, int ordQuantity, int ordPrice) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderdetail.setProID(proID);
        orderdetail.setOrdQuantity(ordQuantity);
        orderdetail.setOrdPrice(ordPrice);
        orderDetailDAO.addOrderDetail(orderdetail);
    }
    
    public void updateOrderDetail(String ordID, String proID, int ordQuantity, int ordPrice) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderdetail.setProID(proID);
        orderdetail.setOrdQuantity(ordQuantity);
        orderdetail.setOrdPrice(ordPrice);
        orderDetailDAO.addOrderDetail(orderdetail);
    }
    
    public void deleteOrderDetail(String ordID) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderDetailDAO.deleteOrderDetail(orderdetail);
    }
}
