/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class FoodProviderOrganization extends Organization{

//    public FoodProviderOrganization() {
//        super(Organization.Type.FoodProvider.getValue());
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new FoodServiceRole());
        return roles;
    }
          public FoodProviderOrganization(String name) {
        super(name);
    }

    @Override
    public Type getType() {
        return Organization.Type.FoodProvider;
    }
    

}
