/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientDirectory;

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public void addPatient(Patient patient)
    {
        patientDirectory.add(patient);
    }
    
    public void removePatient(Patient patient){
        for(Patient p:patientDirectory){
            if(p.getId().equalsIgnoreCase(patient.getId())){
                patientDirectory.remove(p);
            }
        }
    }
}
