/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import Models.StoreService;
import Utilities.StoreServicesController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A
 */
public class SelectService extends javax.swing.JPanel {

    /**
     * Creates new form SelectService
     */
    JPanel bottomPanel;
    private ArrayList<StoreService> storeServicesList;
    private StoreService selectedStoreService;
    
    public SelectService(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saveAndViewSummaryButton = new javax.swing.JButton();
        chooseDatelb = new javax.swing.JLabel();
        backToProfileCreationButton = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT SERVICE PACKAGE");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PLACEHOLDER FOR JCAL");

        saveAndViewSummaryButton.setText("SAVE AND VIEW SUMMARY");
        saveAndViewSummaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAndViewSummaryButtonActionPerformed(evt);
            }
        });

        chooseDatelb.setBackground(new java.awt.Color(255, 255, 255));
        chooseDatelb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        chooseDatelb.setForeground(new java.awt.Color(255, 255, 255));
        chooseDatelb.setText("CHOOSE APPOINTMENT DATE");

        backToProfileCreationButton.setText("BACK TO PROFILE CREATION");
        backToProfileCreationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToProfileCreationButtonActionPerformed(evt);
            }
        });

        ServiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service ID", "Name", "Price"
            }
        ));
        table.setViewportView(ServiceTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backToProfileCreationButton)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(chooseDatelb)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(saveAndViewSummaryButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backToProfileCreationButton)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(chooseDatelb)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(saveAndViewSummaryButton)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveAndViewSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndViewSummaryButtonActionPerformed
        // TODO add your handling code here:
        
        AppointmentSummary appointmentSummaryObj= new AppointmentSummary(bottomPanel);
        bottomPanel.add(appointmentSummaryObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_saveAndViewSummaryButtonActionPerformed
    
    public void populateTable(){
        try{
            this.storeServicesList = StoreServicesController.getAllStoreServices();
            
            DefaultTableModel tableModel = (DefaultTableModel) ServiceTable.getModel();
            tableModel.setRowCount(0);
            for (StoreService ss: storeServicesList){
                
                String[] storeServiceData = {String.valueOf(ss.getStoreServiceID()),ss.getServiceName(),String.valueOf(ss.getServicePrice())};
                tableModel.addRow(storeServiceData);
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void backToProfileCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToProfileCreationButtonActionPerformed
        // TODO add your handling code here:

        CreatePetProfile createPetProfile = new CreatePetProfile(bottomPanel);
        bottomPanel.add(createPetProfile);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToProfileCreationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ServiceTable;
    private javax.swing.JButton backToProfileCreationButton;
    private javax.swing.JLabel chooseDatelb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton saveAndViewSummaryButton;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
