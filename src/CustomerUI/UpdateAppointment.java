package CustomerUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author A
 */
public class UpdateAppointment extends javax.swing.JPanel {

    /**
     * Creates new form UpdateAppointment
     */
    public UpdateAppointment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appCRUDTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppSumTableCRUD = new javax.swing.JTable();
        editApp = new javax.swing.JButton();
        saveApp = new javax.swing.JButton();
        deleteAPP = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        appCRUDTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        appCRUDTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        appCRUDTitleLabel.setText("SELECT TO UPDATE YOUR APPOINTMENT");

        AppSumTableCRUD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STORE NAME", "PET NAME", "SERVICE", "DATE", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(AppSumTableCRUD);

        editApp.setText("EDIT APPOINTMENT");

        saveApp.setText("SAVE CHANGE");

        deleteAPP.setText("CANCEL APPOINTMENT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(editApp)
                        .addGap(83, 83, 83)
                        .addComponent(saveApp)
                        .addGap(66, 66, 66)
                        .addComponent(deleteAPP)
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(appCRUDTitleLabel)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(appCRUDTitleLabel)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editApp)
                    .addComponent(saveApp)
                    .addComponent(deleteAPP))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppSumTableCRUD;
    private javax.swing.JLabel appCRUDTitleLabel;
    private javax.swing.JButton deleteAPP;
    private javax.swing.JButton editApp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveApp;
    // End of variables declaration//GEN-END:variables
}
