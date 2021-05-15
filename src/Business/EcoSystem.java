/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package Business;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class EcoSystem {
    private static EcoSystem business;
   // private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
//    public Network createAndAddNetwork(){
//        Network network=new Network();
//        networkList.add(network);
//        return network;
//    }
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new Admin());
//        return roleList;
//    }
//    public Ecosystem(){
//        super(null);
//        networkList=new ArrayList<Network>();
//    }
//
//    public ArrayList<Network> getNetworkList() {
//        return networkList;
//    }
//
//    public void setNetworkList(ArrayList<Network> networkList) {
//        this.networkList = networkList;
//    }
//    
//    public boolean checkIfUserIsUnique(String userName){
//        if(!this.getUserDir().checkIfUsernameIsUnique(userName)){
//            return false;
//        }
//        for(Network network:networkList){
//            
//        }
//        return true;
//    }
}
