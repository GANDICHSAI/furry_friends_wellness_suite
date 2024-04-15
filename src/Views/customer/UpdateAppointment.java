package Views.customer;

import Models.Appointment;
import Models.Customer;
import Utilities.AppointmentController;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author A
 */
public class UpdateAppointment extends javax.swing.JPanel {

    /**
     * Creates new form UpdateAppointment
     */
    
    JPanel bottomPanel;
    Customer customer;
    Appointment appointment;
    private Appointment selectedAppointment;
    ArrayList<Appointment> allAppointments;
    public UpdateAppointment(JPanel bottomPanel,Customer customer, Appointment appointment) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.customer = customer;
        populateAppointmentTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appCRUDTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppSumTableCRUD = new javax.swing.JTable();
        editApp = new javax.swing.JButton();
        saveApp = new javax.swing.JButton();
        deleteAPP = new javax.swing.JButton();
        backToHomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ChangeDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 0, 0));

        appCRUDTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        appCRUDTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        appCRUDTitleLabel.setText("SELECT TO CHANGE YOUR APPOINTMENT");

        AppSumTableCRUD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "APP ID", "STORE NAME", "SERVICE TYPE", "PET NAME", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(AppSumTableCRUD);

        editApp.setText("EDIT APPOINTMENT");
        editApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAppActionPerformed(evt);
            }
        });

        saveApp.setText("SAVE CHANGE");
        saveApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAppActionPerformed(evt);
            }
        });

        deleteAPP.setText("CANCEL APPOINTMENT");
        deleteAPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAPPActionPerformed(evt);
            }
        });

        backToHomeButton.setText("BACK TO HOME");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW APPOINTMENT DATE");

        ChangeDateChooser.setIcon(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(appCRUDTitleLabel)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backToHomeButton)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editApp)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveApp)
                        .addGap(67, 67, 67)
                        .addComponent(deleteAPP))
                    .addComponent(ChangeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backToHomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(appCRUDTitleLabel)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editApp)
                            .addComponent(saveApp)
                            .addComponent(deleteAPP)))
                    .addComponent(ChangeDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateAppointmentTable() {
        ArrayList<Appointment> appointments = AppointmentController.testController(customer.getCustomerID());
        this.allAppointments = appointments;
        DefaultTableModel model = (DefaultTableModel) AppSumTableCRUD.getModel();
        model.setRowCount(0); 

        for(Appointment app : appointments) {
            
            

            model.addRow(new Object[]{
                    app.getAppointmentId(),
//                    app.getCustomerId(),
                    app.getStoreName(),
                    app.getServiceName(),
                  
                    app.getPetName(),
                    app.getDate().toString(),
                    app.getStatus()
//                    app.getRating()
            });
        }
    }
    
    
    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // TODO add your handling code here:
        
        CustomerLandingPage customerLandingPageObj = new CustomerLandingPage(bottomPanel,customer,appointment);
        bottomPanel.add(customerLandingPageObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

    private void editAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAppActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = AppSumTableCRUD.getSelectedRow();
        if (selectedRowIndex >= 0) {
            // get all appointments for the customer
            //ArrayList<Appointment> appointments = AppointmentController.getAppointmentsByCustomerId(customer.getCustomerID());

            //selected appointment row index = the index of appointment in returned arraylist
            Appointment selectedAppointment = allAppointments.get(selectedRowIndex);

            // Store the selectedAppointment for use when saving later
            this.selectedAppointment = selectedAppointment;

            //set the date in JDateChooser to the date of the selected appointment
            ChangeDateChooser.setDate(selectedAppointment.getDate());
    } else {
        JOptionPane.showMessageDialog(this, "Please select an appointment to edit.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
    }//GEN-LAST:event_editAppActionPerformed

    private void saveAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAppActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = AppSumTableCRUD.getSelectedRow();
            Date currentDate = Calendar.getInstance().getTime();
            if (selectedRowIndex < 0) {
                throw new IllegalArgumentException("Please select an appointment to edit.");
            }
            java.util.Date newDate = ChangeDateChooser.getDate();
            String existingDate = (String) AppSumTableCRUD.getValueAt(selectedRowIndex, 4);
            
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = outputFormat.format(newDate);
            System.out.println(formattedDate+" "+existingDate);
            
            if (newDate == null) {
                throw new IllegalArgumentException("Please choose a new appointment date.");
            }
            if(newDate.before(currentDate)||formattedDate.equals(existingDate)){
                throw new IllegalArgumentException("Please choose appropriate date.");
            }

            int appointmentId = (Integer) AppSumTableCRUD.getValueAt(selectedRowIndex, 0); // Get the appointment ID
            // edit the appointment date
            AppointmentController.editAppointmentDate(appointmentId, newDate);

            // Update the table model
            DefaultTableModel model = (DefaultTableModel) AppSumTableCRUD.getModel();
            model.setValueAt(newDate, selectedRowIndex, 4); // date is in column 5

            JOptionPane.showMessageDialog(this, "Appointment updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_saveAppActionPerformed

    private void deleteAPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAPPActionPerformed
//        // TODO add your handling code here:
          //      need help with appointment deletion
          // what index to use to delete appointment
          
        int selectedRowIndex = AppSumTableCRUD.getSelectedRow();
        if (selectedRowIndex >= 0) {
        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to cancel the selected appointment?",
                "Cancel Appointment",
                JOptionPane.YES_NO_OPTION);
                
        if (confirm == JOptionPane.YES_OPTION) {
            // Assuming the table model starts with the appointment ID
            int appointmentId = (int) AppSumTableCRUD.getValueAt(selectedRowIndex, 0);
            
            // Call the controller to delete the appointment
            AppointmentController.deleteAppointment(appointmentId);
            
            // Remove the row from the table model
            //((DefaultTableModel) AppSumTableCRUD.getModel()).removeRow(selectedRowIndex);
            populateAppointmentTable();
            new Date().getDay();
            
            JOptionPane.showMessageDialog(this, "Appointment cancelled successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select an appointment to cancel.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleteAPPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppSumTableCRUD;
    private com.toedter.calendar.JDateChooser ChangeDateChooser;
    private javax.swing.JLabel appCRUDTitleLabel;
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JButton deleteAPP;
    private javax.swing.JButton editApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveApp;
    // End of variables declaration//GEN-END:variables
}
