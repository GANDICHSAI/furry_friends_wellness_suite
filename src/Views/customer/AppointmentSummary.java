/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import Models.Appointment;
import Models.Customer;
import Utilities.AppointmentController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author A
 */
public class AppointmentSummary extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentSummary
     */
    
    JPanel bottomPanel;
    Customer customer;
    Appointment appointment;
    public AppointmentSummary(JPanel bottomPanel,Customer customer,Appointment appointment) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.customer = customer;
        this.appointment = appointment;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void fetchAndPopulateAppointmentDetails() {
        ArrayList<Appointment> appointments = AppointmentController.getAppointmentsByCustomerId(customer.getCustomerID());

        DefaultTableModel model = (DefaultTableModel) viewAppLabel.getModel();
        model.setRowCount(0); // Clear previous data

        for(Appointment app : appointments) {
            model.addRow(new Object[]{
                app.getCustomerId(),
                app.getStoreName(),
                app.getServiceId(), // Assuming you have a method to get the service name by ID
                app.getPetId(),
                app.getDate().toString(),
                app.getStatus(),
                app.getRating()
            });
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAppTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAppLabel = new javax.swing.JTable();
        bookComplete = new javax.swing.JButton();
        backToServiceOptions = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        viewAppTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewAppTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewAppTitleLabel.setText("PLEASE REVIEW YOUR APPOINTMENT");

        viewAppLabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER ID", "STORE NAME", "SERVICE TYPE", "PET NAME", "DATE", "STATUS", "RATING"
            }
        ));
        jScrollPane1.setViewportView(viewAppLabel);

        bookComplete.setText("COMPLETE BOOKING");

        backToServiceOptions.setText("BACK TO SERVICE OPTIONS");
        backToServiceOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToServiceOptionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(viewAppTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(bookComplete)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToServiceOptions))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backToServiceOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAppTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(bookComplete)
                .addGap(177, 177, 177))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToServiceOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToServiceOptionsActionPerformed
        // TODO add your handling code here:
        
        SelectService selectService = new SelectService(bottomPanel,customer,appointment);
        bottomPanel.add(selectService);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToServiceOptionsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToServiceOptions;
    private javax.swing.JButton bookComplete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewAppLabel;
    private javax.swing.JLabel viewAppTitleLabel;
    // End of variables declaration//GEN-END:variables
}
