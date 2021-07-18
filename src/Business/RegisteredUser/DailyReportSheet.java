/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisteredUser;

/**
 *
 * @author amishagupta
 */
public class DailyReportSheet {
    private String date;
    private String timeSlot;
    private String fever;
    private String oxygenSaturation;
    private String bloodPressure;
    private String heartRate;
    private String otherDetails;

    public DailyReportSheet(String date, String timeSlot, String fever, String oxygenSaturation, String bloodPressure, String heartRate, String otherDetails) {
        this.date = date;
        this.timeSlot = timeSlot;
        this.fever = fever;
        this.oxygenSaturation = oxygenSaturation;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.otherDetails = otherDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getOxygenSaturation() {
        return oxygenSaturation;
    }

    public void setOxygenSaturation(String oxygenSaturation) {
        this.oxygenSaturation = oxygenSaturation;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }
    
     @Override
    public String toString() {
        return String.valueOf(date);
    }
}
