package ProjectoUF4;

public class Persona {
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

    /**
     * Constructor de Persona amb els atributs passats per paràmetre
     * @param botigaId
     * @param nom
     * @param cognoms
     * @param DNI
     * @param edat
     * @param sexe
     * @param telefon
     * @param email
     * @param adreca
     * @param poblacio
     * @since 04/06/2021
     */
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

    /**
     * Constructor de Persona amb menys atributs passats per paràmetre
     * @param nom
     * @param cognoms
     * @since 04/06/2021
     */
    public Persona(String nom, String cognoms) {
        this.nom = nom;
        this.cognoms = cognoms;
    }

    /**
     * Obtenir l'ID de la botiga
     * @return
     * @since 04/06/2021
     */
    public int getBotigaId() {
        return botigaId;
    }

    /**
     * Substituir l'ID de la botiga pel passat per paràmetre
     * @param botigaId
     * @since 04/06/2021
     */
    public void setBotigaId(int botigaId) {
        this.botigaId = botigaId;
    }
    /**
     * Obtenir el nom de la Persona
     * @return
     * @since 04/06/2021
     */
    public String getNom() {
        return nom;
    }

    /**
     * Substituir el nom de la Persona pel passat per paràmetre
     * @param nom
     * @since 04/06/2021
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Obtenir els cognoms de la Persona
     * @return
     * @since 04/06/2021
     */
    public String getCognoms() {
        return cognoms;
    }
    /**
     * Substituir els cognoms de la Persona pel passat per paràmetre
     * @param cognoms
     * @since 04/06/2021
     */
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
    /**
     * Obtenir el Dni de la Persona
     * @return
     * @since 04/06/2021
     */
    public String getDNI() {
        return DNI;
    }
    /**
     * Substituir el DNI de la Persona pel passat per paràmetre
     * @param DNI
     * @since 04/06/2021
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    /**
     * Obtenir l'edat de la Persona
     * @return
     * @since 04/06/2021
     */
    public int getEdat() {
        return edat;
    }
    /**
     * Substituir l'edat de la Persona pel passat per paràmetre
     * @param edat
     * @since 04/06/2021
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }
    /**
     * Obtenir el sexe de la Persona
     * @return
     * @since 04/06/2021
     */
    public char getSexe() {
        return sexe;
    }
    /**
     * Substituir el sexe de la Persona pel passat per paràmetre
     * @param sexe
     * @since 04/06/2021
     */
    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
    /**
     * Obtenir el teléfon de la Persona
     * @return
     * @since 04/06/2021
     */
    public String getTelefon() {
        return telefon;
    }
    /**
     * Substituir el teléfon de la Persona pel passat per paràmetre
     * @param telefon
     * @since 04/06/2021
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    /**
     * Obtenir el email de la Persona
     * @return
     * @since 04/06/2021
     */
    public String getEmail() {
        return email;
    }
    /**
     * Substituir el email de la Persona pel passat per paràmetre
     * @param email
     * @since 04/06/2021
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Obtenir l'adreça de la botiga
     * @return
     * @since 04/06/2021
     */
    public String getAdreca() {
        return adreca;
    }
    /**
     * Substituir l'adreça de la Persona pel passat per paràmetre
     * @param adreca
     * @since 04/06/2021
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    /**
     * Obtenir la població de la botiga
     * @return
     * @since 04/06/2021
     */
    public String getPoblacio() {
        return poblacio;
    }
    /**
     * Substituir la població de la Persona pel passat per paràmetre
     * @param poblacio
     * @since 04/06/2021
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    /**
     * Obtenir tots els atributs de la Persona
     * @return
     * @since 04/06/2021
     */
    @Override
    public String toString() {
        return "Persona{" +
                "botigaId=" + botigaId +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edat=" + edat +
                ", sexe=" + sexe +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", adreca='" + adreca + '\'' +
                ", poblacio='" + poblacio + '\'' +
                '}';
    }
}