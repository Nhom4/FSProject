/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Order {
    private String ordID;
    private String cusID;
    private Date ordDate;
    private int ordTotalPrice;
    private String Status;
    private String empID;

    public String getOrdID() {
        return ordID;
    }

    public void setOrdID(String ordID) {
        this.ordID = ordID;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public int getOrdTotalPrice() {
        return ordTotalPrice;
    }

    public void setOrdTotalPrice(int ordTotalPrice) {
        this.ordTotalPrice = ordTotalPrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }
    
     public Vector getVector() {
        Vector result = new Vector();
        result.add(ordID);
        result.add(cusID);
        result.add(ordDate);
        result.add(ordTotalPrice);
        result.add(Status);
        result.add(empID);
        return result;
    }
    
}
