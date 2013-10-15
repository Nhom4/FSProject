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
       public void addEmployee(String employeeName,String employeAddress,String employeePhone,String employeeEmail,String password) throws ClassNotFoundException, Exception{
        Employee employee=new Employee();
        employee.setEmpName(employeeName);
        employee.setEmpAddress(employeAddress);
        employee.setEmpPhone(employeePhone);
        employee.setEmpEmail(employeeEmail);
        employee.setEmpPassword(password);
        employeeDAO.addEmployee(employee);
    }
      public void updateEmployee(String employeeID,String employeeName,String employeAddress,String employeePhone,String employeeEmail,String password) throws ClassNotFoundException, Exception{
        Employee employee=new Employee();
        employee.setEmpID(employeeID);
        employee.setEmpName(employeeName);
        employee.setEmpAddress(employeAddress);
        employee.setEmpPhone(employeePhone);
        employee.setEmpEmail(employeeEmail);
        employee.setEmpPassword(password);
        employeeDAO.updateEmployee(employee);
    }  
      public void deleteEmployee(String employeeID) throws ClassNotFoundException, Exception{
        Employee employee = new Employee();
        employee.setEmpID(employeeID);
        employeeDAO.deleteEmployee(employee);
    } 
    public ArrayList<Employee> searchEmployeeName(String empName) throws ClassNotFoundException, SQLException {
        return employeeDAO.searchEmployeeName(empName);
    }
    
    public ArrayList<Employee> searchEmployeeID(String empID) throws ClassNotFoundException, SQLException {
        return employeeDAO.searchEmployeeID(empID);
    }
}
