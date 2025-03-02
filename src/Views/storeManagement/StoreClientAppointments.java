/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.Appointment;
import Models.ClientInformationManager;
import Models.StoreEmployee;
import Utilities.AppointmentController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chait
 */
public class StoreClientAppointments extends javax.swing.JPanel {

    /**
     * Creates new form StoreClientAppointments
     */
    JPanel bottomPanel;
    
    String storeLocation;
    ClientInformationManager clims;
    Appointment appointments;
    ArrayList<Appointment> storeAppointmentList;
    StoreEmployee storeEmployee;
    public StoreClientAppointments(JPanel bottomPanel, StoreEmployee storeEmployee) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.storeEmployee = storeEmployee;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        smAppointmentsTable = new javax.swing.JTable();
        smBackToHomeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UNIVERSAL CLIENT APPOINTMENTS");

        smAppointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "APP ID", "STORE NAME", "PET NAME", "SERVICE", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(smAppointmentsTable);

        smBackToHomeButton.setText("BACK TO EMPLOYEE MENU");
        smBackToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smBackToHomeButtonActionPerformed(evt);
            }
        });

        jButton1.setText("MARK AS COMPLETED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(smBackToHomeButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(163, 163, 163))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(smBackToHomeButton)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void smBackToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smBackToHomeButtonActionPerformed
        // TODO add your handling code here:

        StoreEmployeeLandingPage storeEmployeeLandingPageObj = new StoreEmployeeLandingPage(bottomPanel,storeEmployee);
        bottomPanel.add(storeEmployeeLandingPageObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smBackToHomeButtonActionPerformed
    
    /**
    * This method populates the `smAppointmentsTable` with a list of appointments for the currently logged-in store employee's store.
    */
    public void populateTable() {
        int storeId = storeEmployee.getStoreID();

        try {
            this.storeAppointmentList = AppointmentController.getAppointmentsByStoreID(storeId);
            
            DefaultTableModel tableModel = (DefaultTableModel) smAppointmentsTable.getModel();
            tableModel.setRowCount(0);
            for (Appointment appointment : storeAppointmentList) {


                String[] appointmentData = {String.valueOf(appointment.getAppointmentId()),appointment.getStoreName(),appointment.getServiceName(),appointment.getPetName(), String.valueOf(appointment.getDate()), appointment.getStatus()};
                tableModel.addRow(appointmentData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = smAppointmentsTable.getSelectedRow();

        if (selectedRowIndex != -1) {
            String appointmentId = (String) smAppointmentsTable.getValueAt(selectedRowIndex, 0);
            
            if(smAppointmentsTable.getValueAt(selectedRowIndex, 5).equals("COMPLETED")){
                    JOptionPane.showMessageDialog(this, "You cannot cancel an appointed which is already completed!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
            }
            
            if(smAppointmentsTable.getValueAt(selectedRowIndex, 5).equals("CANCELLED")){
                JOptionPane.showMessageDialog(this, "You cannot cancel an appointed which is cancelled!", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
            }

            AppointmentController.updateAppointmentStatus(appointmentId, "COMPLETED");

            smAppointmentsTable.setValueAt("COMPLETED", selectedRowIndex, 5);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an appointment.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable smAppointmentsTable;
    private javax.swing.JButton smBackToHomeButton;
    // End of variables declaration//GEN-END:variables
}
