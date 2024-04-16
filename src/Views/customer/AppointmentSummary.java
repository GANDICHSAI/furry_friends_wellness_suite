/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import Models.Appointment;
import Models.Customer;
import Models.Pet;
import Models.StoreService;
import Utilities.AppointmentController;
import Utilities.EmailSender;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.mail.MessagingException;

import javax.swing.JOptionPane;
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
    Pet pet;
    StoreService service;
    public AppointmentSummary(JPanel bottomPanel,Customer customer,Appointment appointment, StoreService service, Pet pet) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.customer = customer;
        this.appointment = appointment;
        this.pet = pet;
        this.service = service;
        fetchAndPopulateAppointmentDetails();
        System.out.println(appointment.getStoreId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void fetchAndPopulateAppointmentDetails() {
        DefaultTableModel model = (DefaultTableModel) viewAppLabel.getModel();
        model.setRowCount(0); // Clear existing data

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = (appointment.getDate() != null) ? sdf.format(appointment.getDate()) : "No Date Set";

        Object[] row = new Object[6];
        row[0] = appointment.getCustomerId();
        row[1] = appointment.getStoreName();
        row[2] = service.getServiceName(); 
        row[3] = pet.getPetName();  
        row[4] = formattedDate;
        row[5] = appointment.getStatus();
//        row[6] = appointment.getRating();

        model.addRow(row);
//        
    }
    
    private void sendConfirmationEmail() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date = (appointment.getDate() != null) ? sdf.format(appointment.getDate()) : "not specified";

    String emailBody = String.format(
        "Hello %s,\n\n" +
        "Your appointment for the %s service with %s on %s has been successfully booked.\n" +
        "Here are the details:\n" +
        "Service: %s\n" +
        "Pet: %s\n" +
        "Date: %s\n" +
        "If you have any questions, please contact us. Thank you for choosing our services.\n\n" +
        "Best regards,\n" +
        "Furry Friends Veterinary Clinic",
        customer.getFirstName(), service.getServiceName(), pet.getPetName(), date, service.getServiceName(), pet.getPetName(), date);

    try {
        EmailSender.sendEmail(customer.getEmail(), "Appointment Confirmation - Furry Friends Veterinary Clinic", emailBody);
        System.out.println("Confirmation email sent to " + customer.getEmail());
    } catch (MessagingException e) {
        JOptionPane.showMessageDialog(this, "Failed to send confirmation email.", "Email Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAppTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAppLabel = new javax.swing.JTable();
        bookComplete = new javax.swing.JButton();
        backToServiceOptions = new javax.swing.JButton();
        bookComplete1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        viewAppTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        viewAppTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        viewAppTitleLabel.setText("PLEASE REVIEW YOUR APPOINTMENT");

        viewAppLabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CUSTOMER REF NO.", "STORE NAME", "SERVICE TYPE", "PET NAME", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(viewAppLabel);

        bookComplete.setText("COMPLETE BOOKING");
        bookComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookCompleteActionPerformed(evt);
            }
        });

        backToServiceOptions.setText("BACK TO SERVICE OPTIONS");
        backToServiceOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToServiceOptionsActionPerformed(evt);
            }
        });

        bookComplete1.setText("BACK TO HOME");
        bookComplete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookComplete1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookComplete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(bookComplete)
                .addGap(27, 27, 27)
                .addComponent(bookComplete1)
                .addGap(127, 127, 127))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToServiceOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToServiceOptionsActionPerformed
        // TODO add your handling code here:
        
        SelectService selectService = new SelectService(bottomPanel,customer,appointment,pet);
        bottomPanel.add(selectService);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToServiceOptionsActionPerformed

    private void bookCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookCompleteActionPerformed
        // TODO add your handling code here:
        
        try{
             int selectedRowIndex = viewAppLabel.getSelectedRow();
            if (selectedRowIndex < 0) {
                throw new IllegalArgumentException("Please select an appointment to complete booking an appointment.");
            }
            AppointmentController.addAppointment(appointment);
            JOptionPane.showMessageDialog(null, "BOOKING COMPLETE!");
            
            sendConfirmationEmail();
        }
        catch (Exception e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
      
        
        
    }//GEN-LAST:event_bookCompleteActionPerformed

    private void bookComplete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookComplete1ActionPerformed
        // TODO add your handling code here:
            CustomerLandingPage customerLandingPageObj = new CustomerLandingPage(bottomPanel,customer,appointment);
            bottomPanel.add(customerLandingPageObj);
            CardLayout layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel);
    }//GEN-LAST:event_bookComplete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToServiceOptions;
    private javax.swing.JButton bookComplete;
    private javax.swing.JButton bookComplete1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewAppLabel;
    private javax.swing.JLabel viewAppTitleLabel;
    // End of variables declaration//GEN-END:variables
}
