/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Product;
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
        product.setCategoryId(categoryID);
        product.setVendorID(vendorID);
        productDAO.updateProduct(product);
    }  
      public void deleteCustomer(String productID) throws ClassNotFoundException, Exception{
        Product product=new Product();
        product.setProductID(productID);
        productDAO.deleteProduct(product);
    } 
}
