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
public class Category {
    private String categoryID;
    private String categoryName;

    public String getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
      public Vector getVector() {
        Vector result = new Vector();
        result.add(categoryID);
        result.add(categoryName);
        return result;
    }
}
