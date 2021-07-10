/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Tester;

import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public class TestsDirectory {
    ArrayList<Tests> testList  = new ArrayList<>();

    public ArrayList<Tests> getTestList() {
        if(testList == null){
            testList = new ArrayList<>();
        }
        return testList;
    }

    public void setTestList(ArrayList<Tests> testList) {
        this.testList = testList;
    }
    
       public void addTestsList(Tests test){
        testList.add(test);
    }
          public void removeTestsList(Tests test){
              if(testList!=null){
        testList.remove(test);}
    }
}
