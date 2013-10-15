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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmployee = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendor = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtVendorID = new javax.swing.JTextField();
        txtVendorName = new javax.swing.JTextField();
        txtVendorPhone = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        txtVendorFax = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        txtVendorEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVendorAddress = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmployee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEmployee.setText("Vendor Manager");
        jPanel1.add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 0, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 798, 193));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, 798, 10));

        jLabel1.setText("Vendor ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 83, -1));

        lblEmployeeName.setText("Vendor Name:");
        jPanel1.add(lblEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, -1, -1));

        lblBirthday.setText("Vendor Address:");
        jPanel1.add(lblBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 83, -1));

        lblAddress.setText("Vendor Fax:");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 83, -1));

        lblEmail.setText("Vendor Phone:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 83, -1));
        jPanel1.add(txtVendorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 299, 261, -1));
        jPanel1.add(txtVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 330, 261, -1));
        jPanel1.add(txtVendorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 270, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 80, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 80, -1));

        btnReport.setText("Report");
        jPanel1.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 80, -1));
        jPanel1.add(txtVendorFax, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 270, -1));

        lblPosition.setText("Vendor Email:");
        jPanel1.add(lblPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 83, -1));

        lblSearch.setText("Search :");
        jPanel1.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 49, 52, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 46, 201, -1));

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", "by Name", " " }));
        jPanel1.add(cmbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 46, 68, -1));

        btnSearch.setText("Search");
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 45, -1, -1));
        jPanel1.add(txtVendorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 270, -1));

        txtVendorAddress.setColumns(20);
        txtVendorAddress.setRows(5);
        jScrollPane2.setViewportView(txtVendorAddress);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 260, 90));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            String vendorName = txtVendorName.getText();
            String vendorAddress = txtVendorAddress.getText();
            String vendorPhone = txtVendorPhone.getText();
            String vendorFax = txtVendorFax.getText();
            String vendorEmail = txtVendorEmail.getText();
            vendorBUS.addVendor(vendorName, vendorAddress, vendorPhone, vendorFax, vendorEmail);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            String vendorID = txtVendorID.getText();
            vendorBUS.deleteVendor(vendorID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tblVendor;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtVendorAddress;
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
