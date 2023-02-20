package University;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "system");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//1.Register the Driver class
//2.Creating  Connection String 
//3.Creating Statement
//4.Executing MySQL Queries
//5.Closing the Connection
