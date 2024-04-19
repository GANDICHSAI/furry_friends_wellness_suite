/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.systemAdmin;

import Facade.AccountCreator;
import Utilities.CredentialsChecker;
import Utilities.SystemAdminController;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hanee
 */
public class CreateCredentials extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    JPanel bottomPanel;
    String valueSelected = "Client Information Manager";

    AccountCreator accCreator = new AccountCreator();
    
    /**
    * This constructor initializes the components of the `CreateCredentials` class and sets up the logic for the credentials type dropdown.
    * 
    * @param bottomPanel A reference to a JPanel object likely used for layout purposes.
    */
    public CreateCredentials(JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;

        populateStoreDropdown();

        storeDropdown1.setVisible(false);
        storeLabel1.setVisible(false);

        credentialsTypeDropdown1.addActionListener(e -> {
            // Get the selected item when an action is performed (like selecting an item)
            valueSelected = (String) credentialsTypeDropdown1.getSelectedItem();

            if (!"Store Employee".equals(valueSelected)) {
                storeDropdown1.setVisible(false);
                storeLabel1.setVisible(false);
            } else {
                storeDropdown1.setVisible(true);
                storeLabel1.setVisible(true);
            }
        });
    }
    
    /**
    * This method populates the `storeDropdown1` with a list of store names retrieved from the system.
    */
    private void populateStoreDropdown() {
        // Clear existing items in the dropdown
        storeDropdown1.removeAllItems();

        // Get new store names from the database
        ArrayList<String> storeNames = SystemAdminController.getAllStoreNames();

        // Add the new store names to the dropdown
        for (String name : storeNames) {
            storeDropdown1.addItem(name);
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

        jPanel3 = new javax.swing.JPanel();
        heading1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameInput1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        emailInput1 = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        passwordInput1 = new javax.swing.JPasswordField();
        credentialsTypeLabel1 = new javax.swing.JLabel();
        credentialsTypeDropdown1 = new javax.swing.JComboBox<>();
        storeLabel1 = new javax.swing.JLabel();
        storeDropdown1 = new javax.swing.JComboBox<>();
        requirementText1 = new javax.swing.JLabel();
        createAccountBtn1 = new javax.swing.JButton();
        backToMenuBtn = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        heading1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading1.setForeground(new java.awt.Color(255, 255, 255));
        heading1.setText("Create Credentials");

        nameLabel1.setBackground(new java.awt.Color(255, 255, 255));
        nameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel1.setText("Name");

        nameInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInput1ActionPerformed(evt);
            }
        });
        nameInput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameInput1KeyPressed(evt);
            }
        });

        emailLabel1.setBackground(new java.awt.Color(255, 255, 255));
        emailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel1.setText("Email");

        emailInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInput1ActionPerformed(evt);
            }
        });
        emailInput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailInput1KeyPressed(evt);
            }
        });

        passwordLabel1.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Password");

        credentialsTypeLabel1.setBackground(new java.awt.Color(255, 255, 255));
        credentialsTypeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        credentialsTypeLabel1.setText("Credential Type");

        credentialsTypeDropdown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Client Information Manager", "Store Employee", "System Admin" }));

        storeLabel1.setBackground(new java.awt.Color(255, 255, 255));
        storeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        storeLabel1.setText("Store Location");

        storeDropdown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        requirementText1.setBackground(new java.awt.Color(255, 255, 255));
        requirementText1.setForeground(new java.awt.Color(255, 255, 255));
        requirementText1.setText("(Only for Store Employee)");

        createAccountBtn1.setText("Create Account");
        createAccountBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountBtn1ActionPerformed(evt);
            }
        });

        backToMenuBtn.setText("Back to admin menu");
        backToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(heading1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToMenuBtn)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAccountBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel1)
                    .addComponent(passwordLabel1)
                    .addComponent(nameLabel1)
                    .addComponent(storeLabel1)
                    .addComponent(credentialsTypeLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(storeDropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(requirementText1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(credentialsTypeDropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailInput1)
                                .addComponent(passwordInput1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nameInput1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heading1)
                    .addComponent(backToMenuBtn))
                .addGap(107, 107, 107)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(emailLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(passwordLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(passwordInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(credentialsTypeLabel1)
                    .addComponent(credentialsTypeDropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeLabel1)
                    .addComponent(storeDropdown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requirementText1))
                .addGap(47, 47, 47)
                .addComponent(createAccountBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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

    private void nameInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInput1ActionPerformed

    private void emailInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInput1ActionPerformed

    private void backToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuBtnActionPerformed
        // TODO add your handling code here:

        AdminMenu adminMenuObj = new AdminMenu(bottomPanel);
        bottomPanel.add(adminMenuObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToMenuBtnActionPerformed
     private void clearFields() {
        
        nameInput1.setText("");
        emailInput1.setText("");
        passwordInput1.setText("");

        
        
    }
    private void createAccountBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountBtn1ActionPerformed
        // TODO add your handling code here:

        try {

            char[] passwordChars = passwordInput1.getPassword();

            // Convert char[] to String for demonstration (not recommended for passwords
            String passwordString = new String(passwordChars);

            if (nameInput1.getText() == null || nameInput1.getText().isEmpty() || emailInput1.getText() == null
                    || emailInput1.getText().isEmpty() || passwordString == null || passwordString.isEmpty()
                    || credentialsTypeDropdown1.getSelectedItem() == null
                    || storeDropdown1.getSelectedItem() == null) {

                throw new IllegalArgumentException("Please Fill out details to create account");

            }

            if ("Store Employee".equals(valueSelected)) {

                if (CredentialsChecker.checkStoreEmployee(emailInput1.getText())) {
                    JOptionPane.showMessageDialog(this, "This email is already in use! Please use another email!", "Existing User Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                accCreator.createStoreManagerAccount(emailInput1.getText(), passwordString, nameInput1.getText(), storeDropdown1.getSelectedItem().toString());

                JOptionPane.showMessageDialog(this, "Store Employee Created Successfully", "Successful Account Creation", JOptionPane.INFORMATION_MESSAGE);
//            account.createSetStoreEmployeeAccount(emailInput1.getText(), passwordString, nameInput1.getText(), storeDropdown1.getSelectedItem().toString());
                System.out.println("SE");
                clearFields();
                return;
            }
            if ("System Admin".equals(valueSelected)) {

                if (CredentialsChecker.checkSysAdmin(emailInput1.getText())) {
                    JOptionPane.showMessageDialog(this, "This email is already in use! Please use another email!", "Existing User Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                accCreator.createSystemAdminAccount(emailInput1.getText(), passwordString, nameInput1.getText());
                JOptionPane.showMessageDialog(this, "Admin Created Successfully", "Successful Account Creation", JOptionPane.INFORMATION_MESSAGE);
//            account.createAdminAccount(emailInput1.getText(), passwordString, nameInput1.getText());

                System.out.println("SA");
                clearFields();
                return;
            }
            if ("Client Information Manager".equals(valueSelected)) {

                if (CredentialsChecker.checkCimExist(emailInput1.getText())) {
                    JOptionPane.showMessageDialog(this, "This email is already in use! Please use another email!", "Existsing User Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                accCreator.createCIMAccount(emailInput1.getText(), passwordString, nameInput1.getText());
                JOptionPane.showMessageDialog(this, "Client Information Manager Created Successfully", "Successful Account Creation", JOptionPane.INFORMATION_MESSAGE);
//            account.createCIMAccount(emailInput1.getText(), passwordString, nameInput1.getText());
                clearFields();
                System.out.println("CIM");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Account Creation Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_createAccountBtn1ActionPerformed

    private void emailInput1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailInput1KeyPressed
        // TODO add your handling code here:

        try {

            if (emailInput1.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {

                emailInput1.setForeground(Color.black);

            } else {
                throw new Exception();
            }

        } catch (Exception e) {

            emailInput1.setForeground(Color.red);

        }


    }//GEN-LAST:event_emailInput1KeyPressed

    private void nameInput1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameInput1KeyPressed
        // TODO add your handling code here:

        try {

            if (nameInput1.getText().matches("^[a-zA-Z ]+$")) {

                nameInput1.setForeground(Color.black);

            } else {
                throw new Exception();
            }

        } catch (Exception e) {

            nameInput1.setForeground(Color.red);

        }
    }//GEN-LAST:event_nameInput1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToMenuBtn;
    private javax.swing.JButton createAccountBtn1;
    private javax.swing.JComboBox<String> credentialsTypeDropdown1;
    private javax.swing.JLabel credentialsTypeLabel1;
    private javax.swing.JTextField emailInput1;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JLabel heading1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameInput1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPasswordField passwordInput1;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel requirementText1;
    private javax.swing.JComboBox<String> storeDropdown1;
    private javax.swing.JLabel storeLabel1;
    // End of variables declaration//GEN-END:variables
}
