/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class DeliveryMan extends Business.Person.Person{
private int id;
private static final AtomicInteger count = new AtomicInteger(0); 
//ArrayList<Order> orders;
private Boolean available;

    public DeliveryMan( Boolean available, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.available = available;
        this.id=count.incrementAndGet(); 
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

        @Override
     public String toString() {
         return String.valueOf(id);
    }

}
