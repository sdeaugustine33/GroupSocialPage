/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

/**
 *
 * @author Steven DeAugustine
 */
public class User {
    private long id;
    private String username;
    private String password;
    private String name;
    
    
    
    public User (long id, String username, String name){
        this.id = id;
        this.username = username;
        this.name = name;
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
