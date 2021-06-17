/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

import Business.RegisteredUser.RegisteredUser;
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


    public SanitizationPerson(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username);
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

    public ArrayList<RegisteredUser> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<RegisteredUser> patients) {
        this.patients = patients;
    }

     @Override
    public String toString() {
       return String.valueOf(id);
    }
}
