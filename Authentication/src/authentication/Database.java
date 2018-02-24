package authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Database {
    static Connection conn = null;
    public static void connect() {// this method is for creating a database and table if not exist
        
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\GihanUOM\\Documents\\NetBeansProjects\\Authentication\\Database.db";
            // create a connection to the database
            
            conn = DriverManager.getConnection(url);
            
           // System.out.println("Connection to SQLite has been established.");
            String sql = "CREATE TABLE IF NOT EXISTS users ( name text  PRIMARY KEY,dur_mean float NOT NULL ,fly_mean float NOT NULL)";
            
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }
    }
    public  boolean insert(String name, float dur_mean,float fly_mean) {//inserting data when registering a person
        String sql = "INSERT INTO users(name,dur_mean ,fly_mean) VALUES(?,?,?)";
        Boolean val=true;
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setFloat(2, dur_mean);
            pstmt.setFloat(3, fly_mean);
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            if(e.getErrorCode()==19){
                val=false;        
            }
            System.out.println(e.getMessage());
            System.out.println("insert nove");
        }
        return val;
    }
     public void selectAll(){//get all information in the database
        String sql = "SELECT name, dur_mean ,fly_mean FROM users";
        
        try (Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println( 
                                   rs.getString("name") + "\t" +
                                   rs.getFloat("dur_mean")+ "\t" +
                                    rs.getFloat("fly_mean"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("select nove");
        }
    }
     public ArrayList<String> allusers(){//get list of users from database
         ArrayList<String> userlist=new ArrayList<String>();
        String sql = "SELECT name FROM users";
        
        try (Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                userlist.add(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("cant get all");
        }
        return userlist;
    }
     
     public ArrayList<Float> getmeans(String name){//get mean values for a given user
         
         ArrayList<Float> times=new ArrayList<Float>();
               String sql = "SELECT  fly_mean,dur_mean "
                          + "FROM users WHERE name=  ?";
        
        try (PreparedStatement pstmt  = conn.prepareStatement(sql)){
            
            // set the value
            pstmt.setString(1,name);
            //
            ResultSet rs  = pstmt.executeQuery();
            
            // loop through the result set
            while (rs.next()) {
               
                Float fly=rs.getFloat("fly_mean");
                Float dur=rs.getFloat("dur_mean");
                times.add(dur);
                times.add(fly);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return times;
    }
     
    
}
