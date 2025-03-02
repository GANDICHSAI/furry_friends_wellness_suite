/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.customer;

import Models.Appointment;
import Models.Customer;
import Models.Pet;
import Utilities.AppointmentController;
import Utilities.PetController;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
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
    Customer customer;
    Appointment appointment;
    Pet pet;
    public CreatePetProfile(JPanel bottomPanel,Customer customer,Appointment appointment,Pet pet) {
        initComponents();
        this.bottomPanel = bottomPanel;
        this.customer = customer;
        this.appointment = appointment;
        this.pet = pet;
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        petTitleLabel = new javax.swing.JLabel();
        petNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        petNameLable = new javax.swing.JLabel();
        catRadioButton = new javax.swing.JRadioButton();
        dogRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        petWeightTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        petAgeTextField = new javax.swing.JTextField();
        petColTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backToStoreSelectionButton = new javax.swing.JButton();
        girlRadioButton = new javax.swing.JRadioButton();
        boyRadioButton = new javax.swing.JRadioButton();
        saveToSelectServiceButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        petTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        petTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        petTitleLabel.setText("TELL US ABOUT YOUR PET");

        petNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petNameTextFieldActionPerformed(evt);
            }
        });
        petNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petNameTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                petNameTextFieldKeyReleased(evt);
            }
        });

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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COLOR");

        petWeightTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petWeightTextFieldKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WEIGHT");

        petAgeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petAgeTextFieldKeyPressed(evt);
            }
        });

        petColTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petColTextFieldKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");

        backToStoreSelectionButton.setText("BACK TO STORE SELECTION");
        backToStoreSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToStoreSelectionButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(girlRadioButton);
        girlRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        girlRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        girlRadioButton.setText("GIRL");
        girlRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girlRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(boyRadioButton);
        boyRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boyRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        boyRadioButton.setText("BOY");

        saveToSelectServiceButton2.setText("SAVE AND SELECT SERVICE");
        saveToSelectServiceButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveToSelectServiceButton2ActionPerformed(evt);
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
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(girlRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(boyRadioButton))
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
                                        .addComponent(petAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backToStoreSelectionButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(saveToSelectServiceButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(backToStoreSelectionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(girlRadioButton)
                    .addComponent(boyRadioButton))
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
                .addGap(79, 79, 79)
                .addComponent(saveToSelectServiceButton2)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backToStoreSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToStoreSelectionButtonActionPerformed
        // TODO add your handling code here:

        SelectStore selectStore = new SelectStore(bottomPanel,customer,appointment);
        bottomPanel.add(selectStore);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_backToStoreSelectionButtonActionPerformed

    private void girlRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girlRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_girlRadioButtonActionPerformed

    private void petNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petNameTextFieldActionPerformed

    private void petNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petNameTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_petNameTextFieldKeyReleased

    private void petNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petNameTextFieldKeyPressed
        // TODO add your handling code here:
        
        try{
             
             if (petNameTextField.getText().matches("^[a-zA-Z ]+$")){
                 
                 petNameTextField.setForeground(Color.black);

            }
            
            else{
                throw new Exception();
            }
                        
        }
        catch(Exception e){
            
            petNameTextField.setForeground(Color.red);

        }
    }//GEN-LAST:event_petNameTextFieldKeyPressed

    private void petWeightTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petWeightTextFieldKeyPressed
        // TODO add your handling code here:
        
        
        
        try{
            
                if(petWeightTextField.getText().matches("^[0-9]*")){
                    
                    petWeightTextField.setForeground(Color.black);
                    
                }

                else{
                    throw new Exception();
                }
            
        }
        catch(Exception e){
            
            petWeightTextField.setForeground(Color.red);

        }
                
    }//GEN-LAST:event_petWeightTextFieldKeyPressed

    private void petAgeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petAgeTextFieldKeyPressed
        // TODO add your handling code here:
        
        try{
            
                if(petAgeTextField.getText().matches("^[0-9]*")){
                    
                    petAgeTextField.setForeground(Color.black);
                }
                else{
                    throw new Exception();
                }

                
            
        }
        catch(Exception e){
            
            petAgeTextField.setForeground(Color.red);

        }
        
    }//GEN-LAST:event_petAgeTextFieldKeyPressed

    private void petColTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petColTextFieldKeyPressed
        // TODO add your handling code here:
        
        try{
             
             if (petColTextField.getText().matches("^[a-zA-Z]*")){
                 
                 petColTextField.setForeground(Color.black);

            }
            
            else{
                throw new Exception();
            }
                        
        }
        catch(Exception e){
            
            petColTextField.setForeground(Color.red);

        }
        
        
    }//GEN-LAST:event_petColTextFieldKeyPressed

    private void saveToSelectServiceButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveToSelectServiceButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            
            if (petNameTextField.getText()== null||petNameTextField.getText().isEmpty()||petAgeTextField.getText()==null||
                petAgeTextField.getText().isEmpty()||petColTextField.getText()==null||petColTextField.getText().isEmpty()||
                petWeightTextField.getText() == null||petWeightTextField.getText().isEmpty())
            {
                

                throw new IllegalArgumentException("Enter Pet Details to book an appointment with us");
                
            
            }
        
            else{
                

                    this.pet = new Pet();
                    pet.setCustomerId(appointment.getCustomerId());
                    pet.setPetName(petNameTextField.getText());
                    pet.setType(catRadioButton.isSelected() ? "Cat" : "Dog");
                    pet.setGender(girlRadioButton.isSelected() ? "Girl" : "Boy");
                    pet.setAge(Integer.parseInt(petAgeTextField.getText()));
                    pet.setColor( petColTextField.getText());
                    pet.setWeight(Float.parseFloat(petWeightTextField.getText()));
                    
                    int petId = PetController.addPet(pet);

                    if(petId != -1) {
                        // Set the generated pet ID and pet name into the appointment object
                        appointment.setPetId(petId);


                        // Continue to the next screen to select service
                        SelectService selectServiceObj = new SelectService(bottomPanel, customer, appointment, pet);
                        bottomPanel.add(selectServiceObj);
                        CardLayout layout = (CardLayout) bottomPanel.getLayout();
                        layout.next(bottomPanel);
                    }

                    else {
                        // Handle the error case

                        throw new IllegalArgumentException("Failed to save pet information. Please try again.");

                    }
            }
            
            
            
        }
        
        catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        



            
            
    }//GEN-LAST:event_saveToSelectServiceButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToStoreSelectionButton;
    private javax.swing.JRadioButton boyRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton catRadioButton;
    private javax.swing.JRadioButton dogRadioButton;
    private javax.swing.JRadioButton girlRadioButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField petAgeTextField;
    private javax.swing.JTextField petColTextField;
    private javax.swing.JLabel petNameLable;
    private javax.swing.JTextField petNameTextField;
    private javax.swing.JLabel petTitleLabel;
    private javax.swing.JTextField petWeightTextField;
    private javax.swing.JButton saveToSelectServiceButton2;
    // End of variables declaration//GEN-END:variables
}
