/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amishagupta
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private EcoSystem system;
    private JPanel userProcessContainer;
    public ManageNetworkJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer=userProcessContainer;
        populateNetworkTable();
        networkJTable.setRowHeight(25);
        networkJTable.getTableHeader().setDefaultRenderer(new HeaderColor());
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtNetworkName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        lblheadingNetwork = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setText("Network Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 273, 103, 30));

        btnSubmit.setBackground(new java.awt.Color(18, 102, 153));
        btnSubmit.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/add2.png"))); // NOI18N
        btnSubmit.setText("Add New Network");
        btnSubmit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 190, 39));

        txtNetworkName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        add(txtNetworkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 273, 181, 30));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Networks Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 85, 672, 148));

        lblheadingNetwork.setBackground(new java.awt.Color(255, 255, 255));
        lblheadingNetwork.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblheadingNetwork.setText("       Manage Network");
        add(lblheadingNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 44, 244, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String name = txtNetworkName.getText();

        Network network = system.createAndAddNetwork(name);
        network.setName(name);

        populateNetworkTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
            btnSubmit.setBackground(new java.awt.Color(18,102,153));
        btnSubmit.setContentAreaFilled(true);
        btnSubmit.setFocusPainted(true);
        btnSubmit.setBorderPainted(false);
         btnSubmit.setOpaque(true);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
             btnSubmit.setContentAreaFilled(false);
        btnSubmit.setFocusPainted(false);
        btnSubmit.setBorderPainted(true);
    }//GEN-LAST:event_btnSubmitMouseExited
  private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblheadingNetwork;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables
}
