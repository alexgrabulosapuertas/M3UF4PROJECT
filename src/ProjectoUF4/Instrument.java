package ProjectoUF4;

public class Instrument {
    private String nom, tipus, color;
    private float preu, tamany;

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
    ROJO, AZUL, BLANCO, NEGRO, MARRON
}