/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.bll;

import com.c1212l.fs.bean.PurchaseDetail;
import com.c1212l.fs.dal.PurDetailsDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author KimDong
 */
public class PurDetailBUS {
    PurDetailsDAO purDetailDAO = null;
    public PurDetailBUS(){
        purDetailDAO = new PurDetailsDAO();
    }
    public ArrayList<PurchaseDetail> getAllPurDetails() throws ClassNotFoundException, SQLException{
        return purDetailDAO.getAllPurDetails();
    }
    
    public void addPurchaseDetail(String purID, String proID, int purQuantity, int purPrice, int VAT) throws ClassNotFoundException, Exception{
        PurchaseDetail purchasedetail = new PurchaseDetail();
        purchasedetail.setPurID(purID);
        purchasedetail.setProID(proID);
        purchasedetail.setPurQuantity(purQuantity);
        purchasedetail.setPurPrice(purPrice);
        purchasedetail.setVAT(VAT);
        purDetailDAO.addPurDetail(purchasedetail);
    }
    
    public void updatePurchaseDetail(String purID, String proID, int purQuantity, int purPrice, int VAT) throws ClassNotFoundException, Exception{
        PurchaseDetail purchasedetail = new PurchaseDetail();
        purchasedetail.setPurID(purID);
        purchasedetail.setProID(proID);
        purchasedetail.setPurQuantity(purQuantity);
        purchasedetail.setPurPrice(purPrice);
        purchasedetail.setVAT(VAT);
        purDetailDAO.addPurDetail(purchasedetail);
    }
    
    public void deletePurchaseDetail(String purID) throws ClassNotFoundException, Exception{
        PurchaseDetail purchasedetail = new PurchaseDetail();
        purchasedetail.setPurID(purID);
        purDetailDAO.deletePurDetail(purchasedetail);
    }
    

}
