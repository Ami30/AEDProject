/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NecessitiesEntAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.GroceryStorePerson.GroceryStorePerson;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Pharmacist.Pharmacist;
import Business.Role.DeliveryManRole;
import Business.Role.PharmacistRole;
import Business.Role.StorePersonRole;
import Business.Validation.Validations;
import java.awt.Component;
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
    private EcoSystem system;
    
    public ManageNeccessEntEmpJPanel(EcoSystem system,JPanel userProcessContainer,OrganizationDirectory organizationDir,Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.ent=ent;
        this.system=system;
        populateOrganizationComboBox();
      //  populateOrganizationEmpComboBox();
        populateDeliveryManTable();
        populatePharmacistTable();
       // populateGroceryPersonTable();
        organizationPharmacistJTable.setRowHeight(25);
        organizationPharmacistJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
        organizationDeliveryManJTable1.setRowHeight(25);
        organizationDeliveryManJTable1.getTableHeader().setDefaultRenderer(new HeaderColor());
//        organizationGroceryManJTable2.setRowHeight(25);
//        organizationGroceryManJTable2.getTableHeader().setDefaultRenderer(new HeaderColor());
        
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
     
//      private void populateGroceryPersonTable(){
//        DefaultTableModel model = (DefaultTableModel) organizationGroceryManJTable2.getModel();
//        
//        model.setRowCount(0);
//        for(Organization org:organizationDir.getOrgList()){
//           
//        for (GroceryStorePerson gr : org.getGrocPerDir().getgroceryPersonDirectory()){
//            Object[] row = new Object[6];
//            row[0] = gr;  
//            row[1] = gr.getFullName();          
//            row[2] = gr.getAddress();
//            row[3] = gr.getZipcode();
//            row[4] = gr.getContactNumber();
//            row[5] = gr.getEmail();
//            model.addRow(row);
//        }
//           
//        }
//    }

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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        btnRemoveDeliveryMan.setBackground(new java.awt.Color(18, 102, 153));
        btnRemoveDeliveryMan.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemoveDeliveryMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/delete2.png"))); // NOI18N
        btnRemoveDeliveryMan.setText("Remove Delivery Man");
        btnRemoveDeliveryMan.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemoveDeliveryMan.setContentAreaFilled(false);
        btnRemoveDeliveryMan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoveDeliveryManMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoveDeliveryManMouseExited(evt);
            }
        });
        btnRemoveDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDeliveryManActionPerformed(evt);
            }
        });

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Pharmacist");

        btnRemovePharmacist.setBackground(new java.awt.Color(18, 102, 153));
        btnRemovePharmacist.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnRemovePharmacist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/delete2.png"))); // NOI18N
        btnRemovePharmacist.setText("Remove Pharmacist");
        btnRemovePharmacist.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRemovePharmacist.setContentAreaFilled(false);
        btnRemovePharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemovePharmacistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemovePharmacistMouseExited(evt);
            }
        });
        btnRemovePharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePharmacistActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblContactNo.setText("Contact Number");

        jLabel2.setText("Name");

        addJButton.setBackground(new java.awt.Color(18, 102, 153));
        addJButton.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/add2.png"))); // NOI18N
        addJButton.setText("Create Employee");
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
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(lblContactNo1)
                    .addComponent(jLabel10))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEmail)
                                .addGap(18, 18, 18)
                                .addComponent(lblContactNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAddress)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lblZipCode)
                                .addGap(18, 18, 18)
                                .addComponent(txtZipCode))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtpassword)))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
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
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactNo1)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(GenderCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(433, 433, 433)
                                .addComponent(lblDoctorslist1))
                            .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblnurselist)
                                .addGap(180, 180, 180)
                                .addComponent(btnRemovePharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(737, 737, 737)
                            .addComponent(btnRemoveDeliveryMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoctorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemovePharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblnurselist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NurseScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 0, 1000, 730));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Validations validation=new Validations();
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
        
              if(name.equals("")||address.equals("")||email.equals("")||zipcode.equals("")||contactNumber.equals("")||username.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Error!", JOptionPane.ERROR_MESSAGE);
             return;
        }
        Boolean unique=system.checkIfUserIsUnique(username);
        if(!unique){
            JOptionPane.showMessageDialog(null, "Username " + username + " already exists. Please try with different username", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!validation.isValidPassword(password)){
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
         // populateGroceryPersonTable();
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

    private void btnRemovePharmacistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemovePharmacistMouseEntered
        // TODO add your handling code here:
            btnRemovePharmacist.setBackground(new java.awt.Color(18,102,153));
        btnRemovePharmacist.setContentAreaFilled(true);
        btnRemovePharmacist.setFocusPainted(true);
        btnRemovePharmacist.setBorderPainted(false);
        btnRemovePharmacist.setOpaque(true);
    }//GEN-LAST:event_btnRemovePharmacistMouseEntered

    private void btnRemovePharmacistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemovePharmacistMouseExited
        // TODO add your handling code here:
         btnRemovePharmacist.setContentAreaFilled(false);
        btnRemovePharmacist.setFocusPainted(false);
        btnRemovePharmacist.setBorderPainted(true);
    }//GEN-LAST:event_btnRemovePharmacistMouseExited

    private void btnRemoveDeliveryManMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveDeliveryManMouseEntered
        // TODO add your handling code here:
            btnRemoveDeliveryMan.setBackground(new java.awt.Color(18,102,153));
        btnRemoveDeliveryMan.setContentAreaFilled(true);
        btnRemoveDeliveryMan.setFocusPainted(true);
        btnRemoveDeliveryMan.setBorderPainted(false);
        btnRemoveDeliveryMan.setOpaque(true);
    }//GEN-LAST:event_btnRemoveDeliveryManMouseEntered

    private void btnRemoveDeliveryManMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveDeliveryManMouseExited
        // TODO add your handling code here:
         btnRemoveDeliveryMan.setContentAreaFilled(false);
        btnRemoveDeliveryMan.setFocusPainted(false);
        btnRemoveDeliveryMan.setBorderPainted(true);
    }//GEN-LAST:event_btnRemoveDeliveryManMouseExited

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
    private javax.swing.JScrollPane DoctorScrollPane;
    private javax.swing.JComboBox GenderCombobox;
    private javax.swing.JScrollPane NurseScrollPane;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnRemoveDeliveryMan;
    private javax.swing.JButton btnRemovePharmacist;
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
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationDeliveryManJTable1;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JTable organizationPharmacistJTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}
