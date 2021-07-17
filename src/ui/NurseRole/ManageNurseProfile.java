/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NurseRole;

import ui.DoctorRole.*;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Nurse.Nurse;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */
public class ManageNurseProfile extends javax.swing.JPanel {

    /**
     * Creates new form ManageProfileJPanel
     */
    private UserAccount useraccount;
    private EcoSystem system;
    private Enterprise enterprise;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
 
    public ManageNurseProfile(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system) throws ParseException {
        initComponents();
        this.useraccount=account;
        this.system = system;
        this.enterprise=enterprise;
        populateprofile();

 
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        GenderCombobox = new javax.swing.JComboBox();
        txtZipCode = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblContactNo2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtavailability = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblDegree = new javax.swing.JLabel();
        txtDegree = new javax.swing.JTextField();
        lblYearsExp = new javax.swing.JLabel();
        txtYearsExp = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font(".SF NS Text", 1, 13))); // NOI18N

        jLabel2.setText("Name");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblContactNo2.setText("Availability");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblZipCode.setText("Zip Code");

        lblContactNo.setText("Contact Number");

        jLabel1.setText("Date of Birth");

        lblGender.setText("Gender:");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblDegree.setText("Degree");

        txtDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeActionPerformed(evt);
            }
        });

        lblYearsExp.setText("Experience Years");

        txtYearsExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsExpActionPerformed(evt);
            }
        });

        addJButton.setText("Save");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblContactNo)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(lblContactNo2))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nameJTextField)
                    .addComponent(txtZipCode)
                    .addComponent(txtContactNo)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtavailability, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDegree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblYearsExp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtYearsExp, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender)
                    .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDegree)
                        .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtavailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblContactNo2))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblYearsExp)
                        .addComponent(txtYearsExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String name = nameJTextField.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String selectedgender = GenderCombobox.getSelectedItem().toString();
        String email=txtEmail.getText();
        String degree = txtDegree.getText();
        String exp = txtYearsExp.getText();
        String birthDate = formatter.format(jDateChooser1.getDate());
 
      
        
        String username = useraccount.getUsername();
//        RegisteredUser registeredUser= system.getRegisteredUserDirectory().findRegisteredUser(username);
        Nurse nurse=enterprise.getOrganizationDirectory().getOrgList().get(1).getNurDir().findNurse(username);
        nurse.setFullName(name);
        nurse.setAddress(address);
        nurse.setEmail(email);
        nurse.setContactNumber(contactNumber);
        nurse.setDob(birthDate);
        nurse.setDegree(degree);
        nurse.setYearsExperience(exp);

        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='green'> Details Saved Successfully!! </font><></h2></html>"));
      


    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void txtDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDegreeActionPerformed

    private void txtYearsExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearsExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearsExpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JButton addJButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo2;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblYearsExp;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtYearsExp;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtavailability;
    // End of variables declaration//GEN-END:variables

    private void populateprofile() throws ParseException {
        String username = useraccount.getUsername();
       // Doctor doctor1= enterprise.getDocDir().findDoctor(username);
        Nurse nurse=enterprise.getOrganizationDirectory().getOrgList().get(1).getNurDir().findNurse(username);
        nameJTextField.setText(nurse.getFullName());
        txtAddress.setText(nurse.getAddress());
        txtZipCode.setText(nurse.getZipcode());
        txtContactNo.setText(nurse.getContactNumber());
        txtYearsExp.setText(nurse.getYearsExperience());
        txtDegree.setText(nurse.getDegree());
        GenderCombobox.setSelectedItem(nurse.getGender());  
        txtEmail.setText(nurse.getEmail());       
        String birthDate = nurse.getDob();
        if(birthDate != null){
            Date date = (Date) formatter.parse(birthDate);
            jDateChooser1.setDate(date);
        }    
    }
}
