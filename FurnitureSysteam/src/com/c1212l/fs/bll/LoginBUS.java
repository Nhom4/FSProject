/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Admin;
import com.c1212l.fs.bean.Employee;
import com.c1212l.fs.dal.LoginDAO;
import java.sql.SQLException;

/**
 *
 * @author Luu Bi
 */
public class LoginBUS {
    
    LoginDAO loginDAO;

    public LoginBUS() {
        loginDAO = new LoginDAO();
    }

    public Admin getAdmin(String email, String password) throws ClassNotFoundException, SQLException {
        return loginDAO.getAdmin(email, password);

    }

    public Employee getEmployee(String email, String password) throws ClassNotFoundException, SQLException {
        return loginDAO.getEmployee(email, password);
    }
}
