/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import com.c1212l.fs.dal.EmployeeDAO;
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
    private int Status;
    private String empID;
    public String getPurID() {
        return purID;
    }

    public Date getPurDate() {
        return purDate;
    }

    public int getPurTotalPrice() {
        return purTotalPrice;
    }


    public int getStatus() {
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


    public void setStatus(int Status) {
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
