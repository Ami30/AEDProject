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
public class SanitizationServiceFormDirectory {
    ArrayList<SanitizationServiceForm> sanFormList = new ArrayList<>();

    public ArrayList<SanitizationServiceForm> getSanFormList() {
        if(sanFormList == null){
            sanFormList = new ArrayList<>();  
        }
        return sanFormList;
    }

    public void setSanFormList(ArrayList<SanitizationServiceForm> sanFormList) {
        this.sanFormList = sanFormList;
    }
    
    public void addFormList(SanitizationServiceForm form){
                sanFormList.add(form);
    }
    
     public void removeFormList(SanitizationServiceForm form){
                sanFormList.remove(form);
    }
}
