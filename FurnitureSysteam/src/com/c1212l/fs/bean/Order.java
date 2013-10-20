/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import com.c1212l.fs.dal.CategoryDAO;
import com.c1212l.fs.dal.CustomerDAO;
import com.c1212l.fs.dal.EmployeeDAO;
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
    private int Status;
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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
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
        Customer customer = new CustomerDAO().getCustomerById(cusID);
        result.add(customer.getCustomerName());
        result.add(ordDate);
        result.add(ordTotalPrice);
        switch(Status){
            case 1:
                result.add("Approve");
                break;
            case 2:
                result.add("Disapprove");
                break;
            case 3:
                result.add("Waiting approve");
                break;
        }      
        Employee employee = new EmployeeDAO().getEmployeeById(empID);
        result.add(employee.getEmpName());
        return result;
    }
}
