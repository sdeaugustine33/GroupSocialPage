/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Steven DeAugustine
 */
public class Login {
    @Size(min=2,max=30, message = "Username size should be 2 -30")
    private String username;
    
    @NotNull
    @Size(min=1,max=50)
    private String password;

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
   
    
}