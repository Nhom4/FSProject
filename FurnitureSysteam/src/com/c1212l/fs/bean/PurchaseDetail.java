/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.util.Vector;

/**
 *
 * @author KimDong
 */
public class PurchaseDetail {
    private String purID;
    private String proID;
    private int purQuantity;
    private int purPrice;
    private int VAT;

    public PurchaseDetail(String purID,String proID, int purQuantity, int purPrice,int VAT) {
        this.purID = purID;
        this.proID = proID;
        this.purQuantity = purQuantity;
        this.purPrice = purPrice;
        this.VAT = VAT;
    }

    public PurchaseDetail() {
 
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

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public int getVAT() {
        return VAT;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }
    
    
    public Vector getVector() {
        Vector result = new Vector();
        result.add(purID);
        result.add(proID);
        result.add(purQuantity);
        result.add(purPrice);
        result.add(VAT);
        return result;
    }
}
