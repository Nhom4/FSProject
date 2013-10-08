/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Vendor;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class ProductDAO extends ConnectionTool {
     public ArrayList<Product> getAllProduct() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Product");
        ArrayList<Product> result = new ArrayList<Product>();
        while (rs.next()) {
            Product product = new Product();
            product.setProductID(rs.getString("cProID"));
            product.setProductName(rs.getString("vProName"));
            product.setProductDetail(rs.getString("vProDetails"));
            product.setCategoryId(rs.getString("cVenID"));
            product.setVendorID(rs.getString("cCatID"));
            result.add(product);
        }
        closeConnection();
        return result;
    }
     public void addProduct(Product product) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcInsertProduct(?,?,?,?)}");
            cs.setString(1, product.getProductName() );
            cs.setString(2,product.getProductDetail());
            cs.setString(3,product.getCategoryId());
            cs.setString(4, product.getVendorID());
            cs.executeUpdate();
            closeConnection();
    }
     public void updateProduct(Product product) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateProduct(?,?,?,?,?)}");
        cs.setString(1, product.getProductID());
        cs.setString(2, product.getProductName());
        cs.setString(3, product.getProductDetail());
        cs.setString(4, product.getCategoryId());
        cs.setString(5, product.getVendorID());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteProduct(Product product) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeleteProduct(?)}");
            cs.setString(1,product.getProductID());
            cs.executeUpdate();
        closeConnection();
    }
     public Product getProductById(String productID) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Product where cProID = " + productID);
            Product product = null;
            if (rs.next()) {
                product = new Product();
                product.setProductID(rs.getString("cProID"));
                product.setProductName(rs.getString("vProName"));
            }
            closeConnection();
            return product;
        } catch (Exception ex) {
            return null;
        }
     }
}
