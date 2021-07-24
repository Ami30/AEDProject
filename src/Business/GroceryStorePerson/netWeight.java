/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryStorePerson;

import Business.DeliveryMan.DeliveryMan;

/**
 *
 * @author amishagupta
 */
public class netWeight {
    private String itemName;
    private int netWeight;
    private DeliveryMan deliveryMan;
    private String orderStatus;
    

    public netWeight(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.netWeight = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return netWeight;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setItemQuantity(int itemQuantity) {
        this.netWeight = itemQuantity;
    }
    @Override
    public String toString() {
        return itemName;
    }

    
}
