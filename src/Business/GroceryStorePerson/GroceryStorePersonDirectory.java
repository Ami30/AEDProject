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
public class GroceryStorePersonDirectory {
       ArrayList<GroceryStorePerson> groceryPersonDirectory;

    public ArrayList<GroceryStorePerson> getgroceryPersonDirectory() {
        return groceryPersonDirectory;
    }

    public void setgroceryPersonDirectory(ArrayList<GroceryStorePerson> groceryPersonDirectory) {
        this.groceryPersonDirectory = groceryPersonDirectory;
    }
      public GroceryStorePersonDirectory() {
        groceryPersonDirectory = new ArrayList();
    }
    
    public void addgroceryPerson(GroceryStorePerson groceryStorePerson)
    {
        groceryPersonDirectory.add(groceryStorePerson);
    }
    
    public boolean removegroceryPerson(GroceryStorePerson groceryStorePerson){
       for(int i=0;i<groceryPersonDirectory.size();i++){
        GroceryStorePerson g = groceryPersonDirectory.get(i);
        if(g.getId() == groceryStorePerson.getId()){
            groceryPersonDirectory.remove(g);
            return true;
        }
       
        
    }
    return false;
    } 
    public GroceryStorePerson findStorePerson(String username){
        GroceryStorePerson gsp = null;
        for(GroceryStorePerson p: groceryPersonDirectory){
            if(p.getUsername().equalsIgnoreCase(username)){
            gsp=p;
            }
        }
        return gsp;
    }
}
