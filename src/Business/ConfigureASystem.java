/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author amishagupta
 */
public class ConfigureASystem {
       public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
    
       // Employee employee = ecosystem.getEmpDir().createEmp("SystemAdmin");
        
       // UserAccount useraccount = ecosystem.getUserAccountDir().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
       
       UserAccount userAccount=new UserAccount("sysadmin", "sysadmin","System Admin", new SystemAdminRole());
       ecosystem.getUserAccountDir().addUserAccount(userAccount);
        
        return ecosystem;
    }
    
}
