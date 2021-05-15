/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author amishagupta
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory accountDirectory;
    private EmployeeDirectory empDir;
    private int orgID;
    private static int counter=0;
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public enum Type{
        Admin("Admin Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        empDir = new EmployeeDirectory();
        accountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    public UserAccountDirectory getUserAccountDir() {
        return accountDirectory;
    }

    public int getOrgID() {
        return orgID;
    }

    public EmployeeDirectory getEmpDir() {
        return empDir;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
