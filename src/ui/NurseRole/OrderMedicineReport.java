/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NurseRole;


import ui.DoctorRole.*;
import ui.TestingServiceRole.*;
import Business.EcoSystem;
import Business.Employee.Prescription;
import ui.TestingEntAdminRole.*;
import Business.Enterprise.Enterprise;
import Business.FoodSupplier.FoodSupplier;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Person.PersonalNotification;
import Business.Pharmacist.Medicine;
import Business.Pharmacist.Pharmacist;
import Business.RegisteredUser.DailyReportSheet;
import Business.Role.TestingServiceRole;
import Business.Tester.Tester;
import Business.Tester.Tests;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.OrderMedicine;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class OrderMedicineReport extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private Pharmacist pharmacy;
    private Organization org;
    private Tests test;
    private HealthRequest request;
    String ifConsultationRequired;
    private ArrayList<Medicine> medicineList = new ArrayList<>();
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
       
    public OrderMedicineReport(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, HealthRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.request = request;
        populateDetails();
        populateOrderTable();
        populateComboBox();
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
        btnSubmit = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblRequestNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completeOrderTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicineAvailableTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pharmacyComboBox = new javax.swing.JComboBox();
        btnViewDetails = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Patients Name:");

        lblAddress.setText("Request Number:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPatientName.setText("jLabel1");

        lblRequestNumber.setText("jLabel1");

        completeOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Pharmacy Name", "Order Date", "Status", "DeliveryMan Name"
            }
        ));
        jScrollPane1.setViewportView(completeOrderTable);

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine Name", "Expiry Date", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(cartTable);

        medicineAvailableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine Name", "Expiry Date"
            }
        ));
        jScrollPane3.setViewportView(medicineAvailableTable);

        jLabel9.setText("Select a Pharmacy:");

        jLabel10.setText("Available Medicine");

        jLabel11.setText("Cart");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Input Quantity");

        pharmacyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacyComboBoxActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pharmacyComboBox, 0, 193, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel11)
                                .addContainerGap(258, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewDetails)
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblAddress)
                                .addGap(56, 56, 56)
                                .addComponent(lblRequestNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQuantity)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSubmit)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblAddress)
                            .addComponent(lblPatientName)
                            .addComponent(lblRequestNumber))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewDetails)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pharmacyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)))
                .addGap(36, 36, 36)
                .addComponent(btnSubmit)
                .addGap(49, 49, 49))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 740, 560));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Manage Order");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 270, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        Date date = new Date();
        String nowDate = formatter.format(date);
        OrderMedicine ordMed = new OrderMedicine(nowDate,"New", null, pharmacy);
        for(Medicine med : medicineList){
            ordMed.getMedicineDirectory().addMedicineList(med);
        }
        
       medicineList.clear();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void pharmacyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacyComboBoxActionPerformed
        // TODO add your handling code here:
        pharmacyComboBox.removeAllItems();
        if(pharmacyComboBox.getItemCount()==0){
            populateComboBox();
            pharmacyComboBox.setSelectedIndex(0);
            pharmacy = (Pharmacist)pharmacyComboBox.getSelectedItem();
            populateAvailableMedicineTable();
        }
    }//GEN-LAST:event_pharmacyComboBoxActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = medicineAvailableTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
         String Quantity = txtQuantity.getText();
         Medicine med = (Medicine)medicineAvailableTable.getValueAt(selectedRow, 0);
         med.setQuantity(Quantity);
         medicineList.add(med);
         populateCartMedicineTable();
         }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
         int selectedRow = medicineAvailableTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
         OrderMedicine ordMed = (OrderMedicine)medicineAvailableTable.getValueAt(selectedRow, 0);
         OrderDetailsJPanel orderDetails=new OrderDetailsJPanel(userProcessContainer,ent,userAccount,system, request,ordMed);
            userProcessContainer.add("PatientManagerProfileJPanel", orderDetails);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
         }
            
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JTable cartTable;
    private javax.swing.JTable completeOrderTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblRequestNumber;
    private javax.swing.JTable medicineAvailableTable;
    private javax.swing.JComboBox pharmacyComboBox;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void populateDetails(){
        lblPatientName.setText(request.getUser().getName());
        lblRequestNumber.setText(request.getRequestNumber());
    }
    public void populateOrderTable() {
        DefaultTableModel model = (DefaultTableModel) completeOrderTable.getModel();
        model.setRowCount(0);
           for(OrderMedicine om : request.getOrderDirectory().getMedicineList()){
            Object[] row = new Object[5];
            row[0] = om;
            row[1] = om.getPharmacyName();
            row[2] = om.getOrderDate();
            row[3] = om.getStatus();
            row[4] = om.getDeliveryman();
            model.addRow(row);
        }
   
    }
       public void populateAvailableMedicineTable() {
         DefaultTableModel model = (DefaultTableModel) medicineAvailableTable.getModel();
        model.setRowCount(0);
        for(Medicine med : pharmacy.getMedicineDirectory().getMedicineList()){
            Object[] row = new Object[2];
            row[0] = med;
            row[1] = med.getExpiryDate();
            model.addRow(row);
        }
        }
       
       public void populateCartMedicineTable() {
         DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        for(Medicine med : medicineList){
            Object[] row = new Object[2];
            row[0] = med;
            row[1] = med.getExpiryDate();
            row[2] = med.getQuantity();
            model.addRow(row);
        }
        }
    
    public void populateComboBox(){
//        testProviderComboBox.removeAllItems();
          for(Network net: system.getNetworkList()){
            if(net.getName().equalsIgnoreCase(request.getUser().getRegisteredUserNetwork().getName())){
                   for(Enterprise ent: net.getEnterpriseDir().getEnterpriseList()){
            if(ent.getEnterpriseType().getValue().equalsIgnoreCase("Necessities Provider")){
                for(Organization org: ent.getOrganizationDirectory().getOrgList()){
                    if(org.getType().getValue().equalsIgnoreCase("Pharmacy Organization")){
                        for(Pharmacist pharmacy: org.getPharDir().getpharmacistDirectory()){
                            pharmacyComboBox.addItem(pharmacy);
                        }
                    }
                    
                    
                }
            }
        }
            }
        }
        
    }
}
