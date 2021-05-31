package ProjectoUF4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {
    public static void conectarBD(){

    }
    public static void desconectarBD(){

    }
    public static void inserirClients(){

    }
    public static void inserirVinils(Vinil vinil) {
        String jdbcURL = "jdbc:mysql://db-botigamusica.cyhzsvfuetec.us-east-1.rds.amazonaws.com/botigamusica";
        String user = "root";
        String password = "pastanaga";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(jdbcURL, user, password);
            connection.setAutoCommit(true);

            String sql= "INSERT INTO vinils (vinil_id, client_id, empleat_id, nom, preu, autor, any, estil)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,vinil.getVinil_id());
            statement.setInt(2,vinil.getClient_id());
            statement.setInt(3, vinil.getEmpleat_id());
            statement.setString(4, vinil.getNom());
            statement.setFloat(5, vinil.getPreu());
            statement.setString(6, vinil.getAutor());
            statement.setInt(7, vinil.getAny());
            statement.setString(8, vinil.getEstil());
            statement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}