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
    private int medicineQuantity;
    private DeliveryMan deliveryMan;
    private String orderstatus;
    

    public Medicine(String medicineName, int medicineQuantity) {
        this.medicineName = medicineName;
        this.medicineQuantity = medicineQuantity;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
    
    
        @Override
    public String toString() {
        return medicineName;
    }

    
}
