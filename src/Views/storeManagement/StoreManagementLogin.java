/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.storeManagement;

import Models.*;

import Utilities.SystemAdminController;
import Views.systemAdmin.AdminMenu;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author chait
 */
public class StoreManagementLogin extends javax.swing.JPanel {

    /**
     * Creates new form storeManagementLogin
     */
    JPanel bottomPanel;
    Appointment appointment;
    String valueSelected = "CLIENT INFORMATION MANAGER";

    public StoreManagementLogin(JPanel bottomPanel, Appointment appointment) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.appointment = appointment;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        smRole = new javax.swing.JComboBox<>();
        smLogin = new javax.swing.JButton();
        smPassword = new javax.swing.JPasswordField();
        smUsername = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STORE MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ROLE");

        smRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENT INFORMATION MANAGER", "STORE EMPLOYEE", "SYSTEM ADMIN" }));

        smLogin.setText("LOGIN");
        smLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLoginActionPerformed(evt);
            }
        });

        smUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                smUsernameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(smRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(smPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(smUsername))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(smRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(smLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
    * This static method authenticates an admin user based on email and password.
    * It's assumed that this method is part of an `Admin` class or a related utility class.
    * 
    * @param email The email address of the admin user attempting to log in.
    * @param password The password entered by the admin user.
    * @param admins A list of `Admin` objects representing all valid admins in the system.
    * @return The authenticated `Admin` object if successful, otherwise null.
    */
    public static <T extends Admin> T authenticate(String email, String password, List<T> admins) {
        for (Admin admin : admins) {
            if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
                return (T) admin;
            }
        }
        return null;
    }


    private void smLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLoginActionPerformed
        // TODO add your handling code here:

        String email = smUsername.getText();
        char[] passwordChars = smPassword.getPassword();
        String password = new String(passwordChars);

        try {
            
            if (email.isBlank() || password.isBlank()){
                
                throw new IllegalArgumentException("Enter Email and Password to Login");
                
            }
            
            else{
                
                ArrayList<SystemAdmin> defaultSystemAdmins = SystemAdminController.getDefaultSystemAdmins();

            Admin adminAuthenticatedEmployee = authenticate(email, password, defaultSystemAdmins);

            if (adminAuthenticatedEmployee != null) {

                if (smRole.getSelectedItem().toString().equals("SYSTEM ADMIN")) {

                    AdminMenu adminMenuObj = new AdminMenu(bottomPanel);
                    bottomPanel.add(adminMenuObj);
                    CardLayout layout = (CardLayout) bottomPanel.getLayout();
                    layout.next(bottomPanel);

                } else {
                    throw new IllegalArgumentException("Please select only system admin with creds you choose");
                }


            } else {

                switch (smRole.getSelectedItem().toString()) {

                    case "CLIENT INFORMATION MANAGER" -> {
                        try {
                            ArrayList<ClientInformationManager> clientInformationManagers = SystemAdminController.getAllCIMs();

                            ClientInformationManager authenticatedEmployee = authenticate(email, password, clientInformationManagers);

                            if (authenticatedEmployee != null) {


                                ClientAppointmentChoosePanel storeEmployeeChooseObj = new ClientAppointmentChoosePanel(bottomPanel, new Appointment());

//                             ClientAppointmentChoosePanel storeEmployeeChooseObj = new ClientAppointmentChoosePanel((StoreEmployee) authenticatedEmployee, bottomPanel);
                                bottomPanel.add(storeEmployeeChooseObj);
                                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                                layout.next(bottomPanel);

                            } else {
                                throw new IllegalArgumentException("Invalid credentials");
                            }

                            clearFields();

                        } catch (Exception e) {

                            JOptionPane.showMessageDialog(this, e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                    case "STORE EMPLOYEE" -> {
                        try {
                            ArrayList<StoreEmployee> storeEmployees = SystemAdminController.getStoreEmployees();

                            System.out.println(storeEmployees);

                            StoreEmployee authenticatedEmployee = authenticate(email, password, storeEmployees);

                            if (authenticatedEmployee != null) {

                                //StoreClientAppointments storeClientAppointmentObj = new StoreClientAppointments(bottomPanel, authenticatedEmployee);
                                //bottomPanel.add(storeClientAppointmentObj);
                                StoreEmployeeLandingPage storeEmployeeLpObj = new StoreEmployeeLandingPage(bottomPanel, authenticatedEmployee);
                                bottomPanel.add(storeEmployeeLpObj);
                                
                                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                                layout.next(bottomPanel);

                            } else {
                                throw new IllegalArgumentException("Invalid credentials");
                            }

                            clearFields();

                        } catch (Exception e) {

                            JOptionPane.showMessageDialog(this, e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                    case "SYSTEM ADMIN" -> {
                        try {
                            ArrayList<SystemAdmin> systemAdmins = SystemAdminController.getAllSystemAdmins();

                            SystemAdmin authenticatedEmployee = authenticate(email, password, systemAdmins);

                            if (authenticatedEmployee != null) {
                                AdminMenu adminMenuObj = new AdminMenu(bottomPanel);
                                bottomPanel.add(adminMenuObj);
                                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                                layout.next(bottomPanel);
                            } else {
                                throw new IllegalArgumentException("Invalid credentials");
                            }

                            clearFields();

                        } catch (Exception e) {

                            JOptionPane.showMessageDialog(this, e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                    default -> {
                        throw new IllegalArgumentException("please select correct Role");
                    }

                }
            }
                
            }

            
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_smLoginActionPerformed

    private void smUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_smUsernameKeyPressed
        // TODO add your handling code here:

        try {

            if (smUsername.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {

                smUsername.setForeground(Color.black);

            } else {
                throw new Exception();
            }

        } catch (Exception e) {

            smUsername.setForeground(Color.red);

        }

    }//GEN-LAST:event_smUsernameKeyPressed


    private void clearFields() {
        smUsername.setText("");
        smPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton smLogin;
    private javax.swing.JPasswordField smPassword;
    private javax.swing.JComboBox<String> smRole;
    private javax.swing.JTextField smUsername;
    // End of variables declaration//GEN-END:variables
}
