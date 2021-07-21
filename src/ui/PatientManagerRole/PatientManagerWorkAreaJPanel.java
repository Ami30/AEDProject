/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientManagerRole;

import ui.UserRole.*;
import ui.TestingEntAdminRole.*;
import ui.FoodSupplyEntAdminRole.*;
import ui.SanitizationEntAdminRole.*;
import ui.PatientSupportEntAdminRole.*;
import ui.HospitalEntAdminRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import ui.NurseRole.ManageSanitizationJPanel;

/**
 *
 * @author amishagupta
 */

public class PatientManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalEntAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount useraccount;
    Organization org;
    EcoSystem system;
    public PatientManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.org=org;
        this.system=system;
    }

    
     void setColor(JPanel panel){
        panel.setBackground(new Color(130,175,203));
    }
    
    void resetColor(JPanel panel){
         panel.setBackground(new Color(18,102,153));
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
        btnAmbulance_JPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAmbulance = new javax.swing.JLabel();
        btnProfile_Panel = new javax.swing.JPanel();
        btnProfile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAllRequest_JPanel = new javax.swing.JPanel();
        btnAllRequests = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDoctor_JPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDoctor = new javax.swing.JLabel();
        btnFoodService_JPanel = new javax.swing.JPanel();
        btnFoodService = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSaniService_JPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSaniService = new javax.swing.JLabel();
        btnNurse_JPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnNurse1 = new javax.swing.JLabel();
        btnAssignedRequest_JPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnAssignedRequest = new javax.swing.JLabel();
        btnNotifications_JPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnNotification = new javax.swing.JLabel();
        workAreaJPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 102, 153));

        btnAmbulance_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnAmbulance_JPanel.setToolTipText("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/ambulance.png"))); // NOI18N

        btnAmbulance.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAmbulance.setForeground(new java.awt.Color(255, 255, 255));
        btnAmbulance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAmbulance.setText("Manage Ambulance Booking");
        btnAmbulance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAmbulanceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAmbulance_JPanelLayout = new javax.swing.GroupLayout(btnAmbulance_JPanel);
        btnAmbulance_JPanel.setLayout(btnAmbulance_JPanelLayout);
        btnAmbulance_JPanelLayout.setHorizontalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnAmbulance_JPanelLayout.setVerticalGroup(
            btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAmbulance_JPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(btnAmbulance_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnProfile_Panel.setBackground(new java.awt.Color(130, 175, 203));
        btnProfile_Panel.setToolTipText("");

        btnProfile.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProfile.setText("Manage Profile");
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProfileMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/userp.png"))); // NOI18N

        javax.swing.GroupLayout btnProfile_PanelLayout = new javax.swing.GroupLayout(btnProfile_Panel);
        btnProfile_Panel.setLayout(btnProfile_PanelLayout);
        btnProfile_PanelLayout.setHorizontalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProfile_PanelLayout.setVerticalGroup(
            btnProfile_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProfile_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnAllRequest_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnAllRequest_JPanel.setToolTipText("");
        btnAllRequest_JPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAllRequest_JPanelMousePressed(evt);
            }
        });

        btnAllRequests.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAllRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnAllRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAllRequests.setText("View All Requests");
        btnAllRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAllRequestsMousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/requests.png"))); // NOI18N

        javax.swing.GroupLayout btnAllRequest_JPanelLayout = new javax.swing.GroupLayout(btnAllRequest_JPanel);
        btnAllRequest_JPanel.setLayout(btnAllRequest_JPanelLayout);
        btnAllRequest_JPanelLayout.setHorizontalGroup(
            btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAllRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAllRequests)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAllRequest_JPanelLayout.setVerticalGroup(
            btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAllRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAllRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnDoctor_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnDoctor_JPanel.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/doc1.png"))); // NOI18N

        btnDoctor.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDoctor.setText("Assign Doctor");
        btnDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDoctorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnDoctor_JPanelLayout = new javax.swing.GroupLayout(btnDoctor_JPanel);
        btnDoctor_JPanel.setLayout(btnDoctor_JPanelLayout);
        btnDoctor_JPanelLayout.setHorizontalGroup(
            btnDoctor_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDoctor_JPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoctor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDoctor_JPanelLayout.setVerticalGroup(
            btnDoctor_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDoctor_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnDoctor_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnFoodService_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnFoodService_JPanel.setToolTipText("");

        btnFoodService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnFoodService.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFoodService.setText("Manage Food");
        btnFoodService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFoodServiceMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/rest.png"))); // NOI18N

        javax.swing.GroupLayout btnFoodService_JPanelLayout = new javax.swing.GroupLayout(btnFoodService_JPanel);
        btnFoodService_JPanel.setLayout(btnFoodService_JPanelLayout);
        btnFoodService_JPanelLayout.setHorizontalGroup(
            btnFoodService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFoodService_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFoodService)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFoodService_JPanelLayout.setVerticalGroup(
            btnFoodService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFoodService_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnFoodService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnFoodService_JPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnFoodService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnSaniService_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnSaniService_JPanel.setToolTipText("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/spray1.png"))); // NOI18N

        btnSaniService.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnSaniService.setForeground(new java.awt.Color(255, 255, 255));
        btnSaniService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSaniService.setText("Manage Sanitization");
        btnSaniService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaniServiceMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnSaniService_JPanelLayout = new javax.swing.GroupLayout(btnSaniService_JPanel);
        btnSaniService_JPanel.setLayout(btnSaniService_JPanelLayout);
        btnSaniService_JPanelLayout.setHorizontalGroup(
            btnSaniService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaniService_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaniService)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSaniService_JPanelLayout.setVerticalGroup(
            btnSaniService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaniService_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSaniService_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaniService, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNurse_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnNurse_JPanel.setToolTipText("");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/spray1.png"))); // NOI18N

        btnNurse1.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnNurse1.setForeground(new java.awt.Color(255, 255, 255));
        btnNurse1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNurse1.setText("Assign Nurse");
        btnNurse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNurse1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNurse_JPanelLayout = new javax.swing.GroupLayout(btnNurse_JPanel);
        btnNurse_JPanel.setLayout(btnNurse_JPanelLayout);
        btnNurse_JPanelLayout.setHorizontalGroup(
            btnNurse_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNurse_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNurse1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnNurse_JPanelLayout.setVerticalGroup(
            btnNurse_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNurse_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnNurse_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(btnNurse1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAssignedRequest_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnAssignedRequest_JPanel.setToolTipText("");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/spray1.png"))); // NOI18N

        btnAssignedRequest.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnAssignedRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignedRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAssignedRequest.setText("View Assigned Requests");
        btnAssignedRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAssignedRequestMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnAssignedRequest_JPanelLayout = new javax.swing.GroupLayout(btnAssignedRequest_JPanel);
        btnAssignedRequest_JPanel.setLayout(btnAssignedRequest_JPanelLayout);
        btnAssignedRequest_JPanelLayout.setHorizontalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignedRequest)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        btnAssignedRequest_JPanelLayout.setVerticalGroup(
            btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAssignedRequest_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnAssignedRequest_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(btnAssignedRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNotifications_JPanel.setBackground(new java.awt.Color(18, 102, 153));
        btnNotifications_JPanel.setToolTipText("");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/spray1.png"))); // NOI18N

        btnNotification.setFont(new java.awt.Font(".SF NS Text", 1, 14)); // NOI18N
        btnNotification.setForeground(new java.awt.Color(255, 255, 255));
        btnNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNotification.setText("View Notifications");
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNotificationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnNotifications_JPanelLayout = new javax.swing.GroupLayout(btnNotifications_JPanel);
        btnNotifications_JPanel.setLayout(btnNotifications_JPanelLayout);
        btnNotifications_JPanelLayout.setHorizontalGroup(
            btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNotifications_JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotification)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnNotifications_JPanelLayout.setVerticalGroup(
            btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNotifications_JPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnNotifications_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProfile_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAllRequest_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctor_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFoodService_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaniService_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNurse_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotifications_JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnProfile_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAllRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDoctor_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFoodService_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnSaniService_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAmbulance_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(btnNurse_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAssignedRequest_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNotifications_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 250, 910));

        workAreaJPanel.setBackground(new java.awt.Color(255, 255, 255));
        workAreaJPanel.setLayout(new java.awt.CardLayout());
        add(workAreaJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 1180, 880));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAmbulanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmbulanceMousePressed
        // TODO add your handling code here:
                setColor(btnAmbulance_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
        ManageAmbulanceBookingPMJPanel viewAssignedRequests=new ManageAmbulanceBookingPMJPanel(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAmbulanceMousePressed

    private void btnProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMousePressed
        // TODO add your handling code here:
                setColor(btnProfile_Panel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                ManagePatientManagerProfileJPanel managepManagerProfileJPanel=new ManagePatientManagerProfileJPanel(workAreaJPanel,enterprise,useraccount,system);
                workAreaJPanel.add("PatientManagerProfileJPanel", managepManagerProfileJPanel);
                CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
                layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnProfileMousePressed

    private void btnAllRequestsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllRequestsMousePressed
        // TODO add your handling code here:
                setColor(btnAllRequest_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                PatientManagerAssignDocJPanel viewAllRequestJPanel=new PatientManagerAssignDocJPanel(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAllRequestJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAllRequestsMousePressed

    private void btnAllRequest_JPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllRequest_JPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllRequest_JPanelMousePressed

    private void btnDoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoctorMousePressed
        // TODO add your handling code here:
                setColor(btnDoctor_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                PatientManagerAssignDocJPanel assignDocJPanel=new PatientManagerAssignDocJPanel(workAreaJPanel,enterprise,useraccount,system, org);
                workAreaJPanel.add("MedicineJPanel", assignDocJPanel);
                CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
                layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnDoctorMousePressed

    private void btnFoodServiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFoodServiceMousePressed
        // TODO add your handling code here:
                setColor(btnFoodService_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                ManageFoodBookingPMJPanel requestAmbulanceJPanel=new ManageFoodBookingPMJPanel(workAreaJPanel,enterprise,useraccount,system,org);
        workAreaJPanel.add("AmbulanceJPanel", requestAmbulanceJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnFoodServiceMousePressed

    private void btnSaniServiceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaniServiceMousePressed
        // TODO add your handling code here:
                setColor(btnSaniService_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnNurse_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                ManageSanitizationPMJPanel requestSanitizationJPanel=new ManageSanitizationPMJPanel(workAreaJPanel,enterprise,useraccount,system,org);
        workAreaJPanel.add("SanitizationJPanel", requestSanitizationJPanel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnSaniServiceMousePressed

    private void btnNurse1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNurse1MousePressed
        // TODO add your handling code here:
                setColor(btnNurse_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnAssignedRequest_JPanel);
    }//GEN-LAST:event_btnNurse1MousePressed

    private void btnAssignedRequestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignedRequestMousePressed
        // TODO add your handling code here:
                setColor(btnAssignedRequest_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnNotifications_JPanel);
                resetColor(btnNurse_JPanel);
                PatientManagerAssignedRequests viewAssignedRequests=new PatientManagerAssignedRequests(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnAssignedRequestMousePressed

    private void btnNotificationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotificationMousePressed
        // TODO add your handling code here:
                setColor(btnNotifications_JPanel);
                resetColor(btnFoodService_JPanel);
                resetColor(btnAmbulance_JPanel);
                resetColor(btnAllRequest_JPanel);
                resetColor(btnDoctor_JPanel);
                resetColor(btnProfile_Panel);
                resetColor(btnSaniService_JPanel);
                resetColor(btnNurse_JPanel);
                resetColor(btnAssignedRequest_JPanel);
                 NotificationRequestJPanel viewAssignedRequests=new NotificationRequestJPanel(workAreaJPanel,enterprise,useraccount,system, org);
        workAreaJPanel.add("viewAllRequestJPanel", viewAssignedRequests);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnNotificationMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAllRequest_JPanel;
    private javax.swing.JLabel btnAllRequests;
    private javax.swing.JLabel btnAmbulance;
    private javax.swing.JPanel btnAmbulance_JPanel;
    private javax.swing.JLabel btnAssignedRequest;
    private javax.swing.JPanel btnAssignedRequest_JPanel;
    private javax.swing.JLabel btnDoctor;
    private javax.swing.JPanel btnDoctor_JPanel;
    private javax.swing.JLabel btnFoodService;
    private javax.swing.JPanel btnFoodService_JPanel;
    private javax.swing.JLabel btnNotification;
    private javax.swing.JPanel btnNotifications_JPanel;
    private javax.swing.JLabel btnNurse1;
    private javax.swing.JPanel btnNurse_JPanel;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JPanel btnProfile_Panel;
    private javax.swing.JLabel btnSaniService;
    private javax.swing.JPanel btnSaniService_JPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
}
