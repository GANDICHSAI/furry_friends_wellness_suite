/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.Appointment;
import Models.ClientInformationManager;
import Models.Customer;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 * @author chait
 */
public class ClientAppointmentChoosePanel extends javax.swing.JPanel {

    /**
     * Creates new form clientInformationManager
     */
    JPanel bottomPanel;
//    StoreEmployee storeEmployee;
    Customer customer;
    Appointment appointment;



    public ClientAppointmentChoosePanel(JPanel bottomPanel, Appointment appointment) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.appointment = appointment;
        this.customer = customer;
   

//        this.storeEmployee = storeEmployee;
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
        smNewAppointment = new javax.swing.JButton();
        smViewAppointments = new javax.swing.JButton();
        smLogOutButton = new javax.swing.JButton();
        smUpdateAppointments = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME STORE EMPLOYEE");

        smNewAppointment.setText(" CREATE A NEW APPOINTMENT");
        smNewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smNewAppointmentActionPerformed(evt);
            }
        });

        smViewAppointments.setText("VIEW EXISTING APPOINTMENTS");
        smViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smViewAppointmentsActionPerformed(evt);
            }
        });

        smLogOutButton.setText("LOGOUT");
        smLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLogOutButtonActionPerformed(evt);
            }
        });

        smUpdateAppointments.setText("UPDATE APPOINTMENTS");
        smUpdateAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smUpdateAppointmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smViewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smUpdateAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(smLogOutButton)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(246, 246, 246))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(smLogOutButton)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(smNewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(smViewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(smUpdateAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void smNewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smNewAppointmentActionPerformed
        // TODO add your handling code here:
//        System.out.println(storeEmployee);

        SelectStorePanel selectStorePanelObj = new SelectStorePanel(bottomPanel,appointment,customer);
        bottomPanel.add(selectStorePanelObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        
        

    }//GEN-LAST:event_smNewAppointmentActionPerformed

    private void smViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smViewAppointmentsActionPerformed
        // TODO add your handling code here:

        ClientAppointments clientAppointmentsObj = new ClientAppointments(bottomPanel);
        bottomPanel.add(clientAppointmentsObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smViewAppointmentsActionPerformed

    private void smLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLogOutButtonActionPerformed
        // TODO add your handling code here:

        StoreManagementLogin storeManagementLogin = new StoreManagementLogin(bottomPanel,appointment);
        bottomPanel.add(storeManagementLogin);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smLogOutButtonActionPerformed

    private void smUpdateAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smUpdateAppointmentsActionPerformed
        // TODO add your handling code here:
        
        UpdateAppointmentPanel updateAppointmentPanel = new UpdateAppointmentPanel(bottomPanel,null);
        bottomPanel.add(updateAppointmentPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        
        
    }//GEN-LAST:event_smUpdateAppointmentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton smLogOutButton;
    private javax.swing.JButton smNewAppointment;
    private javax.swing.JButton smUpdateAppointments;
    private javax.swing.JButton smViewAppointments;
    // End of variables declaration//GEN-END:variables
}
