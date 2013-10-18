/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.ui;


import com.c1212l.fs.bean.Customer;

import com.c1212l.fs.bll.CustomerBUS;
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
 * @author Win 8 64Bit VS7
 */
public class CustomerManager extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManager
     */
    public CustomerManager() {
        initComponents();
        reloadData();
        txtCustomerID.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCustomerManager = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblCustomerID = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        lblCustomerManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCustomerManager.setText("Customer Manager");

        lblSearch.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", "by Name", " " }));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

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

        lblCustomerID.setText("Customer ID :");

        lblCustomerName.setText("Customer Name :");

        lblAddress.setText("Address :");

        lblPhoneNumber.setText("Phone :");

        lblEmail.setText("Email :");

        lblGender.setText("Sex :");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Famale" }));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/delete-24x24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/c1212l/fs/image/undo.png"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerManager)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 150, Short.MAX_VALUE)
                                .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomerName)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txtCustomerID))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtPhoneNumber)
                            .addComponent(cmbGender, 0, 249, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnUpdate)
                        .addGap(93, 93, 93)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(73, 73, 73)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCustomerManager)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try{
            String customerID = txtCustomerID.getText();
            String customerName = txtCustomerName.getText();
            String phone = txtPhoneNumber.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String gender = cmbGender.getSelectedItem().toString();
            customerBUS.updateCustomer(customerID, customerName, gender, address, phone, email);
            reloadData();
        }catch (Exception ex) {
            if (ex.getMessage().contains("UNIQUE KEY")) {
                JOptionPane.showMessageDialog(null, "Error: Duplicate customer name", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            validateFieldAdd();
            String customerName = txtCustomerName.getText();
            String phone = txtPhoneNumber.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String gender = cmbGender.getSelectedItem().toString();   
            customerBUS.addCustomer(customerName, gender, address, phone, email);
            reloadData();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String customerID = txtCustomerID.getText();
                 customerBUS.deleteCustomer(customerID);
                 reloadData();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
        int row = tblCustomer.rowAtPoint(evt.getPoint());
        txtCustomerID.setText(tblCustomer.getValueAt(row, 0).toString());
        txtCustomerName.setText(tblCustomer.getValueAt(row, 1).toString());
//        cmbGender.setSelectedItem(tblCustomer.getValueAt(row, 2).toString());
        txtAddress.setText(tblCustomer.getValueAt(row, 3).toString());
        txtPhoneNumber.setText(tblCustomer.getValueAt(row, 4).toString());
        txtEmail.setText(tblCustomer.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try {
                 if (cmbSearch.getSelectedIndex()==0) {
   
                    loadSearchCustomerID();
                 }
                 else if(cmbSearch.getSelectedIndex()==1)
                 {
                     loadSearchCustomerName();
                 }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtSearch.setText("");
        cmbGender.setSelectedItem(false);
    }//GEN-LAST:event_btnResetActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblCustomerManager;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private CustomerBUS customerBUS = new CustomerBUS();
    DefaultTableModel tblModel;
    ArrayList<Customer> lstCustomer;    

    private void initTable() {
        Vector header = new Vector();
        header.add("Customer ID ");
        header.add("Customer Name");
        header.add("Gender");
        header.add("Address");
        header.add("Phone Number");
        header.add("Email");
        tblModel = new DefaultTableModel(header, 0);
        tblCustomer.setModel(tblModel);
    }

    private void fillData(ArrayList<Customer> lst) {
        if (lst != null) {
            for (Customer c : lst) {
                tblModel.addRow(c.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            initCmbGender();
            initCmbSearch();
            fillData(customerBUS.getAllCustomer());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void initCmbGender() {
        cmbGender.removeAllItems();
        cmbGender.addItem(new KeyValue(1, "Male"));
        cmbGender.addItem(new KeyValue(0, "Female"));
    }
        private void initTextField() {
        txtCustomerID.setText("");
        txtCustomerName.setText("");
        txtCustomerID.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");;
    }
    private void loadSearchCustomerName() throws ClassNotFoundException, SQLException {
        String customerName = "";
        if (!txtSearch.getText().equals("")) {
            if (!customerName.contains("where")) {
                customerName += " where vCusName like '%" + txtSearch.getText() + "%'";
            } else {
                customerName += " and vCusName like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstCustomer = customerBUS.searchCustomerName(customerName);
        fillData(lstCustomer);
    }
      private void loadSearchCustomerID() throws ClassNotFoundException, SQLException {
        String customerID = "";
        if (!txtSearch.getText().equals("")) {
            if (!customerID.contains("where")) {
                customerID += " where cCusID like '%" + txtSearch.getText() + "%'";
            } else {
                customerID += " and cCusID like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstCustomer = customerBUS.searchCustomerID(customerID);
        fillData(lstCustomer);
      }
       private void initCmbSearch() {
        cmbSearch.removeAllItems();
//        cmbSearch.addItem(new KeyValue(-1, ""));
        cmbSearch.addItem(new KeyValue(0, "by ID"));
        cmbSearch.addItem(new KeyValue(1, "by Name"));
    }
    private void validateFieldAdd() throws Exception {
        if (txtCustomerName.getText().equals("")) {
            throw new Exception("Please enter Customer Name");
        }
        Pattern ptCustomerName = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
        Matcher mcCustomerName = ptCustomerName.matcher(txtCustomerName.getText());
        if (!mcCustomerName.find()) {
            throw new Exception("Customer Name is not valid");
        }
        if (txtAddress.getText().equals("")) {
            throw new Exception("Please enter Customer Address");
        }
        if (txtPhoneNumber.getText().equals("")) {
            throw new Exception("Please enter Phone Number");
        }
        Pattern ptPhoneNumber = Pattern.compile("^[\\d]{10,11}$");
        Matcher mcPhoneNumber = ptPhoneNumber.matcher(txtPhoneNumber.getText());
        if (!mcPhoneNumber.find()) {
            throw new Exception(" Phone number is not valid");
        }
   
        if (txtEmail.getText().equals("")) {
            throw new Exception("Please enter Email");
        }
        Pattern ptemail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,4}$");
        Matcher mcemail = ptemail.matcher(txtEmail.getText());
        if (!mcemail.find()) {
            throw new Exception("Email is not valid");
        }
    }
}
