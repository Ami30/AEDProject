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
public class FoodPackage {
    private String foodPackageName;
    private String foodPackageDetails;
    private String status;
    private String foodProviderRemark;
    private String StartDate;
    private String CompletedDate;
    public FoodPackage(String foodType, String foodPackageDetails) {
        this.foodPackageName = foodType;
        this.foodPackageDetails = foodPackageDetails;
    }

    public String getFoodPackageName() {
        return foodPackageName;
    }

    public void setFoodPackageName(String foodPackageName) {
        this.foodPackageName = foodPackageName;
    }

    public String getFoodPackageDetails() {
        return foodPackageDetails;
    }

    public void setFoodPackageDetails(String foodPackageDetails) {
        this.foodPackageDetails = foodPackageDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFoodProviderRemark() {
        return foodProviderRemark;
    }

    public void setFoodProviderRemark(String foodProviderRemark) {
        this.foodProviderRemark = foodProviderRemark;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getCompletedDate() {
        return CompletedDate;
    }

    public void setCompletedDate(String CompletedDate) {
        this.CompletedDate = CompletedDate;
    }

    @Override
    public String toString() {
        return foodPackageName;
    }
    
    
}
