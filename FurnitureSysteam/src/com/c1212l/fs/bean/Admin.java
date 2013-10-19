/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bean;

/**
 *
 * @author Luu Bi
 */
  public class Admin{
     private int adminID ;
     private String email;
     private String adminName;
     private String adminAddress;
     private String adminPhone;

         public int getAdminID() {
            return adminID;
         }

         public void setAdminID(int adminID) {
                 this.adminID = adminID;
         }
        
        
        public String getAdminName() {
            return adminName;
        }

        public void setAdminName(String adminName) {
            this.adminName = adminName;
        }

        public String getAdminAddress() {
            return adminAddress;
        }

        public void setAdminAddress(String adminAddress) {
            this.adminAddress = adminAddress;
        }

        public String getAdminPhone() {
            return adminPhone;
        }

        public void setAdminPhone(String adminPhone) {
            this.adminPhone = adminPhone;
        }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     
  } 