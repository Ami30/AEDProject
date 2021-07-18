/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Validation.Validations;
import Business.Network.Network;
import Business.Role.FoodSupplyEntAdminRole;
import Business.Role.HospitalEntAdminRole;
import Business.Role.NecessitiesEntAdminRole;
import Business.Role.PatientSupportEntAdminRole;
import Business.Role.SanitizationEntAdminRole;
import Business.Role.TestingEntAdminRole;
import Business.Role.TransportationEntAdminRole;
import Business.UserAccount.UserAccount;
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
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */private JPanel userProcessContainer;
    private EcoSystem system;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
        populateNetworkComboBox();
        enterpriseJTable.setRowHeight(25);
        enterpriseJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
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

        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setSelectionBackground(new java.awt.Color(235, 227, 126));
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel5.setText("Name");

        jLabel1.setText("Network");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Username");

        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel6.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabel6.setText("Manage Enterprise Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkJComboBox, 0, 136, Short.MAX_VALUE)
                                    .addComponent(enterpriseJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(52, 52, 52)
                                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(52, 52, 52)
                                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(submitJButton)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(submitJButton)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDir().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDir().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDir().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        Validations validation = new Validations();
        if(!validation.isValidPassword(password)){
            return;
        }
        Boolean unique=system.checkIfUserIsUnique(username);
        if(!unique){
            JOptionPane.showMessageDialog(null, "Username" + username + " already exists. Please try with different username", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        Employee employee = enterprise.getEmpDir().createEmp(name);
        if(enterprise.getEnterpriseType()!=null){
            if(enterprise.getEnterpriseType().toString().equals("Hospital"))
            {
                UserAccount account=new UserAccount(username, password, name, new HospitalEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                JOptionPane.showMessageDialog(null, "User Account created successfully");
                
                //enterprise.getUserAccountDir().addUserAccount(account);
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new HospitalEntAdminRole());
            }
            else if(enterprise.getEnterpriseType().toString().equals("Food Supplying Units")){
                 UserAccount account=new UserAccount(username, password, name,  new FoodSupplyEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new FoodSupplyEntAdminRole());
                
            }
            else if(enterprise.getEnterpriseType().toString().equals("Transpotation")){
                 UserAccount account=new UserAccount(username, password, name,  new TransportationEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new TransportationEntAdminRole());
                
            }
            else if(enterprise.getEnterpriseType().toString().equals("Sanitization Units")){
                 UserAccount account=new UserAccount(username, password, name, new SanitizationEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new SanitizationEntAdminRole());
                
            }
            else if(enterprise.getEnterpriseType().toString().equals("Testing Units")){
                 UserAccount account=new UserAccount(username, password, name,  new TestingEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new TestingEntAdminRole());
                
            }
            else if(enterprise.getEnterpriseType().toString().equals("Patient Support Services")){
                 UserAccount account=new UserAccount(username, password, name,  new PatientSupportEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
               // UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new PatientSupportEntAdminRole());
                
            }
            else if(enterprise.getEnterpriseType().toString().equals("Necessities Provider")){
                 UserAccount account=new UserAccount(username, password, name,  new NecessitiesEntAdminRole());
                enterprise.getUserAccountDir().addUserAccount(account);
                 JOptionPane.showMessageDialog(null, "User Account created successfully");
              //  UserAccount account = enterprise.getUserAccountDir().createUserAccount(username, password, employee, new NecessitiesEntAdminRole());
                
            }
            
                    
        
        }
        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
