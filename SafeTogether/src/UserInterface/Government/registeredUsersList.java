/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Government;

import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import Business.UserAcc.UserAccDir;
import Business.userR.User;
import Business.userR.User_Directory;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arjunbirju
 */
public class registeredUsersList extends javax.swing.JPanel {

    
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
//    private int totalUsers;
    /**
     * Creates new form registeredUsersList
     */
    public registeredUsersList(JPanel userProcessContainer, UserAcc userAcc,EcoSystem ecosystem) {
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        initComponents();
        populateTable();
    }
    public void populateTable(){
        try {
            User_Directory usersAccDir = system.getUserDir();
            ArrayList<User> users = usersAccDir.getUsers();
//            totalUsers = users.size();
            jLabel2.setText(String.valueOf(users.size()));
            for(int i=0; i< users.size(); i++){
                User user = users.get(i);
                DefaultTableModel table = (DefaultTableModel) usersTable.getModel();
                String s1 = String.valueOf(i+1);

                String s[]={s1,user.getFirstName(),user.getLocation(),user.getEmail()};
                table.addRow(s);
            }
        } catch(Exception ex){
            System.out.print(ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registered Users");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 110, 20));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Location", "Email"
            }
        ));
        jScrollPane1.setViewportView(usersTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 680, 310));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 80, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
