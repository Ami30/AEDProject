/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NurseRole;



import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RegisteredUser.DailyReportSheet;
import Business.Tester.Tester;
import Business.Tester.Tests;
import Business.UserAccount.UserAccount;
import Business.Validation.Validations;
import Business.WorkQueue.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class AddDailyReport extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private Tester tester;
    private Organization org;
    private Tests test;
    private HealthRequest request;
    String ifConsultationRequired;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
       
    public AddDailyReport(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, HealthRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.request = request;
        populateDetails();
        populateDailyReportTable();
        dailyReportTable.setRowHeight(25);
        dailyReportTable.getTableHeader().setDefaultRenderer(new HeaderColor());
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


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblRequestNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDetails = new javax.swing.JTextField();
        slotComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFever = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSPO2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dailyReportTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Patients Name:");

        lblAddress.setText("Request Number:");

        btnSubmit.setBackground(new java.awt.Color(18, 102, 153));
        btnSubmit.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/submit.png"))); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPatientName.setText("jLabel1");

        lblRequestNumber.setText("jLabel1");

        jLabel1.setText("Select Slot:");

        jLabel3.setText("Other Details:");

        slotComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning Slot", "Afternoon Slot", "Evening Slot", "Night Slot" }));

        jLabel4.setText("fever (in farenhite):");

        jLabel6.setText("Oxygen Saturation:");

        jLabel7.setText("Blood Pressure:");

        jLabel8.setText("Heart Rate:");

        dailyReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Slot", "Fever (F)", "SOP2 (%)", "Blood Pressure", "Heart Rate", "Other Details"
            }
        ));
        jScrollPane1.setViewportView(dailyReportTable);

        jButton1.setBackground(new java.awt.Color(18, 102, 153));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/delete2.png"))); // NOI18N
        jButton1.setText("Remove");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblAddress)
                                .addGap(56, 56, 56)
                                .addComponent(lblRequestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDetails, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFever, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slotComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
                                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHeartRate, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(txtSPO2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAddress)
                    .addComponent(lblPatientName)
                    .addComponent(lblRequestNumber))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(slotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFever, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addComponent(txtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 660, 560));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("                      Daily Health Report");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 20));

        jButton3.setBackground(new java.awt.Color(18, 102, 153));
        jButton3.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         Validations validation=new Validations();
        Date date = new Date();
        String nowDate = formatter.format(date);
        String slot = slotComboBox.getSelectedItem().toString();
        String fever = txtFever.getText();
        String oxygenSaturation = txtSPO2.getText();
        String bloodPressure = txtBloodPressure.getText();
        String heartRate = txtHeartRate.getText();
        String details = txtDetails.getText();
        
        if(fever.equals("")||oxygenSaturation.equals("")||bloodPressure.equals("")||heartRate.equals("")){
             JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
             return;
        }
        if(!validation.isFloat(fever)){
            JOptionPane.showMessageDialog(null, "Invalid data for fever", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!validation.isFloat(oxygenSaturation)){
            JOptionPane.showMessageDialog(null, "Invalid data for oxygen saturation", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!validation.isFloat(bloodPressure)){
            JOptionPane.showMessageDialog(null, "Invalid data for blood pressure", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        if(!validation.isFloat(heartRate)){
            JOptionPane.showMessageDialog(null, "Invalid data for heart rate", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        
        DailyReportSheet ds = new DailyReportSheet(nowDate, slot, fever, oxygenSaturation, bloodPressure, heartRate, details);
        request.getDailyReportDirectory().addDailyReport(ds);
        refreshDetails();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int row = dailyReportTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DailyReportSheet dailyReportSheet=(DailyReportSheet)dailyReportTable.getValueAt(row, 0);
        request.getDailyReportDirectory().removeDailyReport(dailyReportSheet);
        refreshDetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
             jButton3.setBackground(new java.awt.Color(18,102,153));
        jButton3.setContentAreaFilled(true);
        jButton3.setFocusPainted(true);
         jButton3.setBorderPainted(false);
        jButton3.setOpaque(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
          jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setBorderPainted(true);
    }//GEN-LAST:event_jButton3MouseExited

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

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
             btnSubmit.setBackground(new java.awt.Color(18,102,153));
        btnSubmit.setContentAreaFilled(true);
        btnSubmit.setFocusPainted(true);
        btnSubmit.setBorderPainted(false);
        btnSubmit.setOpaque(true);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
          btnSubmit.setContentAreaFilled(false);
        btnSubmit.setFocusPainted(false);
        btnSubmit.setBorderPainted(true);
    }//GEN-LAST:event_btnSubmitMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTable dailyReportTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblRequestNumber;
    private javax.swing.JComboBox<String> slotComboBox;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDetails;
    private javax.swing.JTextField txtFever;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtSPO2;
    // End of variables declaration//GEN-END:variables

    private void populateDetails(){
        lblPatientName.setText(request.getUser().getName());
        lblRequestNumber.setText(request.getRequestNumber());
    }
    public void populateDailyReportTable() {
        DefaultTableModel model = (DefaultTableModel) dailyReportTable.getModel();
        model.setRowCount(0);
           for(DailyReportSheet rep : request.getDailyReportDirectory().getDailyReportList()){
            Object[] row = new Object[7];
            row[0] = rep;
            row[1] = rep.getTimeSlot();
            row[2] = rep.getFever();
            row[3] = rep.getOxygenSaturation();
            row[4] = rep.getBloodPressure();
            row[5] = rep.getHeartRate();
            row[6] = rep.getOtherDetails();
            model.addRow(row);
        }
   
    }
    private void refreshDetails(){
        txtFever.setText("");
        txtSPO2.setText("");
        txtBloodPressure.setText("");
        txtHeartRate.setText("");
        txtDetails.setText("");
        populateDailyReportTable();
    }
}
