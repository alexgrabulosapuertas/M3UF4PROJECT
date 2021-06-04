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

    /**
     * Constructor de la Botiga pasant-li parametres
     * @param botigaId
     * @param nom
     * @param adreca
     * @param poblacio
     * @since 04/06/2021
     */
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

    /**
     * Constructor de Botiga principal, per tant amb els atributs indicats
     * @since 04/06/2021
     */
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

    /**
     * Afegeix un Client a la ArrayList<Client> pasada per paràmetre
     * @param c
     * @since 04/06/2021
     */
    @Override
    public void afegirClient(Client c)  {
        clients.add(c);
    }
    /**
     * Eliminar un Client de la ArrayList<Client> pasada per paràmetre
     * @param c
     * @since 04/06/2021
     */
    @Override
    public void eliminarClient(Client c) {
        clients.remove(c);
    }
    /**
     * Afegeix un Empleat a la ArrayList<Empleat> pasada per paràmetre
     * @param e
     * @since 04/06/2021
     */
    @Override
    public void afegirEmpleat(Empleat e)  {
        empleats.add(e);
    }
    /**
     * Eliminar un Empleat de la ArrayList<Empleat> pasada per paràmetre
     * @param e
     * @since 04/06/2021
     */
    @Override
    public void eliminarEmpleat(Empleat e) {
        empleats.remove(e);
    }
    /**
     * Afegeix un Instrument a la ArrayList<Instrument> pasada per paràmetre
     * @param i
     * @since 04/06/2021
     */
    @Override
    public void afegirInstrument(Instrument i)  {
        instruments.add(i);
    }
    /**
     * Eliminar un Instrument de la ArrayList<Instrument> pasada per paràmetre
     * @param i
     * @since 04/06/2021
     */
    @Override
    public void eliminarInstrument(Instrument i) {
        instruments.remove(i);
    }
    /**
     * Afegeix un Vinil a la ArrayList<Vinil> pasada per paràmetre
     * @param v
     * @since 04/06/2021
     */
    @Override
    public void afegirVinil(Vinil v)  {
        vinils.add(v);
    }
    /**
     * Eliminar un Vinil de la ArrayList<Vinil> pasada per paràmetre
     * @param v
     * @since 04/06/2021
     */
    @Override
    public void eliminarVinil(Vinil v) {
        vinils.remove(v);
    }

    /**
     * Mostra tots els atributs de tots els clients guardats a l'ArrayList<Client>
     * @since 04/06/2021
     */
    @Override
    public void llistatClients() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","CLIENT_ID","NOM","COGNOM","DNI","EDAT"));
        for (Client c: clients) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",c.getClientId(),c.nom,c.cognoms,c.DNI,c.edat));

        }
    }

    /**
     * Mostra tots els atributs de tots els empleats guardats a l'ArrayList<Empleat>
     * @since 04/06/2021
     */
    @Override
    public void llistaEmpleat() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","EMPLEAT_ID","NOM","COGNOM","DNI","SALARI"));
        for (Empleat e: empleats) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",e.getEmpleatId(),e.nom,e.cognoms,e.DNI,e.getSalari()));

        }
    }
    /**
     * Mostra tots els atributs de tots els vinils guardats a l'ArrayList<Vinil>
     * @since 04/06/2021
     */
    @Override
    public void llistaVinil() {
        System.out.println(String.format("%5s\t%5s\t%20s\t%20s\t%20s","VINIL_ID","NOM","AUTOR","ANY","PREU"));
        for (Vinil v: vinils) {
            System.out.println(String.format("%3d\t%15s\t%20s\t%20s\t%20s",v.getVinilId(),v.getNom(),v.getAutor(),v.getAny(),v.getPreu()));

        }
    }
    /**
     * Mostra tots els atributs de tots els instruments guardats a l'ArrayList<Instrument>
     * @since 04/06/2021
     */
    @Override
    public void llistaInstruments() {
        System.out.println(String.format("%5s\t%10s\t%25s\t%20s\t%20s","INSTRUMENT_ID","NOM","MATERIAL","COLOR","PREU"));
        for (Instrument i: instruments) {
            System.out.println(String.format("%5d\t%20s\t%20s\t%20s\t%20s",i.getInstrumentId(),i.getNom(),i.getMaterial(),i.getColor(),i.getPreu()));

        }
    }

    /**
     * Funció toString() per a pasar les dades de la botiga per a poder-ho printar
     * @return
     * @since 04/06/2021
     */
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

    /**
     * Obtenir ArrayList<Client>
     * @return
     * @since 04/06/2021
     */
    public ArrayList<Client> getClients() {
        return clients;
    }
    /**
     * Obtenir ArrayList<Empleat>
     * @return
     * @since 04/06/2021
     */
    public ArrayList<Empleat> getEmpleats() {
        return empleats;
    }
    /**
     * Obtenir ArrayList<Instrument>
     * @return
     * @since 04/06/2021
     */
    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }
    /**
     * Obtenir ArrayList<Vinil>
     * @return
     * @since 04/06/2021
     */
    public ArrayList<Vinil> getVinils() {
        return vinils;
    }

    /**
     * Substituir l'ArrayList<Client> per la pasada per paràmetre
     * @param clients
     * @since 04/06/2021
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    /**
     * Substituir l'ArrayList<Empleat> per la pasada per paràmetre
     * @param empleats
     * @since 04/06/2021
     */
    public void setEmpleats(ArrayList<Empleat> empleats) {
        this.empleats = empleats;
    }
    /**
     * Substituir l'ArrayList<Instrument> per la pasada per paràmetre
     * @param instruments
     * @since 04/06/2021
     */
    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }
    /**
     * Substituir l'ArrayList<Vinil> per la pasada per paràmetre
     * @param vinils
     * @since 04/06/2021
     */
    public void setVinils(ArrayList<Vinil> vinils) {
        this.vinils = vinils;
    }
}

