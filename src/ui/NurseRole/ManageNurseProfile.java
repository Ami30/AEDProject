/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NurseRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Nurse.Nurse;
import Business.UserAccount.UserAccount;
import Business.Validation.Validations;
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
        jDateChooser1.setMaxSelectableDate(new Date());
 
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        GenderCombobox = new javax.swing.JComboBox();
        txtZipCode = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblDegree = new javax.swing.JLabel();
        txtDegree = new javax.swing.JTextField();
        lblYearsExp = new javax.swing.JLabel();
        txtYearsExp = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
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

        lblEmail.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblEmail.setText("Email");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblAddress.setText("Address");

        lblZipCode.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblZipCode.setText("Zip Code");

        lblContactNo.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblContactNo.setText("Contact Number");

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabel1.setText("Date of Birth");

        lblGender.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblGender.setText("Gender");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblDegree.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblDegree.setText("Degree");

        txtDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeActionPerformed(evt);
            }
        });

        lblYearsExp.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        lblYearsExp.setText("Experience Years");

        txtYearsExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearsExpActionPerformed(evt);
            }
        });

        addJButton.setBackground(new java.awt.Color(18, 102, 153));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setText("Save");
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

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jLabel3.setText("MY PROFILE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZipCode)
                            .addComponent(lblContactNo)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lblAddress)
                            .addComponent(lblEmail)
                            .addComponent(lblGender)
                            .addComponent(lblDegree)
                            .addComponent(lblYearsExp))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(GenderCombobox, javax.swing.GroupLayout.Alignment.LEADING, 0, 254, Short.MAX_VALUE)
                            .addComponent(txtDegree, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtYearsExp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(lblZipCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYearsExp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearsExp))
                .addGap(54, 54, 54)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
 
       Validations validation=new Validations();

      if(name.equals("")||address.equals("")||email.equals("")||zipcode.equals("")||contactNumber.equals("")||exp.equals("")||degree.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        if(!validation.isValidZipCode(zipcode)){
            return;
        }
        if(!validation.isValidPhoneNumber(contactNumber)){
            return;
        }
        if(!validation.isValidEmail(email)){
            return;
        }
        if(!validation.isFloat(exp)){
         JOptionPane.showMessageDialog(null, "Please enter valid years of Experience!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
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
        nurse.setGender(selectedgender);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JButton addJButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
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
