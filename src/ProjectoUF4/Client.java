package ProjectoUF4;
public class Client extends Persona {
    private int clientId;

    /**
     * Constructor del Client amb els atributs passats per paràmetre
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
     * @param clientId
     * @since 04/06/2021
     */
    public Client(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int clientId) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.clientId = clientId;
    }

    /**
     * Constructor del Client amb menys atributs passats per paràmetre
     * @param nom
     * @param cognoms
     * @param clientId
     * @since 04/06/2021
     */
    public Client(String nom, String cognoms, int clientId) {
        super(nom, cognoms);
        this.clientId = clientId;
    }

    /**
     * Obtenir el ID del Client
     * @return
     * @since 04/06/2021
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Substituir el ID del Client pel passat per paràmetre
     * @param clientId
     * @since 04/06/2021
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Obtenir els atributs del CLient
     * @return
     * @since 04/06/2021
     */
    @Override
    public String toString() {
        return "Client{" +
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
                ", clientId=" + clientId +
                '}';
    }
}