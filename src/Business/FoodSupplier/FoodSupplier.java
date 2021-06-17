/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

import Business.RegisteredUser.RegisteredUser;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class FoodSupplier extends  Business.Person.Person{
    
private String FoodSuppliername;
ArrayList<RegisteredUser> patients;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

    public FoodSupplier(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username);
     this.id=count.incrementAndGet(); 
    }

    public String getFoodSuppliername() {
        return FoodSuppliername;
    }

    public void setFoodSuppliername(String FoodSuppliername) {
        this.FoodSuppliername = FoodSuppliername;
    }

    public ArrayList<RegisteredUser> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<RegisteredUser> patients) {
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
