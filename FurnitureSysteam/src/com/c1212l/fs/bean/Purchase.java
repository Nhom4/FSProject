/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class Purchase {
    private String purID;
    private Date purDate;
    private int purTotalPrice;
    private int VAT;
    private String Status;
    private String empID;

    public Purchase(String purID, Date purDate, int purTotalPrice, int VAT, String Status, String empID) {
        this.purID = purID;
        this.purDate = purDate;
        this.purTotalPrice = purTotalPrice;
        this.VAT = VAT;
        this.Status = Status;
        this.empID = empID;
        
    }

    public Purchase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPurID() {
        return purID;
    }

    public Date getPurDate() {
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

    public void setPurDate(Date purDate) {
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
    
    public Vector getVector() {
        Vector result = new Vector();
        result.add(purID);
        result.add(purDate);
        result.add(purTotalPrice);
        result.add(VAT);
        result.add(Status);
        result.add(empID);
        return result;
    }
    
}
