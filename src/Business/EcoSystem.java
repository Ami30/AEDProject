/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.RegisteredUser.RegisteredUserDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class EcoSystem extends Organization {
    private static EcoSystem ecoSystem;
    private ArrayList<Network> ntwkList;
//    private UserAccountDirectory userAccountDirectory;
    
    private RegisteredUserDirectory registeredUserDirectory;
    
    public static EcoSystem getInstance(){
        if(ecoSystem==null){
            ecoSystem=new EcoSystem();
        }
        return ecoSystem;
    }
    public static void setInstance(EcoSystem system) {
        ecoSystem = system;
    }
    public Network createAndAddNetwork(String name){
        Network network=new Network(name);
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

    public RegisteredUserDirectory getRegisteredUserDirectory() {
        if(registeredUserDirectory==null){
            registeredUserDirectory=new RegisteredUserDirectory();
        }
       
        return registeredUserDirectory;
    }

//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

   
    public void setPatientDirectory(RegisteredUserDirectory patientDirectory) {
        this.registeredUserDirectory = patientDirectory;
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
