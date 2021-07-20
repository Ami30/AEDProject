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
public class SanitizationService {
    private String sanitizationType;
    private String requiredtime;
    
    public SanitizationService(String sanitizationType, String requiredtime) {
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
    
    
       @Override
    public String toString() {
        return sanitizationType;
    }
    
}
