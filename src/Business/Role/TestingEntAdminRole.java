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
import ui.TestingEntAdminRole.TestingAdminWorkAreaJPanel;

/**
 *
 * @author amishagupta
 */
public class TestingEntAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization org, Enterprise enterprise, EcoSystem system) {
        return new TestingAdminWorkAreaJPanel(userProcessContainer, useraccount, org, enterprise, system);
    }
    
}
