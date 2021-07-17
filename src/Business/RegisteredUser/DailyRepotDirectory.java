/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisteredUser;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class DailyRepotDirectory {
    ArrayList<DailyReportSheet> dailyReportList = new ArrayList<>();

    public ArrayList<DailyReportSheet> getDailyReportList() {
        if(dailyReportList == null){
            dailyReportList = new ArrayList<>();
        }
        return dailyReportList;
    }
     public void addDailyReport(DailyReportSheet sheet)
    {
        dailyReportList.add(sheet);
    }
    
     public void removeDailyReport(DailyReportSheet sheet)
    {
        dailyReportList.remove(sheet);
    }
}
