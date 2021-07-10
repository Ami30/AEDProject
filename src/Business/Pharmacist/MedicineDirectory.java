/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class MedicineDirectory {
      ArrayList<Medicine> medicineList  = new ArrayList<>();

    public ArrayList<Medicine> getMedicineList() {
        if(medicineList == null){
            medicineList = new ArrayList<>();
        }
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
       public void addMedicineList(Medicine medicine){
        medicineList.add(medicine);
    }
          public void removeMedicineList(Medicine medicine){
              if(medicineList!=null){
        medicineList.remove(medicine);}
    }
}
