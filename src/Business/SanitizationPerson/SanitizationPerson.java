/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

import Business.RegisteredUser.RegisteredUser;
import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class SanitizationPerson extends Business.Person.Person{
 private int id;
private String sanitizationServicename;
ArrayList<RegisteredUser> patients;
private static final AtomicInteger count = new AtomicInteger(0); 
private SanitizationServiceTypeDirectory saniServiceTypeDirectory;
private SanitizationServiceTypeDirectory completedsaniServiceTypeDirectory;
private HealthRequestDirectory requestDirectory;


    public SanitizationPerson(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
      this.id=count.incrementAndGet(); 
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSanitizationServicename() {
        return sanitizationServicename;
    }

    public void setSanitizationServicename(String sanitizationServicename) {
        this.sanitizationServicename = sanitizationServicename;
    }

    public SanitizationServiceTypeDirectory getSaniServiceTypeDirectory() {
        if(saniServiceTypeDirectory==null){
            saniServiceTypeDirectory=new SanitizationServiceTypeDirectory();
        }
        return saniServiceTypeDirectory;
    }

    public void setSaniServiceTypeDirectory(SanitizationServiceTypeDirectory saniServiceTypeDirectory) {
        this.saniServiceTypeDirectory = saniServiceTypeDirectory;
    }

    public HealthRequestDirectory getRequestDirectory() {
       if(requestDirectory==null){
            requestDirectory=new HealthRequestDirectory();
        }
        return requestDirectory;
    }

    public void setRequestDirectory(HealthRequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    public SanitizationServiceTypeDirectory getCompletedsaniServiceTypeDirectory() {
        if(completedsaniServiceTypeDirectory==null){
            completedsaniServiceTypeDirectory=new SanitizationServiceTypeDirectory();
        }
        return completedsaniServiceTypeDirectory;
    }

    public void setCompletedsaniServiceTypeDirectory(SanitizationServiceTypeDirectory completedsaniServiceTypeDirectory) {
        this.completedsaniServiceTypeDirectory = completedsaniServiceTypeDirectory;
    }
    
    

    public ArrayList<RegisteredUser> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<RegisteredUser> patients) {
        this.patients = patients;
    }
    
    

     @Override
    public String toString() {
       return this.getName();
    }
}
