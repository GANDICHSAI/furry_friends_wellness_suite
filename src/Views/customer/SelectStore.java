/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import Models.Store;
import Utilities.SelectStoreController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A
 */
public class SelectStore extends javax.swing.JPanel {

    /**
     * Creates new form SelectStore
     */
    JPanel bottomPanel;
    public SelectStore(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        strTitleLabel = new javax.swing.JLabel();
        postalCodeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchByPostalCodeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeTable = new javax.swing.JTable();
        nextToPetButton = new javax.swing.JButton();
        backToHomeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        strTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        strTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        strTitleLabel.setText("SELECT STORE LOCATION");

        postalCodeTextField.setText("POSTAL CODE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEARCH BY YOUR LOCATION");

        searchByPostalCodeButton.setText("SEARCH");
        searchByPostalCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByPostalCodeButtonActionPerformed(evt);
            }
        });

        storeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STORE NAME", "POSTAL CODE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeTable);

        nextToPetButton.setText("NEXT");
        nextToPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextToPetButtonActionPerformed(evt);
            }
        });

        backToHomeButton.setText("BACK TO HOME");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(strTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(searchByPostalCodeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(nextToPetButton)))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backToHomeButton)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backToHomeButton)
                .addGap(43, 43, 43)
                .addComponent(strTitleLabel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(postalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(searchByPostalCodeButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(nextToPetButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextToPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextToPetButtonActionPerformed
        // TODO add your handling code here:
        
        CreatePetProfile createPetProfileObj= new CreatePetProfile(bottomPanel);
        bottomPanel.add(createPetProfileObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        
    }//GEN-LAST:event_nextToPetButtonActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // TODO add your handling code here:
        
        CustomerLandingPage customerLandingPageObj = new CustomerLandingPage(bottomPanel);
        bottomPanel.add(customerLandingPageObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

    private void searchByPostalCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByPostalCodeButtonActionPerformed
        // TODO add your handling code here:
        String postalCode = postalCodeTextField.getText();
    
    // Clear the existing table data
    DefaultTableModel model = (DefaultTableModel) storeTable.getModel();
    model.setRowCount(0);
    
    // Check if the postal code field is not empty or just the placeholder text
    if(postalCode != null && !postalCode.trim().isEmpty() && !postalCode.equals("POSTAL CODE")) {
        // Use StoreController to get the list of stores by postal code
        SelectStoreController storeController = new SelectStoreController();
        ArrayList<Store> stores = storeController.searchByPostalCode(postalCode);
        
        // Update the store table with the results
        for(Store store : stores) {
            model.addRow(new Object[]{store.getStoreName(), store.getPostalCode()});
        }
    } else {
        // Show an error message dialog if the postal code field is empty
        JOptionPane.showMessageDialog(this, "Please enter a valid postal code.", "Search Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_searchByPostalCodeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextToPetButton;
    private javax.swing.JTextField postalCodeTextField;
    private javax.swing.JButton searchByPostalCodeButton;
    private javax.swing.JTable storeTable;
    private javax.swing.JLabel strTitleLabel;
    // End of variables declaration//GEN-END:variables
}
