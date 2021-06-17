/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class Pharmacist extends Business.Person.Person{
//private String Pharmacyname;
//ArrayList<Order> orders;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

    public Pharmacist(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username);
//        this.Pharmacyname = Pharmacyname;
         this.id=count.incrementAndGet(); 
    }

//    public String getPharmacyname() {
//        return Pharmacyname;
//    }
//
//    public void setPharmsacyname(String Pharmacyname) {
//        this.Pharmacyname = Pharmacyname;
//    }

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
