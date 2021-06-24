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
public class TranspotationEnterprise extends Enterprise{

//    public TranspotationEnterprise(String name) {
//        super(name, EnterpriseType.Transportation);
//    }   
    

    public TranspotationEnterprise(String name, String contactNumber, String email, String address, String zipcode) {
        super(EnterpriseType.Transportation, name, contactNumber, email, address, zipcode);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
