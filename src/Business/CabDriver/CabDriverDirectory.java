/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CabDriver;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class CabDriverDirectory {
    ArrayList<CabDriver> cabdriverDirectory;

    public ArrayList<CabDriver> getCabDriverDirectory() {
        return cabdriverDirectory;
    }
        public CabDriverDirectory() {
       
            cabdriverDirectory = new ArrayList<>();    
    }

    public void setCabDriverDirectory(ArrayList<CabDriver> cabdriverDirectory) {
        this.cabdriverDirectory = cabdriverDirectory;
    }
    
    
    public void addCabDriver(CabDriver cabdriver){
        cabdriverDirectory.add(cabdriver);
    }
    
    
    public boolean removeCabDriver(CabDriver cabdriver){
            for(int i=0;i<cabdriverDirectory.size();i++){
        CabDriver p = cabdriverDirectory.get(i);
        if(p.getId() == cabdriver.getId()){
            cabdriverDirectory.remove(p);
            return true;
        }
     }
        
    return false;
    }

    public CabDriver findCabProvider(String username){
        CabDriver cabProvider = null;
        for(CabDriver d: cabdriverDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            cabProvider=d;
            }
        }
        return cabProvider;
    }
    
}
