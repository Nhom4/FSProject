/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.ui;

import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bean.Vendor;
import com.c1212l.fs.bll.VendorBUS;
import com.c1212l.fs.util.KeyValue;
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
 * @author Luu Bi
 */
public class VendorPanel extends javax.swing.JPanel {

    /**
     * Creates new form VendorPanel
     */
    public VendorPanel() {
        initComponents();
        reloadData();
        txtVendorID.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVendorManager = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendor = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblVendorID = new javax.swing.JLabel();
        lblVendorName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtVendorID = new javax.swing.JTextField();
        txtVendorName = new javax.swing.JTextField();
        txtVendorAddress = new javax.swing.JTextField();
        lblVendorPhone = new javax.swing.JLabel();
        lblVendorFax = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtVendorPhone = new javax.swing.JTextField();
        txtVendorFax = new javax.swing.JTextField();
        txtVendorEmail = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        lblVendorManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblVendorManager.setText("Vendor Manager");

        lblSearch.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", " " }));

        tblVendor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendor);

        lblVendorID.setText("Vendor ID :");

        lblVendorName.setText("Vendor Name :");

        lblAddress.setText("Vendor Address :");

        lblVendorPhone.setText("Vendor Phone :");

        lblVendorFax.setText("Vendor Fax : ");

        lblEmail.setText("Vendor Email :");

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

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/delete-24x24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVendorManager)
                .addGap(327, 327, 327))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVendorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVendorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
                            .addComponent(txtVendorID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendorName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendorAddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblVendorFax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblVendorPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVendorPhone)
                                    .addComponent(txtVendorFax)
                                    .addComponent(txtVendorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnReset)
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblVendorManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendorID)
                    .addComponent(txtVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVendorPhone)
                    .addComponent(txtVendorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendorName)
                    .addComponent(txtVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVendorFax)
                    .addComponent(txtVendorFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtVendorAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtVendorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(0, 77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            String vendorName = txtVendorName.getText();
            String address = txtVendorAddress.getText();
            String phone = txtVendorPhone.getText();
            String fax = txtVendorFax.getText();
            String email = txtVendorEmail.getText();
            vendorBUS.addVendor(vendorName, address, phone, fax, email);
            reloadData();
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            validateFieldAdd();  
                String vendorID = txtVendorID.getText();
                String vendorName = txtVendorName.getText();
                String vendorAddress = txtVendorAddress.getText();
                String vendorPhone = txtVendorPhone.getText();
                String vendorFax = txtVendorFax.getText();
                String vendorEmail = txtVendorEmail.getText();
                vendorBUS.updateVendor(vendorID, vendorName, vendorAddress, vendorPhone, vendorFax, vendorEmail);
                reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String vendorID = txtVendorID.getText();
                 vendorBUS.deleteVendor(vendorID);
                 reloadData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendorMouseClicked
        // TODO add your handling code here:
        int row = tblVendor.rowAtPoint(evt.getPoint());
        txtVendorID.setText(tblVendor.getValueAt(row, 0).toString());
        txtVendorName.setText(tblVendor.getValueAt(row, 1).toString());
        txtVendorAddress.setText(tblVendor.getValueAt(row, 2).toString());
        txtVendorPhone.setText(tblVendor.getValueAt(row, 3).toString());
        txtVendorFax.setText(tblVendor.getValueAt(row, 4).toString());
        txtVendorEmail.setText(tblVendor.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblVendorMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try {
                 if (cmbSearch.getSelectedIndex()==0) {
   
                    loadSearchVendorID();
                 }
                 else if(cmbSearch.getSelectedIndex()==1)
                 {
                     loadSearchVendorName();
                 }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtVendorID.setText("");
        txtVendorName.setText("");
        txtVendorAddress.setText("");
        txtVendorPhone.setText("");
        txtVendorFax.setText("");
        txtVendorEmail.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblVendorFax;
    private javax.swing.JLabel lblVendorID;
    private javax.swing.JLabel lblVendorManager;
    private javax.swing.JLabel lblVendorName;
    private javax.swing.JLabel lblVendorPhone;
    private javax.swing.JTable tblVendor;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtVendorAddress;
    private javax.swing.JTextField txtVendorEmail;
    private javax.swing.JTextField txtVendorFax;
    private javax.swing.JTextField txtVendorID;
    private javax.swing.JTextField txtVendorName;
    private javax.swing.JTextField txtVendorPhone;
    // End of variables declaration//GEN-END:variables
    private VendorBUS vendorBUS = new VendorBUS();
    DefaultTableModel tblModel;
    ArrayList<Vendor> lstVendor;    

    private void initTable() {
        Vector header = new Vector();
        header.add("Vendor ID ");
        header.add("Vendor Name");
        header.add("Address");
        header.add("Phone Number");
        header.add("Vendor Fax");
        header.add("Email");
        tblModel = new DefaultTableModel(header, 0);
        tblVendor.setModel(tblModel);
    }

    private void fillData(ArrayList<Vendor> lst) {
        if (lst != null) {
            for (Vendor v : lst) {
                tblModel.addRow(v.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            initCmbSearch();
            fillData(vendorBUS.getAllVendor());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initTextField() {
        txtVendorID.setText("");
        txtVendorName.setText("");
        txtVendorAddress.setText("");
        txtVendorPhone.setText("");
        txtVendorFax.setText("");
        txtVendorEmail.setText("");
    }
    private void initCmbSearch() {
        cmbSearch.removeAllItems();
//        cmbSearch.addItem(new KeyValue(-1, ""));
        cmbSearch.addItem(new KeyValue(0, "by ID"));
        cmbSearch.addItem(new KeyValue(1, "by Name"));
    }
    private void loadSearchVendorName() throws ClassNotFoundException, SQLException {
        String vendorName = "";
        if (!txtSearch.getText().equals("")) {
            if (!vendorName.contains("where")) {
                vendorName += " where vVenName like '%" + txtSearch.getText() + "%'";
            } else {
                vendorName += " and vVenName like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstVendor = vendorBUS.searchVendorName(vendorName);
        fillData(lstVendor);
    }
      private void loadSearchVendorID() throws ClassNotFoundException, SQLException {
        String vendorID = "";
        if (!txtSearch.getText().equals("")) {
            if (!vendorID.contains("where")) {
                vendorID += " where cVenID like '%" + txtSearch.getText() + "%'";
            } else {
                vendorID += " and cVenID like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstVendor = vendorBUS.searchVendorID(vendorID);
        fillData(lstVendor);
    }   
    private void validateFieldAdd() throws Exception {
        if (txtVendorName.getText().equals("")) {
            throw new Exception("Please enter Vendor Name");
        }
        Pattern ptVendorName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
        Matcher mcVendorName = ptVendorName.matcher(txtVendorName.getText());
        if (!mcVendorName.find()) {
            throw new Exception("Vendor Name is not valid");
        }
        if (txtVendorAddress.getText().equals("")) {
            throw new Exception("Please enter Vendor Address");
        }
        if (txtVendorPhone.getText().equals("")) {
            throw new Exception("Please enter Phone Number");
        }
        Pattern ptPhoneNumber = Pattern.compile("^[\\d]{10,11}$");
        Matcher mcPhoneNumber = ptPhoneNumber.matcher(txtVendorPhone.getText());
        if (!mcPhoneNumber.find()) {
            throw new Exception(" Phone number is not valid");
        }
   
        if (txtVendorEmail.getText().equals("")) {
            throw new Exception("Please enter Email");
        }
        Pattern ptemail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,4}$");
        Matcher mcemail = ptemail.matcher(txtVendorEmail.getText());
        if (!mcemail.find()) {
            throw new Exception("Email is not valid");
        }
    }
}
