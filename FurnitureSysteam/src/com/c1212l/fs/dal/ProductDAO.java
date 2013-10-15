/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Vendor;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
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
            product.setVendorID(rs.getString("cVenID"));
            product.setCategoryId(rs.getString("cCatID"));
            product.setInventory(rs.getInt("iInventory"));
            result.add(product);
        }
        closeConnection();
        return result;
    }
     public void addProduct(Product product) throws ClassNotFoundException, Exception {
            initConnection();
            String error = "";
            PreparedStatement pstmt = conn.prepareStatement("select * from Product where vProName = ?");
            pstmt.setString(1, product.getProductName());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate product name\n";
            }
            if (error.equals("")) {
                CallableStatement cs = conn.prepareCall("{call prcInsertProduct(?,?,?,?)}");
                cs.setString(1, product.getProductName() );
                cs.setString(2,product.getProductDetail());
                cs.setString(3, product.getVendorID());
                cs.setString(4,product.getCategoryId());
                cs.executeUpdate();
            } else {
                throw new Exception(error);
            }
            closeConnection();
    }
     public void updateProduct(Product product) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateProduct(?,?,?,?,?)}");
        cs.setString(1, product.getProductID());
        cs.setString(2, product.getProductName());
        cs.setString(3, product.getProductDetail());
        cs.setString(4, product.getVendorID());
        cs.setString(5, product.getCategoryId());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteProduct(Product product) throws ClassNotFoundException, Exception {
        initConnection();
        String error = "";
        PreparedStatement pstmt = conn.prepareStatement("select * from PurDetails where  cProID = ?");
        pstmt.setString(1, product.getProductID());
        if (pstmt.executeQuery().next()) {
            error += "Error: This product made at least one PurDetails\n";
        }
        pstmt = conn.prepareStatement("select * from OrdDetails where  cProID = ?");
        pstmt.setString(1, product.getProductID());
         if (pstmt.executeQuery().next()) {
             error+="Error: This product made at least one OrdDetails";
         }
        if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeleteProduct(?)}");
            cs.setString(1,product.getProductID());
            cs.executeUpdate();
        } else {
            throw new Exception(error);
        }
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
         public Category getCategoryID (String categoryName) throws ClassNotFoundException,SQLException
     {
         initConnection();
         Statement stt = conn.createStatement();
         ResultSet rs = stt.executeQuery("Select * from Category where vCatName="+"'"+categoryName+"'");
         Category category = new Category();
         while(rs.next())
         {
              category.setCategoryID(rs.getString("cCatID"));
         }
         closeConnection();
         return category;
                 
     }
         public Vendor getVendorID(String vendorName) throws ClassNotFoundException,Exception{
            initConnection();
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery("Select * from Vendor where  vVenName="+"'"+vendorName+"'");
            Vendor vendor = new Vendor();
            while(rs.next()){
                vendor.setVendorID(rs.getString("cVenID"));
            }
            closeConnection();
            return vendor;
             
         }
}
