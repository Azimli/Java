package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class  DatabaseConnection {

   public static Connection initializeDatabase() throws SQLException,ClassNotFoundException {
       String dbDriver ="com.mysql.jdbc.Driver";
       String url ="jdbc:mysql://localhost:3306/java";
       String dbName ="java";
       String username ="root";
       String password ="";
       Class.forName(dbDriver);
       Connection conn = DriverManager.getConnection(url+dbName+username+password);
       return conn;
   }
}
