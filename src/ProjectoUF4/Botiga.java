package ProjectoUF4;

import java.util.Scanner;

public class Botiga {
    private String nom, adreca;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        projecte(s);
    }
    public static void projecte(Scanner s){
        int opcioMenu;
        do {
            String[] opcions_del_menu = {"1-Carregar dades", "2-Consultar", "3-Afegir", "4-Esborrar", "0-Sortir"};
            Interficie.mostrarMenu(opcions_del_menu);
            opcioMenu = s.nextInt();
            switch (opcioMenu) {
                case 1 -> Interficie.mostrarPerPantalla("Has seleccionat: Carregar dades");
                case 2 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Consultar");
                    String[] opcions_del_sub_menu = {"1. Empleat amb més edat", "2. Instrument més barat", "Vinil més curt"};
                    int opcioSubMenu;
                    do {
                        Interficie.mostrarMenu(opcions_del_sub_menu);
                        opcioSubMenu = s.nextInt();
                        switch (opcioSubMenu) {
                            case 1 -> {
                                Interficie.mostrarPerPantalla("Has seleccionat empleat amb més edat");
                            }
                            case 2->
                                Interficie.mostrarPerPantalla("Has seleccionat instrument més barat");
                            case 3->
                                Interficie.mostrarPerPantalla("Has seleccionat vinil més antic");
                            case 0->
                                Interficie.mostrarPerPantalla("Has tornat al Menu Principal");
                        }
                    } while (opcioSubMenu != 0);
                }
                case 3 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Afegir");
                    //fer un insert
                    int opcio_afegir;
                    do {
                        Interficie.mostrarPerPantalla("Que vols afegir? (1.Vinil/2.Clients/0.Sortir)");
                        opcio_afegir = s.nextInt();
                        switch (opcio_afegir){
                            case 1 ->{
                                Interficie.mostrarPerPantalla("Has seleccionat Afegir vinils");
                                Interficie.mostrarPerPantalla("vinil_id");
                                int vinil_id = s.nextInt();
                                Interficie.mostrarPerPantalla("client_id");
                                int client_id = s.nextInt();
                                Interficie.mostrarPerPantalla("empleat_id");
                                int empleat_id = s.nextInt();
                                Interficie.mostrarPerPantalla("Quin nom li vols posar al vinil?");
                                String nom_vinil = s.next();
                                Interficie.mostrarPerPantalla("preu");
                                float preu_vinil = s.nextFloat();
                                Interficie.mostrarPerPantalla("autor");
                                String autor_vinil = s.next();
                                Interficie.mostrarPerPantalla("any");
                                int any_vinil = s.nextInt();
                                Interficie.mostrarPerPantalla("estil");
                                String estil_vinil = s.next();
                                Vinil vinil = new Vinil (vinil_id, client_id, empleat_id, nom_vinil, preu_vinil, autor_vinil, any_vinil, estil_vinil);
                                BD.inserirVinils(vinil);
                            }
                            case 2 ->{
                                Interficie.mostrarPerPantalla("Has seleccionat: Afegir clients");
                                Interficie.mostrarPerPantalla("Quin es el teu nom?");
                                String nom = s.next();
                                Interficie.mostrarPerPantalla("Quins son els teus cognoms?");
                                String[] cognoms = {s.next(), s.next()};
                                Interficie.mostrarPerPantalla("Quin es el teu telefon?");
                                String telefon = s.next();
                                Interficie.mostrarPerPantalla("Quina es la teva adreça?");
                                String adreca = s.next();
                                Interficie.mostrarPerPantalla("Quin es el teu DNI?");
                                String dni = s.next();
                                Interficie.mostrarPerPantalla("Quin es el teu sexe? (M/F)");
                                char sexe = s.next().charAt(0);
                                Interficie.mostrarPerPantalla("Quina es el teu email?");
                                String email = s.next();
                                Interficie.mostrarPerPantalla("Quants anys tens?");
                                int edat = s.nextInt();
                                Client client = new Client(nom, cognoms, telefon, adreca, dni, sexe, email, edat, 1);
                            }
                        }
                    }while (opcio_afegir != 0);
                }
                case 4 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Esborrar");
                    //fer un delete amb menus per a escullir que vol borrar
                }
                case 0 -> Interficie.mostrarPerPantalla("Has seleccionat: Sortir\nFins aviat!");
            }
        } while (opcioMenu != 0);
    }
}

