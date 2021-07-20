/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplier;

/**
 *
 * @author amishagupta
 */
public class FoodPackageDailyForm {
    private String foodDate;
    private String mealtype;
    private String foodPackageName;

    public FoodPackageDailyForm(String foodDate, String mealtype, String foodPackageName) {
        this.foodDate = foodDate;
        this.mealtype = mealtype;
        this.foodPackageName = foodPackageName;
    }

    public String getFoodDate() {
        return foodDate;
    }

    public void setFoodDate(String foodDate) {
        this.foodDate = foodDate;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    public String getFoodPackageName() {
        return foodPackageName;
    }

    public void setFoodPackageName(String foodPackageName) {
        this.foodPackageName = foodPackageName;
    }
    
             @Override
    public String toString() {
        return foodDate;
    }
    
    
}
