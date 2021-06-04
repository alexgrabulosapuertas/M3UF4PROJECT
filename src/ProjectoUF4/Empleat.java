package ProjectoUF4;

public class Empleat extends Persona {
    private int empleatId;
    private float salari;

    /**
     * Constructor de Empleat tots els atributs
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
     * @param empleatId
     * @param salari
     * @since 04/06/2021
     */
    public Empleat(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int empleatId, float salari) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.empleatId = empleatId;
        this.salari = salari;
    }

    /**
     * Constructor de Empleat amb els atributs mínims
     * @param nom
     * @param cognoms
     * @param empleatId
     * @since 04/06/2021
     */
    public Empleat(String nom, String cognoms, int empleatId) {
        super(nom, cognoms);
        this.empleatId = empleatId;
    }

    /**
     * Obtenir l'ID del Empleat
     * @return
     * @since 04/06/2021
     */
    public int getEmpleatId() {
        return empleatId;
    }

    /**
     * Substituir l'ID de l'Empleat pel passat per paràmetre
     * @param empleatId
     * @since 04/06/2021
     */
    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }
    /**
     * Obtenir el salari de l'Empleat
     * @return
     * @since 04/06/2021
     */
    public float getSalari() {
        return salari;
    }
    /**
     * Substituir el salari de l'Empleat pel passat per paràmetre
     * @param salari
     * @since 04/06/2021
     */
    public void setSalari(float salari) {
        this.salari = salari;
    }

    /**
     * Obtenir tots els atributs de l'Empleat
     * @return
     * @since 04/06/2021
     */
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