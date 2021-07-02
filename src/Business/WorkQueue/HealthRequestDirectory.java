/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class HealthRequestDirectory {
    private ArrayList<HealthRequest> requestList = new ArrayList<>();

    public ArrayList<HealthRequest> getRequestList() {
        if(requestList == null){
            requestList = new ArrayList<>();
        }
        return requestList;
    }

    public void setRequestList(ArrayList<HealthRequest> requestList) {
        this.requestList = requestList;
    }
    public void addRequestList(HealthRequest req){
        requestList.add(req);
    }
    
}
