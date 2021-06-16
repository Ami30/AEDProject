/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.Tester.Tester;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PharmacistDirectory {
    ArrayList<Pharmacist> pharmacistDirectory;

    public ArrayList<Pharmacist> getpharmacistDirectory() {
        return pharmacistDirectory;
    }

    public void setpharmacistDirectory(ArrayList<Pharmacist> pharmacistDirectory) {
        this.pharmacistDirectory = pharmacistDirectory;
    }
    
     public PharmacistDirectory() {
        pharmacistDirectory = new ArrayList();
    }
    public void addpharmacist(Pharmacist pharmacist)
    {
        pharmacistDirectory.add(pharmacist);
    }
    
    public boolean removepharmacist(Pharmacist pharmacist){
     for(int i=0;i<pharmacistDirectory.size();i++){
        Pharmacist p = pharmacistDirectory.get(i);
        if(p.getId() == pharmacist.getId()){
            pharmacistDirectory.remove(p);
            return true;
        }
     }
        
    
    return false;
}
}
