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
public class FoodPackageDailyFormDirectory {
    ArrayList<FoodPackageDailyForm> dailyFoodFormList = new ArrayList<>();

    public ArrayList<FoodPackageDailyForm> getDailyFoodFormList() {
        if(dailyFoodFormList == null){
            dailyFoodFormList = new ArrayList<>();
        }
        return dailyFoodFormList;
    }
    
    public void addFormList(FoodPackageDailyForm form){
                dailyFoodFormList.add(form);
    }
    
     public void removeFormList(FoodPackageDailyForm form){
                dailyFoodFormList.remove(form);
    }
    
}
