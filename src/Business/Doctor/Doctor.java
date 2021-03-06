/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Organization.Organization;
import Business.RegisteredUser.RegisteredUser;
import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class Doctor extends Business.Person.Person{
    
private String degree;
private String hospital;
private String designation;
private String yearsExperience;
private Organization orgType;
private Boolean availability;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 
ArrayList<RegisteredUser> patientAssigned;
private HealthRequestDirectory requestDirectory;

  

    public Doctor(String degree, String hospital, String designation, String yearsExperience, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role, Organization orgType) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
        this.degree = degree;
        this.hospital = hospital;
        this.designation = designation;
        this.yearsExperience = yearsExperience;
        this.id=count.incrementAndGet(); 
        this.orgType = orgType;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public Organization getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization orgType) {
        this.orgType = orgType;
    }


    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//        
//    }

    public ArrayList<RegisteredUser> getPatientAssigned() {
        return patientAssigned;
    }

    public void setPatientAssigned(ArrayList<RegisteredUser> patientAssigned) {
        this.patientAssigned = patientAssigned;
    }

    public HealthRequestDirectory getRequestDirectory() {
        if(requestDirectory==null){
            requestDirectory = new HealthRequestDirectory();
        }
        return requestDirectory;
    }

        @Override
    public String toString() {
        return getName();
    }

}
