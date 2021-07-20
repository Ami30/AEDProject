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
public class SanitizationServiceDirectory {
    ArrayList<SanitizationService> sanitizationServiceList  = new ArrayList<>();

    public ArrayList<SanitizationService> getSanitizationServiceList() {
        if(sanitizationServiceList == null){
            sanitizationServiceList = new ArrayList<>();
        }
        return sanitizationServiceList;
    }

    public void setSanitizationServiceList(ArrayList<SanitizationService> saniServiceList) {
        this.sanitizationServiceList = saniServiceList;
    }
    
       public void addSanitizationServiceList(SanitizationService sanitizationService){
        sanitizationServiceList.add(sanitizationService);
    }
           public void removeSanitizationServiceList(SanitizationService sanitizationService){
               if(sanitizationServiceList!=null){
        sanitizationServiceList.remove(sanitizationService);}
    }
}
