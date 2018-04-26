/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Steven DeAugustine
 */
public class AnnouncementDAOImpl implements AnnouncementDAO{
   private JdbcTemplate jdbc;
   
   public AnnouncementDAOImpl(DataSource datasource){
       jdbc = new JdbcTemplate(datasource);
   }
   
   @Override
   public List<Announcement> list(){
       String sql = "SELECT * FROM announcements";
       RowMapper<Announcement> rm = new RowMapper<Announcement>(){
      
           @Override
           public Announcement mapRow(ResultSet rs, int rowNum) throws SQLException {
               Announcement a = new Announcement();
               a.setTitle(rs.getString("title"));
               a.setBody(rs.getString("body"));
               return a;
           }
       };
       return jdbc.query(sql, rm);
   }
   
   
}
