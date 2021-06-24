/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

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
    
    public Organization createOrg(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.AmbulanceProvider.getValue())){
            organization = new AmbulanceProviderOrganization();
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.CabProvider.getValue())){
            organization = new CabProviderOrganization();
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.DeliveryMan.getValue())){
            organization = new DeliveryManOrganization();
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.FoodProvider.getValue())){
            organization = new FoodProviderOrganization();
            orgList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.GroceryStore.getValue())){
            organization = new GroceryStoreOrganization();
            orgList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Nurse.getValue())){
            organization = new NurseOrganization();
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.PatientManager.getValue())){
            organization = new PatientManagerOrganization();
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.SanitizationProvider.getValue())){
            organization = new SanitizationProviderOrganization();
            orgList.add(organization);
        }
            else if (type.getValue().equals(Organization.Type.TestingProvider.getValue())){
            organization = new TestingProviderOrganization();
            orgList.add(organization);
        }
        return organization;
    }
  
}
