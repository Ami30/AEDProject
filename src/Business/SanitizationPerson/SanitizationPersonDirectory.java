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
    
    public void removesanitizationPerson(SanitizationPerson sanitizationPerson){
        for(SanitizationPerson n:sanitizationPersonDirectory){
            if(n.getId().equalsIgnoreCase(sanitizationPerson.getId())){
                sanitizationPersonDirectory.remove(n);
            }
        }
    } 
}
