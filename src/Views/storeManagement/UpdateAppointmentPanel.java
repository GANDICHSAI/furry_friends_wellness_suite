/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.Appointment;
import Utilities.AppointmentController;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yihan
 */
public class UpdateAppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreEmployeePanel
     */
    JPanel bottomPanel;
    Appointment appointment;
    private Appointment selectedAppointment;
    private ArrayList<Appointment> storeAppointmentList;

    public UpdateAppointmentPanel(JPanel bottomPanel) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        updateAppointmentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        storeEmployeeLogoutButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        editAppointment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newAppointmentDate = new com.toedter.calendar.JDateChooser();
        searchCustomerIdTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Appointment List");

        updateAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "APP ID", "CUS ID", "STORE NAME", "SERVICE TYPE", "PET NAME", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(updateAppointmentTable);

        jButton1.setText("CANCEL APPOINTMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        storeEmployeeLogoutButton.setText("GO BACK TO HOME");
        storeEmployeeLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeEmployeeLogoutButtonActionPerformed(evt);
            }
        });

        jButton2.setText("SAVE CHANGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        editAppointment.setText("EDIT APPOINTMENT");
        editAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAppointmentActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEW APPOINTMENT DATE");

        searchCustomerIdTextField.setText("Search by Customer ID");
        searchCustomerIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerIdTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(storeEmployeeLogoutButton)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(searchCustomerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(searchButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editAppointment)
                        .addGap(74, 74, 74)
                        .addComponent(jButton2)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(storeEmployeeLogoutButton)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(searchCustomerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newAppointmentDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(editAppointment))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = updateAppointmentTable.getSelectedRow();
        
        
        if (selectedRowIndex >= 0) {
            // Confirm deletion
            
            String appointmentStatus = (String) updateAppointmentTable.getValueAt(selectedRowIndex, 6);

            if ("CANCELLED".equals(appointmentStatus.toUpperCase()) || "COMPLETED".equals(appointmentStatus.toUpperCase())) {
                JOptionPane.showMessageDialog(this, "This appointment cannot be cancelled.", "Cancellation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to cancel the selected appointment?",
                    "Cancel Appointment",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                // Assuming the table model starts with the appointment ID
                int appointmentId = Integer.parseInt(updateAppointmentTable.getValueAt(selectedRowIndex, 0).toString());

                // Call the controller to delete the appointment
                AppointmentController.deleteAppointment(appointmentId);


                populateTable();
                new Date().getDay();

                JOptionPane.showMessageDialog(this, "Appointment cancelled successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an appointment to cancel.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * This method populates the `updateAppointmentTable` with a list of appointments retrieved using a join operation (likely combining multiple tables).
    */
    public void populateTable() {


        try {
            this.storeAppointmentList = AppointmentController.getAppointmentsByJoin();

            DefaultTableModel tableModel = (DefaultTableModel) updateAppointmentTable.getModel();
            tableModel.setRowCount(0);
            for (Appointment appointment : storeAppointmentList) {

                String[] appointmentData = {String.valueOf(appointment.getAppointmentId()), String.valueOf(appointment.getCustomerId()), appointment.getStoreName(), appointment.getServiceName(), appointment.getPetName(), String.valueOf(appointment.getDate()), appointment.getStatus()};
                tableModel.addRow(appointmentData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void storeEmployeeLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeEmployeeLogoutButtonActionPerformed
        // TODO add your handling code here:

        ClientAppointmentChoosePanel clientAppointmentChoosePanel = new ClientAppointmentChoosePanel(bottomPanel, appointment);
        bottomPanel.add(clientAppointmentChoosePanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);


    }//GEN-LAST:event_storeEmployeeLogoutButtonActionPerformed

    private void editAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAppointmentActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = updateAppointmentTable.getSelectedRow();
        if (selectedRowIndex >= 0) {

            Appointment selectedAppointment = storeAppointmentList.get(selectedRowIndex);

            // Store the selectedAppointment for use when saving later
            this.selectedAppointment = selectedAppointment;

            //set the date in JDateChooser to the date of the selected appointment
            newAppointmentDate.setDate(selectedAppointment.getDate());
        } else {
            JOptionPane.showMessageDialog(this, "Please select an appointment to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editAppointmentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            int selectedRowIndex = updateAppointmentTable.getSelectedRow();

            Date currentDate = new Date();

            // Get the date from the JDateChooser
            Date selectedDate = newAppointmentDate.getDate();

            if (selectedDate.before(currentDate)) {
                JOptionPane.showMessageDialog(this, "Please enter a valid date!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (selectedRowIndex < 0) {
                throw new IllegalArgumentException("Please select an appointment to edit.");
            }

            String appointmentStatus = (String) updateAppointmentTable.getValueAt(selectedRowIndex, 6);
            if (appointmentStatus.equals("CANCELLED") || appointmentStatus.equals("COMPLETED")) {
                throw new IllegalArgumentException("You can't update the new appointment as appointment cancelled or completed");
            }

            java.util.Date newDate = newAppointmentDate.getDate();
            String existingDate = String.valueOf(updateAppointmentTable.getValueAt(selectedRowIndex, 5));

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedNewDate = outputFormat.format(newDate);
            String formattedCurrentDate = outputFormat.format(currentDate);

            if (newDate == null) {
                throw new IllegalArgumentException("Please choose a new appointment date.");
            }

            if (formattedNewDate.compareTo(formattedCurrentDate) < 0 || formattedNewDate.equals(existingDate)) {
                throw new IllegalArgumentException("Please choose appropriate date.");
            }

            int appointmentId = Integer.parseInt(updateAppointmentTable.getValueAt(selectedRowIndex, 0).toString()); // Get the appointment ID
            // edit the appointment date

            AppointmentController.editAppointmentDate(appointmentId, newDate);

            // Update the table model
            DefaultTableModel model = (DefaultTableModel) updateAppointmentTable.getModel();
            model.setValueAt(newDate, selectedRowIndex, 5); // date is in column 5

            JOptionPane.showMessageDialog(this, "Appointment updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchCustomerIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCustomerIdTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchCustomerId = searchCustomerIdTextField.getText();

        // Clear the existing table data
        DefaultTableModel model = (DefaultTableModel) updateAppointmentTable.getModel();
        model.setRowCount(0);

        if (searchCustomerId != null && !searchCustomerId.trim().isEmpty()) {
            ArrayList<Appointment> appointments = AppointmentController.getAppointmentListByCustomerId(Integer.parseInt(searchCustomerId));

            if (appointments.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No appointments found for customer ID: " + searchCustomerId, "Not Found Error", JOptionPane.ERROR_MESSAGE);
            }

            for (Appointment appointment : appointments) {
                model.addRow(new Object[]{String.valueOf(appointment.getAppointmentId()), String.valueOf(appointment.getCustomerId()), appointment.getStoreName(), appointment.getServiceName(), appointment.getPetName(), String.valueOf(appointment.getDate()), appointment.getStatus()});
            }
        } else {
            ArrayList<Appointment> allAppointments = AppointmentController.getAllAppointments();

            if (allAppointments.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No appointments found.", "Not Found Error", JOptionPane.ERROR_MESSAGE);
            }

            for (Appointment appointment : allAppointments) {
                model.addRow(new Object[]{String.valueOf(appointment.getAppointmentId()), String.valueOf(appointment.getCustomerId()), appointment.getStoreName(), appointment.getServiceName(), appointment.getPetName(), String.valueOf(appointment.getDate()), appointment.getStatus()});
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editAppointment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser newAppointmentDate;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchCustomerIdTextField;
    private javax.swing.JButton storeEmployeeLogoutButton;
    private javax.swing.JTable updateAppointmentTable;
    // End of variables declaration//GEN-END:variables
}
