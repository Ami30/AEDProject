/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalEntAdminRole;

import Business.Doctor.Doctor;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Nurse.Nurse;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class ManageHospEntEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private ArrayList<String> gender;
    
    public ManageHospEntEmpJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.ent=ent;

        this.gender=new ArrayList<>();
     
        gender.add(new String("MALE"));
        gender.add(new String("FEMALE"));
        gender.add(new String("OTHERS"));
        GenderCombobox.removeAllItems();
        
        for(String g:gender)
        {
            GenderCombobox.addItem(g);
        }
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        populateDoctorTable();
        populateNurseTable();
         organizationDoctorJTable.setRowHeight(25);
        organizationDoctorJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
         organizationNurseJTable1.setRowHeight(25);
        organizationNurseJTable1.getTableHeader().setDefaultRenderer(new HeaderColor());
        
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
     public void populateOrganizationComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrgList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrgList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateDoctorTable(){
        DefaultTableModel model = (DefaultTableModel) organizationDoctorJTable.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
        for (Doctor doc : org.getDocDir().getdoctorDirectory()){
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getFullName();          
            row[2] = doc.getAddress();
            row[3] = doc.getZipcode();
            row[4] = doc.getContactNumber();
            row[5] = doc.getEmail();
            model.addRow(row);
        }
        }
    }
     private void populateNurseTable(){
        DefaultTableModel model = (DefaultTableModel) organizationNurseJTable1.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
        for (Nurse nur : org.getNurDir().getnurseDirectory()){
            Object[] row = new Object[6];
            row[0] = nur;  
            row[1] = nur.getFullName();          
            row[2] = nur.getAddress();
            row[3] = nur.getZipcode();
            row[4] = nur.getContactNumber();
            row[5] = nur.getEmail();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        lblnurselist = new javax.swing.JLabel();
        DoctorScrollPane = new javax.swing.JScrollPane();
        organizationDoctorJTable = new javax.swing.JTable();
        NurseScrollPane = new javax.swing.JScrollPane();
        organizationNurseJTable1 = new javax.swing.JTable();
        btnRemoveNurse = new javax.swing.JButton();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnRemoveDoctor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtAddress = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        lblContactNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        txtDegree = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtExperience = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblExperience = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GenderCombobox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnurselist.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblnurselist.setText("Nurses");

        organizationDoctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "ZipCode", "Contact Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationDoctorJTable.setRequestFocusEnabled(false);
        organizationDoctorJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(organizationDoctorJTable);

        organizationNurseJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "ZipCode", "Contact Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationNurseJTable1.setRequestFocusEnabled(false);
        organizationNurseJTable1.setSelectionBackground(new java.awt.Color(235, 227, 126));
        NurseScrollPane.setViewportView(organizationNurseJTable1);

        btnRemoveNurse.setText("Remove Nurse");
        btnRemoveNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveNurseActionPerformed(evt);
            }
        });

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Doctors");

        btnRemoveDoctor.setText("Remove Doctor");
        btnRemoveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(lblDoctorslist1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(lblnurselist))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRemoveNurse)
                        .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemoveDoctor)
                        .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblnurselist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveNurse)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblContactNo.setText("Contact Number");

        jLabel2.setText("Name");

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        txtDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDegreeActionPerformed(evt);
            }
        });

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienceActionPerformed(evt);
            }
        });

        lblAddress.setText("Address");

        lblExperience.setText("Years of Experience");

        jLabel4.setText("Degree");

        jLabel3.setText("Organization");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblZipCode.setText("Zip Code");

        lblContactNo1.setText("Email");

        jLabel10.setText("Gender:");

        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblContactNo)
                    .addComponent(lblExperience)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addJButton)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameJTextField)
                            .addComponent(txtZipCode)
                            .addComponent(txtContactNo)
                            .addComponent(txtExperience, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblAddress)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(29, 29, 29)
                                    .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblContactNo1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(25, 25, 25)
                                .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblZipCode)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNo)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNo1)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblExperience)
                            .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(addJButton)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        String degree=txtDegree.getText();
        String yearsExp=txtExperience.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String gender = (String) GenderCombobox.getSelectedItem();
        String email=txtEmail.getText();
        if(organization.toString().equals("Doctor Organization")){
          Doctor doc=new Doctor(degree, ent.getName(), null, yearsExp, name, null, gender, address, zipcode, contactNumber, email,null);
          organization.getDocDir().addDoctor(doc);
          organization.getEmpDir().createEmp(name);
          populateDoctorTable();
        }
        if(organization.toString().equals("Nurse Organization")){
         Nurse nur=new Nurse(degree, ent.getName(), null, yearsExp, null, null, name, null, gender, address, zipcode, contactNumber, email,null);
          organization.getNurDir().addNurse(nur);
          organization.getEmpDir().createEmp(name);
          populateNurseTable();
        }
       
        

    }//GEN-LAST:event_addJButtonActionPerformed

    private void txtDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDegreeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienceActionPerformed

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void btnRemoveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDoctorActionPerformed
        // TODO add your handling code here:
        int row = organizationDoctorJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor d=(Doctor)organizationDoctorJTable.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getDocDir().removeDoctor(d);
           if(success){
               o.getEmpDir().removeEmpByName(d.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(d.getFullName());
           }
       }      
        
//        for(Organization o:organizationDir.getOrgList())
//        {
//            //o.getEmpDir().removeEmp(e);
//            o.getDocDir().removeDoctor(d);
//        }
       

        populateDoctorTable();
    }//GEN-LAST:event_btnRemoveDoctorActionPerformed

    private void btnRemoveNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveNurseActionPerformed
        // TODO add your handling code here:
          int row = organizationNurseJTable1.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Nurse n=(Nurse)organizationNurseJTable1.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getNurDir().removeNurse(n);
           if(success){
               o.getEmpDir().removeEmpByName(n.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(n.getFullName());
           }
       }      
        populateNurseTable();
    
        
    }//GEN-LAST:event_btnRemoveNurseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JScrollPane NurseScrollPane;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnRemoveDoctor;
    private javax.swing.JButton btnRemoveNurse;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblnurselist;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationDoctorJTable;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationNurseJTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}