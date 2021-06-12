/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;


import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class DeliveryManDirectory {
      ArrayList<DeliveryMan> deliveryManDirectory;

    public ArrayList<DeliveryMan> getdeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setdeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public void adddeliveryMan(DeliveryMan deliveryMan)
    {
        deliveryManDirectory.add(deliveryMan);
    }
    
    public void removedeliveryMan(DeliveryMan deliveryMan){
        for(DeliveryMan n:deliveryManDirectory){
            if(n.getId().equalsIgnoreCase(deliveryMan.getId())){
                deliveryManDirectory.remove(n);
            }
        }
    } 
}
