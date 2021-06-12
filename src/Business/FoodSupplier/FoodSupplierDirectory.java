/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

import Business.Pharmacist.Pharmacist;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class FoodSupplierDirectory {
     ArrayList<FoodSupplier> foodSupplierDirectory;

    public ArrayList<FoodSupplier> getfoodSupplierDirectory() {
        return foodSupplierDirectory;
    }

    public void setfoodSupplierDirectory(ArrayList<FoodSupplier> foodSupplierDirectory) {
        this.foodSupplierDirectory = foodSupplierDirectory;
    }
    
    public void addfoodSupplier(FoodSupplier foodSupplier)
    {
        foodSupplierDirectory.add(foodSupplier);
    }
    
    public void removefoodSupplier(FoodSupplier foodSupplier){
        for(FoodSupplier n:foodSupplierDirectory){
            if(n.getId().equalsIgnoreCase(foodSupplier.getId())){
                foodSupplierDirectory.remove(n);
            }
        }
    } 
}
