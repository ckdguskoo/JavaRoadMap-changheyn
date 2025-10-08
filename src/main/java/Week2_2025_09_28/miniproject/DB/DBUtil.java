package Week2_2025_09_28.miniproject.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        final String URL = "jdbc:mysql://localhost:3307/mini";
        final String USER = "root";
        final String PASSWORD = "root1234";

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
