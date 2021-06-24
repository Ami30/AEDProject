/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Role.Role;

/**
 *
 * @author amishagupta
 */
public class Person extends Business.UserAccount.UserAccount{
    
private String fullName;
private String dob;
private String gender;
private String address;
private String zipcode;
private String contactNumber;
private String email;

    public Person(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String username, String password, Role role) {
        super(username, password, fullName, role);
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.contactNumber = contactNumber;
        this.email = email;
        setUsername(username);
        setPassword(password);
        setRole(role);
        setName(fullName);
    }

    public Person(String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email, String string, String string1, String string2, Role role) {
        super(string, string1, string2, role);
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.contactNumber = contactNumber;
        this.email = email;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
