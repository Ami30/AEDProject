/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author amishagupta
 */
public class Patient extends Business.Person.Person {
private String bloodGroup;
private Boolean comorbid;
private String symptom;
private String doctorAssigned;
private String foodService;
private String pharmacy;
private String healthstatus;
private String nurseAssigned;
private String id;
private String foodpreference;
private Boolean isVaccinated;

    public Patient(String bloodGroup, Boolean comorbid, String symptom, String doctorAssigned, String foodService, String pharmacy, String healthstatus, String nurseAssigned, String id, String foodpreference, Boolean isVaccinated, String fullName, String dob, String gender, String address, String zipcode, String contactNumber, String email) {
        super(fullName, dob, gender, address, zipcode, contactNumber, email);
        this.bloodGroup = bloodGroup;
        this.comorbid = comorbid;
        this.symptom = symptom;
        this.doctorAssigned = doctorAssigned;
        this.foodService = foodService;
        this.pharmacy = pharmacy;
        this.healthstatus = healthstatus;
        this.nurseAssigned = nurseAssigned;
        this.id = id;
        this.foodpreference = foodpreference;
        this.isVaccinated = isVaccinated;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Boolean getComorbid() {
        return comorbid;
    }

    public void setComorbid(Boolean comorbid) {
        this.comorbid = comorbid;
    }

    public String getSymptom() {
        return symptom;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodpreference() {
        return foodpreference;
    }

    public void setFoodpreference(String foodpreference) {
        this.foodpreference = foodpreference;
    }

    public Boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    @Override
    public String toString() {
        return id;
    }

   
    
}
