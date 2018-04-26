/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import FinalProject.AnnouncementDAO;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Steven DeAugustine
 */
@Entity
@Table(name = "announcements")
public class Announcement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    @Column(name = "title")
    private String title;
    
    @NotNull
    @Column(name = "body")
    private String body;
    
   
    
    public Announcement(){
        
    }
    
    public Announcement(long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    
    public long getID(){
     return id;   
    }
    
    public void setID(long id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    

    
    
}
