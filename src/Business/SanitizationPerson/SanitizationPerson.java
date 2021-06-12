/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class SanitizationPerson extends Business.Person.Person{
 private String id;
private String sanitizationServicename;
ArrayList<Patient> patients;

    public SanitizationPerson(String id, String sanitizationServicename, ArrayList<Patient> patients, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.id = id;
        this.sanitizationServicename = sanitizationServicename;
        this.patients = patients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSanitizationServicename() {
        return sanitizationServicename;
    }

    public void setSanitizationServicename(String sanitizationServicename) {
        this.sanitizationServicename = sanitizationServicename;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

     @Override
    public String toString() {
        return id;
    }
}
