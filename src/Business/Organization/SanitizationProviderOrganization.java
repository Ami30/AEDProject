/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SanitizationServiceRole;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class SanitizationProviderOrganization extends Organization{

    public SanitizationProviderOrganization() {
        super(Organization.Type.SanitizationProvider.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new SanitizationServiceRole());
        return roles;
    }
    
}
