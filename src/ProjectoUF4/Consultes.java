package ProjectoUF4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Consultes {

    public void consultarEmpleatMesSalari(ConnexioBD cbd, ArrayList<Empleat> empleats){
        //Comença amb -1 perque ningú tindrà salari negatiu
        float salari = -1;
        String nom = "";
        int id = 1;
        for (int i = 0; i < empleats.size(); i++) {
            if (empleats.get(i).getSalari() > salari){
                salari = empleats.get(i).getSalari();
                nom = empleats.get(i).getNom();
                id = empleats.get(i).getEmpleatId();
            }
        }
        System.out.println("El empleat amb més salari és: " + nom + " amb l'ID " + id + " i el seu salari es " + salari);
    }

    public void consultarInstrumentMesBarat(ConnexioBD cbd, ArrayList<Instrument> instruments){
        float preu = 1000000000;
        String nom = "";
        int id = 1;
        for (int i = 0; i < instruments.size(); i++) {
            if (instruments.get(i).getPreu() < preu){
                preu = instruments.get(i).getPreu();
                nom = instruments.get(i).getNom();
                id = instruments.get(i).getInstrumentId();
            }
        }
        System.out.println("El instrument més barat és: " + nom + " amb l'ID " + id + " i te un preu de " + preu);
    }
    public void consultarVinilMesAntic(ConnexioBD cbd, ArrayList<Vinil> vinils){
        int any = 3000;
        String nom = "";
        int id = 1;
        for (int i = 0; i < vinils.size(); i++) {
            if (vinils.get(i).getAny() < any){
                any = vinils.get(i).getAny();
                nom = vinils.get(i).getNom();
                id = vinils.get(i).getVinilId();
            }
        }
        System.out.println("El vinil més antic és " + nom + " amb l'ID " + id + " i va sortir l'any " + any);
    }
}