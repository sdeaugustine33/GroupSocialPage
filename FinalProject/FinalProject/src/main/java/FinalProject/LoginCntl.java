/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import java.io.IOException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
;

/**
 *
 * @author Steven DeAugustine
 */

@Controller
public class LoginCntl {
    
    
    @Autowired
    AnnouncementRepository postRepo;
    
    @Autowired
    UserRepository userRepo;
    
    @Autowired
    private Notifications notifyService;

    @RequestMapping({"/","/login"})
    public String login(Login login) {
        return "login";
    } 

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPage(@Valid Login login, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
             notifyService.addErrorMessage("Please fill the form correctly!");
             return "/login";
        }
        notifyService.addInfoMessage("Login successful");
        return "home";
    }
    
    @RequestMapping("/register")
    public String register(Register register){
     return "register";   
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPage(@Valid User user, BindingResult bindingResult){
       User userExists = userRepo.findByUsername(user.getUsername());
       if(userExists != null){
        notifyService.addErrorMessage("There is already a user registered with that username");
        return "redirect:/register";
       }
       else{
           userRepo.save(user);
           notifyService.addInfoMessage("Successfull Registration");
       }
        return "redirect:/login";
    }
    
    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }
    
    @RequestMapping("/announcements")
    public String announcements(Model model){
  
        return "announcements";
       
    } 
    
    
    @RequestMapping("/createannouncement")
    public String createAnnouncement(Announcement announcement){
     return "createannouncement";   
    }
    
    @RequestMapping(value = "/createannouncement", method = RequestMethod.POST)
    public String newAnnouncement(@Valid Announcement announcement, BindingResult br){
        if(announcement.getBody() != null & announcement.getTitle() != null){
            notifyService.addInfoMessage("Announcement posted!");
            postRepo.save(announcement);
        }
        else{
         notifyService.addErrorMessage("Please complete form correctly!");
         return "redirect:/createannoucement";
        }
        return "redirect:/announcements";
    }
    
}

