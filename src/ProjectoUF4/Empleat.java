package ProjectoUF4;

public class Empleat {
    private String nom, DNI, adreca, correu, telefon;
    private String[] cognoms;
    private char sexe;
    private int edat;


    public Empleat(){

    }

    public Empleat(String nom, String[] cognoms, char sexe, String DNI, String adreca, String correu, String telefon, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.sexe = sexe;
        this.DNI = DNI;
        this.adreca = adreca;
        this.correu = correu;
        this.telefon = telefon;
        this.edat = edat;
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
