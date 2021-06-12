/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PatientSupportEnterprise extends Enterprise{

    public PatientSupportEnterprise(String name) {
        super(name, EnterpriseType.PatientSupportServices);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
