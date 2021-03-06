/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.BloodBank.BloodWork;
import Business.BloodBank.BloodWorkDirectory;

import Business.Pharma.Pharma;
import Business.Pharma.PharmaDirectory;
import Business.CDC.CDC;
import Business.CDC.CDCDirectory;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDir;
import Business.EcoSystem;
import Business.EmergencyAmbulance.Ambulance;
import Business.EmergencyAmbulance.AmbulanceDir;
import Business.EmergencyPolice.Police;
import Business.EmergencyPolice.PoliceDir;
import Business.EmergencyFire.Fire;
import Business.EmergencyFire.FireDir;
import Business.PandemicCenter.PandemicCenter;
import Business.PandemicCenter.PandemicCenter_Dir;
import Business.UserAcc.UserAcc;
import Business.userR.User;
import Business.userR.User_Directory;
import UserInterface.BloodBank.BloodBankView;
import UserInterface.Doctor.DoctorView;
import UserInterface.Pharmacy.PharmacyMainFrame;
import UserInterface.Ambulance.AmbulanceView;
import UserInterface.Fire.FireView;
import UserInterface.Government.GovernmentView;
import UserInterface.PandemicCenter.PandemicView;
import UserInterface.Police.PoliceMain;
import UserInterface.SysAdmin.SysAdminWorkAreaJPanel;
import UserInterface.user.UserAreaJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raksh
 */
public class UserLogin extends javax.swing.JPanel {

    /**
     * Creates new form UserLogin
     */
    EcoSystem system;
    JPanel workArea;
    UserAcc userAcc;
    JPanel JPanel;

    public UserLogin(JPanel workArea, EcoSystem system) {
        initComponents();

        this.system = system;
        this.workArea = workArea;
        this.setSize(1920, 1080);
        // this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 97, 93));
        jLabel3.setText("Welcome Back.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(73, 84, 90));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, -1));

        userNameTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel1.add(userNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 450, 48));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 84, 90));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, -1));

        loginButton.setBackground(new java.awt.Color(235, 97, 91));
        loginButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 450, 50));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 84, 90));
        jLabel6.setText("gain access to your account");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Login with your data that you entered during your registration to ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        signUpButton.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(235, 97, 91));
        signUpButton.setText("Register");
        signUpButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(235, 97, 91), null));
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 450, 50));

        passwordTextField.setBackground(new java.awt.Color(248, 248, 249));
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 450, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 530, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fusion-medical-animation-rnr8D3FNUNY-unsplash.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String userName = userNameTextField.getText();
        char[] userpwdCharArray = passwordTextField.getPassword();
        String pwd = String.valueOf(userpwdCharArray);

        userAcc = system.getUserAccountDirectory().authenticateUser(userName, pwd);

        // to check if the useraccount is null and display an error message
        if (userAcc == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            userNameTextField.setText("");
            passwordTextField.setText("");
            System.out.println("logged in role as :" + userAcc.getRole());
            String userRole = (userAcc.getRole().toString());

            if (userRole.equals("Business.Roles.System_Admin")) {
                showSysAdminWorkAreaJPanel();

            } else if (userRole.equals("Business.Roles.DoctorRole")) {
                DoctorDir docDir = system.getDoctorDir();
                ArrayList<Doctor> doc = docDir.getDoc();
                int size = doc.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    Doctor d1 = doc.get(i);

                    if (userAcc.getUserName().matches(d1.getUserName())) {

                        viewDocScreen();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.UserR")) {

                User_Directory userDir = system.getUserDir();
                ArrayList<User> user = userDir.getUsers();
                int size = user.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    User u1 = user.get(i);
                    if (userAcc.getUserName().matches(u1.getUserId())) {
                        System.out.print("inside user role method");
                        displayUserPanel();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.Admin_Pharmacy")) {
                PharmaDirectory pharmaDir = system.getPharmaDir();
                ArrayList<Pharma> pharma = pharmaDir.getPharmaArrayList();
                int size = pharma.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    Pharma p1 = pharma.get(i);
                    if (userAcc.getUserName().matches(p1.getUserName())) {
                        System.out.print("inside pharma role method");
                        displayPharmacy();
                        count += 1;

                    }
                }

            } else if (userRole.equals("Business.Roles.Police_Officer")) {
                PoliceDir policeDir = system.getPoliceDir();
                ArrayList<Police> policeList = policeDir.getPoliceList();

                int size = policeList.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    Police p1 = policeList.get(i);
                    System.out.println("Police role -> " + userAcc.getUserName());

                    if (userAcc.getUserName().matches(p1.getUserName())) {
                        System.out.print("inside police role method");
                        policeDashboard();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.Admin_BloodBank")) {
                BloodWorkDirectory bloodBankDir = system.getBloodBankDir();
                ArrayList<BloodWork> bloodBankList = bloodBankDir.getBloodWorkList();
                int size = bloodBankList.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    BloodWork bb1 = bloodBankList.get(i);
                    if (userAcc.getUserName().matches(bb1.getUserId())) {
                        System.out.print("inside blood Bank admin role method");
                        displaybloodbank();
                        count += 1;

                    }
                }
            } else if (userRole.equals("Business.Roles.Fire_Man")) {

                FireDir fireDir = system.getFireDir();
                ArrayList<Fire> fireDepList = fireDir.getFireEngines();
                int size = fireDepList.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    Fire f1 = fireDepList.get(i);
System.out.println("inside fire username"+userAcc.getUserName());
                    if (userAcc.getUserName().matches(f1.getUserName())) {
                        System.out.print("inside fire dept admin role method");
                        fireDashboard();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.Driver_Ambulance")) {
                AmbulanceDir ambulanceDir = system.getAmbulanceDir();
                ArrayList<Ambulance> ambulanceList = ambulanceDir.getAmbulances();
                int size = ambulanceList.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    Ambulance a1 = ambulanceList.get(i);

                    if (userAcc.getUserName().matches(a1.getUserName())) {
                        System.out.print("inside ambulance dept admin role method");
                        ambulanceDashboard();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.Officer_CDC")) {
                CDCDirectory govDir = system.getcDCDir();
                ArrayList<CDC> govList = govDir.getCdcList();
                int size = govList.size();

                int count = 0;
                for (int i = 0; i < size; i++) {
                    CDC g1 = govList.get(i);

                    if (userAcc.getUserName().matches(g1.getUserName())) {
                        System.out.print("inside gov dept admin role method");
                        govtDashboard();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else if (userRole.equals("Business.Roles.Admin_PandemicTestCenter")) {
                PandemicCenter_Dir testCenterDir = system.getPandemicCenterDir();
                ArrayList<PandemicCenter> centerList = testCenterDir.getPandemicdirectory();
                int size = centerList.size();
            
                int count = 0;
                for (int i = 0; i < size; i++) {
                    PandemicCenter t1 = centerList.get(i);
                
                    if (userAcc.getUserName().matches(t1.getUserName())) {
                          System.out.print("inside test center admin role method");
                        pandemicCenter();
                        count += 1;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials");
                }
            } else {
                System.out.println(userAcc.getRole());
            }

        }
    }

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:

        UserRegister registerPage = new UserRegister(workArea, system);
        workArea.add("UserRegister", registerPage);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables

    private void showSysAdminWorkAreaJPanel() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        // System.out.println("im inside login cardlayout");
        SysAdminWorkAreaJPanel sysadmin = new SysAdminWorkAreaJPanel(workArea, system);
        workArea.add("SysAdminWorkAreaJPanel", sysadmin);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }

    private void policeDashboard() {
        PoliceMain police = new PoliceMain(workArea, userAcc, system);
        workArea.add(police);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void fireDashboard() {
        FireView fire = new FireView(workArea, userAcc, system);
        workArea.add(fire);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void ambulanceDashboard() {
        AmbulanceView ambulance = new AmbulanceView(workArea, userAcc, system);
        workArea.add(ambulance);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void viewDocScreen() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DoctorView docview = new DoctorView(workArea, userAcc, system);
        workArea.add(docview);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }

    private void govtDashboard() {
        //System.out.println("im inside card layout of gov");
        GovernmentView gov = new GovernmentView(workArea, userAcc, system);
        workArea.add(gov);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void pandemicCenter() {
        PandemicView testcenter = new PandemicView(workArea, userAcc, system);
        workArea.add(testcenter);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }

    private void displayUserPanel() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        UserAreaJPanel userView = new UserAreaJPanel(workArea, userAcc, system);
        workArea.add(userView);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }

    private void displayPharmacy() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        PharmacyMainFrame pharma = new PharmacyMainFrame(workArea, userAcc, system);
        workArea.add(pharma);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);

    }

    private void displaybloodbank() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        BloodBankView bloodBank = new BloodBankView(workArea, userAcc, system);
        workArea.add(bloodBank);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }
}
