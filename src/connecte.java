
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connecte {
    Connection con;
    public connecte(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/consultation", "root", "");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Echec de la connection à la BD");
        }
    }
    
}
