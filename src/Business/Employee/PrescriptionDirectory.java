/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PrescriptionDirectory {
    ArrayList<Prescription> prescriptionList  = new ArrayList<>();

    public ArrayList<Prescription> getPrescriptionList() {
        if(prescriptionList == null){
            prescriptionList = new ArrayList<>();
        }
        return prescriptionList;
    }

    
       public void addPrescriptionList(Prescription prescription){
        prescriptionList.add(prescription);
    }
          public void removePrescriptionList(Prescription prescription){
        prescriptionList.remove(prescription);
    }
    
}
