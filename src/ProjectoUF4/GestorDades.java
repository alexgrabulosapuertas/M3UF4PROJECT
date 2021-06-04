package ProjectoUF4;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDades {
    ConnexioBD connect = new ConnexioBD();
    Connection c = connect.getConnection();

    /**
     * Es connecta a la BD, crea un Client per a cada client i l'afegeix a l'ArrayList<Client>
     * Li passan l'objecte de la Botiga per a poder accedir a les seves funcions
     * @param botiga
     * @since 04/06/2021
     */
    public void CarregarClient(Botiga botiga){
        try {
            botiga.setClients(new ArrayList<Client>());
            Statement stmt = c.createStatement();
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
                botiga.afegirClient(client);
            }
            connect.deconnectar();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * Es connecta a la BD, crea un Empleat per a cada empleat i l'afegeix a l'ArrayList<Empleat>
     * Li passan l'objecte de la Botiga per a poder accedir a les seves funcions
     * @param botiga
     * @since 04/06/2021
     */
    public void carregarEmpleat(Botiga botiga) {
        try {
            botiga.setEmpleats(new ArrayList<Empleat>());
            Statement stmt = c.createStatement();
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
                Empleat empleat = new Empleat(botigaId, nom, cognoms, dni, edat, sexe, telefon, email, adreca, poblacio, empleatId, salari);
                botiga.afegirEmpleat(empleat);

            }
            connect.deconnectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * Es connecta a la BD, crea un Vinil per a cada vinil i l'afegeix a l'ArrayList<Vinil>
     * Li passan l'objecte de la Botiga per a poder accedir a les seves funcions
     * @param botiga
     * @since 04/06/2021
     */
    public void carregarVinils(Botiga botiga) {
        try {
            botiga.setVinils(new ArrayList<Vinil>());
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from vinils");
            int vinilId, clientId, empleatId, any;
            float preu;
            String nom, autor, estil;
            while (rs.next()) {
                vinilId =  rs.getInt("vinil_id");
                empleatId = rs.getInt("empleat_id");
                clientId = rs.getInt("client_id");
                nom = rs.getString("nom");
                autor = rs.getString("autor");
                preu = rs.getFloat("preu");
                any = rs.getInt("any");
                estil = rs.getString("estil");
                Vinil vinil = new Vinil(vinilId,empleatId,clientId,nom,preu,autor,any,estil);
                botiga.afegirVinil(vinil);
            }
            connect.deconnectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * Es connecta a la BD, crea un Instrument per a cada instrument i l'afegeix a l'ArrayList<Instrument>
     * Li passan l'objecte de la Botiga per a poder accedir a les seves funcions
     * @param botiga
     * @since 04/06/2021
     */
    public void carregarInstruments (Botiga botiga) {
        try {
            botiga.setInstruments(new ArrayList<Instrument>());
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from instruments");
            int instrumentId, clientId, empleatId;
            float preu;
            String nom, material, color;
            while (rs.next()) {
                instrumentId =  rs.getInt("instrument_id");
                empleatId = rs.getInt("empleat_id");
                clientId = rs.getInt("client_id");
                nom = rs.getString("nom");
                preu = rs.getFloat("preu");
                material = rs.getString("material");
                color = rs.getString("color");
                Instrument instrument = new Instrument(instrumentId,empleatId,clientId,nom,color,material,preu);
                botiga.afegirInstrument(instrument);
            }
            connect.deconnectar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Elimina un Client de l'ArrayList<Client>
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param botiga
     * @param s
     * @since 04/06/2021
     */
    public void esborrarClient (Botiga botiga, Scanner s) {
        botiga.llistatClients();
        Interficie.mostrarPerPantalla("Digues el id del client que vols esborrar: ");
        int idClientEsborrar = s.nextInt();
        for (int i = 0; i < botiga.getClients().size(); i++) {
            if (idClientEsborrar == botiga.getClients().get(i).getClientId()) {
                botiga.eliminarClient(botiga.getClients().get(i));
            }
        }
        Interficie.mostrarPerPantalla("Clients restants:");
        botiga.llistatClients();
    }
    /**
     * Elimina un Empleat de l'ArrayList<Empleat>
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param botiga
     * @param s
     * @since 04/06/2021
     */
    public void esborrarEmpleat (Botiga botiga, Scanner s) {
        botiga.llistaEmpleat();
        Interficie.mostrarPerPantalla("Digues el id de l'empleat que vols esborrar: ");
        int idEmpleatEsborrar = s.nextInt();
        for (int i = 0; i < botiga.getEmpleats().size(); i++) {
            if (idEmpleatEsborrar == botiga.getEmpleats().get(i).getEmpleatId()) {
                botiga.eliminarEmpleat(botiga.getEmpleats().get(i));
            }
        }
        Interficie.mostrarPerPantalla("Empleats restants:");
        botiga.llistaEmpleat();
    }
    /**
     * Elimina un Vinil de l'ArrayList<Vinil>
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param botiga
     * @param s
     * @since 04/06/2021
     */
    public void esborrarVinil (Botiga botiga, Scanner s) {
        botiga.llistaVinil();
        Interficie.mostrarPerPantalla("Digues el id del vinil que vols esborrar: ");
        int idVinilEsborrar = s.nextInt();
        for (int i = 0; i < botiga.getVinils().size(); i++) {
            if (idVinilEsborrar == botiga.getVinils().get(i).getVinilId()) {
                botiga.eliminarVinil(botiga.getVinils().get(i));
            }
        }
        Interficie.mostrarPerPantalla("Vinils restants:");
        botiga.llistaVinil();
    }
    /**
     * Elimina un Instrument de l'ArrayList<Instrument>
     * Li passan els objectes necessaris per a poder accedir a les seves funcions
     * @param botiga
     * @param s
     * @since 04/06/2021
     */
    public void esborrarInstrument (Botiga botiga, Scanner s) {
        botiga.llistaInstruments();
        Interficie.mostrarPerPantalla("Digues el id del instrument que vols esborrar: ");
        int idInstrumentEsborrar = s.nextInt();
        for (int i = 0; i < botiga.getInstruments().size(); i++) {
            if (idInstrumentEsborrar == botiga.getInstruments().get(i).getInstrumentId()) {
                botiga.eliminarInstrument(botiga.getInstruments().get(i));
            }
        }
        Interficie.mostrarPerPantalla("Instruments restants:");
        botiga.llistaInstruments();
    }
}
