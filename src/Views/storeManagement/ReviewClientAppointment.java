/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.Appointment;
import Models.Customer;
import Models.Pet;
import Utilities.AppointmentController;
import Utilities.EmailSender;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chait
 */
public class ReviewClientAppointment extends javax.swing.JPanel {

    /**
     * Creates new form reviewClientAppointment
     */
    JPanel bottomPanel;
    Appointment appointment;
    Customer customer;
    Pet pet;

    public ReviewClientAppointment(JPanel bottomPanel, Appointment appointment, Customer customer, Pet pet) {
        initComponents();

        this.bottomPanel = bottomPanel;
        this.appointment = appointment;
        this.customer = customer;
        this.pet = pet;
        populateTable();
    }
    
    
    /**
    * This method sends a confirmation email to the customer for their appointment.
    */
    private void sendConfirmationEmail() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = (appointment.getDate() != null) ? sdf.format(appointment.getDate()) : "not specified";

        String emailBody = String.format(
                "Hello %s,\n\n"
                + "Your appointment for the %s service with %s on %s has been successfully booked.\n"
                + "Here are the details:\n"
                + "Service: %s\n"
                + "Pet: %s\n"
                + "Date: %s\n"
                + "If you have any questions, please contact us. Thank you for choosing our services.\n\n"
                + "Best regards,\n"
                + "Furry Friends Veterinary Clinic",
                customer.getFirstName(), appointment.getServiceName(), pet.getPetName(), date, appointment.getServiceName(), pet.getPetName(), date);
        try {
            EmailSender.sendEmail(customer.getEmail(), "Appointment Confirmation - Furry Friends Veterinary Clinic", emailBody);
            System.out.println("Confirmation email sent to " + customer.getEmail());
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(this, "Failed to send confirmation email.", "Email Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
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

        submitAppointment = new javax.swing.JButton();
        viewAppTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        smReviewAppointmentTable = new javax.swing.JTable();
        smBackToServiceOptions = new javax.swing.JButton();
        backToHomeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        submitAppointment.setText("COMPLETE BOOKING");
        submitAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAppointmentActionPerformed(evt);
            }
        });

        viewAppTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewAppTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewAppTitleLabel.setText("PLEASE REVIEW YOUR APPOINTMENT");

        smReviewAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER ID", "STORE NAME", "SERVICE TYPE", "PET NAME", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(smReviewAppointmentTable);

        smBackToServiceOptions.setText("BACK TO SERVICE OPTIONS");
        smBackToServiceOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smBackToServiceOptionsActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(viewAppTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backToHomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(smBackToServiceOptions)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(smBackToServiceOptions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAppTitleLabel)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(submitAppointment)
                .addGap(18, 18, 18)
                .addComponent(backToHomeButton)
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void smBackToServiceOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smBackToServiceOptionsActionPerformed
        // TODO add your handling code here:

        SelectServicePanel typeOfService = new SelectServicePanel(bottomPanel, appointment, customer, pet);
        bottomPanel.add(typeOfService);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smBackToServiceOptionsActionPerformed

    private void submitAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAppointmentActionPerformed
        // TODO add your handling code here:                          
        try {
                
                int selectedRowIndex = smReviewAppointmentTable.getSelectedRow();

        if (selectedRowIndex != -1) {
             AppointmentController.addAppointment(appointment);
            JOptionPane.showMessageDialog(null, "BOOKING COMPLETE!");

            sendConfirmationEmail();
        } else {
            JOptionPane.showMessageDialog(this, "Please select the appointment to complete the booking!", "Booking error", JOptionPane.ERROR_MESSAGE);
        }
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitAppointmentActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // TODO add your handling code here:
        ClientAppointmentChoosePanel clientAppointmentChoosePanelObj = new ClientAppointmentChoosePanel(bottomPanel, appointment);
        bottomPanel.add(clientAppointmentChoosePanelObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToHomeButtonActionPerformed
    /**
    * This method populates the `smReviewAppointmentTable` with data from a single appointment object (`appointment`).
    */
    public void populateTable() {
        try {
            DefaultTableModel tableModel = (DefaultTableModel) smReviewAppointmentTable.getModel();
            tableModel.setRowCount(0);

            appointment.setStatus("PENDING");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = (appointment.getDate() != null) ? sdf.format(appointment.getDate()) : "No Date Set";

            String[] storeServiceData = {String.valueOf(appointment.getCustomerId()), appointment.getStoreName(), appointment.getServiceName(), appointment.getPetName(), formattedDate, appointment.getStatus()};
            tableModel.addRow(storeServiceData);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton smBackToServiceOptions;
    private javax.swing.JTable smReviewAppointmentTable;
    private javax.swing.JButton submitAppointment;
    private javax.swing.JLabel viewAppTitleLabel;
    // End of variables declaration//GEN-END:variables
}
