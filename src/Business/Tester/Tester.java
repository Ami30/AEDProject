/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tester;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class Tester extends Business.Person.Person{
    
private String TestingService;
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 

    public Tester( String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
         this.id=count.incrementAndGet(); 
       
    }

    public String getTestingService() {
        return TestingService;
    }

    public void setTestingService(String TestingService) {
        this.TestingService = TestingService;
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
