/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryStorePerson;

import Business.Role.Role;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class GroceryStorePerson extends Business.Person.Person{
    private int id;
    private static final AtomicInteger count = new AtomicInteger(0); 

    public GroceryStorePerson(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email,username,password, role);
        this.id=count.incrementAndGet(); 
    }

    public int getId() {
        return id;
    }

//    public void setId(int Id) {
//        this.Id = Id;
//    }
    
       @Override
    public String toString() {
         return String.valueOf(id);
    }
    
}
