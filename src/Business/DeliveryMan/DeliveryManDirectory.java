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
      public ArrayList<DeliveryMan> DeliveryManDirectory() {
         if(deliveryManDirectory == null){
            deliveryManDirectory = new ArrayList<>();
        }
        return deliveryManDirectory;
    }
    
    public void adddeliveryMan(DeliveryMan deliveryMan)
    {
        deliveryManDirectory.add(deliveryMan);
    }
    
    public boolean removedeliveryMan(DeliveryMan deliveryMan){
       for(int i=0;i<deliveryManDirectory.size();i++){
        DeliveryMan d = deliveryManDirectory.get(i);
        if(d.getId() == deliveryMan.getId()){
            deliveryManDirectory.remove(d);
            return true;
        }
       
        
    }
    return false;
    } 
}
