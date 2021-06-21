/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author amishagupta
 */
public class UserAccount {
    private String username;
    private String password;
    private Role role;
    private Employee emp;
    private WorkQueue workQueue;
    private String name;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee emp) {
        this.emp = emp;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return emp;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
}
