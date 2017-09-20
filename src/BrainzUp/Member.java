/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrainzUp;

import java.io.Serializable;

/**
 *
 * @author Vali
 */
public class Member implements Serializable {
    
    private String name;
    private String password;
    
    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String viewAll() {
        return "Player: " + name + "\nPassword: " + password;
    }
    
}
