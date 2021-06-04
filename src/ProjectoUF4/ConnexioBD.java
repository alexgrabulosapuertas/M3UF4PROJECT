package ProjectoUF4;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnexioBD {
    private static Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://db-botigamusica.cyhzsvfuetec.us-east-1.rds.amazonaws.com/botigamusica";
    private static final String user = "root";
    private static final String password = "pastanaga";

    public ConnexioBD() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al connectar amb la base de dades:" + e);
        }
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void deconnectar() {
        connection = null;
    }
}