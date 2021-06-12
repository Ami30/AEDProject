/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class Driver extends Business.Person.Person{
    
    
private String licenseNumber;
private String valStartDate;
private String valEndDate;
//ArrayList<Bookings> bookingsList;
private String driverType;
private String id;

    public Driver(String licenseNumber, String valStartDate, String valEndDate, String driverType, String id, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.licenseNumber = licenseNumber;
        this.valStartDate = valStartDate;
        this.valEndDate = valEndDate;
        this.driverType = driverType;
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getValStartDate() {
        return valStartDate;
    }

    public void setValStartDate(String valStartDate) {
        this.valStartDate = valStartDate;
    }

    public String getValEndDate() {
        return valEndDate;
    }

    public void setValEndDate(String valEndDate) {
        this.valEndDate = valEndDate;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
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
