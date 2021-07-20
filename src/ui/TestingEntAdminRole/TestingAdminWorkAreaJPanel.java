/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TestingEntAdminRole;

import ui.FoodSupplyEntAdminRole.*;
import ui.SanitizationEntAdminRole.*;
import ui.PatientSupportEntAdminRole.*;
import ui.HospitalEntAdminRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */

public class TestingAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;
    public TestingAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.org=org;
        this.system=system;
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
        btnEmployee_Panel = new javax.swing.JPanel();
        btnManageEmployee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrganization_Panel = new javax.swing.JPanel();
        btnmgOrg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 102, 153));

        btnEmployee_Panel.setBackground(new java.awt.Color(18, 102, 153));
        btnEmployee_Panel.setToolTipText("");
        btnEmployee_Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEmployee_PanelMousePressed(evt);
            }
        });

        btnManageEmployee.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnManageEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnEmployee_PanelLayout = new javax.swing.GroupLayout(btnEmployee_Panel);
        btnEmployee_Panel.setLayout(btnEmployee_PanelLayout);
        btnEmployee_PanelLayout.setHorizontalGroup(
            btnEmployee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmployee_PanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEmployee_PanelLayout.setVerticalGroup(
            btnEmployee_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEmployee_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        btnOrganization_Panel.setBackground(new java.awt.Color(130, 175, 203));
        btnOrganization_Panel.setToolTipText("");

        btnmgOrg.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnmgOrg.setForeground(new java.awt.Color(255, 255, 255));
        btnmgOrg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnmgOrg.setText("Manage Organization");
        btnmgOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmgOrgMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/org.png"))); // NOI18N

        javax.swing.GroupLayout btnOrganization_PanelLayout = new javax.swing.GroupLayout(btnOrganization_Panel);
        btnOrganization_Panel.setLayout(btnOrganization_PanelLayout);
        btnOrganization_PanelLayout.setHorizontalGroup(
            btnOrganization_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrganization_PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmgOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btnOrganization_PanelLayout.setVerticalGroup(
            btnOrganization_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOrganization_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmgOrg, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnOrganization_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmployee_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnOrganization_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEmployee_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(766, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMousePressed
        // TODO add your handling code here:

        setColor(btnEmployee_Panel);
        resetColor(btnOrganization_Panel);
        ManageTestingEntEmpJPanel manageSanitizationEmpJPanel=new ManageTestingEntEmpJPanel(workAreaJPanel,enterprise.getOrganizationDirectory(),enterprise);
        workAreaJPanel.add("ManageEmpJPanel", manageSanitizationEmpJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
       
    }//GEN-LAST:event_btnManageEmployeeMousePressed

    private void btnEmployee_PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployee_PanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployee_PanelMousePressed

    private void btnmgOrgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmgOrgMousePressed
        // TODO add your handling code here:
        setColor(btnOrganization_Panel);
        resetColor(btnEmployee_Panel);
        ManageTestingEntOrgJPanel manageSanitizationOrgJPanel=new ManageTestingEntOrgJPanel(workAreaJPanel,enterprise.getOrganizationDirectory());
        workAreaJPanel.add("ManageOrgJPanel", manageSanitizationOrgJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnmgOrgMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEmployee_Panel;
    private javax.swing.JLabel btnManageEmployee;
    private javax.swing.JPanel btnOrganization_Panel;
    private javax.swing.JLabel btnmgOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
