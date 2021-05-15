/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author amishagupta
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDir;
    
    public Network(){
        enterpriseDir=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }
      public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
