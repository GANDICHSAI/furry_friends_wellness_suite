/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.systemAdmin;

import Models.Appointment;
import Models.ClientInformationManager;
import Views.storeManagement.StoreManagementLogin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author hanee
 */
public class AdminMenu extends javax.swing.JPanel {

    /**
     * Creates new form Test
     */
    JPanel bottomPanel;
    Appointment appointment;
    public AdminMenu(JPanel bottomPanel) {
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

        jPanel3 = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        createCredentialsBtn2 = new javax.swing.JButton();
        manageStoreEmpBtn2 = new javax.swing.JButton();
        manageStoreServicesBtn2 = new javax.swing.JButton();
        manageSystemAdminBtn2 = new javax.swing.JButton();
        manageCIMBtn2 = new javax.swing.JButton();
        manageStoreBtn2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        title2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(255, 255, 255));
        title2.setText("Admin Menu");

        createCredentialsBtn2.setText("Create Credentials");
        createCredentialsBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCredentialsBtn2ActionPerformed(evt);
            }
        });

        manageStoreEmpBtn2.setText("Manage Store Employees");
        manageStoreEmpBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreEmpBtn2ActionPerformed(evt);
            }
        });

        manageStoreServicesBtn2.setText("Manage Store Services");
        manageStoreServicesBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreServicesBtn2ActionPerformed(evt);
            }
        });

        manageSystemAdminBtn2.setText("Manage System Admin");
        manageSystemAdminBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSystemAdminBtn2ActionPerformed(evt);
            }
        });

        manageCIMBtn2.setText("Manage CIM");
        manageCIMBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCIMBtn2ActionPerformed(evt);
            }
        });

        manageStoreBtn2.setText("Manage Store ");
        manageStoreBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStoreBtn2ActionPerformed(evt);
            }
        });

        jButton6.setText("LOGOUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createCredentialsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageStoreServicesBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageStoreEmpBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageSystemAdminBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageCIMBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageStoreBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(title2)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton6)
                .addGap(88, 88, 88)
                .addComponent(title2)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageStoreBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createCredentialsBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageSystemAdminBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageStoreEmpBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageCIMBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manageStoreServicesBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createCredentialsBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCredentialsBtn2ActionPerformed
        // TODO add your handling code here:
        
        
        CreateCredentials createCredentialsObj = new CreateCredentials(bottomPanel);
        bottomPanel.add(createCredentialsObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_createCredentialsBtn2ActionPerformed

    private void manageSystemAdminBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSystemAdminBtn2ActionPerformed
        // TODO add your handling code here:
        
        ManageSystemAdmin manageSystemAdminObj = new ManageSystemAdmin(bottomPanel);
        bottomPanel.add(manageSystemAdminObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        
    }//GEN-LAST:event_manageSystemAdminBtn2ActionPerformed

    private void manageCIMBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCIMBtn2ActionPerformed
        // TODO add your handling code here:
        
        ManageCIM manageCIMObj = new ManageCIM(bottomPanel);
        bottomPanel.add(manageCIMObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_manageCIMBtn2ActionPerformed

    private void manageStoreEmpBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreEmpBtn2ActionPerformed
        // TODO add your handling code here:
        
        ManageStoreEmployee manageStoreEmployeeObj = new ManageStoreEmployee(bottomPanel);
        bottomPanel.add(manageStoreEmployeeObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_manageStoreEmpBtn2ActionPerformed

    private void manageStoreServicesBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreServicesBtn2ActionPerformed
        // TODO add your handling code here:
        
        ManageStoreServices managerStoreServicesObj = new ManageStoreServices(bottomPanel);
        bottomPanel.add(managerStoreServicesObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_manageStoreServicesBtn2ActionPerformed

    private void manageStoreBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStoreBtn2ActionPerformed
        // TODO add your handling code here:
        
        ManageStores manageStoresObj = new ManageStores(bottomPanel);
        bottomPanel.add(manageStoresObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_manageStoreBtn2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        StoreManagementLogin storeManagementLoginObject = new StoreManagementLogin(bottomPanel,appointment);
        bottomPanel.add(storeManagementLoginObject);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCredentialsBtn2;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageCIMBtn2;
    private javax.swing.JButton manageStoreBtn2;
    private javax.swing.JButton manageStoreEmpBtn2;
    private javax.swing.JButton manageStoreServicesBtn2;
    private javax.swing.JButton manageSystemAdminBtn2;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
