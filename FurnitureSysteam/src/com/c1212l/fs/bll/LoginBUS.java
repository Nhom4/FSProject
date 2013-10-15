/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Employee;
import com.c1212l.fs.bean.Login;
import com.c1212l.fs.dal.EmployeeDAO;
import com.c1212l.fs.dal.LoginDAO;
import java.sql.SQLException;

/**
 *
 * @author Thuy_Sociu
 */
public class LoginBUS {
    
    LoginDAO loginDAO;

    public LoginBUS() {
        loginDAO = new LoginDAO();
    }

    public Login getAdmin(String email, String password) throws ClassNotFoundException, SQLException {
        return loginDAO.getLogin(email, password);
    }

    public Employee getEmployee(String email,String password) throws ClassNotFoundException, SQLException {
        return loginDAO.getEmployee(email, password) ; 
    }
}