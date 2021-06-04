package ProjectoUF4;

import java.util.Scanner;

public class ProjectePOO {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Botiga b = new Botiga();
        AfegirDades ad = new AfegirDades();
        InserirBD ibd = new InserirBD();
        ConnexioBD cbd = new ConnexioBD();
        Consultes c = new Consultes();
        projecte(s,b, ad, ibd, cbd, c);
    }
    public static void projecte(Scanner s, Botiga b, AfegirDades ad, InserirBD inserirBd, ConnexioBD cbd, Consultes c){
        int opcioMenu;
        do {
            String[] opcions_del_menu = {"1-Carregar dades", "2-Consultar", "3-Afegir", "4-Esborrar", "0-Sortir"};
            Interficie.mostrarMenu(opcions_del_menu);
            opcioMenu = s.nextInt();
            switch (opcioMenu) {
                case 1 -> Interficie.mostrarPerPantalla("Has seleccionat: Carregar dades");
                case 2 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Consultar");
                    String[] opcions_del_sub_menu = {"1. Empleat amb més edat", "2. Instrument més barat", "3. Vinil més curt", "0. Sortir"};
                    int opcioSubMenu;
                    do {
                        Interficie.mostrarMenu(opcions_del_sub_menu);
                        opcioSubMenu = s.nextInt();
                        switch (opcioSubMenu) {
                            case 1 -> {
                                Interficie.mostrarPerPantalla("Has seleccionat empleat amb més edat");
                                c.consultarEmpleatMesSalari(cbd, b.getEmpleats());
                            }
                            case 2 -> {
                                Interficie.mostrarPerPantalla("Has seleccionat instrument més barat");
                                c.consultarInstrumentMesBarat(cbd, b.getInstruments());
                            }
                            case 3 -> {
                                Interficie.mostrarPerPantalla("Has seleccionat vinil més antic");
                                c.consultarVinilMesAntic(cbd, b.getVinils());
                            }
                            case 0-> {
                                Interficie.mostrarPerPantalla("Has tornat al Menu Principal");
                            }
                        }
                    } while (opcioSubMenu != 0);
                }
                case 3 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Afegir");
                    int opcio_afegir;
                    do {
                        Interficie.mostrarPerPantalla("Que vols afegir? (1.Vinil/2.Clients/3.Instruments/4.Empleats/0.Sortir)");
                        opcio_afegir = s.nextInt();
                        switch (opcio_afegir){
                            case 1 -> ad.afegirVinils(s,b, inserirBd, cbd);
                            case 2 -> ad.afegirClients(s,b, inserirBd, cbd);
                            case 3 -> ad.afegirInstruments(s, b, inserirBd, cbd);
                            case 4 -> ad.afegirEmpleats(s, b, inserirBd, cbd);
                            case 0 -> Interficie.mostrarPerPantalla("Has tornat al menú principal");
                        }
                    }while (opcio_afegir != 0);
                }
                case 4 -> {
                    Interficie.mostrarPerPantalla("Has seleccionat: Esborrar");
                }
                case 0 -> Interficie.mostrarPerPantalla("Has seleccionat: Sortir\nFins aviat!");
            }
        } while (opcioMenu != 0);
    }
}

