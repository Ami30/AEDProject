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
public class NecessitiesProviderEnterprise extends Enterprise{

//    public NecessitiesProviderEnterprise(String name) {
//        super(name, EnterpriseType.NecessitiesProvider);
//    }

 

    public NecessitiesProviderEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseType.NecessitiesProvider, name, contactNumber, email, address, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
