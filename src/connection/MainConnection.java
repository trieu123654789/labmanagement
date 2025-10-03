package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MainConnection {
    public static Connection conn;
    public static Connection getConnection(){
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=LabManagement;encrypt=true;trustServerCertificate=true;", "sa","sqladmin");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex);
        }
        return conn;
    }
    
}
    
