/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.systemAdmin;

import Models.ClientInformationManager;
import Models.Store;
import Utilities.SystemAdminController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hanee
 */
public final class ManageStores extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoress
     */
    JPanel bottomPanel;
    private Store selectedStore;
    private Store editingStore;
    private ArrayList<Store> stores;
    
    public ManageStores(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
        populateTable();
    }
    
    private void clearFields() {
        
        storeNameInput.setText("");
        storePostalInput.setText("");
        idValue.setText("");
        
        selectedStore = null;
        editingStore = null;
    }
    
    public void populateTable() {
        try {
            
            this.stores = SystemAdminController.getAllStores();
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            
            tableModel.setRowCount(0);
            
            for (Store store : stores) {
                String[] storeData = {(String) Integer.toString(store.getStoreId()), store.getStoreName(), store.getPostalCode()};
                tableModel.addRow(storeData);
            }
            
            clearFields();
            
        } catch (Exception e) {
            
        }
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
        heading = new javax.swing.JLabel();
        table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addStoreBtn = new javax.swing.JButton();
        saveChangesBtn = new javax.swing.JButton();
        editStoreBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idValue = new javax.swing.JLabel();
        deleteStoreBtn = new javax.swing.JButton();
        storeNameLabel = new javax.swing.JLabel();
        storeNameInput = new javax.swing.JTextField();
        storePostalLabel = new javax.swing.JLabel();
        storePostalInput = new javax.swing.JTextField();
        backToMenuBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Manage Store");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "StoreID", "Store Name", "Store Postal Code"
            }
        ));
        table.setViewportView(jTable1);

        addStoreBtn.setText("Add Store");
        addStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoreBtnActionPerformed(evt);
            }
        });

        saveChangesBtn.setText("Save changes");
        saveChangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesBtnActionPerformed(evt);
            }
        });

        editStoreBtn.setText("Edit Store");
        editStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStoreBtnActionPerformed(evt);
            }
        });

        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("Store ID");

        idValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idValue.setForeground(new java.awt.Color(255, 255, 255));
        idValue.setText("abc1234");

        deleteStoreBtn.setText("Delete Store");
        deleteStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStoreBtnActionPerformed(evt);
            }
        });

        storeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        storeNameLabel.setText("Store name");

        storePostalLabel.setForeground(new java.awt.Color(255, 255, 255));
        storePostalLabel.setText("Store Postal Code");

        backToMenuBtn.setText("Back to admin menu");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storeNameLabel)
                    .addComponent(storePostalLabel)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(storePostalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deleteStoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuBtn)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heading)
                    .addComponent(backToMenuBtn))
                .addGap(18, 18, 18)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storeNameLabel)
                            .addComponent(storeNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storePostalLabel)
                            .addComponent(storePostalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        // TODO add your handling code here:
        
        AdminMenu adminMenuObj = new AdminMenu(bottomPanel);
        bottomPanel.add(adminMenuObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToMenuBtnActionPerformed

    private void addStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoreBtnActionPerformed
        // TODO add your handling code here:
        
        if(storeNameInput.getText().equals("") || storePostalInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please make sure you fill all the fields!", "Empty data inputs", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Store newStore = new Store();
        
        newStore.setPostalCode(storePostalInput.getText());
        newStore.setStoreName(storeNameInput.getText());
        
        SystemAdminController.addStore(newStore);
        
       populateTable();
        
    }//GEN-LAST:event_addStoreBtnActionPerformed

    private void editStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStoreBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                throw new IllegalArgumentException("Please select a store you want to edit the data for!");
            } else {
                editingStore = stores.get(selectedRowIndex);
                idValue.setText((String) Integer.toString(editingStore.getStoreId()));
                storeNameInput.setText(editingStore.getStoreName());
                storePostalInput.setText(editingStore.getPostalCode());
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editStoreBtnActionPerformed

    private void saveChangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (editingStore == null) {
                 throw new IllegalArgumentException("no-select");
            } else {
                Store newStore = new Store();
                
                newStore.setStoreName(storeNameInput.getText());
                newStore.setPostalCode(storePostalInput.getText());
                
                
                if (editingStore.getStoreName().equals(newStore.getStoreName()) && editingStore.getPostalCode().equals(newStore.getPostalCode())) {
                    throw new IllegalArgumentException("no-edit");
                } else {
                    SystemAdminController.editStore(editingStore, newStore);
                    clearFields();
                    populateTable();
                    JOptionPane.showMessageDialog(null, "Store succesfully updated!", "Successfully Updated", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("no-edit")) {
                JOptionPane.showMessageDialog(this, "Please make some changes to the user you have selected!", "Data Updation Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (e.getMessage().equals("no-select")) {
                JOptionPane.showMessageDialog(this, "Please make some you selected a user to edit!", "Data Updation Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveChangesBtnActionPerformed

    private void deleteStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStoreBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                
                throw new IllegalArgumentException("Please select a user to delete!");
                
            } else {
                
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                selectedStore = stores.get(selectedRowIndex);
                SystemAdminController.deleteStore(selectedStore);
                clearFields();
                populateTable();
                JOptionPane.showMessageDialog(null, "Store succesfully deleted!", "Successfully Deleted", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        } catch (IllegalArgumentException e) {
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Data Selection Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Data Deletion Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_deleteStoreBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStoreBtn;
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JButton deleteStoreBtn;
    private javax.swing.JButton editStoreBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton saveChangesBtn;
    private javax.swing.JTextField storeNameInput;
    private javax.swing.JLabel storeNameLabel;
    private javax.swing.JTextField storePostalInput;
    private javax.swing.JLabel storePostalLabel;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
