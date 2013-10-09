/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Employee;
import com.c1212l.fs.bean.Permission;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Vendor;
import com.c1212l.fs.dal.EmployeeDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class EmployeeBUS {
       EmployeeDAO employeeDAO = null;
       public EmployeeBUS(){
             employeeDAO = new EmployeeDAO();
}
       public ArrayList<Employee> getAllEmployee() throws ClassNotFoundException, SQLException{
        return employeeDAO.getAllEmployee();
       }
       public void addEmployee(String permissionID,String employeeName,String employeAddress,String employeePhone,String employeeEmail,String password) throws ClassNotFoundException, Exception{
        Employee employee=new Employee();
        employee.setPerID(permissionID);
        employee.setEmpName(employeeName);
        employee.setEmpAddress(employeAddress);
        employee.setEmpPhone(employeePhone);
        employee.setEmpEmail(employeeEmail);
        employee.setEmpPassword(password);
        employeeDAO.addEmployee(employee);
    }
      public void updateEmployee(String employeeID,String permissionID,String employeeName,String employeAddress,String employeePhone,String employeeEmail,String password) throws ClassNotFoundException, Exception{
        Employee employee=new Employee();
        employee.setEmpID(employeeID);
        employee.setPerID(permissionID);
        employee.setEmpName(employeeName);
        employee.setEmpAddress(employeAddress);
        employee.setEmpPhone(employeePhone);
        employee.setEmpEmail(employeeEmail);
        employee.setEmpPassword(password);
        employeeDAO.addEmployee(employee);
    }  
      public void deleteEmployee(String employeeID) throws ClassNotFoundException, Exception{
        Employee employee = new Employee();
        employee.setEmpID(employeeID);
        employeeDAO.addEmployee(employee);
    } 
     public Permission getPermissionID(String permissionID) throws ClassNotFoundException,Exception{
            return employeeDAO.getPermissionID(permissionID);   
     } 
}
