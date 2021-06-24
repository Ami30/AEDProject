/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author amishagupta
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory orgDir;
    
//     public Enterprise(String name,EnterpriseType type){
//        super(name);
//        this.enterpriseType=type;
//        orgDir=new OrganizationDirectory();
//    }

    public Enterprise(EnterpriseType enterpriseType, String name, String contactNumber, String email, String address, String zipcode) {
        super(name, contactNumber, email, address, zipcode);
        this.enterpriseType = enterpriseType;
        this.orgDir = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return orgDir;
    }
    
    public enum EnterpriseType{
        FoodSupplyingUnits("Food Supplying Units"),
        Hospital("Hospital"),
        Transportation("Transpotation"),
        SanitizationUnits("Sanitization Units"),
        TestingUnits("Testing Units"),
        PatientSupportServices("Patient Support Services"),
        NecessitiesProvider("Necessities Provider");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
   
}
