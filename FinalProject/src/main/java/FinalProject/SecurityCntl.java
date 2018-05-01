/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;




import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 *
 * @author Steven DeAugustine
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableWebSecurity
public class SecurityCntl extends WebSecurityConfigurerAdapter{
    
    @Autowired
    DataSource datasource;
    
    
    @Autowired
    private MyUserDetailService userDetailService;
    
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder authenticate) throws Exception{
        authenticate.userDetailsService(userDetailService)
                .passwordEncoder(getPasswordEncoder());
        authenticate.jdbcAuthentication().dataSource(datasource);
                              
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http
            .authorizeRequests()
                .antMatchers("/register","/css/**","/js/**","/img/**","/login").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
            .logout()
                .permitAll();
    }
    
    private PasswordEncoder getPasswordEncoder(){
        return new PasswordEncoder(){
            @Override
            public String encode(CharSequence cs) {
               return cs.toString();
            }

            @Override
            public boolean matches(CharSequence cs, String string) {
                return true;
            }
            
        };
    }
  
    
}
