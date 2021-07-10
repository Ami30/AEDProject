/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SanitizationServiceRole;

import ui.TestingServiceRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.SanitizationPerson.SanitizationPerson;
import Business.Tester.Tester;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class SanitizationPersonAssignedRequest extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
     private UserAccount useraccount;
       private EcoSystem system;
       private Enterprise enterprise;
       private Organization organization;
       private JPanel userProcessContainer;
       private HealthRequest req;
       private SanitizationPerson sanitizationPerson;
    public SanitizationPersonAssignedRequest(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;

        SubmittedrequestsJTable.setRowHeight(25);
        SubmittedrequestsJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        populateRequestTable();
    }
     public class HeaderColor extends DefaultTableCellRenderer {
        public HeaderColor() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);         
           setBackground(new java.awt.Color(74,122,193));
            return this;
        }
    }
  public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
        SanitizationPerson sanitizationPer = null;
       for(Organization org : enterprise.getOrganizationDirectory().getOrgList()){
           if(org.getSaniPersonDir().findSaniPerson(useraccount.getUsername())!= null){
               sanitizationPer = org.getSaniPersonDir().findSaniPerson(useraccount.getUsername());
              for(HealthRequest req : sanitizationPer.getRequestDirectory().getRequestList()){
            Object[] row = new Object[4];
            row[0] = req;
            row[1] = req.getUser().getName();
            row[2] = req.getDoctor()==null?"Not Assigned": req.getDoctor().getName();
            row[3] = req.getStatus();
            model.addRow(row);
        }
           }
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

        DoctorScrollPane = new javax.swing.JScrollPane();
        SubmittedrequestsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewDetails = new javax.swing.JButton();
        btnManageProfile3 = new javax.swing.JButton();

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Requester's Name", "Doctor Assigned", "Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("User's Requests");

        viewDetails.setText("View Details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        btnManageProfile3.setFont(new java.awt.Font(".SF NS Text", 0, 12)); // NOI18N
        btnManageProfile3.setText("Manage completed Test");
        btnManageProfile3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(74, 126, 203), null, null));
        btnManageProfile3.setBorderPainted(false);
        btnManageProfile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfile3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnManageProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetails)
                    .addComponent(btnManageProfile3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
          int selectedRow = SubmittedrequestsJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
                for(Organization org : enterprise.getOrganizationDirectory().getOrgList()){
                if(org.getSaniPersonDir().findSaniPerson(useraccount.getUsername())!= null){
                    sanitizationPerson=org.getSaniPersonDir().findSaniPerson(useraccount.getUsername());
                   req = (HealthRequest)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
                  SanitizationPersonRequestReport saniRequests=new SanitizationPersonRequestReport(userProcessContainer,enterprise,useraccount,system, req, sanitizationPerson);
                  userProcessContainer.add("SanitizationRequestJPanel", saniRequests);
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
                }
                }
                  
         }
        
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void btnManageProfile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfile3ActionPerformed
        // TODO add your handling code here:
        
            int selectedRow = SubmittedrequestsJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
        req = (HealthRequest)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
        CompletedSanitizationReport completedSanitization=new CompletedSanitizationReport(userProcessContainer,enterprise,useraccount,system, req);
        userProcessContainer.add("userReport", completedSanitization);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
         }
    }//GEN-LAST:event_btnManageProfile3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JButton btnManageProfile3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
