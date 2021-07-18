/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author amishagupta
 */
public class PersonalNotification {
    private String message;
    private String date;
    private String requestNumber;
    private String status;

    public PersonalNotification(String message, String date, String requestNumber) {
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

    public String getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(String requestNumber) {
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
