/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Network.Network;
import Business.UserAccount.UserAccount;

/**
 *
 * @author amishagupta
 */
public class RequestDoctor extends WorkRequest {
    private String requestID;
    private UserAccount registeredUser;
    private UserAccount patientManager;
    private UserAccount doctor;
    private UserAccount NurUserAccount;
    private Network network;
    private String DoctorMessage;
    private String HospitalAssigned;
    private String Requeststatus;
    private String PatientmanagerComment;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID() {
        int num = (int) (Math.random() * (999 - 100 + 1) + 100);
        this.requestID = "Request" + num;
    }

    public UserAccount getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(UserAccount registeredUser) {
        this.registeredUser = registeredUser;
    }

    public UserAccount getPatientManager() {
        return patientManager;
    }

    public void setPatientManager(UserAccount patientManager) {
        this.patientManager = patientManager;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public UserAccount getNurUserAccount() {
        return NurUserAccount;
    }

    public void setNurUserAccount(UserAccount NurUserAccount) {
        this.NurUserAccount = NurUserAccount;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getDoctorMessage() {
        return DoctorMessage;
    }

    public void setDoctorMessage(String DoctorMessage) {
        this.DoctorMessage = DoctorMessage;
    }

    public String getRequeststatus() {
        return Requeststatus;
    }

    public void setRequeststatus(String Requeststatus) {
        this.Requeststatus = Requeststatus;
    }

    public String getPatientmanagerComment() {
        return PatientmanagerComment;
    }

    public void setPatientmanagerComment(String PatientmanagerComment) {
        this.PatientmanagerComment = PatientmanagerComment;
    }

    public String getHospitalAssigned() {
        return HospitalAssigned;
    }

    public void setHospitalAssigned(String HospitalAssigned) {
        this.HospitalAssigned = HospitalAssigned;
    }
    
       @Override
    public String toString() {
        return requestID;
    }
}
