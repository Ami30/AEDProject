/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CabDriver;

import Business.AmbulanceDriver.*;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class CabServiceDirectory {
    ArrayList<CabService> cabServiceList = new ArrayList<>();

    public ArrayList<CabService> getCabServiceList() {
        if(cabServiceList == null){
        cabServiceList = new ArrayList<>();
        }
        return cabServiceList;
    }

    public void setAmbulanceServiceList(ArrayList<CabService> ambulanceServiceList) {
        this.cabServiceList = cabServiceList;
    }
    
    public void addService(CabService ambService){
        cabServiceList.add(ambService);
        }
    
    public void removeService(CabService ambService){
              if(cabServiceList!=null){
        cabServiceList.remove(ambService);}
    }
}
