package projeto.sistema.funcionario;

import java.sql.Connection; 
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s; 
    
    public Conn(){
    
        String url ="jdbc:mysql://localhost:3306/jdbcd";
        String username="root"; 
        String password ="";
        try{    
            Class.forName("com.mysql.jdbc.Driver");


           c = DriverManager.getConnection(url, username, password);
           s =  c.createStatement();
//            ResultSet resultSet = statement.executeQuery("Select * from login");
            
        } catch (Exception e){
            System.out.println(e);
        }
        
        
    }
           
}
