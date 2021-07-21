/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NurseRole;


import Business.AmbulanceDriver.AmbulanceDriver;
import Business.AmbulanceDriver.AmbulanceService;
import ui.AmbulanceServiceRole.*;
import ui.FoodServiceRole.*;
import ui.SanitizationServiceRole.*;
import ui.TestingServiceRole.*;
import Business.EcoSystem;
import ui.TestingEntAdminRole.*;
import Business.Enterprise.Enterprise;
import Business.FoodSupplier.FoodSupplier;
import Business.FoodSupplier.FoodPackage;
import Business.Network.Network;
import Business.Nurse.Nurse;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RegisteredUser.RegisteredUser;
import Business.Role.TestingServiceRole;
import Business.SanitizationPerson.SanitizationPerson;
import Business.SanitizationPerson.SanitizationService;
import Business.Tester.Tester;
import Business.Tester.Tests;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.ServiceRequest;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class BookAmbulanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmpJPanel
     */
    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    private UserAccount userAccount;
    private EcoSystem system;
    private FoodSupplier foodProvider;
    private Organization org;
    private AmbulanceDriver ambulance;
    private RegisteredUser user;
    private Nurse nurse;
       
    public BookAmbulanceJPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        nurse=org.getNurDir().findNurse(userAccount.getUsername());
        UserComboBox();
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

    private void populateServiceTable(){
        DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
        
        model.setRowCount(0);
        for (AmbulanceService ambService : ambulance.getAmbulanceServiceDirectory().getAmbulanceServiceList()){          
            Object[] row = new Object[2];
            row[0] = ambService;
            row[1] = ambService.getServiceType();
            model.addRow(row);
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
        lblDoctorslist1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        ambulanceProviderComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        userComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Ambulance Service");

        jLabel1.setText("Select an Ambulance Provider");

        jLabel2.setText("Select a Service");

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Service Name", "Service Type"
            }
        ));
        jScrollPane2.setViewportView(serviceTable);

        ambulanceProviderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceProviderComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Select a Patient first");

        userComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(userComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ambulanceProviderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDoctorslist1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ambulanceProviderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addGap(163, 163, 163))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void ambulanceProviderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceProviderComboBoxActionPerformed
        // TODO add your handling code here:
          ambulanceProviderComboBox.removeAllItems();
        if(ambulanceProviderComboBox.getItemCount()==0){
            populateComboBox();
            ambulanceProviderComboBox.setSelectedIndex(0);
            ambulance = (AmbulanceDriver)ambulanceProviderComboBox.getSelectedItem();
            populateServiceTable();
        }
    }//GEN-LAST:event_ambulanceProviderComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = serviceTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        AmbulanceService ambService=(AmbulanceService)serviceTable.getValueAt(row, 0);
        ServiceRequest serReq = new ServiceRequest(ambService.getServiceName(), ambService.getServiceType(), user, null, null,"New");
        ambulance.getServiceRequestDirectory().addRequest(serReq);
        nurse.getServicerequestDirectory().addRequest(serReq);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void userComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userComboBoxActionPerformed
        // TODO add your handling code here:
         userComboBox.removeAllItems();
        if(userComboBox.getItemCount()==0){
            populateComboBox();
            userComboBox.setSelectedIndex(0);
            user = (RegisteredUser)userComboBox.getSelectedItem();
        }
    }//GEN-LAST:event_userComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ambulanceProviderComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTable serviceTable;
    private javax.swing.JComboBox<String> userComboBox;
    // End of variables declaration//GEN-END:variables
    public void populateComboBox(){
        
        Organization orgnization = null;
        for(Network net: system.getNetworkList()){
         for(Enterprise ent: net.getEnterpriseDir().getEnterpriseList()){
             for(Organization org: ent.getOrganizationDirectory().getOrgList()){
                if(org.getType().getValue().equalsIgnoreCase("Ambulance Provider Organization")){
                    orgnization = org;
                }
            }
         }
    }
        
        
        if(orgnization.getAmbulanceDriverDir().getambulanceDriverDirectory()!=null){
            for(AmbulanceDriver ad: orgnization.getAmbulanceDriverDir().getambulanceDriverDirectory()){
                ambulanceProviderComboBox.addItem(ad);
            }
        }            
    }
    
     public void UserComboBox(){
         
         ArrayList<HealthRequest> requestList = nurse.getRequestDirectory().getRequestList();
         for(HealthRequest req: requestList){
                ambulanceProviderComboBox.addItem(req.getUser());
            }
    }
}
