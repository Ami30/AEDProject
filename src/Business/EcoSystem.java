/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class EcoSystem extends Organization {
    private static EcoSystem ecoSystem;
    private ArrayList<Network> ntwkList;
    
    
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new EcoSystem();
        }
        return ecoSystem;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        ntwkList.add(network);
        return network;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> listrole=new ArrayList<Role>();
        listrole.add(new SystemAdminRole());
        return listrole;
    }
    
    private EcoSystem(){
        super(null);
        ntwkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return ntwkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.ntwkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:ntwkList){
            
        }
        return true;
    }
}
