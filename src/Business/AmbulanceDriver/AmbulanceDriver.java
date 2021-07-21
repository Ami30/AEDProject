/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceDriver;

import Business.CabDriver.*;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.ServiceRequestDirectory;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class AmbulanceDriver extends Business.Person.Person{
    
    
private String licenseNumber;
private String valStartDate;
private String valEndDate;
//ArrayList<Bookings> bookingsList;
private String driverType;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 
private AmbulanceServiceDirectory ambulanceServiceDirectory;
private ServiceRequestDirectory serviceRequestDirectory;

    public AmbulanceDriver(String licenseNumber,String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username, String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username, password,role);
        this.licenseNumber=licenseNumber;
       this.id=count.incrementAndGet(); 
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AmbulanceServiceDirectory getAmbulanceServiceDirectory() {
        if(ambulanceServiceDirectory == null){
            ambulanceServiceDirectory = new AmbulanceServiceDirectory();
        }
        return ambulanceServiceDirectory;
    }

    public void setAmbulanceServiceDirectory(AmbulanceServiceDirectory ambulanceServiceDirectory) {
        this.ambulanceServiceDirectory = ambulanceServiceDirectory;
    }

    public ServiceRequestDirectory getServiceRequestDirectory() {
        if(serviceRequestDirectory == null){
            serviceRequestDirectory = new ServiceRequestDirectory();
        }
        return serviceRequestDirectory;
    }

    
    @Override
    public String toString() {
       return getName();
    }
    
    



    
}
