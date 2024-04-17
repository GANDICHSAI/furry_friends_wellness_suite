/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.Appointment;
import Models.Customer;
import Models.Pet;
import Models.StoreEmployee;
import Models.StoreService;

import Utilities.StoreServicesController;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chait
 */
public class SelectServicePanel extends javax.swing.JPanel {

    /**
     * Creates new form typeOfService
     */
    JPanel bottomPanel;
    Appointment appointment;
    StoreEmployee storeEmployee;
    Customer customer;
    Pet pet;
    private ArrayList<StoreService> storeServicesList;

    public SelectServicePanel(JPanel bottomPanel, Appointment appointment, Customer customer, Pet pet) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.appointment = appointment;
//        this.storeEmployee = storeEmployee;
        this.customer = customer;
        this.pet = pet;
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
        smBackToProfileCreationButton = new javax.swing.JButton();
        saveAndViewSummaryButton = new javax.swing.JButton();
        chooseDatelb = new javax.swing.JLabel();
        table = new javax.swing.JScrollPane();
        smServiceTable = new javax.swing.JTable();
        appointmentDateChooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT SERVICE PACKAGE");

        smBackToProfileCreationButton.setText("BACK TO PROFILE CREATION");
        smBackToProfileCreationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smBackToProfileCreationButtonActionPerformed(evt);
            }
        });

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

        smServiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setViewportView(smServiceTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(198, 198, 198)
                            .addComponent(chooseDatelb)
                            .addGap(221, 221, 221)))
                    .addComponent(smBackToProfileCreationButton))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(appointmentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(saveAndViewSummaryButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(smBackToProfileCreationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(chooseDatelb)
                .addGap(18, 18, 18)
                .addComponent(appointmentDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(saveAndViewSummaryButton)
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void smBackToProfileCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smBackToProfileCreationButtonActionPerformed
        // TODO add your handling code here:

        CreateCustomerAndPetPanel newAppointment = new CreateCustomerAndPetPanel(bottomPanel, appointment, customer, pet);
        bottomPanel.add(newAppointment);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smBackToProfileCreationButtonActionPerformed

    public void populateTable() {
        try {
            this.storeServicesList = StoreServicesController.getAllStoreServices();

            DefaultTableModel tableModel = (DefaultTableModel) smServiceTable.getModel();
            tableModel.setRowCount(0);
            for (StoreService ss : storeServicesList) {

                String[] storeServiceData = {String.valueOf(ss.getStoreServiceID()), ss.getServiceName(), String.valueOf(ss.getServicePrice())};
                tableModel.addRow(storeServiceData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void saveAndViewSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndViewSummaryButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = smServiceTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a service.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Date selectedDate = appointmentDateChooser.getDate();
        // Get today's date
        Date currentDate = new Date();

        if (selectedDate == null) {
            JOptionPane.showMessageDialog(this, "Please choose date before completing appointment", "Date selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (selectedDate.before(currentDate)) {
                JOptionPane.showMessageDialog(this, "Please select a valid date.", "Date selection Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            appointment.setDate(appointmentDateChooser.getDate());
        }

        int serviceId = Integer.parseInt((String) smServiceTable.getValueAt(selectedRow, 0));
        appointment.setServiceId(serviceId);
        String serviceName = (String) smServiceTable.getValueAt(selectedRow, 1);
        appointment.setServiceName(serviceName);

        ReviewClientAppointment reviewClientAppointmentObj = new ReviewClientAppointment(bottomPanel, appointment, customer, pet);
        bottomPanel.add(reviewClientAppointmentObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_saveAndViewSummaryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser appointmentDateChooser;
    private javax.swing.JLabel chooseDatelb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveAndViewSummaryButton;
    private javax.swing.JButton smBackToProfileCreationButton;
    private javax.swing.JTable smServiceTable;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
