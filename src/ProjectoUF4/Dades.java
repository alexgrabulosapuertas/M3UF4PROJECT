package ProjectoUF4;

import java.sql.*;
class CarregarClients {
    public static void CarregarClient() {
        try {
            /*Connection connection = null;*/
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://db-botigamusica.cyhzsvfuetec.us-east-1.rds.amazonaws.com/botigamusica", "root", "pastanaga");
            //here sonoo is database name, root is username and password
            /*boolean valid = connection.isValid(50000);
            System.out.println(valid ? "OK" : "FAIL");*/
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from clients");
            int clientId, botigaId, edat;
            char sexe;
            String nom, cognoms, dni, telefon, email, adreca, poblacio;
            while (rs.next()) {
                clientId = rs.getInt("client_id");
                botigaId = rs.getInt("botiga_id");
                nom = rs.getString("nom");
                cognoms = rs.getString("cognoms");
                dni = rs.getString("dni");
                edat = rs.getInt("edat");
                sexe = rs.getString("sexe").charAt(0);
                telefon = rs.getString("telefon");
                email = rs.getString("email");
                adreca = rs.getString("adreca");
                poblacio = rs.getString("poblacio");
                Client client = new Client(clientId, botigaId,nom,cognoms,dni,edat,sexe,telefon,email,adreca,poblacio);
                System.out.println(clientId+" "+botigaId+" "+nom+" "+cognoms+" "+dni+" "+edat+" "+sexe+" "+telefon+" "+email+" "+adreca+" "+poblacio);

            }
            rs.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Dades {
    public static void main(String[] args) {
        CarregarClients.CarregarClient();
    }
}
