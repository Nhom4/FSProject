/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

/**
 *
 * @author KimDong
 */
public class PurchaseDetail {
    private String purID;
    private int purQuantity;
    private int purPrice;

    public PurchaseDetail(String purID, int purQuantity, int purPrice) {
        this.purID = purID;
        this.purQuantity = purQuantity;
        this.purPrice = purPrice;
    }

    public String getPurID() {
        return purID;
    }

    public int getPurQuantity() {
        return purQuantity;
    }

    public int getPurPrice() {
        return purPrice;
    }

    public void setPurID(String purID) {
        this.purID = purID;
    }

    public void setPurQuantity(int purQuantity) {
        this.purQuantity = purQuantity;
    }

    public void setPurPrice(int purPrice) {
        this.purPrice = purPrice;
    }
    
    
}
