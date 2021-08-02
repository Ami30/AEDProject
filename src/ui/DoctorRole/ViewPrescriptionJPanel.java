/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Prescription;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import ui.NurseRole.NurseReportActionPanel;
import ui.UserRole.HealthRequestReport;


/**
 *
 * @author amishagupta
 */
public class ViewPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerAssignDocJPanel
     */
     private UserAccount useraccount;
       private EcoSystem system;
       private Doctor doctor;
       private Enterprise enterprise;
       private Organization organization;
       private JPanel userProcessContainer;
       private HealthRequest req;
       private Prescription presc;
    public ViewPrescriptionJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system,HealthRequest request, Organization organization) {
        initComponents();
        this.useraccount=account;
        this.system=system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        this.req = request;
        String username = useraccount.getUsername();
//        doctor =organization.getDocDir().findDoctor(username);
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
           setBackground(new java.awt.Color(18,102,153));
            return this;
        }
    }
  public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
           for(Prescription req : req.getPrescriptionDirectory().getPrescriptionList()){
            Object[] row = new Object[3];
            row[0] = req;
            row[1] = req.getPrescription();
            row[2] = req.getNextConsultationRequired();
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
        viewDetails = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Comment", "Prescription", "Next Consultation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SubmittedrequestsJTable.setRequestFocusEnabled(false);
        SubmittedrequestsJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(SubmittedrequestsJTable);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("User's Prescription");

        viewDetails.setBackground(new java.awt.Color(18, 102, 153));
        viewDetails.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        viewDetails.setText("View Details");
        viewDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewDetails.setContentAreaFilled(false);
        viewDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailsMouseExited(evt);
            }
        });
        viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(18, 102, 153));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
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
                presc = (Prescription)SubmittedrequestsJTable.getValueAt(selectedRow, 0);
                  AddPrescriptionDetailsJPanel healthRequest=new AddPrescriptionDetailsJPanel(userProcessContainer,enterprise,useraccount,system, req, presc);
                  userProcessContainer.add("PatientManagerProfileJPanel", healthRequest);
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
         }
        
    }//GEN-LAST:event_viewDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(organization.getType().getValue().equalsIgnoreCase("Nurse Organization")){
        NurseReportActionPanel  reportActionJPanel=new NurseReportActionPanel(userProcessContainer,enterprise,useraccount,system,req,organization);
        userProcessContainer.add("reportActionJPanel", reportActionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
        HealthRequestReport  reportActionJPanel=new HealthRequestReport(userProcessContainer,enterprise,useraccount,system,req,null,"doctor",organization);
        userProcessContainer.add("reportActionJPanel", reportActionJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsMouseEntered
        // TODO add your handling code here:
        viewDetails.setBackground(new java.awt.Color(18,102,153));
        viewDetails.setContentAreaFilled(true);
        viewDetails.setFocusPainted(true);
        viewDetails.setBorderPainted(false);
        viewDetails.setOpaque(true);
    }//GEN-LAST:event_viewDetailsMouseEntered

    private void viewDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsMouseExited
        // TODO add your handling code here:
          viewDetails.setContentAreaFilled(false);
        viewDetails.setFocusPainted(false);
        viewDetails.setBorderPainted(true);
    }//GEN-LAST:event_viewDetailsMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
          jButton1.setBackground(new java.awt.Color(18,102,153));
        jButton1.setContentAreaFilled(true);
        jButton1.setFocusPainted(true);
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
          jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setBorderPainted(true);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewDetails;
    // End of variables declaration//GEN-END:variables
}
