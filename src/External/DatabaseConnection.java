package External;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
        Connection conn = null;
        String url = "Jdbc:mysql://localhost:3306/";
        String dbName = "AddressBook";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String password = "";
        
        ResultSet rs = null;
        PreparedStatement pst = null;
        
        
    public DatabaseConnection(){
        
    }
    
    public void access(){
        try{      
        //Create Driver object
        Class.forName(driver).newInstance();
        //connection
        conn = DriverManager.getConnection(url+dbName,username,password);
        //statement
        Statement statement = conn.createStatement();
        //Create Driver object
        Class.forName(driver).newInstance();  
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
