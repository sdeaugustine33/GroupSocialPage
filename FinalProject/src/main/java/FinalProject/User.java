/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Steven DeAugustine
 */
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name = "userID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "fullname")
    private String name;
    
    @Column(name = "enabled")
    private boolean enabled;
    
    public User(){
        
    }
    
    public User (long id, String username, String password, String name, boolean enabled){
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.enabled = enabled;
        
    } 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString(){
        return "User: " + " id = " + id + " , username = " + username + ", password = " + password + " , name = " + name;
     }
}
