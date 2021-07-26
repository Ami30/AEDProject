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
import Business.Pharmacist.Medicine;
import Business.Pharmacist.Pharmacist;
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
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class OrderDetailsJPanel extends javax.swing.JPanel {

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
    private OrderMedicine ordMed;
    String ifConsultationRequired;
    private ArrayList<Medicine> medicineList = new ArrayList<>();
    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
       
    public OrderDetailsJPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org, HealthRequest request, OrderMedicine ordMed) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.request = request;
        this.ordMed = ordMed;
        this.org = org;
        populateDetails();
        populateOrderTabletTable();
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
        lblOrderId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        completeOrderTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Patients Name:");

        lblAddress.setText("OrderId");

        btnSubmit.setText("Close");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPatientName.setText("jLabel1");

        lblOrderId.setText("jLabel1");

        completeOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine Name", "Quantity", "ExpiryDate"
            }
        ));
        jScrollPane1.setViewportView(completeOrderTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblAddress)
                        .addGap(56, 56, 56)
                        .addComponent(lblOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 183, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAddress)
                    .addComponent(lblPatientName)
                    .addComponent(lblOrderId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnSubmit)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 740, 350));

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
       OrderMedicineReport orderMedicine=new OrderMedicineReport(userProcessContainer,ent,userAccount,system,request, org);
       userProcessContainer.add("orderMedicine", orderMedicine);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTable completeOrderTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblOrderId;
    private javax.swing.JLabel lblPatientName;
    // End of variables declaration//GEN-END:variables

    private void populateDetails(){
        lblPatientName.setText(request.getUser().getName());
        lblOrderId.setText(ordMed.getOrderId());
    }
    public void populateOrderTabletTable() {
        DefaultTableModel model = (DefaultTableModel) completeOrderTable.getModel();
        model.setRowCount(0);
           for(Medicine om : ordMed.getMedicineDirectory().getMedicineList()){
            Object[] row = new Object[3];
            row[0] = om.getMedicineName();
            row[1] = om.getQuantity();
            row[2] = om.getExpiryDate();
            model.addRow(row);
        }
   
    }
       
    
}
