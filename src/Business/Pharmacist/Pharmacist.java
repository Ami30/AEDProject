/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import Business.WorkQueue.OrderDirectory;
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
private MedicineDirectory medicineDirectory;
private HealthRequestDirectory requestDirectory;
private OrderDirectory orderDirectoryMed;
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

    public MedicineDirectory getMedicineDirectory() {
        if(medicineDirectory==null){
            medicineDirectory=new MedicineDirectory();
        }
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public HealthRequestDirectory getRequestDirectory() {
        if(requestDirectory==null){
            requestDirectory=new HealthRequestDirectory();
        }
        return requestDirectory;
    }

    public void setRequestDirectory(HealthRequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
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

    public OrderDirectory getOrderDirectoryMed() {
        if(orderDirectoryMed == null){
            orderDirectoryMed = new OrderDirectory();
        }
        return orderDirectoryMed;
    }
    
    
      @Override
    public String toString() {
         return this.getName();
    }
}
