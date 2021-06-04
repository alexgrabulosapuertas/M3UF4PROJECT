package ProjectoUF4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirBD {
    private static Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://db-botigamusica.cyhzsvfuetec.us-east-1.rds.amazonaws.com/botigamusica";
    private static final String user = "root";
    private static final String password = "pastanaga";

    /**
     * Instrodueix el Vinil a la BD
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param vinil
     * @param cbd
     * @since 04/06/2021
     */
    public void inserirVinils(Vinil vinil, ConnexioBD cbd) {
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(true);

            String sql= "INSERT INTO vinils (vinil_id, client_id, empleat_id, nom, preu, autor, any, estil)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,vinil.getVinilId());
            statement.setInt(2,vinil.getClientId());
            statement.setInt(3, vinil.getEmpleatId());
            statement.setString(4, vinil.getNom());
            statement.setFloat(5, vinil.getPreu());
            statement.setString(6, vinil.getAutor());
            statement.setInt(7, vinil.getAny());
            statement.setString(8, vinil.getEstil());
            statement.execute();
            cbd.deconnectar();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /**
     * Instrodueix el Client a la BD
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param client
     * @param cbd
     * @since 04/06/2021
     */
    public void inserirClients(Client client, ConnexioBD cbd){
        try{
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(true);

            String sql = "INSERT INTO clients(client_id, botiga_id, nom, cognoms, dni, edat, sexe, telefon, email, adreca, poblacio)\n" +
                    "\tVALUES(?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, client.getClientId());
            statement.setInt(2,client.getBotigaId());
            statement.setString(3, client.getNom());
            statement.setString(4, client.getCognoms());
            statement.setString(5, client.getDNI());
            statement.setInt(6, client.getEdat());
            statement.setString(7, String.valueOf(client.getSexe()));
            statement.setString( 8, client.getTelefon());
            statement.setString( 9, client.getEmail());
            statement.setString(10, client.getAdreca());
            statement.setString(11, client.getPoblacio());
            statement.execute();
            cbd.deconnectar();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /**
     * Instrodueix el Instrument a la BD
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param instrument
     * @param cbd
     * @since 04/06/2021
     */
    public void inserirInstruments(Instrument instrument, ConnexioBD cbd){
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(true);

            String sql = "INSERT INTO instruments(instrument_id, tipus_id, client_id, empleat_id, nom, preu, material, color)\n" +
                    "\tVALUES(?,?,?,?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, instrument.getInstrumentId());
            statement.setInt(2, instrument.getTipus());
            statement.setInt(3, instrument.getClientId());
            statement.setInt(4, instrument.getEmpleatId());
            statement.setString(5, instrument.getNom());
            statement.setFloat(6, instrument.getPreu());
            statement.setString(7, instrument.getMaterial());
            statement.setString(8, instrument.getColor());
            statement.execute();
            cbd.deconnectar();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    /**
     * Instrodueix el Empleat a la BD
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param empleat
     * @param cbd
     * @since 04/06/2021
     */
    public void inserirEmpleats(Empleat empleat, ConnexioBD cbd){
        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(true);

            String sql = "INSERT INTO empleats(empleat_id, botiga_id, nom, cognoms, dni, edat, sexe, telefon, email, adreca, poblacio, salari)\n" +
                    "\tVALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, empleat.getEmpleatId());
            statement.setInt(2, empleat.getBotigaId());
            statement.setString(3, empleat.getNom());
            statement.setString(4, empleat.getCognoms());
            statement.setString(5, empleat.getDNI());
            statement.setInt(6,empleat.getEdat());
            statement.setString(7, String.valueOf(empleat.getSexe()));
            statement.setString(8, empleat.getTelefon());
            statement.setString(9, empleat.getEmail());
            statement.setString(10, empleat.getAdreca());
            statement.setString(11, empleat.getPoblacio());
            statement.setFloat(12, empleat.getSalari());
            statement.execute();
            cbd.deconnectar();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
