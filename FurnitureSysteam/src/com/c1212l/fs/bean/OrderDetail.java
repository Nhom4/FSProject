/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

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
    
     public Vector getVector() {
        Vector result = new Vector();
        result.add(ordID);
        result.add(proID);
        result.add(ordQuantity);
        result.add(ordPrice);
        return result;
    }
}
