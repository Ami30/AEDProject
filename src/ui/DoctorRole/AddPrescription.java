/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;



import Business.EcoSystem;
import Business.Employee.Prescription;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Tester.Tester;
import Business.Tester.Tests;
import Business.UserAccount.UserAccount;
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
import ui.UserRole.HealthRequestReport;

/**
 *
 * @author amishagupta
 */
public class AddPrescription extends javax.swing.JPanel {

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
       
    public AddPrescription(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, HealthRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.request = request;
        populateDetails();
        datePanel.setVisible(false);
        

        
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
        addJButton = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblRequestNumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrescription = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nextConsultationComboBox = new javax.swing.JComboBox<>();
        datePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nextConsultationDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel2.setText("Patients Name");

        lblAddress.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblAddress.setText("Request Number");

        addJButton.setBackground(new java.awt.Color(18, 102, 153));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/submit.png"))); // NOI18N
        addJButton.setText("Submit");
        addJButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJButton.setContentAreaFilled(false);
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addJButtonMouseExited(evt);
            }
        });
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        lblPatientName.setText("jLabel1");

        lblRequestNumber.setText("jLabel1");

        jLabel1.setText("Comment:");

        jLabel3.setText("Prescription:");

        jLabel4.setText("Next Consultation?");

        nextConsultationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        nextConsultationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextConsultationComboBoxActionPerformed(evt);
            }
        });

        datePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Select Date:");

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(nextConsultationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(nextConsultationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblAddress)
                                .addGap(18, 18, 18)
                                .addComponent(lblRequestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtComment)
                            .addComponent(txtPrescription)
                            .addComponent(nextConsultationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nextConsultationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 340));

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 1, 16)); // NOI18N
        jLabel5.setText("                      Add Prescription");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 270, 40));

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
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String comment = txtComment.getText();
        String prescription = txtPrescription.getText();
        if(prescription.equals("")){
            JOptionPane.showMessageDialog(null, "Did you forget to add prescription ?", "Error!", JOptionPane.ERROR_MESSAGE);
          return;
        }
        else{
        if(ifConsultationRequired.equalsIgnoreCase("yes")){
            datePanel.setVisible(true);
            Date date = nextConsultationDate.getDate();
            String nextDate = formatter.format(date);
            Prescription pres = new Prescription(comment, prescription, ifConsultationRequired, nextDate);
            request.getPrescriptionDirectory().addPrescriptionList(pres);
            
        }else{
            String nextDate = "Not Applicable";
            Prescription pres = new Prescription(comment, prescription, ifConsultationRequired, nextDate);
            request.getPrescriptionDirectory().addPrescriptionList(pres);
        }
        JOptionPane.showMessageDialog(null, "Prescription Added Successfully");
        HealthRequestReport healthRequest=new HealthRequestReport(userProcessContainer,ent,userAccount,system, request, null, "doctor");
        userProcessContainer.add("PatientManagerProfileJPanel", healthRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_addJButtonActionPerformed

    private void nextConsultationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextConsultationComboBoxActionPerformed
        // TODO add your handling code here:
       ifConsultationRequired= nextConsultationComboBox.getSelectedItem().toString();
       if(ifConsultationRequired.equalsIgnoreCase("yes")){
           datePanel.setVisible(true);
       }
    }//GEN-LAST:event_nextConsultationComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseEntered
        // TODO add your handling code here:
           addJButton.setBackground(new java.awt.Color(18,102,153));
        addJButton.setContentAreaFilled(true);
        addJButton.setFocusPainted(true);
        addJButton.setBorderPainted(false);
        addJButton.setOpaque(true);
    }//GEN-LAST:event_addJButtonMouseEntered

    private void addJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseExited
        // TODO add your handling code here:
          addJButton.setContentAreaFilled(false);
        addJButton.setFocusPainted(false);
        addJButton.setBorderPainted(true);
    }//GEN-LAST:event_addJButtonMouseExited

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JPanel datePanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblRequestNumber;
    private javax.swing.JComboBox<String> nextConsultationComboBox;
    private com.toedter.calendar.JDateChooser nextConsultationDate;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtPrescription;
    // End of variables declaration//GEN-END:variables

    private void populateDetails(){
        lblPatientName.setText(request.getUser().getName());
        lblRequestNumber.setText(request.getRequestNumber());
    }
}
