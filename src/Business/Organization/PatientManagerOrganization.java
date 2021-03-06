/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PatientManagerRole;
import Business.Role.Role;
import Business.WorkQueue.HealthRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PatientManagerOrganization extends Organization{

//    public PatientManagerOrganization() {
//        super(Organization.Type.PatientManager.getValue());
//    }
//    private HealthRequestDirectory requestDirectory = new HealthRequestDirectory();
//
//    public HealthRequestDirectory getRequestDirectory() {
//        if(requestDirectory == null){
//            requestDirectory = new HealthRequestDirectory();
//        }
//        return requestDirectory;
//    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList();
        roles.add(new PatientManagerRole());
        return roles;
    }
          public PatientManagerOrganization(String name) {
        super(name);
    }

    @Override
    public Type getType() {
        return Organization.Type.PatientManager;
    }
    
}
