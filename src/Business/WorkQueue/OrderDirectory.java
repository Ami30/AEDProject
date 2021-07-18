/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class OrderDirectory {
    ArrayList<OrderMedicine> orderList = new ArrayList<>();
    public ArrayList<OrderMedicine> getMedicineList() {
        if(orderList == null){
        orderList = new ArrayList<>();
        }
        return orderList;
    }
    
     public void addOrder(OrderMedicine medicine)
    {
        orderList.add(medicine);
    }
    
     public void removeOrder(OrderMedicine medicine)
    {
        orderList.remove(medicine);
    }
}
