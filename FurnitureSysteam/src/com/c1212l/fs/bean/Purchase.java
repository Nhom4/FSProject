/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class Purchase {
    private String purID;
    private String purDate;
    private int purTotalPrice;
    private int VAT;
    private String Status;
    private String empID;

    public Purchase(String purID, String purDate, int purTotalPrice, int VAT, String Status, String empID) {
        this.purID = purID;
        this.purDate = purDate;
        this.purTotalPrice = purTotalPrice;
        this.VAT = VAT;
        this.Status = Status;
        this.empID = empID;
        
    }

    public String getPurID() {
        return purID;
    }

    public String getPurDate() {
        return purDate;
    }

    public int getPurTotalPrice() {
        return purTotalPrice;
    }

    public int getVAT() {
        return VAT;
    }

    public String getStatus() {
        return Status;
    }

    public String getEmpID() {
        return empID;
    }

    public void setPurID(String purID) {
        this.purID = purID;
    }

    public void setPurDate(String purDate) {
        this.purDate = purDate;
    }

    public void setPurTotalPrice(int purTotalPrice) {
        this.purTotalPrice = purTotalPrice;
    }

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
    
    
    
}
