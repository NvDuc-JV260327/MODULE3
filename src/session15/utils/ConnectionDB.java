package session15.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/session15?createDatabaseIfNotExist=true";
    public static final String USERNAME = "root";
    public static final String PASSWORD =  "123456";

    public static Connection openConnection() {
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
