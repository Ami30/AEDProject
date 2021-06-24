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
    
     public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        orgDir=new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return orgDir;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        FoodSupplyingUnits("Food Supplying Units"),
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
