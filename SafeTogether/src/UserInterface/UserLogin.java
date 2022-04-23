/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Doctor.Doctor;
import Business.Doctor.DoctorDir;
import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import Business.UserAcc.UserAccDir;
import Business.userR.User;
import Business.userR.User_Directory;
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
    public UserLogin(JPanel workArea, EcoSystem system) {
        initComponents();
         
        this.system=system;
        this.workArea=workArea;
          this.setSize(1920, 1080);
        //this.setResizable(false);
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

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
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
        passwordTextField.setPreferredSize(new java.awt.Dimension(7, 20));
        jPanel1.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 450, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 530, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kristaps-grundsteins-phv0kzqMJyk-unsplash.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String uName = userNameTextField.getText();
        char[] upwdCharArray = passwordTextField.getPassword();
        String pwd = String.valueOf(upwdCharArray);

       userAcc = system.getUserAccountDirectory().authenticateUser(uName, pwd);
      
       //to check if the useraccount is null and display an error message
        if(userAcc==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            userNameTextField.setText("");
            passwordTextField.setText("");
            System.out.println("logged in role as :"+userAcc.getRole());
            String userRole=(userAcc.getRole().toString());
            
            if(userRole.equals("Business.Roles.System_Admin"))
            {
                showSysAdminWorkAreaJPanel();
                
            }
            else if(userRole.equals("Business.Roles.DoctorRole"))
            {
                DoctorDir cd=system.getDoctorDir();
                ArrayList<Doctor> doc=cd.getDoc();
                int size=doc.size();
                //System.out.println(doc.size());
                int count=0;
                for(int i=0;i<size;i++)
                {
                Doctor c1=doc.get(i);
                //System.out.println(userAcc.getUserName());
                //System.out.println(c1.getUserId());                
                if(userAcc.getUserName().matches(c1.getUserName()))
                {
                    
                viewDocScreen();
                count+=1;
                }       
                }
                if(count==0)
                {
                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
                }
            }
             else if(userRole.equals("Business.Roles.UserR"))
            {
             displayUserPanel();
//                User_Directory cd=system.getUserDir();
//                ArrayList<User> c=cd.getUsers();
//                int size=c.size();
//                System.out.println("size:"+c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                User c1=c.get(i);
//                if(userAcc.getUserName().matches(c1.getUserId()))
//                {
//                    System.out.print("inside user role method");
//               displayUserPanel();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
            }
//            else if(userRole.equals("Business.Role.AdminRole"))
//            {
//                
//                RestaurantDirectory cd=system.getRestaurantDirectory();
//                ArrayList<Restaurant> c=cd.getRestaurantList();
//                int size=c.size();
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                Restaurant c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUsername()))
//                {
//                callAdminWorkAreaJPanel();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.UserRole"))
//            {
//                User_directory cd=system.getUserdirectory();
//                ArrayList<User> c=cd.getUser();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                User c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUser_id()))
//                {
//                calluser();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.DoctorRole"))
//            {
//                Doctor_Directory cd=system.getDoctordirectory();
//                ArrayList<Doctor> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                Doctor c1=c.get(i);
//                System.out.println(userAcc.getUsername());
//                System.out.println(c1.getUserid());                
//                if(userAcc.getUsername().matches(c1.getUsername()))
//                {
//                    
//                calldoctor();
//                count+=1;
//                }       
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.bloodbankadminrole"))
//            {
//                bloodbank_directory cd=system.getBloodbankdirectory();
//                ArrayList<BloodBank> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                BloodBank c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUserid()))
//                {
//                callbloodbank();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.PharmacyAdmin"))
//            {
//                Pharmacy_directory cd=system.getPharmacy_directory();
//                ArrayList<Pharmacy> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                Pharmacy c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUserid()))
//                {
//                callpharmacy();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//           
//         
//            else if(userRole.equals("Business.Role.governmantOfficial"))
//            {
//                governmentoffical_directory cd=system.getGovdirectory();
//                ArrayList<governmentofficial> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                governmentofficial c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUser_id()))
//                {
//                callgov();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.AmbulanceDriver"))
//            {
//                ambulance_directory cd=system.getAmbulancedirectory();
//                ArrayList<Ambulance> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                Ambulance c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUser_id()))
//                {
//                callambulance();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.covidtestingadmin"))
//            {
//                covidcenter_directory cd=system.getCd();
//                ArrayList<covidcenter> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                covidcenter c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUserid()))
//                {
//                callambulance1();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            else if(userRole.equals("Business.Role.Vaccination_admin"))
//            {
//                vaccination_org_directory cd=system.getVacc_org();
//                ArrayList<vaccination_org> c=cd.getA();
//                int size=c.size();
//                System.out.println(c.size());
//                int count=0;
//                for(int i=0;i<size;i++)
//                {
//                vaccination_org c1=c.get(i);
//                if(userAcc.getUsername().matches(c1.getUserid()))
//                {
//                vaccination();
//                count+=1;
//                }            
//                }
//                if(count==0)
//                {
//                  JOptionPane.showMessageDialog(null, "Invalid credentials");  
//                }
//            }
//            
            else
            {
                System.out.println(userAcc.getRole());
            }           
            
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        
      
        UserRegister registerPage =new UserRegister(workArea,system);
        workArea.add("UserRegister",registerPage);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    
    }//GEN-LAST:event_signUpButtonActionPerformed


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
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      
       // System.out.println("im inside login cardlayout");
        SysAdminWorkAreaJPanel sysadmin=new SysAdminWorkAreaJPanel(workArea,system);
        workArea.add("SysAdminWorkAreaJPanel",sysadmin);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    
    }

    private void viewDocScreen() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    
//     Doctorframe ur=new Doctorframe(container,system,userAccount);
//        container.add(ur);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container); 
//    
    
    }

    private void displayUserPanel() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    UserAreaJPanel ur=new UserAreaJPanel(workArea,userAcc,system);
        workArea.add(ur);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea); 
    
    
    }
}
