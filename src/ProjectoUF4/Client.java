package ProjectoUF4;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String telefon;
    private String adreca;
    private String DNI;
    private String email;
    private String[] cognoms;
    private char sexe;
    private int edat, id;
    ArrayList<Client> clients = new ArrayList<Client>();

    public Client(String nom, String[] cognoms, String telefon, String adreca, String DNI, char sexe, String email, int edat, int id) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.telefon = telefon;
        this.adreca = adreca;
        this.DNI = DNI;
        this.sexe = sexe;
        this.email = email;
        this.edat = edat;
        this.id = clients.size();
        clients.add(new Client(nom, cognoms, telefon, adreca, DNI, sexe, email, edat, id));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String[] getCognoms() {
        return cognoms;
    }

    public void setCognoms(String[] cognoms) {
        this.cognoms = cognoms;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
}
