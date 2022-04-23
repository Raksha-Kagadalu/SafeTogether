/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.user;

import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author shrikrishnajoisa
 */
public class VaccinationAppointments extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationAppointments
     */
     EcoSystem system;
    JPanel rightSidePanel;
    public VaccinationAppointments(EcoSystem system, JPanel rightSidePanel) {
        initComponents();
         this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.setSize(1160, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        covidYes = new javax.swing.JRadioButton();
        covidNo = new javax.swing.JRadioButton();
        diabetesYes = new javax.swing.JRadioButton();
        diabetesNo = new javax.swing.JRadioButton();
        medicationYes = new javax.swing.JRadioButton();
        medicationNo = new javax.swing.JRadioButton();
        bloodYes = new javax.swing.JRadioButton();
        bloodNo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 241));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Vaccination Appointments");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 580, 630));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerButton.setBackground(new java.awt.Color(10, 132, 255));
        registerButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel7.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 220, 39));

        cancelButton.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        jPanel7.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 200, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel2.setText("Questionnaires");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Have you ever diagnosed with COVID 19 virus?");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 420, -1));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Do you have diabetes");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Are you under any medication?");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("Is your blood thinner?");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        covidYes.setBackground(new java.awt.Color(255, 255, 255));
        covidYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        covidYes.setForeground(new java.awt.Color(204, 204, 204));
        covidYes.setText("Yes");
        jPanel7.add(covidYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        covidNo.setBackground(new java.awt.Color(255, 255, 255));
        covidNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        covidNo.setForeground(new java.awt.Color(204, 204, 204));
        covidNo.setText("No");
        jPanel7.add(covidNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        diabetesYes.setBackground(new java.awt.Color(255, 255, 255));
        diabetesYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        diabetesYes.setForeground(new java.awt.Color(204, 204, 204));
        diabetesYes.setText("Yes");
        jPanel7.add(diabetesYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        diabetesNo.setBackground(new java.awt.Color(255, 255, 255));
        diabetesNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        diabetesNo.setForeground(new java.awt.Color(204, 204, 204));
        diabetesNo.setText("No");
        jPanel7.add(diabetesNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        medicationYes.setBackground(new java.awt.Color(255, 255, 255));
        medicationYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        medicationYes.setForeground(new java.awt.Color(204, 204, 204));
        medicationYes.setText("Yes");
        jPanel7.add(medicationYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        medicationNo.setBackground(new java.awt.Color(255, 255, 255));
        medicationNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        medicationNo.setForeground(new java.awt.Color(204, 204, 204));
        medicationNo.setText("No");
        jPanel7.add(medicationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        bloodYes.setBackground(new java.awt.Color(255, 255, 255));
        bloodYes.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bloodYes.setForeground(new java.awt.Color(204, 204, 204));
        bloodYes.setText("Yes");
        jPanel7.add(bloodYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        bloodNo.setBackground(new java.awt.Color(255, 255, 255));
        bloodNo.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bloodNo.setForeground(new java.awt.Color(204, 204, 204));
        bloodNo.setText("No");
        jPanel7.add(bloodNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bloodNo;
    private javax.swing.JRadioButton bloodYes;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton covidNo;
    private javax.swing.JRadioButton covidYes;
    private javax.swing.JRadioButton diabetesNo;
    private javax.swing.JRadioButton diabetesYes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton medicationNo;
    private javax.swing.JRadioButton medicationYes;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
