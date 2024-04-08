/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author A
 */
public class CreatePetProfile extends javax.swing.JPanel {

    /**
     * Creates new form CreatePetProfile
     */
    JPanel bottomPanel;
    public CreatePetProfile(JPanel bottomPanel) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        petTitleLabel = new javax.swing.JLabel();
        petNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        petNameLable = new javax.swing.JLabel();
        catRadioButton = new javax.swing.JRadioButton();
        dogRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        petGenTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        petWeightTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        petAgeTextField = new javax.swing.JTextField();
        petColTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        saveToSelectServiceButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        petTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        petTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        petTitleLabel.setText("TELL US ABOUT YOUR PET");

        petNameTextField.setText("pet name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GENDER");

        petNameLable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        petNameLable.setForeground(new java.awt.Color(255, 255, 255));
        petNameLable.setText("PET NAME");

        buttonGroup1.add(catRadioButton);
        catRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        catRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        catRadioButton.setText("CAT");

        buttonGroup1.add(dogRadioButton);
        dogRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dogRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        dogRadioButton.setText("DOG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PET TYPE");

        petGenTextField.setText("pet gender");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COLOR");

        petWeightTextField.setText("weight");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WEIGHT");

        petAgeTextField.setText("age");

        petColTextField.setText("color");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");

        saveToSelectServiceButton.setText("SAVE AND SELECT SERVICE");
        saveToSelectServiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToSelectServiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(petTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(petNameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(petNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(petWeightTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(petGenTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(catRadioButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(dogRadioButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(petColTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(petAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(saveToSelectServiceButton)
                                    .addGap(19, 19, 19))))))
                .addGap(0, 210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(petTitleLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petNameLable))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(catRadioButton)
                    .addComponent(dogRadioButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(petGenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(petWeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(petAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(petColTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addComponent(saveToSelectServiceButton)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveToSelectServiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToSelectServiceButtonActionPerformed
        // TODO add your handling code here:
        
        SelectService selectServiceObj = new SelectService(bottomPanel);
        bottomPanel.add(selectServiceObj);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_saveToSelectServiceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton catRadioButton;
    private javax.swing.JRadioButton dogRadioButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField petAgeTextField;
    private javax.swing.JTextField petColTextField;
    private javax.swing.JTextField petGenTextField;
    private javax.swing.JLabel petNameLable;
    private javax.swing.JTextField petNameTextField;
    private javax.swing.JLabel petTitleLabel;
    private javax.swing.JTextField petWeightTextField;
    private javax.swing.JButton saveToSelectServiceButton;
    // End of variables declaration//GEN-END:variables
}
