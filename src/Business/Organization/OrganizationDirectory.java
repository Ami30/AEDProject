/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class OrganizationDirectory {
     private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }
    
    public Organization createOrg(Type type,String name){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization(name);
            orgList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.AmbulanceProvider.getValue())){
            organization = new AmbulanceProviderOrganization(name);
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.CabProvider.getValue())){
            organization = new CabProviderOrganization(name);
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.DeliveryMan.getValue())){
            organization = new DeliveryManOrganization(name);
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.FoodProvider.getValue())){
            organization = new FoodProviderOrganization(name);
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.GroceryStore.getValue())){
            organization = new GroceryStoreOrganization(name);
            orgList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization(name);
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.PatientManager.getValue())){
            organization = new PatientManagerOrganization(name);
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization(name);
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.SanitizationProvider.getValue())){
            organization = new SanitizationProviderOrganization(name);
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.TestingProvider.getValue())){
            organization = new TestingProviderOrganization(name);
            orgList.add(organization);
        }
        return organization;
    }
    public Organization getOrganization(String name){
       Organization organization = null;
       for(Organization org : orgList){
           if(org.getType().getValue().equalsIgnoreCase(name)){
               organization = org;
           }
       }
       return organization;
    }
  
}
