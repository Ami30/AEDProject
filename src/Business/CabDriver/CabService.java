/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CabDriver;

import Business.AmbulanceDriver.*;

/**
 *
 * @author amishagupta
 */
public class CabService {
    private String serviceName;
    private String serviceType;

    public CabService(String serviceName, String serviceType) {
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    
           @Override
    public String toString() {
        return serviceName;
    }
    
}
