package ProjectoUF4;

public class Vinil {
    private int vinilId;
    private int clientId;
    private int empleatId;
    private String nom;
    private float preu;
    private String autor;
    private int any;
    private String estil;
    private Estil estils;

    public Vinil(int vinilId, int clientId, int empleatId, String nom, float preu, String autor, int any, Estil estils) {
        this.vinilId = vinilId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom;
        this.preu = preu;
        this.autor = autor;
        this.any = any;
        this.estils = estils;
    }

    public Vinil(int vinilId, int clientId, int empleatId, String nom_vinil, float preu_vinil, String autor_vinil, int any_vinil, String estil_vinil) {
        this.vinilId = vinilId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom_vinil;
        this.preu = preu_vinil;
        this.autor = autor_vinil;
        this.any = any_vinil;
        this.estil = estil_vinil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public int getVinilId() {
        return vinilId;
    }

    public void setVinilId(int vinilId) {
        this.vinilId = vinilId;
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

    public String getEstil() {
        return estil;
    }

    public void setEstil(String estil) {
        this.estil = estil;
    }
}
enum Estil{
    ROCK, PUNK, POP, RAP, TRAP, CLASSIC
}
