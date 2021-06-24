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
        if(nurseDirectory == null){
            nurseDirectory = new ArrayList();
        }
        return nurseDirectory;
    }

    public void setnurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }
    
    public NurseDirectory() {
//        nurseDirectory = new ArrayList();
    }
    public void addNurse(Nurse nurse)
    {
        nurseDirectory.add(nurse);
    }
    
    public boolean removeNurse(Nurse nurse){
     for(int i=0;i<nurseDirectory.size();i++){
        Nurse n = nurseDirectory.get(i);
        if(n.getId() == nurse.getId()){
            nurseDirectory.remove(n);
            return true;
        }
       
        
    }
    return false;
    
    }
}
