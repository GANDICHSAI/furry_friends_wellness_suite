/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author chait
 */
public class TypeOfService extends javax.swing.JPanel {

    /**
     * Creates new form typeOfService
     */
    JPanel bottomPanel;
    public TypeOfService(JPanel bottomPanel) {
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

        jLabel1 = new javax.swing.JLabel();
        smBackToProfileCreationButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        saveAndViewSummaryButton = new javax.swing.JButton();
        chooseDatelb = new javax.swing.JLabel();
        table = new javax.swing.JScrollPane();
        ServiceTable = new javax.swing.JTable();

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
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(250, 250, 250)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(198, 198, 198)
                                    .addComponent(chooseDatelb)))
                            .addGap(221, 221, 221)))
                    .addComponent(smBackToProfileCreationButton))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
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
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(saveAndViewSummaryButton)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void smBackToProfileCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smBackToProfileCreationButtonActionPerformed
        // TODO add your handling code here:
        
        NewAppointment newAppointment = new NewAppointment(bottomPanel);
        bottomPanel.add(newAppointment);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_smBackToProfileCreationButtonActionPerformed

    private void saveAndViewSummaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAndViewSummaryButtonActionPerformed
        // TODO add your handling code here:

//        AppointmentSummary appointmentSummaryObj= new AppointmentSummary(bottomPanel);
//        bottomPanel.add(appointmentSummaryObj);
//        CardLayout layout = (CardLayout) bottomPanel.getLayout();
//        layout.next(bottomPanel);
    }//GEN-LAST:event_saveAndViewSummaryButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ServiceTable;
    private javax.swing.JLabel chooseDatelb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton saveAndViewSummaryButton;
    private javax.swing.JButton smBackToProfileCreationButton;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
