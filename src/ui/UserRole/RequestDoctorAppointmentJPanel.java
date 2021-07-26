/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.UserRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.RegisteredUser.RegisteredUser;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class RequestDoctorAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDoctorAppointmentJPanel
     */
     private ArrayList<String> fever;
     private ArrayList<String> cough;
     private ArrayList<String> bodyPain;
      private UserAccount useraccount;
       private EcoSystem system;
       RegisteredUser user;
       Enterprise ent;
    public RequestDoctorAppointmentJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system) {
        initComponents();
   
        this.system=system;
        this.useraccount=account;
        this.ent=enterprise;
        String username = useraccount.getUsername();
        user =system.getRegisteredUserDirectory().findRegisteredUser(username);
        populatecombobox();
        populateRequesttable();
        SubmittedrequestsJTable.setRowHeight(25);
        SubmittedrequestsJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        
 
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
    
    public void populatecombobox(){
        ComboBoxBodyPain.removeAllItems();
        ComboBoxFever.removeAllItems();
        ComboboxCough.removeAllItems();
         this.fever=new ArrayList<>();
         this.cough=new ArrayList<>();
         this.bodyPain=new ArrayList<>();
         fever.add("Yes - Severe");
         fever.add("Yes - Mild");
         fever.add("No");
         cough.add("Yes - Severe");
         cough.add("Yes - mild");
         cough.add("No");
         bodyPain.add("Yes - Severe");
         bodyPain.add("Yes- Mild");
         bodyPain.add("No");
         for(String f:fever){
             ComboBoxFever.addItem(f);
         }
         for(String c:cough){
             ComboboxCough.addItem(c);
         }
         for(String bp:bodyPain){
             ComboBoxBodyPain.addItem(bp);
         }
    }
     public void populateRequesttable() {
        DefaultTableModel model = (DefaultTableModel) SubmittedrequestsJTable.getModel();
        model.setRowCount(0);
//        if(system.getWorkQueue()!=null){
//        for (WorkRequest workRequest : system.getWorkQueue().getWorkRqstList()) {
//            if (workRequest instanceof RequestDoctor){
//               if (((RequestDoctor) workRequest).getRegisteredUser().getUsername().equals(useraccount.getUsername())){
//                    Object[] row = new Object[7];
//                            row[0] = workRequest;
//                            row[1] = ((RequestDoctor) workRequest).getRegisteredUser().getEmployee().getName();
//                            row[2] = ((RequestDoctor) workRequest).getPatientManager()==null?"Not Assigned":((RequestDoctor) workRequest).getPatientManager().getEmployee().getName();
//                            row[3] = ((RequestDoctor) workRequest).getDoctor()==null?"Not Assigned":((RequestDoctor) workRequest).getDoctor().getEmployee().getName();
//                            row[4] = ((RequestDoctor) workRequest).getNurUserAccount()==null?"Not Assigned":((RequestDoctor) workRequest).getNurUserAccount().getEmployee().getName();
//                            row[5] = ((RequestDoctor) workRequest).getHospitalAssigned()==null?"Hospital Not Assigned":((RequestDoctor) workRequest).getHospitalAssigned();
//                            row[6] = ((RequestDoctor) workRequest).getDoctorMessage()==null?"No Comments":((RequestDoctor) workRequest).getDoctorMessage();
//                            row[7] = ((RequestDoctor) workRequest).getPatientmanagerComment()==null?"No Comments":((RequestDoctor) workRequest).getPatientmanagerComment();
//                            row[8] = ((RequestDoctor) workRequest).getRequeststatus();
//                            model.addRow(row);
//               }
//            }
//            
//            
//        }
//        }

        
        for(HealthRequest req : user.getHealthRequestDirectory().getRequestList()){
            Object[] row = new Object[6];
            row[0] = req.getRequestNumber();
            row[1] = req.getPatientManager()==null?"Not Assigned":req.getPatientManager().getName();
            row[2] = req.getDoctor()==null?"Not Assigned":req.getDoctor().getName();
            row[3] = req.getNurse()==null?"Not Assigned":req.getNurse().getName();
            row[4] = req.getHospital()==null?"Not Assigned": req.getHospital().getName();
            row[5] = req.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        lblFever = new javax.swing.JLabel();
        ComboBoxFever = new javax.swing.JComboBox();
        lblCough = new javax.swing.JLabel();
        ComboboxCough = new javax.swing.JComboBox();
        lblBodyPain = new javax.swing.JLabel();
        ComboBoxBodyPain = new javax.swing.JComboBox();
        lblSymptoms = new javax.swing.JLabel();
        txtSymptom = new javax.swing.JTextField();
        DoctorScrollPane = new javax.swing.JScrollPane();
        SubmittedrequestsJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lblSubmittedrqsts = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel1.setText("REQUEST DOCTOR");

        lblFever.setText("Fever");

        ComboBoxFever.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxFever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFeverActionPerformed(evt);
            }
        });

        lblCough.setText("Cough");

        ComboboxCough.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboboxCough.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxCoughActionPerformed(evt);
            }
        });

        lblBodyPain.setText("Body Pain");

        ComboBoxBodyPain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxBodyPain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxBodyPainActionPerformed(evt);
            }
        });

        lblSymptoms.setText("Other Symptoms(if any)");

        SubmittedrequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient Manager", "Doctor Assigned", "Nurse Assigned", "Hospital Assigned", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
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

        jButton1.setBackground(new java.awt.Color(18, 102, 153));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblSubmittedrqsts.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        lblSubmittedrqsts.setText("Submitted Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 414, Short.MAX_VALUE)
                        .addComponent(lblSubmittedrqsts)
                        .addGap(425, 425, 425))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSymptoms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFever)
                                .addGap(182, 182, 182)
                                .addComponent(ComboBoxFever, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCough)
                                    .addComponent(lblBodyPain))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxBodyPain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboboxCough, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxFever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFever))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboboxCough, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCough))
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxBodyPain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBodyPain))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSymptom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSymptoms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblSubmittedrqsts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxFeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFeverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFeverActionPerformed

    private void ComboboxCoughActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxCoughActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxCoughActionPerformed

    private void ComboBoxBodyPainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxBodyPainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxBodyPainActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selectedfever = (String) ComboBoxFever.getSelectedItem();
        String selectedcough = (String) ComboboxCough.getSelectedItem();
        String selectedbodypain = (String) ComboBoxBodyPain.getSelectedItem();
        String otherSymptoms = txtSymptom.getText();
//        registeredUser.setFever(selectedfever);
//        registeredUser.setBodypain(selectedbodypain);
//        registeredUser.setCough(selectedcough);
        
        
        //creating new Health reuest starts
        
        Network network = user.getRegisteredUserNetwork();
        Organization organization = null;
        for(Enterprise ent : network.getEnterpriseDir().getEnterpriseList()){
            for(Organization org : ent.getOrganizationDirectory().getOrgList()){
                if(org.getType().getValue().equalsIgnoreCase("Patient Manager Organization")){
                    organization = org;
                }
            }    
    }
        HealthRequest req = new HealthRequest("New", user, null, null, null, organization, selectedfever, selectedcough, selectedbodypain, selectedcough,null);
        user.getHealthRequestDirectory().addRequestList(req);
        organization.getRequestDirectory().addRequestList(req);
        // creating new Helath requesr
        
        
//        RequestDoctor requestDoc=new RequestDoctor();
//        requestDoc.setRequestID();
//        requestDoc.setRegisteredUser(useraccount);
//        requestDoc.setRequeststatus("Request Submitted");
//        system.getWorkQueue().getWorkRqstList().add(requestDoc);
        
        JOptionPane.showMessageDialog(null, "Your Request Sent Successfully to Patient Support Services.You will soon be assigned a Patient Manger.");
        populateRequesttable();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxBodyPain;
    private javax.swing.JComboBox ComboBoxFever;
    private javax.swing.JComboBox ComboboxCough;
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JTable SubmittedrequestsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBodyPain;
    private javax.swing.JLabel lblCough;
    private javax.swing.JLabel lblFever;
    private javax.swing.JLabel lblSubmittedrqsts;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JTextField txtSymptom;
    // End of variables declaration//GEN-END:variables
}
