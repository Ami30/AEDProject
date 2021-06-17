/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.UserRole;

import ui.TestingEntAdminRole.*;
import ui.FoodSupplyEntAdminRole.*;
import ui.SanitizationEntAdminRole.*;
import ui.PatientSupportEntAdminRole.*;
import ui.HospitalEntAdminRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */

public class UserWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;
    public UserWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.org=org;
        this.system=system;
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
        btnConsultDoctor = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        btnOrderMedicine = new javax.swing.JButton();
        btnBookFoodService = new javax.swing.JButton();
        btnBookAmbulance = new javax.swing.JButton();
        btnSanitizationService = new javax.swing.JButton();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 227, 126));

        btnConsultDoctor.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnConsultDoctor.setText("Consult Doctor");
        btnConsultDoctor.setBorder(null);
        btnConsultDoctor.setBorderPainted(false);
        btnConsultDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDoctorActionPerformed(evt);
            }
        });

        btnManageProfile.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(74, 126, 203), null, null));
        btnManageProfile.setBorderPainted(false);
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        btnOrderMedicine.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnOrderMedicine.setText("Order Medicine");
        btnOrderMedicine.setBorder(null);
        btnOrderMedicine.setBorderPainted(false);
        btnOrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMedicineActionPerformed(evt);
            }
        });

        btnBookFoodService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnBookFoodService.setText("Book Food Service");
        btnBookFoodService.setBorder(null);
        btnBookFoodService.setBorderPainted(false);
        btnBookFoodService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFoodServiceActionPerformed(evt);
            }
        });

        btnBookAmbulance.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnBookAmbulance.setText("Book Ambulance");
        btnBookAmbulance.setBorder(null);
        btnBookAmbulance.setBorderPainted(false);
        btnBookAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAmbulanceActionPerformed(evt);
            }
        });

        btnSanitizationService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSanitizationService.setText("Book Sanitization Service");
        btnSanitizationService.setBorder(null);
        btnSanitizationService.setBorderPainted(false);
        btnSanitizationService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanitizationServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnBookFoodService, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnBookAmbulance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(btnSanitizationService, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBookFoodService, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBookAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSanitizationService, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 880));

        workAreaJPanel.setBackground(new java.awt.Color(74, 122, 193));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDoctorActionPerformed
        // TODO add your handling code here:
      RequestDoctorAppointmentJPanel requestDoctorAppointmentJPanel=new RequestDoctorAppointmentJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("DoctorAppointmentJPanel", requestDoctorAppointmentJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnConsultDoctorActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
        ManageProfileJPanel manageuserProfileJPanel=new ManageProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("UserProfileJPanel", manageuserProfileJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnOrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMedicineActionPerformed
        // TODO add your handling code here:
        RequestMedicineJPanel requestMedicineJPanel=new RequestMedicineJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("MedicineJPanel", requestMedicineJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnOrderMedicineActionPerformed

    private void btnBookFoodServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFoodServiceActionPerformed
        // TODO add your handling code here:
        RequestFoodJPanel requestFoodJPanel=new RequestFoodJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("FoodJPanel", requestFoodJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnBookFoodServiceActionPerformed

    private void btnBookAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAmbulanceActionPerformed
        // TODO add your handling code here:
        RequestAmbulanceJPanel requestAmbulanceJPanel=new RequestAmbulanceJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("AmbulanceJPanel", requestAmbulanceJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnBookAmbulanceActionPerformed

    private void btnSanitizationServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanitizationServiceActionPerformed
        // TODO add your handling code here:
        RequestSanitizationJPanel requestSanitizationJPanel=new RequestSanitizationJPanel(workAreaJPanel,enterprise,useraccount,system);
        workAreaJPanel.add("SanitizationJPanel", requestSanitizationJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnSanitizationServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAmbulance;
    private javax.swing.JButton btnBookFoodService;
    private javax.swing.JButton btnConsultDoctor;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnOrderMedicine;
    private javax.swing.JButton btnSanitizationService;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
