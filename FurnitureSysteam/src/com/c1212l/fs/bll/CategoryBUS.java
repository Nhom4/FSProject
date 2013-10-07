/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Permission;
import com.c1212l.fs.dal.CategoryDAO;
import com.c1212l.fs.dal.PermissionDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luu Bi
 */
public class CategoryBUS {
               CategoryDAO categoryDAO = null;
       public CategoryBUS(){
             categoryDAO = new CategoryDAO();
}
       public ArrayList<Category> getAllCategory() throws ClassNotFoundException, SQLException{
        return categoryDAO.getAllCategory();
       }
       public void addCategory(String categoryName) throws ClassNotFoundException, Exception{
        Category category=new Category();
        category.setCategoryName(categoryName);
        categoryDAO.addCategory(category);
    }
      public void updateCategory(String categoryID,String categoryName) throws ClassNotFoundException, Exception{
        Category  category = new Category();
        category.setCategoryID(categoryID);
        category.setCategoryName(categoryName);
        categoryDAO.updateCategory(category);
    }  
      public void deleteCustomer(String categoryID) throws ClassNotFoundException, Exception{
        Category category= new Category();
        category.setCategoryID(categoryID);
        categoryDAO.deleteCategory(category);
    }
}
