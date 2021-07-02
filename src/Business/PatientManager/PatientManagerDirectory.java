/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PatientManager;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PatientManagerDirectory {
    ArrayList<PatientManager> patientManagerDirectory = new ArrayList();

    public ArrayList<PatientManager> getPatientManagerDirectory() {
        if(patientManagerDirectory == null){
            patientManagerDirectory = new ArrayList();
        }
        return patientManagerDirectory;
    }

    public void setPatientManagerDirectory(ArrayList<PatientManager> patientManagerDirectory) {
        this.patientManagerDirectory = patientManagerDirectory;
    }
  
      public PatientManagerDirectory() {
//        patientManagerDirectory = new ArrayList();
    }
    public void addpatientManager(PatientManager pmanager)
    {
        patientManagerDirectory.add(pmanager);
    }
    
    public boolean removepatientManager(PatientManager pmanager){
     for(int i=0;i<patientManagerDirectory.size();i++){
        PatientManager p = patientManagerDirectory.get(i);
        if(p.getId() == pmanager.getId()){
            patientManagerDirectory.remove(p);
            return true;
        }
     }
        
    
    return false;
}
    
      public PatientManager findPatientManager(String username){
        PatientManager pat = null;
        for(PatientManager d: patientManagerDirectory){
            if(d.getUsername().equalsIgnoreCase(username)){
            pat=d;
            }
        }
        return pat;
    }
}
