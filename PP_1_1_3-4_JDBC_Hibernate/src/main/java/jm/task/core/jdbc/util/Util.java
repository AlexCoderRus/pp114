package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/myfirstsql_test";
    private static final String USER = "root";
    private static final String PASSWORD = "Rhenbpyfpdjybn1996";
    public static Connection getConnection() {

        Connection connection = null;

        try  {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed())
                System.out.println("Соединение установлено");
                return connection;
        }catch (SQLException ex){
            System.err.println("Соединение не установлено");
            ex.printStackTrace();
        }

       return connection; 
    }
}
