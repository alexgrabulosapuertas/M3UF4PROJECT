package ProjectoUF4;

import java.util.Scanner;

public class Botiga {
    private int botigaId;
    private String nom;
    private String adreca;
    private String poblacio;


    public Botiga(int botigaId, String nom, String adreca, String poblacio) {
        this.botigaId = botigaId;
        this.nom = nom;
        this.adreca = adreca;
        this.poblacio = poblacio;
    }

    @Override
    public String toString() {
        return "Botiga{" +
                "botigaId=" + botigaId +
                ", nom='" + nom + '\'' +
                ", adreca='" + adreca + '\'' +
                ", poblacio='" + poblacio + '\'' +
                '}';
    }
}

