package ProjectoUF4;

import com.sun.jdi.PrimitiveValue;

import java.util.ArrayList;


class Persona {
    protected int botigaId;
    protected String nom;
    protected String cognoms;
    protected String DNI;
    protected int edat;
    protected char sexe;
    protected String telefon;
    protected String email;
    protected String adreca;
    protected String poblacio;

    public Persona(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio) {
        this.botigaId = botigaId;
        this.nom = nom;
        this.cognoms = cognoms;
        this.DNI = DNI;
        this.edat = edat;
        this.sexe = sexe;
        this.telefon = telefon;
        this.email = email;
        this.adreca = adreca;
        this.poblacio = poblacio;
    }

    public int getBotigaId() {
        return botigaId;
    }

    public void setBotigaId(int botigaId) {
        this.botigaId = botigaId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
}





class Client extends Persona {
    private int clientId;
    ArrayList<Client> clients = new ArrayList<Client>();

    public Client(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int clientId) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

}

class Empleat extends Persona {
    private int empleatId;
    private float salari;

    public Empleat(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int empleatId, float salari) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.empleatId = empleatId;
        this.salari = salari;
    }

    public int getEmpleatId() {
        return empleatId;
    }

    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }

    public float getSalari() {
        return salari;
    }

    public void setSalari(float salari) {
        this.salari = salari;
    }
}
