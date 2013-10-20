/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Order;
import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.dal.OrderDetailDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void addOrderDetail(String ordID, String proID, int ordQuantity, int ordPrice, int VAT) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderdetail.setProID(proID);
        orderdetail.setOrdQuantity(ordQuantity);
        orderdetail.setOrdPrice(ordPrice);
        orderdetail.setVAT(VAT);
        orderDetailDAO.addOrderDetail(orderdetail);
    }
    
    public void updateOrderDetail(String ordID, String proID, int ordQuantity, int ordPrice, int VAT) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderdetail.setProID(proID);
        orderdetail.setOrdQuantity(ordQuantity);
        orderdetail.setOrdPrice(ordPrice);
        orderdetail.setVAT(VAT);
        orderDetailDAO.updateOrderDetail(orderdetail);
    }
    
    public void deleteOrderDetail(String ordID,String proID) throws ClassNotFoundException, Exception{
        OrderDetail orderdetail = new OrderDetail();
        orderdetail.setOrdID(ordID);
        orderdetail.setProID(proID);
        orderDetailDAO.deleteOrderDetail(orderdetail);
    }
         public Product getProductID(String productName) throws ClassNotFoundException,Exception{
            return orderDetailDAO.getProductID(productName);
     }
   
}
