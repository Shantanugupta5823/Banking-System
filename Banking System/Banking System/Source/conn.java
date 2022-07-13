package Source;
import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost/banking_system","root","Shantanu");  
        s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}