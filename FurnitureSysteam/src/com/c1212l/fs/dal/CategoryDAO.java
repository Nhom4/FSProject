/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.dal;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Permission;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
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
            String error = "";
            PreparedStatement pstmt = conn.prepareStatement("select * from Category where vCatName = ?");
            pstmt.setString(1, category.getCategoryName());
            if (pstmt.executeQuery().next()) {
                error += "Error: Duplicate product name\n";
            }
            if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcInsertCategory(?)}");
            cs.setString(1, category.getCategoryName() );
            cs.executeUpdate();
            } else {
                throw new Exception(error);
            }
            closeConnection();
    }
       public void updateCategory(Category category) throws ClassNotFoundException, Exception {
        initConnection();
        CallableStatement cs = conn.prepareCall("{call prcUpdateCategory(?,?)}");
        cs.setString(1, category.getCategoryID());
        cs.setString(2, category.getCategoryName());
        cs.executeUpdate();
        closeConnection();
    }
     public void deleteCategory(Category category) throws ClassNotFoundException, Exception {
        initConnection();
           String error = "";
           PreparedStatement pstmt = conn.prepareStatement("select * from Product where  cCatID = ?");
           pstmt.setString(1, category.getCategoryID());
           if (pstmt.executeQuery().next()) {
                error += "Error: This category made at least one product\n";
           }
            if (error.equals("")) {
            CallableStatement cs = conn.prepareCall("{call prcDeleteCategory(?)}");
            cs.setString(1,category.getCategoryID());
            cs.executeUpdate();
              } else {
            throw new Exception(error);
        }
        closeConnection();
    }
    public Category getCategoryById(String categoryID) {
        try {
            initConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Category where cCatID = " + "'"+categoryID+"'");
            Category category = null;
            if (rs.next()) {
                category = new Category();
                category.setCategoryID(rs.getString("cCatID"));
                category.setCategoryName(rs.getString("vCatName"));
            }
            closeConnection();
            return category;
        } catch (Exception ex) {
            return null;
        }
    }
    
    public ArrayList<Category> searchCategoryID(String categoryID) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Category " + categoryID);
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
    
    public ArrayList<Category> searchCategoryName(String categoryName) throws ClassNotFoundException, SQLException {
        initConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Category " + categoryName);
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
}
