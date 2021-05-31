package ProjectoUF4;

public class Vinil {
    private int vinil_id;
    private int client_id;
    private int empleat_id;
    private String nom;
    private float preu;
    private String autor;
    private int any;
    private String estil;

    public Vinil(int vinil_id, int client_id, int empleat_id, String nom_vinil, float preu_vinil, String autor_vinil, int any_vinil, String estil_vinil) {
        this.vinil_id = vinil_id;
        this.client_id = client_id;
        this.empleat_id = empleat_id;
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

    public int getVinil_id() {
        return vinil_id;
    }

    public void setVinil_id(int vinil_id) {
        this.vinil_id = vinil_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getEmpleat_id() {
        return empleat_id;
    }

    public void setEmpleat_id(int empleat_id) {
        this.empleat_id = empleat_id;
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
