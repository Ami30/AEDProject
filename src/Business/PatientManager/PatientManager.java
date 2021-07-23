/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientManager;

import Business.Person.PersonalNotificationDirectory;
import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import Business.WorkQueue.ServiceRequestDirectory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class PatientManager extends Business.Person.Person {
private int id;
private int currentPatients;
private HealthRequestDirectory requestDirectory = new HealthRequestDirectory();
private PersonalNotificationDirectory notificationDirectory = new PersonalNotificationDirectory();
private static final AtomicInteger count = new AtomicInteger(0); 
private ServiceRequestDirectory servicerequestDirectoryFood;
private ServiceRequestDirectory servicerequestDirectoryAmb;
private ServiceRequestDirectory servicerequestDirectorySan;
private ServiceRequestDirectory servicerequestDirectoryCab;

    public PatientManager(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username,password, role);
         this.id=count.incrementAndGet(); 
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPatients() {
        return currentPatients;
    }

    public void setCurrentPatients(int currentPatients) {
        this.currentPatients = currentPatients;
    }

    public HealthRequestDirectory getRequestDirectory() {
        if(requestDirectory==null){
            requestDirectory= new HealthRequestDirectory();
        }
        return requestDirectory;
    }

    public void setRequestDirectory(HealthRequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }

    public PersonalNotificationDirectory getNotificationDirectory() {
        if(notificationDirectory == null){
            notificationDirectory = new PersonalNotificationDirectory();
        }
        return notificationDirectory;
    }
      
    public ServiceRequestDirectory getServicerequestDirectoryFood() {
        if(servicerequestDirectoryFood == null){
            servicerequestDirectoryFood = new ServiceRequestDirectory();
        }
        return servicerequestDirectoryFood;
    }

    public ServiceRequestDirectory getServicerequestDirectoryAmb() {
        if(servicerequestDirectoryAmb == null){
            servicerequestDirectoryAmb = new ServiceRequestDirectory();
        }
        return servicerequestDirectoryAmb;
    }

    public ServiceRequestDirectory getServicerequestDirectorySan() {
        if(servicerequestDirectorySan == null){
            servicerequestDirectorySan = new ServiceRequestDirectory();
        }
        return servicerequestDirectorySan;
    }

    public ServiceRequestDirectory getServicerequestDirectoryCab() {
        if(servicerequestDirectoryCab == null){
            servicerequestDirectoryCab = new ServiceRequestDirectory();
        }
        return servicerequestDirectoryCab;
    }
    
         @Override
    public String toString() {
         return String.valueOf(id);
    }

}
