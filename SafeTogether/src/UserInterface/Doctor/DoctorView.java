/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Doctor;

import Business.DatabaseUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author shrikrishnajoisa
 */
public class DoctorView extends javax.swing.JPanel {

    /**
     * Creates new form DoctorView
     */
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public DoctorView(JPanel userProcessContainer, UserAcc userAcc, EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Appointments = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        goBack = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        appointments = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        requestBlood = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(250, 249, 251));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appointments.setBackground(new java.awt.Color(255, 255, 255));
        Appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Appointments.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        Appointments.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack.setBackground(new java.awt.Color(255, 255, 255));
        goBack.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBackMousePressed(evt);
            }
        });
        goBack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-logout-24.png"))); // NOI18N
        goBack.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel32.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(115, 120, 128));
        jLabel32.setText("Return");
        goBack.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Appointments.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        appointments.setBackground(new java.awt.Color(255, 255, 255));
        appointments.setPreferredSize(new java.awt.Dimension(100, 48));
        appointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                appointmentsMousePressed(evt);
            }
        });
        appointments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-city-buildings-24.png"))); // NOI18N
        appointments.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(115, 120, 128));
        jLabel7.setText("Manage Appointments");
        appointments.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Appointments.add(appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 60));

        requestBlood.setBackground(new java.awt.Color(255, 255, 255));
        requestBlood.setPreferredSize(new java.awt.Dimension(100, 48));
        requestBlood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                requestBloodMousePressed(evt);
            }
        });
        requestBlood.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-drop-of-blood-24.png"))); // NOI18N
        requestBlood.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(115, 120, 128));
        jLabel6.setText("Request Blood");
        requestBlood.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        Appointments.add(requestBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 60));
        Appointments.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo/safe together-logos_transparent copy.png"))); // NOI18N
        Appointments.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        jPanel3.add(Appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel10.setText("Doctors Dashboard");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("Manage everything related to Pharmaceutical Enterprises");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel3.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1300, 910));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBackMousePressed

    private void requestBloodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestBloodMousePressed
        // TODO add your handling code here:
        requestBlood();
    }//GEN-LAST:event_requestBloodMousePressed

    private void appointmentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsMousePressed
        // TODO add your handling code here:
        appointments();
    }//GEN-LAST:event_appointmentsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Appointments;
    private javax.swing.JPanel appointments;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel requestBlood;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void requestBlood() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        appointments.setBackground(new Color(255, 255, 255));
        requestBlood.setBackground(new Color(213, 230, 249));

        RequestBlood reqBlood = new RequestBlood(container, system, userAcc);

        rightSidePanel.add(reqBlood);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }

    private void appointments() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        requestBlood.setBackground(new Color(255, 255, 255));
        appointments.setBackground(new Color(213, 230, 249));

        ManageDoc manageApp = new ManageDoc(rightSidePanel, system, userAcc);

        rightSidePanel.add(manageApp);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);

    }
}
