/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SanitizationPerson;

/**
 *
 * @author amishagupta
 */
public class SanitizationServiceForm {
    private String serviceDate;
    private String status;

    public SanitizationServiceForm(String serviceDate, String status) {
        this.serviceDate = serviceDate;
        this.status = status;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
            @Override
    public String toString() {
        return serviceDate;
    }
    
}
