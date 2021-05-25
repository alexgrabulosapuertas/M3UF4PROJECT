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
                    String[] opcions_del_sub_menu = {"1. Empleats", "2. Clients", "3. Instruments", "4. Vinil", "0. Sortir"};
                    int opcioSubMenu;
                    do {
                        Interficie.mostrarMenu(opcions_del_sub_menu);
                        opcioSubMenu = s.nextInt();
                        switch (opcioSubMenu) {
                            case 1 -> {
                                Interficie.mostrarPerPantalla("Has seleccionat: Consultar Empleats");
                                Empleat empleat = new Empleat("Juan", new String[]{"Barrido", "Cuesta"}, 'M', "53627462S","C/ Avinguda als paissos catalans", "ejemplo@gmail.com", "674527364", 23);
                                System.out.println("El nom\n" + empleat.getNom());
                            }
                            case 2->
                                Interficie.mostrarPerPantalla("Has seleccionat: Consultar Clients");
                            case 3->
                                Interficie.mostrarPerPantalla("Has seleccionat: Consultar Instruments");
                            case 4->
                                Interficie.mostrarPerPantalla("Has seleccionat: Consultar Vinil");
                            case 0->
                                Interficie.mostrarPerPantalla("Has tornat al Menu Principal");
                        }
                    } while (opcioSubMenu != 0);
                }
                case 3 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Afegir");
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
                    Interficie.mostrarPerPantalla("Quina es el teu correu?");
                    String correu = s.next();
                    Interficie.mostrarPerPantalla("Quants anys tens?");
                    int edat = s.nextInt();
                    Client client = new Client(nom, cognoms, telefon, adreca, dni, sexe, correu, edat);
                }
                case 4 -> Interficie.mostrarPerPantalla("Has seleccionat: Esborrar");
                case 0 -> Interficie.mostrarPerPantalla("Has seleccionat: Sortir\nFins aviat!");
            }
        } while (opcioMenu != 0);
    }
}

