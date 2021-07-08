/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author amishagupta
 */
public class Prescription {
    private String comment;
    private String prescription;
    private String nextConsultationRequired;
    private String date;

    public Prescription(String comment, String prescription, String nextConsultationRequired, String date) {
        this.comment = comment;
        this.prescription = prescription;
        this.nextConsultationRequired = nextConsultationRequired;
        this.date = date;
    }

    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getNextConsultationRequired() {
        return nextConsultationRequired;
    }

    public void setNextConsultationRequired(String nextConsultationRequired) {
        this.nextConsultationRequired = nextConsultationRequired;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
