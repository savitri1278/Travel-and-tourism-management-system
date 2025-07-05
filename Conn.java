
package travel.management.system;

 import java.sql.*;  
public class Conn {
    Connection c;
    Statement s;
    Conn(){
       
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
           c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","savi"); 
            
            s =c.createStatement();  
              }catch(Exception e){ 
                  e.printStackTrace();
         //   System.out.println(e);
              }
    }
}
