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

    public Instrument(String nom, int tipus, String material, String color, float preu){
        this.nom = nom;
        this.tipus = tipus;
        this.material = material;
        this.color = color;
        this.preu = preu;
    }

    public Instrument(int instrumentId, int clientId, int empleatId, String nom, String color, String material, float preu) {
        this.instrumentId = instrumentId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom;
        this.color = color;
        this.material = material;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTipus() {
        return tipus;
    }

    public void setTipus(int tipus) {
        this.tipus = tipus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getEmpleatId() {
        return empleatId;
    }

    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
enum COLOR {
    VERMELL, BLAU, BLANC, NEGRE, MARRO, OR
}
enum TIPUS{
    CORDA, VENT, PERCUSSIO
}