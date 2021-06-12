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
    
    public void addpharmacist(Pharmacist pharmacist)
    {
        pharmacistDirectory.add(pharmacist);
    }
    
    public void removepharmacist(Pharmacist pharmacist){
        for(Pharmacist n:pharmacistDirectory){
            if(n.getId().equalsIgnoreCase(pharmacist.getId())){
                pharmacistDirectory.remove(n);
            }
        }
    } 
}
