/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.ui;

import com.c1212l.fs.bean.Order;
import com.c1212l.fs.bean.OrderDetail;
import com.c1212l.fs.bean.Product;
import com.c1212l.fs.bll.OrderBUS;
import com.c1212l.fs.bll.OrderDetailBUS;
import com.c1212l.fs.bll.ProductBUS;
import com.c1212l.fs.util.KeyValue;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hocvien
 */
public class OrderManager extends javax.swing.JPanel {

    /**
     * Creates new form OrderManager
     */
    public OrderManager() {
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

        lblOrderManager = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblOrdID = new javax.swing.JLabel();
        lblCusID = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        txtOrdID = new javax.swing.JTextField();
        txtCusID = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrdDetail = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblOrdIDDetail = new javax.swing.JLabel();
        txtOrdIDDetail = new javax.swing.JTextField();
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
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtDate = new javax.swing.JFormattedTextField();

        lblOrderManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrderManager.setText("Order Manager");

        lblSearch.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", " " }));

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        lblOrdID.setText("Order ID :");

        lblCusID.setText("Customer ID :");

        lblDate.setText("Date :");

        lblTotalPrice.setText("Total Price :");

        lblStatus.setText("Status :");

        lblEmpID.setText("Employee :");

        txtOrdID.setEnabled(false);

        txtEmpID.setEnabled(false);
        txtEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIDActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Order Detail"));

        tblOrdDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrdDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdDetailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblOrdDetail);

        lblOrdIDDetail.setText("Order ID :");

        txtOrdIDDetail.setEnabled(false);

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
                            .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(lblOrdIDDetail)
                            .addComponent(lblProIDDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrdIDDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtQuantity)
                            .addComponent(cmbProID, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lblOrdIDDetail)
                    .addComponent(txtOrdIDDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/add24.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/delete-24x24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/upgrade-24x24.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/M/d"))));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(lblOrderManager)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCusID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOrdID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOrdID)
                                    .addComponent(txtCusID, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblOrderManager)
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
                            .addComponent(lblOrdID)
                            .addComponent(txtOrdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCusID)
                            .addComponent(txtCusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(lblStatus)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmpID)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnAddDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailActionPerformed
        // TODO add your handling code here:
        try {
            validateFieldAddOrderDetail();
            int Quantity = Integer.valueOf(txtQuantity.getText());
            int Price = Integer.valueOf(txtPrice.getText());
            int VAT = Integer.valueOf(txtVAT.getText());
            ordDetailBUS.addOrderDetail(TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY, Quantity, Price, VAT);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddDetailActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            validateFieldAdd();
            String cusID = txtCusID.getText();
            Date date = Date.valueOf(txtDate.getText());
           // int Quantity = Integer.valueOf(txtQuantity.getText());
            int TotalPrice = Integer.valueOf(txtTotalPrice.getText());
            String Status = txtStatus.getText();
            String empID = txtEmpID.getText();
            orderBUS.addOrder(cusID, date, TotalPrice, Status, empID);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            String ordID = txtOrdID.getText();
            String cusID = txtCusID.getText();
            Date date = Date.valueOf(txtDate.getText());
           // int Quantity = Integer.valueOf(txtQuantity.getText());
            int TotalPrice = Integer.valueOf(txtTotalPrice.getText());
            String Status = txtStatus.getText();
            String empID = txtEmpID.getText();
            orderBUS.updateOrder(ordID, cusID, date, TotalPrice, Status, empID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String ordID = txtOrdID.getText();
            orderBUS.deleteOrder(ordID);
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
            String ordIDDetail = txtOrdIDDetail.getText();
            int Quantity = Integer.valueOf(txtQuantity.getText());
            int Price = Integer.valueOf(txtPrice.getText());
            int VAT = Integer.valueOf(txtVAT.getText());
            ordDetailBUS.addOrderDetail(ordIDDetail, TOOL_TIP_TEXT_KEY, Quantity, Price, VAT);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PurchaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateDetailActionPerformed

    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        // TODO add your handling code here:
        int row = tblOrder.rowAtPoint(evt.getPoint());
        txtOrdID.setText(tblOrder.getValueAt(row, 0).toString());
        txtCusID.setText(tblOrder.getValueAt(row, 1).toString());
        txtDate.setText(tblOrder.getValueAt(row, 2).toString());
        txtTotalPrice.setText(tblOrder.getValueAt(row, 3).toString());
        txtStatus.setText(tblOrder.getValueAt(row, 4).toString());
        txtEmpID.setText(tblOrder.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblOrderMouseClicked

    private void tblOrdDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdDetailMouseClicked
        // TODO add your handling code here:
        int row = tblOrdDetail.rowAtPoint(evt.getPoint());
        txtOrdID.setText(tblOrdDetail.getValueAt(row, 0).toString());
        cmbProID.setSelectedItem(tblOrdDetail.getValueAt(row, 1).toString());
        txtQuantity.setText(tblOrdDetail.getValueAt(row, 2).toString());
        txtPrice.setText(tblOrdDetail.getValueAt(row, 3).toString());
        txtVAT.setText(tblOrdDetail.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblOrdDetailMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try {
                 if (cmbSearch.getSelectedIndex()==0) {
   
                    loadSearchOrderID();
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

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmpIDActionPerformed

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddDetail;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteDetail;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateDetail;
    private javax.swing.JComboBox cmbProID;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCusID;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblOrdID;
    private javax.swing.JLabel lblOrdIDDetail;
    private javax.swing.JLabel lblOrderManager;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProIDDetail;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblVAT;
    private javax.swing.JTable tblOrdDetail;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtCusID;
    private javax.swing.JFormattedTextField txtDate;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtOrdID;
    private javax.swing.JTextField txtOrdIDDetail;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtVAT;
    // End of variables declaration//GEN-END:variables

    private OrderBUS orderBUS = new OrderBUS();
    DefaultTableModel tblModel;
    ArrayList<Order> lstOrder;  
    ArrayList<OrderDetail> lstOrdDetails;

    private void initTable() {
        Vector header = new Vector();
        header.add("Purchase ID");
        header.add("Customer ID");
        header.add("Date");
        header.add("TotalPrice");
        header.add("Status");
        header.add("Employee ID");
        tblModel = new DefaultTableModel(header, 0);
        tblOrder.setModel(tblModel);
    }
    
    

    private void fillData(ArrayList<Order> lst) {
        if (lst != null) {
            for (Order v : lst) {
                tblModel.addRow(v.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            initCmbSearch();
            fillData(orderBUS.getAllOrder());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextField() {
        txtOrdID.setText("");
        txtCusID.setText("");
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
    
      private void loadSearchOrderID() throws ClassNotFoundException, SQLException {
        String orderID = "";
        if (!txtSearch.getText().equals("")) {
            if (!orderID.contains("where")) {
                orderID += " where cVenID like '%" + txtSearch.getText() + "%'";
            } else {
                orderID += " and cVenID like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstOrder = orderBUS.searchOrderID(orderID);
        fillData(lstOrder);
    }
      
      private OrderDetailBUS ordDetailBUS = new OrderDetailBUS();

    private void initTableDetail() {
        Vector header = new Vector();
        header.add("Purchase ID");
        header.add("Product ID");
        header.add("Quantity");
        header.add("Price");
        header.add("VAT");
        tblModel = new DefaultTableModel(header, 0);
        tblOrdDetail.setModel(tblModel);
    }
    
    

    private void fillDataDetail(ArrayList<OrderDetail> lst1) {
        if (lst1 != null) {
            for (OrderDetail v : lst1) {
                tblModel.addRow(v.getVector());
            }
        }
    }

    private void reloadDataDetail() {
        try {
            initTableDetail();
            initCmbProID();
            initCmbSearch();
            fillDataDetail(ordDetailBUS.getAllOrderDetail());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextFieldDetail() {
        txtOrdIDDetail.setText("");   
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
                cmbProID.addItem(new KeyValue(i, product.getProductName()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProductPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void validateFieldAdd() throws Exception {
        if (txtDate.getText().equals("")) {
            throw new Exception("Please enter Date Name");
        }
        if (txtTotalPrice.getText().equals("")) {
            throw new Exception("Please enter Total Price");
        }
        if (txtStatus.getText().equals("")) {
            throw new Exception("Please enter status");
        }
    }
    private void validateFieldAddOrderDetail() throws Exception {
        if (txtQuantity.getText().equals("")) {
            throw new Exception("Please enter Quantity ");
        }
        if (txtPrice.getText().equals("")) {
            throw new Exception("Please enter Price ");
        }
        if (txtVAT.getText().equals("")) {
            throw new Exception("Please enter VAT ");
        }
    }
}
