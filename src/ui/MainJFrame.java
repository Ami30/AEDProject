/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author amishagupta
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Organization inOrg;
    UserAccount ua;
    Enterprise inEnterprise;   
    Network network;
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        EcoSystem.setInstance(system);
        this.setSize(1680, 1050);
        this.containerJPanel.setVisible(false);
        this.exitJPanel.setVisible(false);
        this.mainScreenJPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerJPanel = new javax.swing.JPanel();
        mainScreenJPanel = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        exitJPanel = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 25, 0, 0));
        setMinimumSize(new java.awt.Dimension(1420, 961));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerJPanel.setPreferredSize(new java.awt.Dimension(1338, 840));
        containerJPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(containerJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 81, 1420, 880));
        containerJPanel.getAccessibleContext().setAccessibleName("");

        mainScreenJPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainScreenJPanel.setPreferredSize(new java.awt.Dimension(1680, 1050));
        mainScreenJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        lblLogin.setText("                   WELCOME");
        mainScreenJPanel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 89, 313, 35));

        lblUsername.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lblUsername.setText("Enter Username");
        mainScreenJPanel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 158, 133, 28));

        lblpassword.setBackground(new java.awt.Color(255, 255, 255));
        lblpassword.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        lblpassword.setText("Enter Password");
        mainScreenJPanel.add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 192, 120, 32));
        mainScreenJPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 162, 123, -1));
        mainScreenJPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 198, 123, -1));

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        mainScreenJPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 263, -1, -1));

        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        mainScreenJPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 263, -1, -1));

        getContentPane().add(mainScreenJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1050));

        exitJPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitJPanel.setPreferredSize(new java.awt.Dimension(1420, 80));
        exitJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        lblWelcome.setText("HELLO ADMIN");
        exitJPanel.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 480, 60));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        exitJPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        getContentPane().add(exitJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
          // Get user name
        String userName = txtUsername.getText();
        String welcomemsg = "Hi";
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDir().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDir().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDir().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrgList()) {
                            userAccount = organization.getUserAccountDir().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            mainScreenJPanel.setVisible(false);
            containerJPanel.setVisible(true);
            exitJPanel.setVisible(true);
           welcomemsg=welcomemsg+ " " + userAccount.getEmployee().getName();
            
            CardLayout layout = (CardLayout) containerJPanel.getLayout();
            containerJPanel.add("workArea", userAccount.getRole().createWorkArea(containerJPanel, userAccount, inOrganization, inEnterprise, system));
           lblWelcome.setText(welcomemsg);
            layout.next(containerJPanel);
        }
      
        txtPassword.setText("");
        txtUsername.setText("");
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        containerJPanel.removeAll();
        dB4OUtil.storeSystem(system);
        containerJPanel.setVisible(false);
        mainScreenJPanel.setVisible(true);     
        exitJPanel.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        UserRegistrationJPanel panel = new UserRegistrationJPanel(containerJPanel, system);
        lblWelcome.setText("WELCOME TO PATIENT REGISTRATION!!!");
        mainScreenJPanel.setVisible(false);
        containerJPanel.setVisible(true);
        exitJPanel.setVisible(true);
        containerJPanel.add("workArea", panel);
        CardLayout layout = (CardLayout) containerJPanel.getLayout();
        layout.next(containerJPanel);
    }//GEN-LAST:event_btnRegisterActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel containerJPanel;
    private javax.swing.JPanel exitJPanel;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JPanel mainScreenJPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
