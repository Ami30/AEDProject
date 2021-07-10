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
      public FoodSupplierDirectory() {

            foodSupplierDirectory = new ArrayList<>();

    }
    
    public void addfoodSupplier(FoodSupplier foodSupplier)
    {
        foodSupplierDirectory.add(foodSupplier);
    }
    
    public boolean removefoodSupplier(FoodSupplier foodSupplier){
         for(int i=0;i<foodSupplierDirectory.size();i++){
        FoodSupplier p = foodSupplierDirectory.get(i);
        if(p.getId() == foodSupplier.getId()){
            foodSupplierDirectory.remove(p);
            return true;
        }
     }
        
    return false;
    }
    
    public FoodSupplier findFoodSupplier(String username){
        FoodSupplier foodSup = null;
        for(FoodSupplier p: foodSupplierDirectory){
            if(p.getUsername().equalsIgnoreCase(username)){
            foodSup=p;
            }
        }
        return foodSup;
    }
}
