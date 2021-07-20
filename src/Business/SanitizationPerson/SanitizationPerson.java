/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

import Business.RegisteredUser.RegisteredUser;
import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import Business.WorkQueue.ServiceRequestDirectory;
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
private SanitizationServiceDirectory saniServiceTypeDirectory;
private SanitizationServiceDirectory completedsaniServiceTypeDirectory;
private HealthRequestDirectory requestDirectory;
private ServiceRequestDirectory serviceRequestDirectory;



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

    public SanitizationServiceDirectory getSaniServiceTypeDirectory() {
        if(saniServiceTypeDirectory==null){
            saniServiceTypeDirectory=new SanitizationServiceDirectory();
        }
        return saniServiceTypeDirectory;
    }

    public void setSaniServiceTypeDirectory(SanitizationServiceDirectory saniServiceTypeDirectory) {
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

    public SanitizationServiceDirectory getCompletedsaniServiceTypeDirectory() {
        if(completedsaniServiceTypeDirectory==null){
            completedsaniServiceTypeDirectory=new SanitizationServiceDirectory();
        }
        return completedsaniServiceTypeDirectory;
    }

    public void setCompletedsaniServiceTypeDirectory(SanitizationServiceDirectory completedsaniServiceTypeDirectory) {
        this.completedsaniServiceTypeDirectory = completedsaniServiceTypeDirectory;
    }
    
    

    public ArrayList<RegisteredUser> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<RegisteredUser> patients) {
        this.patients = patients;
    }
    
     public ServiceRequestDirectory getServiceRequestDirectory() {
        if(serviceRequestDirectory == null){
            serviceRequestDirectory = new ServiceRequestDirectory();
        }
        return serviceRequestDirectory;
    }

     @Override
    public String toString() {
       return this.getName();
    }
}
