/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class DriverDirectory {
    ArrayList<Driver> driverDirectory;

    public ArrayList<Driver> getDriverDirectory() {
        if(driverDirectory == null){
            driverDirectory = new ArrayList<>();
        }
        return driverDirectory;
    }

    public void setDriverDirectory(ArrayList<Driver> driverDirectory) {
        this.driverDirectory = driverDirectory;
    }
    
    
    public void addDriver(Driver driver){
        driverDirectory.add(driver);
    }
    
    
    public void removeDriver(Driver driver){
        for(Driver drv : driverDirectory){
            if(drv.getId().equalsIgnoreCase(driver.getId())){
                driverDirectory.remove(drv);
            }
        }
    }

    
    
}
