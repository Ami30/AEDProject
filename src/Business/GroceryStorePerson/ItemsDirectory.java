/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryStorePerson;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class ItemsDirectory {
   ArrayList<Items> itemsList  = new ArrayList<>();

    public ArrayList<Items> getItemsList() {
        if(itemsList == null){
            itemsList = new ArrayList<>();
        }
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }
    
       public void addItemsList(Items item){
        itemsList.add(item);
    }
           public void removeItemsList(Items item){
               if(itemsList!=null){
        itemsList.remove(item);}
    }
    
}
