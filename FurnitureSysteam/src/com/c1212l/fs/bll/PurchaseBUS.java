/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.Purchase;
import com.c1212l.fs.dal.PurchaseDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author KimDong
 */
public class PurchaseBUS {

    PurchaseDAO purchaseDAO = null;
    public PurchaseBUS(){
        purchaseDAO = new PurchaseDAO();
    }
    public ArrayList<Purchase> getAllPurchase() throws ClassNotFoundException, SQLException{
        return purchaseDAO.getAllPurchase();
    }
    
    public void addPurchase(Date purDate,int purTotalPrice,int VAT,String Status, String empID) throws ClassNotFoundException, Exception{
        Purchase purchase = new Purchase();
        purchase.setPurDate(purDate);
        purchase.setPurTotalPrice(purTotalPrice);
        purchase.setVAT(VAT);
        purchase.setStatus(Status);
        purchase.setEmpID(empID);
        purchaseDAO.addPurchase(purchase);
    }
    
    public void updatePurchase(Date purDate,int purTotalPrice,int VAT,String Status, String empID) throws ClassNotFoundException, Exception{
        Purchase purchase = new Purchase();
        purchase.setPurDate(purDate);
        purchase.setPurTotalPrice(purTotalPrice);
        purchase.setVAT(VAT);
        purchase.setStatus(Status);
        purchase.setEmpID(empID);
        purchaseDAO.addPurchase(purchase);
    }
    
    public void deletePurchase(String purID) throws ClassNotFoundException, Exception{
        Purchase purchase= new Purchase();
        purchase.setPurID(purID);
        purchaseDAO.deletePurchase(purchase);
    }
    
    public ArrayList<Purchase> searchPurchaseID(String purchaseID) throws ClassNotFoundException, SQLException {
        return purchaseDAO.searchPurchaseID(purchaseID);
    }
}
