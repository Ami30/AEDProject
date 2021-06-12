/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tester;

/**
 *
 * @author amishagupta
 */
public class Tester extends Business.Person.Person{
    
private String TestingService;
private String id;

    public Tester(String TestingService, String id, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.TestingService = TestingService;
        this.id = id;
    }

    public String getTestingService() {
        return TestingService;
    }

    public void setTestingService(String TestingService) {
        this.TestingService = TestingService;
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
