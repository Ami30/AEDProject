/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceDriver;

import Business.CabDriver.*;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class AmbulanceDriverDirectory {
    ArrayList<AmbulanceDriver> ambulancedriverDirectory;

    public ArrayList<AmbulanceDriver> getambulanceDriverDirectory() {
        if(ambulancedriverDirectory == null){
        ambulancedriverDirectory = new ArrayList<>();
        }
       
        return ambulancedriverDirectory;
    }
    
       public AmbulanceDriverDirectory() {
       
            ambulancedriverDirectory = new ArrayList<>();    
    }
    

    public void setambulanceDriverDirectory(ArrayList<AmbulanceDriver> ambulancedriverDirectory) {
        this.ambulancedriverDirectory = ambulancedriverDirectory;
    }
    
    
    public void addambulanceDriver(AmbulanceDriver ambulancedriver){
        ambulancedriverDirectory.add(ambulancedriver);
    }
    
    
    public boolean removeambulanceDriver(AmbulanceDriver ambulancedriver){
            for(int i=0;i<ambulancedriverDirectory.size();i++){
        AmbulanceDriver p = ambulancedriverDirectory.get(i);
        if(p.getId() == ambulancedriver.getId()){
            ambulancedriverDirectory.remove(p);
            return true;
        }
     }
        
    return false;
    }

      public AmbulanceDriver findAmbulanceProvider(String username){
        AmbulanceDriver ambProvider = null;
        for(AmbulanceDriver d: ambulancedriverDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            ambProvider=d;
            }
        }
        return ambProvider;
    }
    
    
}
