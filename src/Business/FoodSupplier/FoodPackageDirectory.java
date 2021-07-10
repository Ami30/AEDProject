/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class FoodPackageDirectory {
    ArrayList<FoodPackage> foodTypeList  = new ArrayList<>();

    public ArrayList<FoodPackage> getFoodTypeList() {
        if(foodTypeList == null){
            foodTypeList = new ArrayList<>();
        }
        return foodTypeList;
    }

    public void setFoodTypeList(ArrayList<FoodPackage> foodTypeList) {
        this.foodTypeList = foodTypeList;
    }
    
       public void addFoodTypeList(FoodPackage foodType){
        foodTypeList.add(foodType);
    }
           public void removeFoodTypeList(FoodPackage foodType){
               if(foodTypeList!=null){
        foodTypeList.remove(foodType);
               }
    }
    
   
           
}
