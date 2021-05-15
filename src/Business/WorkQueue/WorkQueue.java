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
public class WorkQueue {
     private ArrayList<WorkRequest> workRqstList;

    public WorkQueue() {
        workRqstList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRqstList() {
        return workRqstList;
    }
}
