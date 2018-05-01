package FinalProject;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.thymeleaf.spring4.SpringTemplateEngine;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven DeAugustine
 */
@Configuration
public class DBConfig{
    
    @Autowired
    SpringTemplateEngine engine;
    
    @Bean
    public DataSource datasource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/data");
        source.setUsername("root");
        source.setPassword("password");
        return source;
    }
    
    @Bean
    public AnnouncementDAOImpl getAnnouncementDAO(){
     return new AnnouncementDAOImpl(datasource());   
    }
    
    
}
