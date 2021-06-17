/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;

import Business.RegisteredUser.RegisteredUser;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class Nurse extends Business.Person.Person{
private String degree;
private String hospital;
private String designation;
private String yearsExperience;
private Boolean availability;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

ArrayList<RegisteredUser> patientAssigned;

    public Nurse(String degree, String hospital, String designation, String yearsExperience, Boolean availability, ArrayList<RegisteredUser> patientAssigned, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username);
        this.degree = degree;
        this.hospital = hospital;
        this.designation = designation;
        this.yearsExperience = yearsExperience;
        this.availability = availability;
        this.patientAssigned = patientAssigned;
        this.id=count.incrementAndGet(); 
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
//    }

    public ArrayList<RegisteredUser> getPatientAssigned() {
        return patientAssigned;
    }

    public void setPatientAssigned(ArrayList<RegisteredUser> patientAssigned) {
        this.patientAssigned = patientAssigned;
    }

      @Override
    public String toString() {
         return String.valueOf(id);
    }

}
