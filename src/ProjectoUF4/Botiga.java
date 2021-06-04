package ProjectoUF4;

import java.util.ArrayList;

public class Botiga implements BotigaI {
    private int botigaId;
    private String nom;
    private String adreca;
    private String poblacio;
    private ArrayList<Client> clients;
    private ArrayList<Empleat> empleats;
    private ArrayList<Instrument> instruments;
    private ArrayList<Vinil> vinils;


    public Botiga(int botigaId, String nom, String adreca, String poblacio) {
        this.botigaId = botigaId;
        this.nom = nom;
        this.adreca = adreca;
        this.poblacio = poblacio;
        this.clients = new ArrayList<Client>();
        this.empleats = new ArrayList<Empleat>();
        this.instruments = new ArrayList<Instrument>();
        this.vinils = new ArrayList<Vinil>();

    }

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

    @Override
    public void afegirClient(Client c)  {
        clients.add(c);
    }

    @Override
    public void eliminarClient(Client c) {
        clients.remove(c);
    }

    @Override
    public void afegirEmpleat(Empleat e)  {
        empleats.add(e);
    }

    @Override
    public void eliminarEmpleat(Empleat e) {
        empleats.remove(e);
    }

    @Override
    public void afegirInstrument(Instrument i)  {
        instruments.add(i);
    }

    @Override
    public void eliminarInstrument(Instrument i) {
        instruments.remove(i);
    }

    @Override
    public void afegirVinil(Vinil v)  {
        vinils.add(v);
    }

    @Override
    public void eliminarVinil(Vinil v) {
        vinils.remove(v);
    }
    
    @Override
    public void llistatClients() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","CLIENT_ID","NOM","COGNOM","DNI","EDAT"));
        for (Client c: clients) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",c.getClientId(),c.nom,c.cognoms,c.DNI,c.edat));

        }
    }

    @Override
    public void llistaEmpleat() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","EMPLEAT_ID","NOM","COGNOM","DNI","EDAT"));
        for (Empleat e: empleats) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",e.getEmpleatId(),e.nom,e.cognoms,e.DNI,e.edat));

        }
    }

    @Override
    public void llistaVinil() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","VINIL_ID","NOM","AUTOR","ANY","PREU"));
        for (Vinil v: vinils) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",v.getVinilId(),v.getNom(),v.getAutor(),v.getAny(),v.getPreu()));

        }
    }

    @Override
    public void llistaInstruments() {
        System.out.println(String.format("%5s\t%10s\t%25s\t%20s\t%20s","INSTRUMENT_ID","NOM","MATERIAL","COLOR","PREU"));
        for (Instrument i: instruments) {
            System.out.println(String.format("%5d\t%20s\t%20s\t%20s\t%20s",i.getInstrumentId(),i.getNom(),i.getMaterial(),i.getColor(),i.getPreu()));

        }
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

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void setEmpleats(ArrayList<Empleat> empleats) {
        this.empleats = empleats;
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void setVinils(ArrayList<Vinil> vinils) {
        this.vinils = vinils;
    }
}

