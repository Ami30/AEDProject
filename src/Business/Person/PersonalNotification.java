/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.WorkQueue.HealthRequest;

/**
 *
 * @author amishagupta
 */
public class PersonalNotification {
    private String message;
    private String date;
    private HealthRequest requestNumber;
    private String status;

    public PersonalNotification(String message, String date, HealthRequest requestNumber) {
        this.message = message;
        this.date = date;
        this.requestNumber = requestNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HealthRequest getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(HealthRequest requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  
 
      @Override
    public String toString() {
        return String.valueOf(date);
    }
}
