/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.PatientManager.PatientManager;
import Business.Person.PersonalNotification;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.RequestDoctor;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import ui.UserRole.HealthRequestReport;

/**
 *
 * @author amishagupta
 */
public class NotificationRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
     private UserAccount useraccount;
       private EcoSystem system;
       private PatientManager patientManager;
       private Enterprise enterprise;
       private Organization organization;
       private JPanel userProcessContainer;
       private HealthRequest req;
    public NotificationRequestJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        String username = useraccount.getUsername();
        patientManager =organization.getpManagerDir().findPatientManager(username);
        notificationJTable.setRowHeight(25);
        notificationJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
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
        DefaultTableModel model = (DefaultTableModel) notificationJTable.getModel();
        model.setRowCount(0);
           for(PersonalNotification not : patientManager.getNotificationDirectory().getNotificationList()){
            Object[] row = new Object[3];
            row[0] = not;
            row[1] = not.getMessage();
            row[2] = not.getRequestNumber();
            model.addRow(row);
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
        notificationJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewDetails = new javax.swing.JButton();
        btnMarkAsRead = new javax.swing.JButton();

        notificationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Message", "Request Number"
            }
        ));
        notificationJTable.setRequestFocusEnabled(false);
        notificationJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(notificationJTable);
        if (notificationJTable.getColumnModel().getColumnCount() > 0) {
            notificationJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("User's Requests");

        viewDetails.setText("View Details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        btnMarkAsRead.setText("Mark as Read");
        btnMarkAsRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkAsReadActionPerformed(evt);
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
                        .addContainerGap()
                        .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMarkAsRead, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetails)
                    .addComponent(btnMarkAsRead))
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
          int selectedRow = notificationJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
                  req = (HealthRequest)notificationJTable.getValueAt(selectedRow, 2);
                  PersonalNotification not = (PersonalNotification)notificationJTable.getValueAt(selectedRow, 0);
                  HealthRequestReportQuarantineFlowJPanel healthQuarantine=new HealthRequestReportQuarantineFlowJPanel(userProcessContainer,enterprise,useraccount,system, req, patientManager, "patManAssignedReq");
                  userProcessContainer.add("PatientManagerQuarantineJPanel", healthQuarantine);
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
                  not.setStatus("old");
                  
         }
        
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void btnMarkAsReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkAsReadActionPerformed
        // TODO add your handling code here:
          int selectedRow = notificationJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
                  PersonalNotification not = (PersonalNotification)notificationJTable.getValueAt(selectedRow, 0);
                  not.setStatus("old");
                  
         }
    }//GEN-LAST:event_btnMarkAsReadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JButton btnMarkAsRead;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable notificationJTable;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
