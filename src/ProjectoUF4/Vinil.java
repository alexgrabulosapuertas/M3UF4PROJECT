package ProjectoUF4;

public class Vinil {
    private String nom, autor;
    private int any, temps;

    public Vinil(String nom, String autor, int any, int temps) {
        this.nom = nom;
        this.autor = autor;
        this.any = any;
        this.temps = temps;
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

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }
}
enum Estil{
    ROCK, PUNK, POP, RAP, TRAP, CLASSIC
}
