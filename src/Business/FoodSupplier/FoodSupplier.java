/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class FoodSupplier extends  Business.Person.Person{
    
private String FoodSuppliername;
ArrayList<Patient> patients;
private String id;

    public FoodSupplier(String FoodSuppliername, ArrayList<Patient> patients, String id, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.FoodSuppliername = FoodSuppliername;
        this.patients = patients;
        this.id = id;
    }

    public String getFoodSuppliername() {
        return FoodSuppliername;
    }

    public void setFoodSuppliername(String FoodSuppliername) {
        this.FoodSuppliername = FoodSuppliername;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
      @Override
    public String toString() {
        return id;
    }

}
