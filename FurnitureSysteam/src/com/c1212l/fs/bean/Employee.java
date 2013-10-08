/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

import java.util.Vector;

/**
 *
 * @author Luu Bi
 */
public class Employee {
    private String empID;
    private String perID;
    private String empName;
    private String empAddress;
    private String empPhone;
    private String empEmail;
    private String empPassword;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPerID() {
        return perID;
    }

    public void setPerID(String perID) {
        this.perID = perID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }
    
     public Vector getVector() {
        Vector result = new Vector();
        result.add(empID);
        result.add(perID);
        result.add(empName);
        result.add(empAddress);
        result.add(empPhone);
        result.add(empEmail);
        result.add(empPassword);
        return result;
    }
    
}
