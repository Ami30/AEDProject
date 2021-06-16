/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StorePersonRole;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class GroceryStoreOrganization extends Organization{

  public GroceryStoreOrganization() {
        super(Organization.Type.GroceryStore.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new StorePersonRole());
        return roles;
    }
    
}
