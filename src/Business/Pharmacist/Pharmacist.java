/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class Pharmacist extends Business.Person.Person{
private String Pharmacyname;
//ArrayList<Order> orders;
private String id;

    public Pharmacist(String Pharmacyname, String id, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.Pharmacyname = Pharmacyname;
        this.id = id;
    }

    public String getPharmacyname() {
        return Pharmacyname;
    }

    public void setPharmacyname(String Pharmacyname) {
        this.Pharmacyname = Pharmacyname;
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
