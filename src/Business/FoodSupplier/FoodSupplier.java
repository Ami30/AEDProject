/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

import Business.Patient.Patient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class FoodSupplier extends  Business.Person.Person{
    
private String FoodSuppliername;
ArrayList<Patient> patients;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

    public FoodSupplier(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
     this.id=count.incrementAndGet(); 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
      @Override
    public String toString() {
        return String.valueOf(id);
    }

}
