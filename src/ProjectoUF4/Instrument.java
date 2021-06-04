package ProjectoUF4;

public class Instrument {
    private int instrumentId;
    private int clientId;
    private int empleatId;
    private String nom;
    private int tipus;
    private String color;
    private String material;
    private float preu;

    /**
     * Constructor de l'Instrument amb els atributs passats per paràmetre
     * @param instrumentId
     * @param clientId
     * @param empleatId
     * @param nom
     * @param tipus
     * @param color
     * @param material
     * @param preu
     * @since 04/06/2021
     */
    public Instrument(int instrumentId, int clientId, int empleatId, String nom, int tipus, String color, String material, float preu){
        this.instrumentId = instrumentId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom;
        this.tipus = tipus;
        this.color = color;
        this.material = material;
        this.preu = preu;
    }

    /**
     * Constructor de Instrument amb menys atributs passats per paràmetre
     * @param instrumentId
     * @param clientId
     * @param empleatId
     * @param nom
     * @param color
     * @param material
     * @param preu
     * @since 04/06/2021
     */
    public Instrument(int instrumentId, int clientId, int empleatId, String nom, String color, String material, float preu) {
        this.instrumentId = instrumentId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom;
        this.color = color;
        this.material = material;
        this.preu = preu;
    }

    /**
     * Obtenir el nom de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public String getNom() {
        return nom;
    }

    /**
     * Substituir el nom de l'Instrument pel que es passat per paràmetre
     * @param nom
     * @since 04/06/2021
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Obtenir el tipus de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public int getTipus() {
        return tipus;
    }
    /**
     * Substituir el tipus de l'Instrument pel que es passat per paràmetre
     * @param tipus
     * @since 04/06/2021
     */
    public void setTipus(int tipus) {
        this.tipus = tipus;
    }
    /**
     * Obtenir el color de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public String getColor() {
        return color;
    }
    /**
     * Substituit el color de l'Instrument pel que es passat per paràmetre
     * @param color
     * @since 04/06/2021
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Obtenir el preu de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public float getPreu() {
        return preu;
    }
    /**
     * Substituir el preu de l'Instrument pel que es passat per paràmetre
     * @param preu
     * @since 04/06/2021
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }
    /**
     * Obtenir el instrument de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public int getInstrumentId() {
        return instrumentId;
    }
    /**
     * Substituir el instrumentId de l'Instrument pel que es passat per paràmetre
     * @param instrumentId
     * @since 04/06/2021
     */
    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }
    /**
     * Obtenir el clientId de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public int getClientId() {
        return clientId;
    }
    /**
     * Substituir el clientId de l'Instrument pel que es passat per paràmetre
     * @param clientId
     * @since 04/06/2021
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    /**
     * Obtenir el empleatId de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public int getEmpleatId() {
        return empleatId;
    }
    /**
     * Substituir el empleatId de l'Instrument pel que es passat per paràmetre
     * @param empleatId
     * @since 04/06/2021
     */
    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }
    /**
     * Obtenir el material de l'Instrument
     * @return
     * @since 04/06/2021
     */
    public String getMaterial() {
        return material;
    }
    /**
     * Substituir el material de l'Instrument pel que es passat per paràmetre
     * @param material
     * @since 04/06/2021
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Obtenir tots els atributs del Instrument
     * @return
     * @since 04/06/2021
     */
    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId=" + instrumentId +
                ", clientId=" + clientId +
                ", empleatId=" + empleatId +
                ", nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", preu=" + preu +
                '}';
    }
}

enum COLOR{VERMELL, BLAU, BLANC, NEGRE, MARRO, OR}