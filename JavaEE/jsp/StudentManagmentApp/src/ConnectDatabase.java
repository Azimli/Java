import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {


    public  static Connection connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java";
        String username ="root";
        String password ="";
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;
    }

}
