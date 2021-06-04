package ProjectoUF4;

import java.util.ArrayList;

public class Botiga {
    private int botigaId;
    private String nom;
    private String adreca;
    private String poblacio;
    private ArrayList<Client> clients;
    private ArrayList<Empleat> empleats;
    private ArrayList<Instrument> instruments;
    private ArrayList<Vinil> vinils;


    public Botiga() {
        this.botigaId = 1;
        this.nom = "Onmusic";
        this.adreca = "Passeig de Gracia, 1";
        this.poblacio = "Barcelona";
        this.clients = new ArrayList<Client>();
        this.empleats = new ArrayList<Empleat>();
        this.instruments = new ArrayList<Instrument>();
        this.vinils = new ArrayList<Vinil>();
    }

    public void afegirClient (Client c)  {
        clients.add(c);
    }

    public void eliminarClient (Client c) {
        clients.remove(c);
    }

    public void afegirEmpleat (Empleat e)  {
        empleats.add(e);
    }

    public void eliminarEmpleat (Empleat e) {
        empleats.remove(e);
    }

    public void afegirInstrument (Instrument i)  {
        instruments.add(i);
    }

    public void eliminarInstrument (Instrument i) {
        instruments.remove(i);
    }

    public void afegirVinil (Vinil v)  {
        vinils.add(v);
    }

    public void eliminarVinil (Vinil v) {
        vinils.remove(v);
    }


    @Override
    public String toString() {
        return "Botiga{" +
                "botigaId=" + botigaId +
                ", nom='" + nom + '\'' +
                ", adreca='" + adreca + '\'' +
                ", poblacio='" + poblacio + '\'' +
                ", clients=" + clients +
                ", empleats=" + empleats +
                ", instruments=" + instruments +
                ", vinils=" + vinils +
                '}';
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Empleat> getEmpleats() {
        return empleats;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public ArrayList<Vinil> getVinils() {
        return vinils;
    }
}
