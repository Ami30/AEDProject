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
public class SanitizationPersonDirectory {
     ArrayList<SanitizationPerson> sanitizationPersonDirectory;

    public ArrayList<SanitizationPerson> getsanitizationPersonDirectory() {
        return sanitizationPersonDirectory;
    }

    public void setsanitizationPersonDirectory(ArrayList<SanitizationPerson> sanitizationPersonDirectory) {
        this.sanitizationPersonDirectory = sanitizationPersonDirectory;
    }
    
    public void addsanitizationPerson(SanitizationPerson sanitizationPerson)
    {
        sanitizationPersonDirectory.add(sanitizationPerson);
    }
        public ArrayList<SanitizationPerson> SanitizationPersonDirectory() {
         if(sanitizationPersonDirectory == null){
            sanitizationPersonDirectory = new ArrayList<>();
        }
        return sanitizationPersonDirectory;
    }
    
    public boolean removesanitizationPerson(SanitizationPerson sanitizationPerson){
        for(int i=0;i<sanitizationPersonDirectory.size();i++){
        SanitizationPerson p = sanitizationPersonDirectory.get(i);
        if(p.getId() == sanitizationPerson.getId()){
            sanitizationPersonDirectory.remove(p);
            return true;
        }
     }
        
    
    return false;
    } 
}
