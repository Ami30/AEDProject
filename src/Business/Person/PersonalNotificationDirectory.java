/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import javax.management.Notification;

/**
 *
 * @author amishagupta
 */
public class PersonalNotificationDirectory {
    ArrayList<PersonalNotification> notificationList = new ArrayList<>();

    public ArrayList<PersonalNotification> getNotificationList() {
        if(notificationList == null){
            notificationList = new ArrayList<>();
        }
        return notificationList;
    }
     public void addNotification(PersonalNotification notification)
    {
        notificationList.add(notification);
    }
    
     public void removeDailyReport(PersonalNotification notification)
    {
        notificationList.remove(notification);
    }
    
}
