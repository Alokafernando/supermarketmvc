package lk.ijse.carhire.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

    public static final String USER_NAME = "Admin";
    public static final String PASSWORD = "12";
    private static DbConnection dbConnection;
    private static Connection con;

    private static final String URL = "jdbc:mysql://localhost:3306/carregistation";
    private static Properties props = new Properties();

    static {
        props.setProperty("user", "root");
        props.setProperty("password", "homagama123");
    }


    private DbConnection() throws SQLException {
        con = DriverManager.getConnection(URL, props);
    }

    public static DbConnection getInstance() throws SQLException {
        return (null == dbConnection) ? dbConnection = new DbConnection() : dbConnection;
    }

    public Connection getConnection() {
        return con;
    }
}
