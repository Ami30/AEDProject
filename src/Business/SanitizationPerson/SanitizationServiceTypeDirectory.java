/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class SanitizationServiceTypeDirectory {
    ArrayList<SanitizationServiceType> sanitizationServiceList  = new ArrayList<>();

    public ArrayList<SanitizationServiceType> getSanitizationServiceList() {
        if(sanitizationServiceList == null){
            sanitizationServiceList = new ArrayList<>();
        }
        return sanitizationServiceList;
    }

    public void setSanitizationServiceList(ArrayList<SanitizationServiceType> saniServiceList) {
        this.sanitizationServiceList = saniServiceList;
    }
    
       public void addSanitizationServiceList(SanitizationServiceType sanitizationService){
        sanitizationServiceList.add(sanitizationService);
    }
           public void removeSanitizationServiceList(SanitizationServiceType sanitizationService){
               if(sanitizationServiceList!=null){
        sanitizationServiceList.remove(sanitizationService);}
    }
}
