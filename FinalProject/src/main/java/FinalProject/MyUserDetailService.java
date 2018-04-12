/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Steven DeAugustine
 */
@Service
public class MyUserDetailService implements UserDetailsService{
    @Autowired
    private UserRepository userRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username){
     User user = userRepo.findByUsername(username);
     if(user == null){
        
         throw new UsernameNotFoundException(username);
         
     }
     return new MyUserPrincipal(user);
    }
    
}
