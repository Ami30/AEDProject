/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class DoctorDirectory {
      ArrayList<Doctor> doctorDirectory;

    public ArrayList<Doctor> getdoctorDirectory() {
        return doctorDirectory;
    }

    public void setdoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public void addDoctor(Doctor doctor)
    {
        doctorDirectory.add(doctor);
    }
    
    public void removeDoctor(Doctor doctor){
        
        for(Doctor d:doctorDirectory){
            if(d.getId().equalsIgnoreCase(doctor.getId())){
                doctorDirectory.remove(d);
            }
        }
    }
}
