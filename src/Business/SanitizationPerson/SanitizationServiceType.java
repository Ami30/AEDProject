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
public class SanitizationServiceType {
    private String sanitizationType;
    private String requiredtime;
    private String status;
    private String sanitizationRemark;
    private String sanitizationDate;
    public SanitizationServiceType(String sanitizationType, String requiredtime) {
        this.sanitizationType = sanitizationType;
        this.requiredtime = requiredtime;
    }

    
    
    public String getSanitizationType() {
        return sanitizationType;
    }

    public void setSanitizationType(String SanitizationType) {
        this.sanitizationType = SanitizationType;
    }

    public String getRequiredtime() {
        return requiredtime;
    }

    public void setRequiredtime(String requiredtime) {
        this.requiredtime = requiredtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String RequestStatus) {
        this.status = RequestStatus;
    }

    public String getSanitizationRemark() {
        return sanitizationRemark;
    }

    public void setSanitizationRemark(String sanitizationRemark) {
        this.sanitizationRemark = sanitizationRemark;
    }

    public String getSanitizationDate() {
        return sanitizationDate;
    }

    public void setSanitizationDate(String sanitizationDate) {
        this.sanitizationDate = sanitizationDate;
    }
    
    
    
       @Override
    public String toString() {
        return sanitizationType;
    }
    
}
