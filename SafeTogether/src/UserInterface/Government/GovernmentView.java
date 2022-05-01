/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Government;

import Business.EcoSystem;
import Business.UserAcc.UserAcc;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import Business.DatabaseUtil.DB4OUtil;
import Business.Vac.Vaccinations;
import Business.WorkQueue.OutbreakTracer;
import Business.WorkQueue.OutbreakTracerDir;
import Business.WorkQueue.VacRequest_Dir;
import com.sun.mail.imap.Rights;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author shrikrishnajoisa
 */
public class GovernmentView extends javax.swing.JPanel {

    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form PoliceMain
     * @param userProcessContainer
     * @param userAcc
     * @param system
     * @param ecosystem
     */
    public GovernmentView(JPanel userProcessContainer, UserAcc userAcc,EcoSystem system) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
       
//        Time();
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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        goBack2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        orderPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vacPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rightSidePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1040, 190, 30));
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        goBack2.setBackground(new java.awt.Color(255, 255, 255));
        goBack2.setPreferredSize(new java.awt.Dimension(100, 48));
        goBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goBack2MousePressed(evt);
            }
        });
        goBack2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-logout-24.png"))); // NOI18N
        goBack2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel26.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(115, 120, 128));
        jLabel26.setText("Return");
        goBack2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel6.add(goBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 290, 60));

        orderPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        orderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderPanelMousePressed(evt);
            }
        });
        orderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-delivery-24.png"))); // NOI18N
        orderPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(115, 120, 128));
        jLabel10.setText("Statistics");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        orderPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel6.add(orderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 60));

        vacPanel.setBackground(new java.awt.Color(255, 255, 255));
        vacPanel.setPreferredSize(new java.awt.Dimension(100, 48));
        vacPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vacPanelMousePressed(evt);
            }
        });
        vacPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icons/icons8-vaccination-24.png"))); // NOI18N
        vacPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 30, -1));

        jLabel11.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(115, 120, 128));
        jLabel11.setText("Vaccination Portal");
        vacPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jPanel6.add(vacPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 60));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 290, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo/safe together-logos_transparent copy.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 288, 1080));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        timeLabel.setText("3:45 PM");
        jPanel8.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel12.setText("CDC Dashboard");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(152, 151, 151));
        jLabel1.setText("View all the trends related to the pandemic");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1630, 90));

        rightSidePanel.setBackground(new java.awt.Color(250, 249, 251));
        rightSidePanel.setLayout(new java.awt.CardLayout());
        jPanel1.add(rightSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 1160, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBack2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBack2MousePressed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_goBack2MousePressed

    private void vacPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vacPanelMousePressed
        // TODO add your handling code here:
        sendToVacReqScreen();
    }//GEN-LAST:event_vacPanelMousePressed

    private void orderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderPanelMousePressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        OutbreakTracerDir vaccinationDirectory = system.getOutbreakStatusDir();
        ArrayList<OutbreakTracer> c1= vaccinationDirectory.getOutbreakLog();
        
        int a=0;
        int b=0;
        for(int i=0;i<c1.size();i++)
        {
            
            OutbreakTracer c2 = c1.get(i);
            if(c2.getResult().matches("Positive"))
            {
                a+=1;
            }
            else if(c2.getResult().matches("Negative"))
            {
                b+=1;
            }
            
        }
        
        DefaultPieDataset pie=new DefaultPieDataset();
        pie.setValue("Positive Case", a);
        pie.setValue("Negative Case", b);
        JFreeChart c2=ChartFactory.createPieChart("Covid-19 Statistics", pie,true,true,true);
        PiePlot p = (PiePlot)c2.getPlot();
        ChartFrame f=new ChartFrame("Pie Chart",c2);
        f.setVisible(false);
        f.setSize(300, 400);
        ChartPanel cp=new ChartPanel(c2);
        cp.setSize(500, 600);
        rightSidePanel.removeAll();
        rightSidePanel.add(cp);
        rightSidePanel.updateUI();
       
        
    }//GEN-LAST:event_jLabel10MouseClicked

    
    public void sendToVacReqScreen(){
        vacPanel.setBackground(new Color(213,230,249));
        VacRequest pr=new VacRequest(container,userAcc, system);
        rightSidePanel.add(pr);
        CardLayout layout = (CardLayout) rightSidePanel.getLayout();
        layout.next(rightSidePanel);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel goBack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel rightSidePanel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel vacPanel;
    // End of variables declaration//GEN-END:variables
}
