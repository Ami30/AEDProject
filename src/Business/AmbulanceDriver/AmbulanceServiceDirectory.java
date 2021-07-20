/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AmbulanceDriver;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class AmbulanceServiceDirectory {
    ArrayList<AmbulanceService> ambulanceServiceList = new ArrayList<>();

    public ArrayList<AmbulanceService> getAmbulanceServiceList() {
        if(ambulanceServiceList == null){
        ambulanceServiceList = new ArrayList<>();
        }
        return ambulanceServiceList;
    }

    public void setAmbulanceServiceList(ArrayList<AmbulanceService> ambulanceServiceList) {
        this.ambulanceServiceList = ambulanceServiceList;
    }
    
    public void addService(AmbulanceService ambService){
        ambulanceServiceList.add(ambService);
        }
    
    public void removeService(AmbulanceService ambService){
              if(ambulanceServiceList!=null){
        ambulanceServiceList.remove(ambService);}
    }
}
