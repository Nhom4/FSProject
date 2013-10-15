/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Vendor;
import com.c1212l.fs.dal.CustomerDAO;
import com.c1212l.fs.dal.ProductDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class ProductBUS {
        ProductDAO productDAO = null;
       public ProductBUS(){
             productDAO = new ProductDAO();
}
       public ArrayList<Product> getAllProduct() throws ClassNotFoundException, SQLException{
        return productDAO.getAllProduct();
       }
       public void addProduct(String productName,String productDetail,String categoryID,String vendorID) throws ClassNotFoundException, Exception{
        Product product=new Product();
        product.setProductName(productName);
        product.setProductDetail(productDetail);
        product.setCategoryId(categoryID);
        product.setVendorID(vendorID);
        productDAO.addProduct(product);
    }
      public void updateProduct(String productID,String productName,String productDetail,String categoryID,String vendorID) throws ClassNotFoundException, Exception{
        Product product=new Product();
        product.setProductID(productID);
        product.setProductName(productName);
        product.setProductDetail(productDetail);
        product.setVendorID(vendorID);
        product.setCategoryId(categoryID);
        productDAO.updateProduct(product);
    }  
      public void deleteProduct(String productID) throws ClassNotFoundException, Exception{
        Product product=new Product();
        product.setProductID(productID);
        productDAO.deleteProduct(product);
    } 
     public Category getCategoryID(String categoryName) throws ClassNotFoundException,Exception{
            return productDAO.getCategoryID(categoryName);   
     }
      public Vendor getVendorID(String vendorName) throws ClassNotFoundException,Exception{
            return productDAO.getVendorID(vendorName);
     }
}
