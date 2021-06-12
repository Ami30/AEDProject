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
public class TesterDirectory {
    ArrayList<Tester> testerDirectory;

    public ArrayList<Tester> gettesterDirectory() {
        return testerDirectory;
    }

    public void settesterDirectory(ArrayList<Tester> testerDirectory) {
        this.testerDirectory = testerDirectory;
    }
    
    public void addtester(Tester tester)
    {
        testerDirectory.add(tester);
    }
    
    public void removetester(Tester tester){
        for(Tester n:testerDirectory){
            if(n.getId().equalsIgnoreCase(tester.getId())){
                testerDirectory.remove(n);
            }
        }
    } 
}
