package ProjectoUF4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexioBD {
    private static Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "pastanaga";
    private static final String url = "jdbc:mysql://db-botigamusica.cyhzsvfuetec.us-east-1.rds.amazonaws.com/botigamusica";

    /**
     * Es connecta a la BD utilitzant l'url, l'usuari i la contrasenya
     * @since 04/06/2021
     */
    public ConnexioBD() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);


        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al connectar amb la base de dades:" + e);
        }
    }

    /**
     * Obtenir la connecció
     * @return
     * @since 04/06/2021
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * Desconnecctar de la BD
     * @since 04/06/2021
     */
    public void deconnectar() {
        connection = null;
    }
}
