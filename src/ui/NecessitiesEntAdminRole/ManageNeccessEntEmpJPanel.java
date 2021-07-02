/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NecessitiesEntAdminRole;

import Business.DeliveryMan.DeliveryMan;
import ui.HospitalEntAdminRole.*;
import Business.Doctor.Doctor;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.GroceryStorePerson.GroceryStorePerson;
import Business.Nurse.Nurse;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Pharmacist.Pharmacist;
import Business.Role.DeliveryManRole;
import Business.Role.PharmacistRole;
import Business.Role.StorePersonRole;
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
public class ManageNeccessEntEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    
    public ManageNeccessEntEmpJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.ent=ent;

        populateOrganizationComboBox();
      //  populateOrganizationEmpComboBox();
        populateDeliveryManTable();
        populatePharmacistTable();
        populateGroceryPersonTable();
        organizationPharmacistJTable.setRowHeight(25);
        organizationPharmacistJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        organizationDeliveryManJTable1.setRowHeight(25);
        organizationDeliveryManJTable1.getTableHeader().setDefaultRenderer(new HeaderColor());
        organizationGroceryManJTable2.setRowHeight(25);
        organizationGroceryManJTable2.getTableHeader().setDefaultRenderer(new HeaderColor());
        
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
    
//    public void populateOrganizationEmpComboBox(){
//        organizationEmpJComboBox.removeAllItems();
//        
//        for (Organization organization : organizationDir.getOrgList()){
//            organizationEmpJComboBox.addItem(organization);
//        }
//    }

    private void populateDeliveryManTable(){
        DefaultTableModel model = (DefaultTableModel) organizationDeliveryManJTable1.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
            
        for (DeliveryMan del : org.getDelManDir().getdeliveryManDirectory()){
            Object[] row = new Object[6];
            row[0] = del;
            row[1] = del.getFullName();          
            row[2] = del.getAddress();
            row[3] = del.getZipcode();
            row[4] = del.getContactNumber();
            row[5] = del.getEmail();
            model.addRow(row);
        }
            
        }
    }
     private void populatePharmacistTable(){
        DefaultTableModel model = (DefaultTableModel) organizationPharmacistJTable.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
            
        for (Pharmacist ph : org.getPharDir().getpharmacistDirectory()){
            Object[] row = new Object[6];
            row[0] = ph;  
            row[1] = ph.getFullName();          
            row[2] = ph.getAddress();
            row[3] = ph.getZipcode();
            row[4] = ph.getContactNumber();
            row[5] = ph.getEmail();
            model.addRow(row);
        }
        
        }
    }
     
      private void populateGroceryPersonTable(){
        DefaultTableModel model = (DefaultTableModel) organizationGroceryManJTable2.getModel();
        
        model.setRowCount(0);
        for(Organization org:organizationDir.getOrgList()){
           
        for (GroceryStorePerson gr : org.getGrocPerDir().getgroceryPersonDirectory()){
            Object[] row = new Object[6];
            row[0] = gr;  
            row[1] = gr.getFullName();          
            row[2] = gr.getAddress();
            row[3] = gr.getZipcode();
            row[4] = gr.getContactNumber();
            row[5] = gr.getEmail();
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
        organizationPharmacistJTable = new javax.swing.JTable();
        NurseScrollPane = new javax.swing.JScrollPane();
        organizationDeliveryManJTable1 = new javax.swing.JTable();
        btnRemoveDeliveryMan = new javax.swing.JButton();
        lblDoctorslist1 = new javax.swing.JLabel();
        btnRemovePharmacist = new javax.swing.JButton();
        lblnurselist1 = new javax.swing.JLabel();
        NurseScrollPane1 = new javax.swing.JScrollPane();
        organizationGroceryManJTable2 = new javax.swing.JTable();
        btnRemoveStorePerson = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtAddress = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        lblContactNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        GenderCombobox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnurselist.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblnurselist.setText("Delivery Man");

        organizationPharmacistJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        organizationPharmacistJTable.setRequestFocusEnabled(false);
        organizationPharmacistJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        DoctorScrollPane.setViewportView(organizationPharmacistJTable);

        organizationDeliveryManJTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        organizationDeliveryManJTable1.setRequestFocusEnabled(false);
        organizationDeliveryManJTable1.setSelectionBackground(new java.awt.Color(235, 227, 126));
        NurseScrollPane.setViewportView(organizationDeliveryManJTable1);

        btnRemoveDeliveryMan.setText("Remove Delivery Man");
        btnRemoveDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDeliveryManActionPerformed(evt);
            }
        });

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Pharmacist");

        btnRemovePharmacist.setText("Remove Pharmacist");
        btnRemovePharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePharmacistActionPerformed(evt);
            }
        });

        lblnurselist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblnurselist1.setText("Grocery Store Persons");

        organizationGroceryManJTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        organizationGroceryManJTable2.setRequestFocusEnabled(false);
        organizationGroceryManJTable2.setSelectionBackground(new java.awt.Color(235, 227, 126));
        NurseScrollPane1.setViewportView(organizationGroceryManJTable2);

        btnRemoveStorePerson.setText("Remove Store Person");
        btnRemoveStorePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStorePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NurseScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblnurselist)
                                .addGap(223, 223, 223)
                                .addComponent(btnRemoveDeliveryMan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(433, 433, 433)
                                .addComponent(lblDoctorslist1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemovePharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblnurselist1)
                        .addGap(178, 178, 178)
                        .addComponent(btnRemoveStorePerson)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorslist1)
                    .addComponent(btnRemovePharmacist))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnurselist)
                    .addComponent(btnRemoveDeliveryMan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnurselist1)
                    .addComponent(btnRemoveStorePerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NurseScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lblAddress.setText("Address");

        jLabel3.setText("Organization");

        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });

        lblZipCode.setText("Zip Code");

        lblContactNo1.setText("Email");

        jLabel10.setText("Gender:");

        GenderCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        GenderCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel4.setText("Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipCode)
                    .addComponent(lblContactNo)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtZipCode)
                            .addComponent(txtContactNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblContactNo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblAddress)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(addJButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(txtpassword))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addContainerGap(264, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(addJButton)
                .addGap(16, 16, 16))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, 240));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        String address=txtAddress.getText();
        String zipcode=txtZipCode.getText();
        String contactNumber=txtContactNo.getText();
        String gender = (String) GenderCombobox.getSelectedItem();
        String email=txtEmail.getText();
         String username = txtuserName.getText();
        char[] passwordCharArray = txtpassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(organization.getType().getValue().equals("Delivery Provider Organization")){
          DeliveryMan del=new DeliveryMan(null, name, null, gender, address, zipcode, contactNumber, email,username,password, new DeliveryManRole());
          organization.getDelManDir().adddeliveryMan(del);
          organization.getUserAccountDir().addUserAccount(del);
        //  organization.getEmpDir().createEmp(name);
          populateDeliveryManTable();
        }
        if(organization.getType().getValue().equals("Pharmacy Organization")){
         Pharmacist ph=new Pharmacist(name, null, gender, address, zipcode, contactNumber, email,username,password, new PharmacistRole());
          organization.getPharDir().addpharmacist(ph);
          organization.getUserAccountDir().addUserAccount(ph);
          //organization.getEmpDir().createEmp(name);
          populatePharmacistTable();
        }
        if(organization.getType().getValue().equals("Grocery Store Organization")){
         GroceryStorePerson groc=new GroceryStorePerson(name, null, gender, address, zipcode, contactNumber, email,username,password, new StorePersonRole());
          organization.getGrocPerDir().addgroceryPerson(groc);
          organization.getUserAccountDir().addUserAccount(groc);
          //organization.getEmpDir().createEmp(name);
          populateGroceryPersonTable();
        }
        

    }//GEN-LAST:event_addJButtonActionPerformed

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

    private void GenderComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboboxActionPerformed

    private void btnRemovePharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePharmacistActionPerformed
        // TODO add your handling code here:
        int row = organizationPharmacistJTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pharmacist ph=(Pharmacist)organizationPharmacistJTable.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getPharDir().removepharmacist(ph);
           if(success){
               o.getEmpDir().removeEmpByName(ph.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(ph.getFullName());
           }
       }      
        
//        for(Organization o:organizationDir.getOrgList())
//        {
//            //o.getEmpDir().removeEmp(e);
//            o.getDocDir().removeDoctor(d);
//        }
       

        populatePharmacistTable();
    }//GEN-LAST:event_btnRemovePharmacistActionPerformed

    private void btnRemoveDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDeliveryManActionPerformed
        // TODO add your handling code here:
          int row = organizationDeliveryManJTable1.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DeliveryMan d=(DeliveryMan)organizationDeliveryManJTable1.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getDelManDir().removedeliveryMan(d);
           if(success){
               o.getEmpDir().removeEmpByName(d.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(d.getFullName());
           }
       }      
        populateDeliveryManTable();
    
        
    }//GEN-LAST:event_btnRemoveDeliveryManActionPerformed

    private void btnRemoveStorePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStorePersonActionPerformed
        // TODO add your handling code here:
          int row = organizationGroceryManJTable2.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        GroceryStorePerson groc=(GroceryStorePerson)organizationGroceryManJTable2.getValueAt(row, 0);
        
       for(int i=0;i<organizationDir.getOrgList().size();i++){
           Organization o= organizationDir.getOrgList().get(i);
           Boolean success=o.getGrocPerDir().removegroceryPerson(groc);
           if(success){
               o.getEmpDir().removeEmpByName(groc.getFullName());
               o.getUserAccountDir().removeUserAccountByUserName(groc.getFullName());
           }
       }      
        populateDeliveryManTable();
    }//GEN-LAST:event_btnRemoveStorePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JScrollPane NurseScrollPane;
    private javax.swing.JScrollPane NurseScrollPane1;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnRemoveDeliveryMan;
    private javax.swing.JButton btnRemovePharmacist;
    private javax.swing.JButton btnRemoveStorePerson;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblnurselist;
    private javax.swing.JLabel lblnurselist1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationDeliveryManJTable1;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationGroceryManJTable2;
    private javax.swing.JTable organizationPharmacistJTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}
