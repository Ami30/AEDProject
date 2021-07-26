/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.UserRole;


import Business.AmbulanceDriver.AmbulanceDriver;
import Business.AmbulanceDriver.AmbulanceService;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FoodSupplier.FoodSupplier;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.RegisteredUser.RegisteredUser;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ServiceRequest;
import java.awt.CardLayout;
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
public class BookAmbulanceUserJPanel extends javax.swing.JPanel {

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
       
    public BookAmbulanceUserJPanel(JPanel userProcessContainer,Enterprise ent, UserAccount userAccount, EcoSystem system, Organization org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.userAccount = userAccount;
        this.system = system;
        this.ent=ent;
        this.org = org;
        user=system.getRegisteredUserDirectory().findRegisteredUser(userAccount.getUsername());
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
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblDoctorslist1.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblDoctorslist1.setText("Ambulance Service");

        jLabel1.setText("Select an Ambulance Provider");

        jLabel2.setText("Select a Service");

        jButton1.setBackground(new java.awt.Color(18, 102, 153));
        jButton1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton1.setText("Book");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
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

        jButton2.setBackground(new java.awt.Color(18, 102, 153));
        jButton2.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ambulanceProviderComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDoctorslist1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDoctorslist1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ambulanceProviderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 570, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void ambulanceProviderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceProviderComboBoxActionPerformed
        // TODO add your handling code here:
         ambulance = (AmbulanceDriver)ambulanceProviderComboBox.getSelectedItem();
            populateServiceTable();
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
        user.getServiceRequestDirectoryAmb().addRequest(serReq);
        JOptionPane.showMessageDialog(null, "Ambulance Service booked Successfully");
        ManageAmbulanceBookingUserJPanel manageAmbulance=new ManageAmbulanceBookingUserJPanel(userProcessContainer,ent,userAccount,system,org);
        userProcessContainer.add("manageAmbulance", manageAmbulance);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
         jButton2.setBackground(new java.awt.Color(18,102,153));
        jButton2.setContentAreaFilled(true);
        jButton2.setFocusPainted(true);
        jButton2.setBorderPainted(false);
         jButton2.setOpaque(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
         jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setBorderPainted(true);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
         jButton1.setBackground(new java.awt.Color(18,102,153));
        jButton1.setContentAreaFilled(true);
        jButton1.setFocusPainted(true);
        jButton1.setBorderPainted(false);
         jButton1.setOpaque(true);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setBorderPainted(true);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ambulanceProviderComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoctorslist1;
    private javax.swing.JTable serviceTable;
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
        
            for(AmbulanceDriver ad: orgnization.getAmbulanceDriverDir().getambulanceDriverDirectory()){
                ambulanceProviderComboBox.addItem(ad);
            }
    }
    
}
