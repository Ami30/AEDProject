/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisteredUser;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author amishagupta
 */
public class RegisteredUser extends Business.Person.Person {
private String bloodGroup;
private ArrayList<String> comorbid;
private String symptom;
private String userNetwork;
private String doctorAssigned;
private String foodService;
private String pharmacy;
private String healthstatus;
private String nurseAssigned;
private int id;
private String userCurrentStatus="Healthy";
private String foodpreference;
private String fever;
private String cough;
private String bodypain;
private String isVaccinated;
private String surgeries;
private String Allergies;
private String weight;
private String height;
private static final AtomicInteger count = new AtomicInteger(0); 

    public RegisteredUser(String userNetwork, String bloodGroup, ArrayList<String> comorbid, String symptom, String foodpreference, String isVaccinated, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email,String username,String password, Role role) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email, username,password, role);
        this.bloodGroup = bloodGroup;
        this.comorbid = comorbid;
        this.symptom = symptom;
        this.foodpreference = foodpreference;
        this.isVaccinated = isVaccinated;       
        this.id=count.incrementAndGet(); 
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getCough() {
        return cough;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public String getBodypain() {
        return bodypain;
    }

    public void setBodypain(String bodypain) {
        this.bodypain = bodypain;
    }
    

    public String getRegisteredUserNetwork() {
        return userNetwork;
    }

    public void setRegisteredUserNetwork(String userNetwork) {
        this.userNetwork = userNetwork;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public ArrayList<String> getComorbid() {
        return comorbid;
    }

    public void setComorbid(ArrayList<String> comorbid) {
        this.comorbid = comorbid;
    }

    public String getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(String surgeries) {
        this.surgeries = surgeries;
    }

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String Allergies) {
        this.Allergies = Allergies;
    }

    public String getSymptom() {
        return symptom;
    }

   

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }

    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public String getFoodService() {
        return foodService;
    }

    public void setFoodService(String foodService) {
        this.foodService = foodService;
    }

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
    }

    public String getHealthstatus() {
        return healthstatus;
    }

    public void setHealthstatus(String healthstatus) {
        this.healthstatus = healthstatus;
    }

    public String getNurseAssigned() {
        return nurseAssigned;
    }

    public void setNurseAssigned(String nurseAssigned) {
        this.nurseAssigned = nurseAssigned;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodpreference() {
        return foodpreference;
    }

    public void setFoodpreference(String foodpreference) {
        this.foodpreference = foodpreference;
    }

    public String getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(String isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

   
    
}
