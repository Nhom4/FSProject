/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.fs.ui;

import com.c1212l.fs.bean.Category;
import com.c1212l.fs.bean.Customer;
import com.c1212l.fs.bll.CategoryBUS;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win 8 64Bit VS7
 */
public class CategoryManager extends javax.swing.JPanel {

    /**
     * Creates new form CategoryManager
     */
    public CategoryManager() {
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

        lblCategoryManager = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblTypeID = new javax.swing.JLabel();
        lblTypeName = new javax.swing.JLabel();
        txtCategoryID = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        lblCategoryManager.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCategoryManager.setText("Category Manager");

        lblSearch.setText("Search :");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by ID", "by Name", " " }));

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        lblTypeID.setText("Category ID :");

        lblTypeName.setText("Category Name :");

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(lblCategoryManager))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTypeName, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(lblTypeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCategoryID, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                        .addComponent(txtCategoryName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89)
                                        .addComponent(btnUpdate)
                                        .addGap(102, 102, 102)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 187, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCategoryManager)
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
                    .addComponent(lblTypeID)
                    .addComponent(txtCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeName)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            validateFieldAdd();
            // TODO add your handling code here:
            String categoryName = txtCategoryName.getText();
            categoryBUS.addCategory(categoryName);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            String categoryID = txtCategoryID.getText();
            String categoryName = txtCategoryName.getText();
            categoryBUS.updateCategory(categoryID, categoryName);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            String categoryID = txtCategoryID.getText();
            categoryBUS.deleteCustomer(categoryID);
            reloadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CategoryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        // TODO add your handling code here:
        int row = tblCategory.rowAtPoint(evt.getPoint());
        txtCategoryID.setText(tblCategory.getValueAt(row, 0).toString());
        txtCategoryName.setText(tblCategory.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        try {
                 if (cmbSearch.getSelectedIndex()==0) {
   
                    loadSearchCategoryID();
                 }
                 else if(cmbSearch.getSelectedIndex()==1)
                 {
                     loadSearchCategoryName();
                 }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(VendorPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_txtSearchKeyReleased

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCategoryManager;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTypeID;
    private javax.swing.JLabel lblTypeName;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtCategoryID;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private CategoryBUS categoryBUS = new CategoryBUS();
    DefaultTableModel tblModel;
    ArrayList<Category> lstCategory;    

    private void initTable() {
        Vector header = new Vector();
        header.add("Category ID ");
        header.add("Category Name");
        tblModel = new DefaultTableModel(header, 0);
        tblCategory.setModel(tblModel);
    }

    private void fillData(ArrayList<Category> lst) {
        if (lst != null) {
            for (Category category : lst) {
                tblModel.addRow(category.getVector());
            }
        }
    }

    private void reloadData() {
        try {
            initTable();
            fillData(categoryBUS.getAllCategory());
            initTextField();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void initTextField() {
        txtCategoryID.setText("");
        txtCategoryName.setText("");
    }
     
     private void loadSearchCategoryName() throws ClassNotFoundException, SQLException {
        String categoryName = "";
        if (!txtSearch.getText().equals("")) {
            if (!categoryName.contains("where")) {
                categoryName += " where vCatName like '%" + txtSearch.getText() + "%'";
            } else {
                categoryName += " and vCatName like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstCategory = categoryBUS.searchCategoryName(categoryName);
        fillData(lstCategory);
    }
     
     private void loadSearchCategoryID() throws ClassNotFoundException, SQLException {
        String categoryID = "";
        if (!txtSearch.getText().equals("")) {
            if (!categoryID.contains("where")) {
                categoryID += " where cCatID like '%" + txtSearch.getText() + "%'";
            } else {
                categoryID += " and cCatID like '%" + txtSearch.getText() + "%'";
            }
        }
        initTable();
        lstCategory = categoryBUS.searchCategoryName(categoryID);
        fillData(lstCategory);
    }
     private void validateFieldAdd() throws Exception {
        if (txtCategoryName.getText().equals("")) {
            throw new Exception("Please enter Category Name");
        }
          Pattern ptCategory = Pattern.compile("^([A-Za-z]+[\\s]?)+$");
        Matcher mcCategory = ptCategory.matcher(txtCategoryName.getText());
        if (!mcCategory.find()) {
            throw new Exception("Category Name is not valid");
        }
    }
}
