/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import com.c1212l.fs.dal.CategoryDAO;
import com.c1212l.fs.dal.ProductDAO;
import java.util.Vector;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class OrderDetail {
    private String ordID;
    private String proID;
    private int ordQuantity;
    private int ordPrice;
    private int VAT;

    public String getOrdID() {
        return ordID;
    }

    public void setOrdID(String ordID) {
        this.ordID = ordID;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public int getOrdQuantity() {
        return ordQuantity;
    }

    public void setOrdQuantity(int ordQuantity) {
        this.ordQuantity = ordQuantity;
    }

    public int getOrdPrice() {
        return ordPrice;
    }

    public void setOrdPrice(int ordPrice) {
        this.ordPrice = ordPrice;
    }

    public int getVAT() {
        return VAT;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }
     public Vector getVector() {
        Vector result = new Vector();
        result.add(ordID);      
        Product product = new ProductDAO().getProductById(proID);
        result.add(product.getProductName());
        result.add(ordQuantity);
        result.add(ordPrice);
        result.add(VAT);
        return result;
    }
}
