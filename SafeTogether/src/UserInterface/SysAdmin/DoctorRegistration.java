/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SysAdmin;

import Business.DatabaseUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDir;
import Business.EcoSystem;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class DoctorRegistration extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRegistration
     */
    EcoSystem system;
    JPanel rightSidePanel;
       ArrayList<String> hospitals = new ArrayList<String>();
    ArrayList<String> specializations = new ArrayList<String>();
    int hospitalCount = 0;
    int specializationCount = 0;
    
    public DoctorRegistration(EcoSystem system, JPanel rightSidePanel) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.setSize(1160, 750);
        displayTable();
        populateDashBoard();
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
        jPanel2 = new javax.swing.JPanel();
        hosCount = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField4 = new javax.swing.JTextField();
        userNameTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTextField7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        userNameTextField8 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        splCount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosCount.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        hosCount.setText("10");
        jPanel2.add(hosCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 90));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        jLabel6.setText("Hospitals");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(152, 151, 151));
        jLabel13.setText("Total number of hospital that are");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(152, 151, 151));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel16.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(152, 151, 151));
        jLabel16.setText("Total number of hospital that are");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(152, 151, 151));
        jLabel19.setText("registered with us");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 220));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Hospital", "Specialization", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 580, 370));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(10, 132, 255));
        jButton1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        jButton2.setBackground(new java.awt.Color(94, 92, 230));
        jButton2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        jButton3.setBackground(new java.awt.Color(255, 55, 95));
        jButton3.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setText("Enter Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 50));

        jLabel7.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(73, 84, 90));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        userNameTextField3.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        jLabel8.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(73, 84, 90));
        jLabel8.setText("Hospital");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        userNameTextField4.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        userNameTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextField4ActionPerformed(evt);
            }
        });
        jPanel7.add(userNameTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userNameTextField5.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        jLabel9.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 84, 90));
        jLabel9.setText("Specializations");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        userNameTextField6.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(73, 84, 90));
        jLabel10.setText("User ID");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(73, 84, 90));
        jLabel11.setText("Password");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        userNameTextField7.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        jLabel12.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(73, 84, 90));
        jLabel12.setText("Phone Number");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 220, -1));

        userNameTextField8.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 420, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        splCount.setFont(new java.awt.Font("SF Pro Display", 1, 64)); // NOI18N
        splCount.setText("10");
        jPanel8.add(splCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, 90));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 30)); // NOI18N
        jLabel4.setText("Specializations");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel18.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(152, 151, 151));
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(152, 151, 151));
        jLabel17.setText("Total number of specializations");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(152, 151, 151));
        jLabel14.setText("we have under belt");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 270, 220));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          String name = (userNameTextField4.getText());
           String hospital = (userNameTextField3.getText());
           String specialization = (userNameTextField5.getText());
            String userId = (userNameTextField6.getText());
            String pwd = (userNameTextField7.getText());
            String phoneNum = (userNameTextField8.getText());
             Doctor doc = new Doctor(name,hospital,specialization,userId,pwd,phoneNum);
            system.getUserAccDir().addAccount(doc);
            system.getDoctorDir().addNewDoc(doc);
           //System.out.println(system.getUserAccDir().getUserAccList().get(1)); 
            displayTable();
            populateDashBoard();
            
              userNameTextField3.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
            userNameTextField8.setText("");
            // DB4OUtil.dB4OUtil.storeSystem(system);
            
//            Person per = personDir.addPerson();
//            per.setName(name);
//            per.setAge(age);
//             per.setSsn(ssn);
//            House house = new House();
//            house.setCityName(city);
//            house.setCommunityName(community);
//            house.setAddress(address);
//            house.setSetPerson(per);
//            house.setCommunityList(house);
//            house.setHouseList(house);
//            per.setHouse(house);
//
//            JOptionPane.showMessageDialog(this, "New Person Details added!");

//            txtName.setText("");
//            txtAge.setText("");
//            txtCity.setText("");
//            txtComm.setText("");
//            txtAddress.setText("");
//            txtSsn.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow=jTable1.getSelectedRow();
        if(sRow>=0)
        {
             
        String value=(String)table.getValueAt(sRow, 3);
        DoctorDir doctorDirectory = system.getDoctorDir();
        ArrayList<Doctor> list=doctorDirectory.getDoc();
        int listsize=list.size();
        for(int i=0;i<listsize;i++)
        {
            Doctor doc=list.get(i);
            //System.out.println(doc.getUserName());
            
            if(doc.getUserName().matches(value))
                    {
                        if(!userNameTextField8.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]"))
            {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                userNameTextField8.setText("");
                return;
            }

                     doc.setFirstName(userNameTextField4.getText());
                        doc.setHospital(userNameTextField3.getText());
                        doc.setSpecialization(userNameTextField5.getText());
                        doc.setUserId(userNameTextField6.getText());
                        doc.setAccPassword(userNameTextField7.getText());
                        doc.setPhoneNum(userNameTextField8.getText());
                    
                    }
            else {
                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
            }
        }
          displayTable();
          
            
              userNameTextField3.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
            userNameTextField8.setText("");
             }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
//        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
//        int selectedRow=jTable1.getSelectedRow();
//          if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(null, "Please select a Person from table", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else{
//        String a=(String)table.getValueAt(selectedRow, 3);
//        DoctorDir doctorDirectory = system.getDoctorDir();
//        ArrayList<Doctor> cd1=doctorDirectory.getDoc();
//        int z=cd1.size();
//        for(int i=0;i<z;i++)
//        {
//            Doctor c=cd1.get(i);
//            if(c.getUserName().matches(a))
//                        c.setFirstName(userNameTextField4.getText());
//                        c.setHospital(userNameTextField3.getText());
//                        c.setSpecialization(userNameTextField5.getText());
//                        c.setUserId(userNameTextField6.getText());
//                        c.setAccPassword(userNameTextField7.getText());
//                        c.setPhoneNum(userNameTextField8.getText());
//                    
//        }
//              displayTable();
//            
//              userNameTextField3.setText("");
//            userNameTextField4.setText("");
//            userNameTextField5.setText("");
//            userNameTextField6.setText("");
//            userNameTextField7.setText("");
//            userNameTextField8.setText("");
//          }
//         
//       int selectedRow = jTable1.getSelectedRow();
//        if (selectedRow < 0) {
//            JOptionPane.showMessageDialog(null, "Please select a Person from table", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        } else{
//         System.out.println("row" + selectedRow);
//        System.out.println("Value" + jTable1.getValueAt(selectedRow, 0));
//        
////         DefaultTableModel dtm = (DefaultTableModel) labTable.getModel();
////
////        String name = dtm.getValueAt(labTable.getSelectedRow(), 0).toString();
////        String address = dtm.getValueAt(labTable.getSelectedRow(), 1).toString();
////        nameTxtField.setText(name);
////        addrTxtField.setText(address);
//
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        
//       // Doctor per= (Doctor) jTable1.getValueAt(selectedRow, 0);
//         String name =  model.getValueAt(jTable1.getSelectedRow(), 0).toString();
//         String hospital =  model.getValueAt(jTable1.getSelectedRow(), 1).toString();
//         String specialization =  model.getValueAt(jTable1.getSelectedRow(), 2).toString();
//          String userid =  model.getValueAt(jTable1.getSelectedRow(), 3).toString();
//            String pwd =  model.getValueAt(jTable1.getSelectedRow(), 4).toString();
//             String phnum =  model.getValueAt(jTable1.getSelectedRow(), 5).toString();
//        //System.out.println(per);
//        
// //        System.out.println("to be displayed" + per.getFirstName());
//       userNameTextField4.setText(name);
//       userNameTextField3.setText(hospital);
//       userNameTextField5.setText(specialization);
//       userNameTextField6.setText(userid);
//       userNameTextField7.setText(pwd);
//       userNameTextField8.setText(phnum);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void userNameTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
         DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow=jTable1.getSelectedRow();
        if(sRow>=0)
        {
             
        String value=(String)table.getValueAt(sRow, 3);
        DoctorDir doctorDirectory = system.getDoctorDir();
        ArrayList<Doctor> docs=doctorDirectory.getDoc();
        int z=docs.size();
        for(int i=0;i<z;i++)
           {
            Doctor d=docs.get(i);
            if(d.getUserName().matches(value))
                    {
                       doctorDirectory.removeDoc(d);
                       system.getUserAccDir().removeccount(d);
                  
                        break;
                    }
        }
          displayTable();
          userNameTextField3.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");
            userNameTextField8.setText("");
             }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
          if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else{
        userNameTextField4.setText(table.getValueAt(selectedRow,0).toString());
        userNameTextField3.setText(table.getValueAt(selectedRow,1).toString());
        userNameTextField5.setText(table.getValueAt(selectedRow,2).toString());
        userNameTextField6.setText(table.getValueAt(selectedRow,3).toString());
        userNameTextField7.setText(table.getValueAt(selectedRow,4).toString());
        userNameTextField8.setText(table.getValueAt(selectedRow,5).toString());
        
          }
        
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hosCount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel splCount;
    private javax.swing.JTextField userNameTextField3;
    private javax.swing.JTextField userNameTextField4;
    private javax.swing.JTextField userNameTextField5;
    private javax.swing.JTextField userNameTextField6;
    private javax.swing.JTextField userNameTextField7;
    private javax.swing.JTextField userNameTextField8;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DoctorDir docDir = system.getDoctorDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Doctor doc : docDir.getDoc()) {
                    Object[] row = new Object[6];
                    row[0] = doc.getFirstName();
                    row[1] = doc.getHospital();
                    row[2] = doc.getSpecialization();
                    row[3] = doc.getUserId();
                    row[4] = doc.getAccPassword();
                    row[5] = doc.getPhoneNum();
                    hospitals.add(doc.getHospital());
                    specializations.add(doc.getSpecialization());

                    model.addRow(row);
                
            }
        
    }
    
     private void populateDashBoard() {
        // Print the count of the location
        // Converting it to hash set
        HashSet<String> uniqueHospital = new HashSet<String>(hospitals);
        HashSet<String> uniqueSpecialization = new HashSet<String>(specializations);
        
        // get the count of hash sets
        hospitalCount = uniqueHospital.size();
        specializationCount = uniqueSpecialization.size();
        
        hosCount.setText(Integer.toString(hospitalCount));
        splCount.setText(Integer.toString(specializationCount));
        
    }
    }

