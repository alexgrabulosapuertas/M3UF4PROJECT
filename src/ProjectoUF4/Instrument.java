package ProjectoUF4;

public class Instrument {
    private String nom, tipus, color;
    private float preu;

    public void setColor(){}

    public Instrument(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
enum color{
    VERMELL, BLAU, BLANC, NEGRE, MARRO, OR
}