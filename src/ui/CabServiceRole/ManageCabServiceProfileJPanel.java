/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CabServiceRole;


import Business.AmbulanceDriver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */
public class ManageCabServiceProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProfileJPanel
     */
    private UserAccount useraccount;
    private EcoSystem system;
    private Enterprise enterprise;
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
 
    public ManageCabServiceProfileJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system) throws ParseException {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GenderCombobox = new javax.swing.JComboBox();
        txtZipCode = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();

        jLabel2.setText("Name");

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

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblZipCode.setText("Zip Code");

        lblContactNo.setText("Contact Number");

        lblGender.setText("Gender:");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblContactNo)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtZipCode)
                    .addComponent(txtContactNo))
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
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(266, 266, 266)
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
                .addGap(35, 35, 35)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String name = nameJTextField.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String selectedgender = GenderCombobox.getSelectedItem().toString();
        String email=txtEmail.getText();

        String username = useraccount.getUsername();
        //        RegisteredUser registeredUser= system.getRegisteredUserDirectory().findRegisteredUser(username);
        AmbulanceDriver ambulanceProvider=null;
       for(Organization org : enterprise.getOrganizationDirectory().getOrgList()){
           if(org.getAmbulanceDriverDir().findAmbulanceProvider(username)!= null){
               ambulanceProvider = org.getAmbulanceDriverDir().findAmbulanceProvider(username);
        ambulanceProvider.setFullName(name);
        ambulanceProvider.setAddress(address);
        ambulanceProvider.setEmail(email);
        ambulanceProvider.setZipcode(zipcode);
        ambulanceProvider.setContactNumber(contactNumber);

        JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I><font color='green'> Details Saved Successfully!! </font><></h2></html>"));
           }
       }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void populateprofile() throws ParseException {
        String username = useraccount.getUsername();
       // Doctor doctor1= enterprise.getDocDir().findDoctor(username);
        AmbulanceDriver ambulanceProvider=null;
       for(Organization org : enterprise.getOrganizationDirectory().getOrgList()){
           if(org.getAmbulanceDriverDir().findAmbulanceProvider(username)!= null){
               ambulanceProvider = org.getAmbulanceDriverDir().findAmbulanceProvider(username);
               nameJTextField.setText(ambulanceProvider.getFullName());
            txtAddress.setText(ambulanceProvider.getAddress());
            txtZipCode.setText(ambulanceProvider.getZipcode());
            txtContactNo.setText(ambulanceProvider.getContactNumber());
            GenderCombobox.setSelectedItem(ambulanceProvider.getGender());  
            txtEmail.setText(ambulanceProvider.getEmail());       
            String birthDate = ambulanceProvider.getDob();   
           }
       }
    }
}
