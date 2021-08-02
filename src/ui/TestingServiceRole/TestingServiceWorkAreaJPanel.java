/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TestingServiceRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */

public class TestingServiceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;
    public TestingServiceWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
       
        try{
            initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.org=org;
        this.system=system;
         
            // TODO add your handling code here:
            ManageTesterProfileJPanel manageTesterProfile=new ManageTesterProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
            workAreaJPanel.add("UserProfileJPanel", manageTesterProfile);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } catch (ParseException ex) {
            Logger.getLogger(TestingServiceWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        void setColor(JPanel panel){
        panel.setBackground(new Color(130,175,203));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(18,102,153));
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
        btnAddTests_JPanel = new javax.swing.JPanel();
        btnAddTests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrders_JPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnOrders = new javax.swing.JLabel();
        btnProfile_Panel = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 102, 153));

        btnAddTests_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnAddTests_JPanel.setToolTipText("");
        btnAddTests_JPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddTests_JPanelMousePressed(evt);
            }
        });

        btnAddTests.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAddTests.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddTests.setText("Add Tests");
        btnAddTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddTestsMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8-add-30.png"))); // NOI18N

        javax.swing.GroupLayout btnAddTests_JPanelLayout = new javax.swing.GroupLayout(btnAddTests_JPanel);
        btnAddTests_JPanel.setLayout(btnAddTests_JPanelLayout);
        btnAddTests_JPanelLayout.setHorizontalGroup(
            btnAddTests_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddTests_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddTests)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAddTests_JPanelLayout.setVerticalGroup(
            btnAddTests_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddTests_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAddTests_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddTests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnOrders_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnOrders_JPanel.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/requests.png"))); // NOI18N

        btnOrders.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOrders.setText("Manage Requests");
        btnOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOrdersMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnOrders_JPanelLayout = new javax.swing.GroupLayout(btnOrders_JPanel);
        btnOrders_JPanel.setLayout(btnOrders_JPanelLayout);
        btnOrders_JPanelLayout.setHorizontalGroup(
            btnOrders_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrders_JPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrders)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOrders_JPanelLayout.setVerticalGroup(
            btnOrders_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrders_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnOrders_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProfile_Panel.setBackground(new java.awt.Color(130, 175, 203));
        btnProfile_Panel.setToolTipText("");

        btnProfile.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Manage Profile");
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfileMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnProfile_PanelLayout = new javax.swing.GroupLayout(btnProfile_Panel);
        btnProfile_Panel.setLayout(btnProfile_PanelLayout);
        btnProfile_PanelLayout.setHorizontalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        btnProfile_PanelLayout.setVerticalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnProfile_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrders_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddTests_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnProfile_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOrders_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAddTests_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(730, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTestsMousePressed
        // TODO add your handling code here:
        setColor(btnAddTests_JPanel);
        resetColor(btnOrders_JPanel);
        resetColor(btnProfile_Panel);
      ManageTests manageTest=new ManageTests(workAreaJPanel,enterprise,useraccount,system,org);
        workAreaJPanel.add("UserProfileJPanel", manageTest);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAddTestsMousePressed

    private void btnAddTests_JPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTests_JPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddTests_JPanelMousePressed

    private void btnOrdersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdersMousePressed
        // TODO add your handling code here:
        setColor(btnOrders_JPanel);
        resetColor(btnAddTests_JPanel);
        resetColor(btnProfile_Panel);
       TesterAssignedRequest testerAssignedRequests=new TesterAssignedRequest(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("viewAllRequestJPanel", testerAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnOrdersMousePressed

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
        setColor(btnProfile_Panel);
        resetColor(btnOrders_JPanel);
        resetColor(btnAddTests_JPanel);
        try {
            // TODO add your handling code here:
            ManageTesterProfileJPanel manageTesterProfile=new ManageTesterProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
            workAreaJPanel.add("UserProfileJPanel", manageTesterProfile);
            CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
            layout.next(workAreaJPanel);
        } catch (ParseException ex) {
            Logger.getLogger(TestingServiceWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProfileMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddTests;
    private javax.swing.JPanel btnAddTests_JPanel;
    private javax.swing.JLabel btnOrders;
    private javax.swing.JPanel btnOrders_JPanel;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JPanel btnProfile_Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
