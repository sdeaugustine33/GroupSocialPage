/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import java.util.Objects;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven DeAugustine
 */
@Service
public class AuthenticateImpl implements Authenticate{
    @Override
    public boolean authenticate(String username, String password) {
         // Provide a sample password check: username == password
         username = "this";
         password = "password";
         return Objects.equals(username, password);
    }
}
