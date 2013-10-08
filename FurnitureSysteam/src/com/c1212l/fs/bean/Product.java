/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import com.c1212l.fs.dal.CategoryDAO;
import com.c1212l.fs.dal.VendorDAO;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Product {
    private String productID;
    private String productName;
    private String productDetail;
    private String categoryID;
    private String vendorID;

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getCategoryId() {
        return categoryID;
    }

    public void setCategoryId(String categoryId) {
        this.categoryID = categoryId;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }
    public Vector getVector() {
        Vector result = new Vector();
        result.add(productID);
        result.add(productName);
        result.add(productDetail);
        Category category = new CategoryDAO().getCategoryById(categoryID);
        result.add(category.getCategoryName()); 
        Vendor vendor = new VendorDAO().getVendorById(vendorID);
        result.add(vendor.getVendorName()); 
        return result;
    }
}
