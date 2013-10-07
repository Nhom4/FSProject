/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Permission;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class CategoryDAO extends ConnectionTool{
    public ArrayList<Category> getAllCategory() throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stt = conn.createStatement();
        ResultSet rs = stt.executeQuery("Select * From Category");
        ArrayList<Category> result = new ArrayList<Category>();
        while (rs.next()) {
            Category category = new Category();
            category.setCategoryID(rs.getString("cCatID"));
            category.setCategoryName(rs.getString("vCatName"));
            result.add(category);
        }
        closeConnection();
        return result;
    }
       public void addCategory(Category category) throws ClassNotFoundException, Exception {
            initConnection();
            CallableStatement cs = conn.prepareCall("{call prcInsertCategory(?)}");
            cs.setString(1, category.getCategoryName() );
            cs.executeUpdate();
            closeConnection();
    }
       public void updateCategory(Category category) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdatePermission(?,?)}");
        cs.setString(1, category.getCategoryID());
        cs.setString(2, category.getCategoryName());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteCategory(Category category) throws ClassNotFoundException, Exception {
        initConnection();
            CallableStatement cs = conn.prepareCall("{call prcDeletePermission(?)}");
            cs.setString(1,category.getCategoryID());
            cs.executeUpdate();
        closeConnection();
    }
}
