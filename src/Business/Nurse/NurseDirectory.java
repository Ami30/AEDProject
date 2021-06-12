/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurse;


import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class NurseDirectory {
    
    ArrayList<Nurse> nurseDirectory;

    public ArrayList<Nurse> getnurseDirectory() {
        return nurseDirectory;
    }

    public void setnurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    
    public void addNurse(Nurse nurse)
    {
        nurseDirectory.add(nurse);
    }
    
    public void removeNurse(Nurse nurse){
        for(Nurse n:nurseDirectory){
            if(n.getId().equalsIgnoreCase(nurse.getId())){
                nurseDirectory.remove(n);
            }
        }
    }
    
    
}
