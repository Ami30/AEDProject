/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.NecessitiesEntAdminRole.NecessitiesEntAdminWorkAreaJPanel;

/**
 *
 * @author amishagupta
 */
public class NecessitiesEntAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
       return new NecessitiesEntAdminWorkAreaJPanel(userProcessContainer, useraccount, org, enterprise, system);
    }
    
}
