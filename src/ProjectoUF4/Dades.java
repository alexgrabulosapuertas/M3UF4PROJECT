package ProjectoUF4;



import java.sql.*;
import java.util.ArrayList;

class CarregarClients {
    ConnexioBD connect = new ConnexioBD();
    Connection s = connect.getConnection();
    public void CarregarClient(ArrayList<Client> clients){
        try {
            /*PreparedStatement consulta = s.prepareStatement("INSERT");*/
            Statement stmt = s.createStatement();
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
                Client client = new Client(botigaId,nom,cognoms,dni,edat,sexe,telefon,email,adreca,poblacio,clientId);
                clients.add(client);
                System.out.println(clientId+" "+botigaId+" "+nom+" "+cognoms+" "+dni+" "+edat+" "+sexe+" "+telefon+" "+email+" "+adreca+" "+poblacio);
            }
            /*s.close();^*/
            connect.deconnectar();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class CarregarEmpleats {
    public static void carregarEmpleat(ArrayList<Empleat> empleats) {
        ConnexioBD connect = new ConnexioBD();
        Connection s = connect.getConnection();
        try {
            /*PreparedStatement consulta = s.prepareStatement("INSERT");*/
            Statement stmt = s.createStatement();
            ResultSet rs = stmt.executeQuery("select * from empleats");
            int empleatId, botigaId, edat;
            float salari;
            char sexe;
            String nom, cognoms, dni, telefon, email, adreca, poblacio;
            while (rs.next()) {
                empleatId = rs.getInt("empleat_id");
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
                salari = rs.getFloat("salari");
                Empleat empleat = new Empleat(botigaId,nom,cognoms,dni,edat,sexe,telefon,email,adreca,poblacio,empleatId,salari);
                empleats.add(empleat);
                System.out.println(empleatId+" "+botigaId+" "+nom+" "+cognoms+" "+dni+" "+edat+" "+sexe+" "+telefon+" "+email+" "+adreca+" "+poblacio);

            }
            /*s.close();^*/
            connect.deconnectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class CarregarBotigues {
    public static void carregarBotiga() {
        ConnexioBD connect = new ConnexioBD();
        Connection s = connect.getConnection();
        try {
            Statement stmt = s.createStatement();
            ResultSet rs = stmt.executeQuery("select * from botigues");
            int botigaId;
            String nom, adreca, poblacio;
            while (rs.next()) {
                botigaId = rs.getInt("botiga_id");
                nom = rs.getString("nom");
                adreca = rs.getString("adreca");
                poblacio = rs.getString("poblacio");
                Botiga botiga = new Botiga(botigaId,nom,adreca,poblacio);
                System.out.println(botigaId+" "+nom+" "+adreca+" "+poblacio);
                System.out.println(botiga);
            }
            connect.deconnectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Dades {
    public static void main(String[] args){
        ArrayList<Client> clients = new ArrayList<Client>();
        ArrayList<Empleat> empleats = new ArrayList<Empleat>();
        CarregarClients carregarClient = new CarregarClients();
        carregarClient.CarregarClient(clients);
        System.out.println(clients);
        CarregarEmpleats.carregarEmpleat(empleats);
        System.out.println(empleats);
        CarregarBotigues.carregarBotiga();

    }
}
