/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.DeliveryMan.DeliveryMan;
import Business.UserAccount.UserAccount;

/**
 *
 * @author amishagupta
 */
public class Medicine {
    private String medicineName;
    private String ExpiryDate;
    private String quantity;

    public Medicine(String medicineName, String ExpiryDate) {
        this.medicineName = medicineName;
        this.ExpiryDate = ExpiryDate;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
    
        @Override
    public String toString() {
        return medicineName;
    }

    
}
