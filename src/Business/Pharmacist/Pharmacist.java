/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class Pharmacist extends Business.Person.Person{
private String Pharmacyname;
private String PharmacyAddress;
private String PharmacyZipCode;
//ArrayList<Order> orders;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

    public Pharmacist(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
//        this.Pharmacyname = Pharmacyname;
         this.id=count.incrementAndGet(); 
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getPharmacyname() {
        return Pharmacyname;
    }

    public void setPharmacyname(String Pharmacyname) {
        this.Pharmacyname = Pharmacyname;
    }

    public String getPharmacyAddress() {
        return PharmacyAddress;
    }

    public void setPharmacyAddress(String PharmacyAddress) {
        this.PharmacyAddress = PharmacyAddress;
    }

    public String getPharmacyZipCode() {
        return PharmacyZipCode;
    }

    public void setPharmacyZipCode(String PharmacyZipCode) {
        this.PharmacyZipCode = PharmacyZipCode;
    }
    
    
      @Override
    public String toString() {
         return String.valueOf(id);
    }
}
