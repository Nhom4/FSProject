/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.ui;

import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bean.Purchase;
import com.c1212l.fs.bean.PurchaseDetail;
import com.c1212l.fs.bll.ProductBUS;
import com.c1212l.fs.bll.PurDetailBUS;
import com.c1212l.fs.bll.PurchaseBUS;
import com.c1212l.fs.util.KeyValue;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class PurchaseManager extends javax.swing.JPanel {

    /**
     * Creates new form PurchaseManager
     */
    public PurchaseManager() {
        initComponents();
        reloadData();
        reloadDataDetail();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPurchaseManager = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchase = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblPurID = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        txtPurID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPurDetail = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblPurIDDetail = new javax.swing.JLabel();
        txtPurIDDetail = new javax.swing.JTextField();
        lblProIDDetail = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        lblVAT = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtVAT = new javax.swing.JTextField();
        btnAddDetail = new javax.swing.JButton();
        btnUpdateDetail = new javax.swing.JButton();
        btnDeleteDetail = new javax.swing.JButton();
        cmbProID = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        txtStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();

        lblPurchaseManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPurchaseManager.setText("Purchase Manager");

        lblSearch.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", " " }));

        tblPurchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPurchaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPurchase);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/add24.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/upgrade-24x24.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPurID.setText("Purchase ID :");

        lblDate.setText("Date :");

        lblTotalPrice.setText("Total Price :");

        txtPurID.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Detail"));

        tblPurDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPurDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPurDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPurDetail);

        lblPurIDDetail.setText("Purchase ID :");

        txtPurIDDetail.setEnabled(false);

        lblProIDDetail.setText("Product ID :");

        lblQuantity.setText("Quantity :");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        lblPrice.setText("Price :");

        lblVAT.setText("VAT :");

        btnAddDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/add24.png"))); // NOI18N
        btnAddDetail.setText("Add");
        btnAddDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailActionPerformed(evt);
            }
        });

        btnUpdateDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/upgrade-24x24.png"))); // NOI18N
        btnUpdateDetail.setText("Update");
        btnUpdateDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailActionPerformed(evt);
            }
        });

        btnDeleteDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/delete-24x24.png"))); // NOI18N
        btnDeleteDetail.setText("Delete");

        cmbProID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPurIDDetail)
                                .addGap(18, 18, 18)
                                .addComponent(txtPurIDDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblProIDDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantity)
                                    .addComponent(cmbProID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(lblVAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice)
                            .addComponent(txtVAT)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnUpdateDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnDeleteDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurIDDetail)
                    .addComponent(txtPurIDDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProIDDetail)
                    .addComponent(lblVAT)
                    .addComponent(txtVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDetail)
                    .addComponent(btnUpdateDetail)
                    .addComponent(btnDeleteDetail))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/delete-24x24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Status :");

        jLabel2.setText("Employee ID :");

        txtEmpID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblPurchaseManager)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPurID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStatus)
                                    .addComponent(txtEmpID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPurID, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPurchaseManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPurID)
                            .addComponent(txtPurID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalPrice)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            Date date = Date.valueOf(txtDate.getText());
           // int Quantity = Integer.valueOf(txtQuantity.getText());
            int TotalPrice = Integer.valueOf(txtTotalPrice.getText());
            String Status = txtStatus.getText();
            String empID = txtEmpID.getText();
            purchaseBUS.addPurchase(date, TotalPrice, Status, empID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnAddDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailActionPerformed
        // TODO add your handling code here:
        try {
            int Quantity = Integer.valueOf(txtQuantity.getText());
            int Price = Integer.valueOf(txtPrice.getText());
            int VAT = Integer.valueOf(txtVAT.getText());
            purDetailBUS.addPurchaseDetail(TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY, Quantity, Price, VAT);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddDetailActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            String purID = txtPurID.getText();
             Date date = Date.valueOf(txtDate.getText());
           // int Quantity = Integer.valueOf(txtQuantity.getText());
            int TotalPrice = Integer.valueOf(txtTotalPrice.getText());
            String Status = txtStatus.getText();
            String empID = txtEmpID.getText();
            purchaseBUS.updatePurchase(purID, date, TotalPrice, Status, empID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String purID = txtPurID.getText();
            purchaseBUS.deletePurchase(purID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailActionPerformed
        // TODO add your handling code here:
        try {
            String purIDDetail = txtPurIDDetail.getText();
            int Quantity = Integer.valueOf(txtQuantity.getText());
            int Price = Integer.valueOf(txtPrice.getText());
            int VAT = Integer.valueOf(txtVAT.getText());
            purDetailBUS.updatePurchaseDetail(purIDDetail, TOOL_TIP_TEXT_KEY, Quantity, Price, VAT);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateDetailActionPerformed

    private void tblPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPurchaseMouseClicked
        // TODO add your handling code here:
        int row = tblPurchase.rowAtPoint(evt.getPoint());
        txtPurID.setText(tblPurchase.getValueAt(row, 0).toString());
        txtDate.setText(tblPurchase.getValueAt(row, 1).toString());
        txtTotalPrice.setText(tblPurchase.getValueAt(row, 2).toString());
        txtStatus.setText(tblPurchase.getValueAt(row, 3).toString());
        txtEmpID.setText(tblPurchase.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblPurchaseMouseClicked

    private void tblPurDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPurDetailMouseClicked
        // TODO add your handling code here:
        int row = tblPurDetail.rowAtPoint(evt.getPoint());
        txtPurID.setText(tblPurDetail.getValueAt(row, 0).toString());
        cmbProID.setSelectedItem(tblPurDetail.getValueAt(row, 1).toString());
        txtQuantity.setText(tblPurDetail.getValueAt(row, 2).toString());
        txtPrice.setText(tblPurDetail.getValueAt(row, 3).toString());
        txtVAT.setText(tblPurDetail.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblPurDetailMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try {
                 if (cmbSearch.getSelectedIndex()==0) {
   
                    loadSearchPurchaseID();
                 }
                 else if(cmbSearch.getSelectedIndex()==1)
                 {
                     //loadSearchVendorName();
                 }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_txtSearchKeyReleased

   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddDetail;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteDetail;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateDetail;
    private javax.swing.JComboBox cmbProID;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProIDDetail;
    private javax.swing.JLabel lblPurID;
    private javax.swing.JLabel lblPurIDDetail;
    private javax.swing.JLabel lblPurchaseManager;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblVAT;
    private javax.swing.JTable tblPurDetail;
    private javax.swing.JTable tblPurchase;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPurID;
    private javax.swing.JTextField txtPurIDDetail;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtVAT;
    // End of variables declaration//GEN-END:variables

    
    private PurchaseBUS purchaseBUS = new PurchaseBUS();
    DefaultTableModel tblModel;
    ArrayList<Purchase> lstPurchase;  
    ArrayList<PurchaseDetail> lstPurDetails;

    private void initTable() {
        Vector header = new Vector();
        header.add("Purchase ID");
        header.add("Date");
        header.add("Total Price");
        header.add("Status");
        header.add("Employee ID");
        tblModel = new DefaultTableModel(header, 0);
        tblPurchase.setModel(tblModel);
    }
    
    

    private void fillData(ArrayList<Purchase> lst) {
        if (lst != null) {
            for (Purchase v : lst) {
                tblModel.addRow(v.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            initCmbSearch();
            fillData(purchaseBUS.getAllPurchase());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextField() {
        txtPurID.setText("");
        txtDate.setText("");
        txtTotalPrice.setText("");
        txtStatus.setText("");
    }
    private void initCmbSearch() {
        cmbSearch.removeAllItems();
//        cmbSearch.addItem(new KeyValue(-1, ""));
        cmbSearch.addItem(new KeyValue(0, "by ID"));
        cmbSearch.addItem(new KeyValue(1, "by Name"));
    }
    
      private void loadSearchPurchaseID() throws ClassNotFoundException, SQLException {
        String purchaseID = "";
        if (!txtSearch.getText().equals("")) {
            if (!purchaseID.contains("where")) {
                purchaseID += " where cVenID like '%" + txtSearch.getText() + "%'";
            } else {
                purchaseID += " and cVenID like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstPurchase = purchaseBUS.searchPurchaseID(purchaseID);
        fillData(lstPurchase);
    }
      
      private PurDetailBUS purDetailBUS = new PurDetailBUS();

    private void initTableDetail() {
        Vector header = new Vector();
        header.add("Purchase ID");
        header.add("Product ID");
        header.add("Quantity");
        header.add("Price");
        header.add("VAT");
        tblModel = new DefaultTableModel(header, 0);
        tblPurDetail.setModel(tblModel);
    }
    
    

    private void fillDataDetail(ArrayList<PurchaseDetail> lst1) {
        if (lst1 != null) {
            for (PurchaseDetail v : lst1) {
                tblModel.addRow(v.getVector());
            }
        }
    }

    private void reloadDataDetail() {
        try {
            initTableDetail();
            initCmbProID();
            initCmbSearch();
            fillDataDetail(purDetailBUS.getAllPurDetails());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextFieldDetail() {
        txtPurIDDetail.setText("");   
        txtQuantity.setText("");
        txtPrice.setText("");
        txtVAT.setText("");
    }
    
    private void initCmbProID() {
        try {
            cmbProID.removeAllItems();
            cmbProID.addItem(new KeyValue(-1, ""));
            ProductBUS productBUS = new ProductBUS();
            ArrayList<Product> arrProduct = productBUS.getAllProduct();
            for (int i=0;i<arrProduct.size();i++) {
                Product product = arrProduct.get(i);
                cmbProID.addItem(new KeyValue(i, product.getProductID()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
