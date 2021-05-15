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
    
//    public Organization createOrg(Organization.Type type){
//        Organization organization = null;
//        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
//            organization = new DoctorOrganization();
//            orgList.add(organization);
//        }
//        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
//            organization = new LabOrganization();
//            orgList.add(organization);
//        }
//        return organization;
//    }
}
