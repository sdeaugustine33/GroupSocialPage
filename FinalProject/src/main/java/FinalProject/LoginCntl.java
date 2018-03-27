/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Steven DeAugustine
 */

@Controller
public class LoginCntl {
    
    @Autowired
    private Authenticate authenticate;

    @Autowired
    private Notifications notifyService;

    @RequestMapping("/")
    public String login(Login login) {
        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String loginPage(@Valid Login login, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
             notifyService.addErrorMessage("Please fill the form correctly!");
             return "/login";
        }

        if (!authenticate.authenticate(
             login.getUsername(), login.getPassword())) {
             notifyService.addErrorMessage("Invalid login!");
             return "/login";
        }

        notifyService.addInfoMessage("Login successful");
        return "redirect:/";
    }
    
    @RequestMapping("/register")
    public String register(Register register){
     return "register";   
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPage(Register register){
        return "/register";
    }
    
}

