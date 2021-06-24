/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class HospitalEnterprise extends Enterprise{
    
    private String numberOfBeds;

//    public HospitalEnterprise(String name) {
//        super(name, EnterpriseType.Hospital);
//    }

    public HospitalEnterprise(String numberOfBeds, String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseType.Hospital, name, contactNumber, email, address, zipcode);
        this.numberOfBeds = numberOfBeds;
    }

      
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
