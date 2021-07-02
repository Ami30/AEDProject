/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.TestingServiceRole;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class TestingProviderOrganization extends Organization {

//   public TestingProviderOrganization() {
//        super(Organization.Type.TestingProvider.getValue());
//    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new TestingServiceRole());
        return roles;
    }
          public TestingProviderOrganization(String name) {
        super(name);
    }

    @Override
    public Type getType() {
        return Organization.Type.TestingProvider;
    }
}
