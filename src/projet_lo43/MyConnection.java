package projet_lo43;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    
    static Connection con = null;
    //creer un fonction de connexion a la base de donné
    public static Connection connect(){
        
      try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baselo43","root","");
      }catch (SQLException ex){
          System.out.println(ex.getMessage());
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
      
          return con;
    }
    
    public static Connection getConnection(){
        return con;
    }
    
}
