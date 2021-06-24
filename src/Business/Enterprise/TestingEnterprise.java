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
public class TestingEnterprise extends Enterprise{

//    public TestingEnterprise(String name) {
//        super(name, EnterpriseType.TestingUnits);
//    }

    

    public TestingEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseType.TestingUnits, name, contactNumber, email, address, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
