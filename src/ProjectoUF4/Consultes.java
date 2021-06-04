package ProjectoUF4;

import java.util.ArrayList;

public class Consultes {
    /**
     * Busca en els atributs de l'Empleat a l'ArrayList<Empleat> pasada per paràmetre i mostra el nom, l'ID i el salari de l'Empleat amb més salari
     * @param empleats
     * @since 04/06/2021
     */
    public void consultarEmpleatMesSalari(ArrayList<Empleat> empleats){
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
        System.out.println("L'empleat amb més salari és: " + nom + " amb l'ID " + id + " i el seu salari és " + salari+"€.");
    }

    /**
     * Busca en els atributs de l'Instrument a l'ArrayList<Instrument> pasada per paràmetre i mostra el nom, l'ID i el preu de l'Instrument més barat
     * @param instruments
     * @since 04/06/2021
     */
    public void consultarInstrumentMesBarat(ArrayList<Instrument> instruments){
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
        System.out.println("El instrument més barat és: " + nom + " amb l'ID " + id + " i te un preu de " + preu+"€.");
    }

    /**
     * Busca en els atributs de Vinil a l'ArrayList<Vinil> pasada per paràmetre per a mostrar el nom, l'ID, l'autor i l'any del Vinil més antic
     * @param vinils
     * @since 04/06/2021
     */
    public void consultarVinilMesAntic(ArrayList<Vinil> vinils){
        int any = 3000;
        String nom = "";
        String autor = "";
        int id = 1;
        for (int i = 0; i < vinils.size(); i++) {
            if (vinils.get(i).getAny() < any){
                any = vinils.get(i).getAny();
                nom = vinils.get(i).getNom();
                id = vinils.get(i).getVinilId();
                autor = vinils.get(i).getAutor();
            }
        }
        System.out.println("El vinil més antic és " + nom + " amb l'ID " + id +" i el seu autor és "+autor+", va sortir l'any " + any+".");
    }
}