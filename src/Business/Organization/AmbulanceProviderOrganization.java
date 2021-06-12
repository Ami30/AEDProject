/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class AmbulanceProviderOrganization extends Organization{

   public AmbulanceProviderOrganization() {
        super(Organization.Type.AmbulanceProviderOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new AmbulanceServiceRole());
        return roles;
    }
    
}
