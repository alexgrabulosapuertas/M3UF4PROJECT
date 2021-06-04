package ProjectoUF4;

public class Empleat extends Persona {
    private int empleatId;
    private float salari;

    public Empleat(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int empleatId, float salari) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.empleatId = empleatId;
        this.salari = salari;
    }

    public Empleat(String nom, String cognoms, int empleatId) {
        super(nom, cognoms);
        this.empleatId = empleatId;
    }

    public int getEmpleatId() {
        return empleatId;
    }

    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }

    public float getSalari() {
        return salari;
    }

    public void setSalari(float salari) {
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "Empleat{" +
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
                ", empleatId=" + empleatId +
                ", salari=" + salari +
                '}';
    }
}
