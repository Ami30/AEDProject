/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientManager;

import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class PatientManager extends Business.Person.Person {
private int id;
private int currentPatients;
private HealthRequestDirectory requestDirectory = new HealthRequestDirectory();
private static final AtomicInteger count = new AtomicInteger(0); 

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
      
         @Override
    public String toString() {
         return String.valueOf(id);
    }

}
