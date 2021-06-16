/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amishagupta
 */
public abstract class Role  {
    
    public enum RoleType{
        DoctorRole("Doctor"),
        NurseRole("Nurse"),
        FoodServiceRole("Food Service"),
        CabServiceRole("Cab Service"),
        AmbulanceServiceRole("Ambulance Service"),
        DeliveryManRole("Delivery Man"),
        PharmacistRole("Pharmacist"),
        StorePersonRole("Store Person"),
        SanitizationServiceRole("Sanitization Service"),
        TestingServiceRole("Testing Service"),
        PatientManagerRole("Patient Manager"),
        FoodSupplyEntAdmin("Food Supplying Admin"),
        HospitalEntAdmin("Hospital Admin"),
        NecessitiesEntAdmin("Necessities Admin"),
        PatientSupportEntAdmin("Patient Support Admin"),
        SanitizationEntAdmin("Sanitization Admin"),
        TestingEntAdmin("Testing Provider Admin"),
        TransportationEntAdmin("Transportation Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount useraccount, 
            Organization org, 
            Enterprise enterprise, 
            EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
