/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientManagerRole;

import ui.UserRole.*;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Nurse.Nurse;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.PatientManager.PatientManager;
import Business.Person.PersonalNotification;
import Business.RegisteredUser.RegisteredUser;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.DoctorRole.AddPrescription;
import ui.DoctorRole.AssignHospitalToRequest;

/**
 *
 * @author amishagupta
 */
public class HealthRequestReportQuarantineFlowJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageProfileJPanel
     */

    private ArrayList<String> comorbid;
    private UserAccount useraccount;
    private EcoSystem system;
    private HealthRequest request;
    private JPanel userProcessContainer;
    private PatientManager patientManager;
    private String buttonFlag;
    private Boolean docNurseTable = true;
    private Enterprise enterprise;
     DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
 
    public HealthRequestReportQuarantineFlowJPanel(JPanel userProcessContainer,Enterprise enterprise, UserAccount account, EcoSystem system, HealthRequest request, PatientManager patientManager, String buttonFlag) {
        initComponents();
        this.useraccount=account;
        this.system = system;
        this.request = request;
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.patientManager = patientManager;
        this.buttonFlag = buttonFlag;
        doctorJpanel.setVisible(false);
        toggleNurseButton();
        populateprofile();
        this.comorbid=new ArrayList<>();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblContactNo1 = new javax.swing.JLabel();
        lblRequestNumber = new javax.swing.JLabel();
        lblPatientsName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblZipCode1 = new javax.swing.JLabel();
        lblContactNo2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblContactNo3 = new javax.swing.JLabel();
        lblPatientManagerName = new javax.swing.JLabel();
        lblDoctorsName = new javax.swing.JLabel();
        lblNursesName = new javax.swing.JLabel();
        lblHospitalsName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblZipCode2 = new javax.swing.JLabel();
        lblContactNo4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFever = new javax.swing.JLabel();
        lblCough = new javax.swing.JLabel();
        lblBodyPain = new javax.swing.JLabel();
        lblOtherSymptoms = new javax.swing.JLabel();
        doctorJpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorJTable = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        btnAssignToNurse = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setText("Request Number:");

        lblZipCode.setText("Patients Name:");

        lblContactNo.setText("Contact Number:");

        jLabel1.setText("Gender:");

        lblContactNo1.setText("Date of Birth");

        lblRequestNumber.setText("jLabel4");
        lblRequestNumber.setMaximumSize(new java.awt.Dimension(6, 20));
        lblRequestNumber.setMinimumSize(new java.awt.Dimension(6, 20));
        lblRequestNumber.setPreferredSize(new java.awt.Dimension(6, 20));

        lblPatientsName.setText("jLabel4");
        lblPatientsName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblPatientsName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblPatientsName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblContact.setText("jLabel4");
        lblContact.setMaximumSize(new java.awt.Dimension(6, 20));
        lblContact.setMinimumSize(new java.awt.Dimension(6, 20));
        lblContact.setPreferredSize(new java.awt.Dimension(6, 20));

        lblGender.setText("jLabel4");
        lblGender.setMaximumSize(new java.awt.Dimension(6, 20));
        lblGender.setMinimumSize(new java.awt.Dimension(6, 20));
        lblGender.setPreferredSize(new java.awt.Dimension(6, 20));

        lblDob.setText("jLabel4");
        lblDob.setMaximumSize(new java.awt.Dimension(6, 20));
        lblDob.setMinimumSize(new java.awt.Dimension(6, 20));
        lblDob.setPreferredSize(new java.awt.Dimension(6, 20));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("View completel Profile");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblRequestNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lblPatientsName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRequestNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientsName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setText("Patient Manager Name:");

        lblZipCode1.setText("Doctor's Name:");

        lblContactNo2.setText("Nurse's Name:");

        jLabel4.setText("Hospital's Name");

        lblContactNo3.setText("Status");

        lblPatientManagerName.setText("jLabel4");
        lblPatientManagerName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblPatientManagerName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblPatientManagerName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblDoctorsName.setText("jLabel4");
        lblDoctorsName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblDoctorsName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblDoctorsName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblNursesName.setText("jLabel4");
        lblNursesName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblNursesName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblNursesName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblHospitalsName.setText("jLabel4");
        lblHospitalsName.setMaximumSize(new java.awt.Dimension(6, 20));
        lblHospitalsName.setMinimumSize(new java.awt.Dimension(6, 20));
        lblHospitalsName.setPreferredSize(new java.awt.Dimension(6, 20));

        lblStatus.setText("jLabel4");
        lblStatus.setMaximumSize(new java.awt.Dimension(6, 20));
        lblStatus.setMinimumSize(new java.awt.Dimension(6, 20));
        lblStatus.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContactNo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPatientManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lblDoctorsName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNursesName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHospitalsName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorsName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNursesName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalsName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setText("Fever:");

        lblZipCode2.setText("Cough:");

        lblContactNo4.setText("Body Pain:");

        jLabel6.setText("Other Symptoms:");

        lblFever.setText("jLabel4");
        lblFever.setMaximumSize(new java.awt.Dimension(6, 20));
        lblFever.setMinimumSize(new java.awt.Dimension(6, 20));
        lblFever.setPreferredSize(new java.awt.Dimension(6, 20));

        lblCough.setText("jLabel4");
        lblCough.setMaximumSize(new java.awt.Dimension(6, 20));
        lblCough.setMinimumSize(new java.awt.Dimension(6, 20));
        lblCough.setPreferredSize(new java.awt.Dimension(6, 20));

        lblBodyPain.setText("jLabel4");
        lblBodyPain.setMaximumSize(new java.awt.Dimension(6, 20));
        lblBodyPain.setMinimumSize(new java.awt.Dimension(6, 20));
        lblBodyPain.setPreferredSize(new java.awt.Dimension(6, 20));

        lblOtherSymptoms.setText("jLabel4");
        lblOtherSymptoms.setMaximumSize(new java.awt.Dimension(6, 20));
        lblOtherSymptoms.setMinimumSize(new java.awt.Dimension(6, 20));
        lblOtherSymptoms.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContactNo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblFever, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lblCough, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBodyPain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOtherSymptoms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFever, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCough, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblZipCode2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBodyPain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContactNo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOtherSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        doctorJpanel.setBackground(new java.awt.Color(255, 255, 255));

        doctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor/ Nurse Name", "Qualification", "Experience", "Zipcode"
            }
        ));
        jScrollPane1.setViewportView(doctorJTable);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorJpanelLayout = new javax.swing.GroupLayout(doctorJpanel);
        doctorJpanel.setLayout(doctorJpanelLayout);
        doctorJpanelLayout.setHorizontalGroup(
            doctorJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(doctorJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(doctorJpanelLayout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        doctorJpanelLayout.setVerticalGroup(
            doctorJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnAssignToNurse.setText("Assign a Nurse");
        btnAssignToNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToNurseActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doctorJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssignToNurse)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAssignToNurse)
                        .addGap(45, 45, 45)
                        .addComponent(doctorJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(369, 369, 369))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                  RegisteredUser user = request.getUser();
                  UserReport userReport=new UserReport(userProcessContainer,system, user);
                  userProcessContainer.add("userReport", userReport);
                  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                  layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         int selectedRow = doctorJTable.getSelectedRow();
         if (selectedRow < 0){
              JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
         }
         else{
             if(docNurseTable){
                  if(request.getDoctor()==null){
                 Doctor doc = (Doctor)doctorJTable.getValueAt(selectedRow, 0);
                  request.setStatus("Assigned to doctor-"+doc.getName());
                  request.setDoctor(doc);
                  doc.getRequestDirectory().addRequestList(request);
                  JOptionPane.showMessageDialog(null, "This request assigned to doctor "+doc.getName()+" Successfully!");
                  doctorJpanel.setVisible(true);
             } else{
                    if(request.getNurse()==null){
                        Nurse nurse = (Nurse)doctorJTable.getValueAt(selectedRow, 0);
                        request.setStatus("Assigned to Nurse-"+nurse.getName());
                        request.setNurse(nurse);
                        nurse.getRequestDirectory().addRequestList(request);
                        JOptionPane.showMessageDialog(null, "This request assigned to Nurse "+nurse.getName()+" Successfully!");
                        doctorJpanel.setVisible(true);
                  }
             }
            
             JOptionPane.showMessageDialog(null, "This request is already assigned to doctor "+request.getDoctor().getName());
             }    
         }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnAssignToNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToNurseActionPerformed
        // TODO add your handling code here:
        doctorJpanel.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) doctorJTable.getModel();
        model.setRowCount(0);
        for(Network net: system.getNetworkList()){
            if(net.getName().equalsIgnoreCase(request.getUser().getRegisteredUserNetwork().getName())){
                   for(Enterprise ent: net.getEnterpriseDir().getEnterpriseList()){
            if(ent.getEnterpriseType().getValue().equalsIgnoreCase("Hospital")){
                for(Organization org: ent.getOrganizationDirectory().getOrgList()){
                    if(org.getType().getValue().equalsIgnoreCase("Nurse Organization")){
                        for(Nurse nurse: org.getNurDir().getnurseDirectory()){
                            Object[] row = new Object[4];
                            row[0] = nurse;
                            row[1] = nurse.getDegree();
                            row[2] = nurse.getYearsExperience();
                            row[3] = nurse.getZipcode();
                            model.addRow(row);
                            
                        }
                    }
                    
                    
                }
            }
        }
            }
        }
        
    }//GEN-LAST:event_btnAssignToNurseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToNurse;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTable doctorJTable;
    private javax.swing.JPanel doctorJpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBodyPain;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblContactNo2;
    private javax.swing.JLabel lblContactNo3;
    private javax.swing.JLabel lblContactNo4;
    private javax.swing.JLabel lblCough;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblDoctorsName;
    private javax.swing.JLabel lblFever;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalsName;
    private javax.swing.JLabel lblNursesName;
    private javax.swing.JLabel lblOtherSymptoms;
    private javax.swing.JLabel lblPatientManagerName;
    private javax.swing.JLabel lblPatientsName;
    private javax.swing.JLabel lblRequestNumber;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblZipCode1;
    private javax.swing.JLabel lblZipCode2;
    // End of variables declaration//GEN-END:variables

    private void populateprofile() {
       lblRequestNumber.setText(request.getRequestNumber());
       lblPatientsName.setText(request.getUser().getFullName());
       lblContact.setText(request.getUser().getContactNumber());
       lblGender.setText(request.getUser().getGender());
       lblDob.setText(request.getUser().getDob());
       lblPatientManagerName.setText(request.getPatientManager()==null?"Not Assigned":request.getPatientManager().getName());
       lblDoctorsName.setText(request.getDoctor()==null?"Not Assigned":request.getDoctor().getName());
       lblNursesName.setText(request.getNurse()==null?"Not Assigned":request.getNurse().getName());
       lblHospitalsName.setText(request.getHospital()==null?"Not Assigned": request.getHospital().getName());
       lblStatus.setText(request.getStatus());
       lblFever.setText(request.getFever());
       lblCough.setText(request.getCough());
       lblBodyPain.setText(request.getBodyPain());
       lblOtherSymptoms.setText(request.getOtherSymptoms());
       
    }     
    public void toggleNurseButton(){
        if(request.getNurse()!=null){
            btnAssignToNurse.setVisible(false);
        }
    }
}
