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
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
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
public class PatientManagerAssignDocJPanel extends javax.swing.JPanel {

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
    public PatientManagerAssignDocJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        String username = useraccount.getUsername();
        patientManager =organization.getpManagerDir().findPatientManager(username);
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
           for(HealthRequest req : organization.getRequestDirectory().getRequestList()){
            Object[] row = new Object[7];
            row[0] = req;
            row[1] = req.getUser().getName();
            row[2] = req.getPatientManager()==null?"Not Assigned":req.getPatientManager().getName();
            row[3] = req.getDoctor()==null?"Not Assigned":req.getDoctor().getName();
            row[4] = req.getNurse()==null?"Not Assigned":req.getNurse().getName();
            row[5] = req.getHospital()==null?"Not Assigned": req.getHospital().getName();
            row[6] = req.getStatus();
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
        SubmittedrequestsJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnAssign = new javax.swing.JButton();
        viewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Requester's Name", "Patient Manager", "Doctor Assigned", "Nurse Assigned", "Hospital Assigned", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("Assigned Doctor Requests");

        BtnAssign.setText("Assign to Me");
        BtnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAssignActionPerformed(evt);
            }
        });

        viewDetails.setText("View Details");
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnAssign))
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAssign)
                    .addComponent(viewDetails))
                .addContainerGap(322, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAssignActionPerformed
        // TODO add your handling code here:
          int selectedRow = SubmittedrequestsJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
        req = (HealthRequest)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
        if(req.getPatientManager()==null){
        req.setPatientManager(patientManager);
        patientManager.getRequestDirectory().addRequestList(req);
        populateRequestTable();
        JOptionPane.showMessageDialog(null, "This Request has been assigned to you successfuuly");
        }else{
            JOptionPane.showMessageDialog(null, "This Request is already assigned to: " +req.getPatientManager().getName());
        }
        
         }
            
        
    }//GEN-LAST:event_BtnAssignActionPerformed

    private void viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsActionPerformed
        // TODO add your handling code here:
          int selectedRow = SubmittedrequestsJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
                  req = (HealthRequest)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
                  HealthRequestReport healthRequest=new HealthRequestReport(userProcessContainer,enterprise,useraccount,system, req, patientManager, "patManAllReq");
                  userProcessContainer.add("PatientManagerProfileJPanel", healthRequest);
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
         }
        
    }//GEN-LAST:event_viewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAssign;
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
