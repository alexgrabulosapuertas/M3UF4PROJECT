package ProjectoUF4;

import java.util.Scanner;

public class ProjectePOO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GestorDades carregarGestorDades = new GestorDades();
        Botiga botiga = new Botiga();
        AfegirDades ad = new AfegirDades();
        InserirBD ibd = new InserirBD();
        ConnexioBD cbd = new ConnexioBD();
        Consultes c = new Consultes();
        projecte(s, carregarGestorDades, botiga, ad, ibd, cbd, c);
    }
    public static void projecte(Scanner s, GestorDades carregarGestorDades, Botiga botiga, AfegirDades ad, InserirBD inserirBd, ConnexioBD cbd, Consultes c){
        int opcioMenu;
        do {
            Interficie.titolMenu("MENÚ");
            String[] opcions_del_menu = {"1-Carregar dades", "2-Consultar", "3-Afegir", "4-Esborrar", "0-Sortir"};
            Interficie.mostrarMenu(opcions_del_menu);
            opcioMenu = s.nextInt();
            switch (opcioMenu) {
                case 1 -> {
                    Interficie.imprimirCapcalera("Has seleccionat: Carregar dades");
                    carregarGestorDades.CarregarClient(botiga);
                    carregarGestorDades.carregarEmpleat(botiga);
                    carregarGestorDades.carregarInstruments(botiga);
                    carregarGestorDades.carregarVinils(botiga);
                    Interficie.mostrarPerPantalla("S'han carregat amb èxit les dades de la base de dades.");
                }
                case 2 -> {
                    Interficie.imprimirCapcalera("Has seleccionat: Consultar");
                    String[] opcions_del_sub_menu = {"1. Empleat amb més salari", "2. Instrument més barat", "3. Vinil més antic","4. Mostrar informació","0. Tornar al menú principal"};
                    int opcioSubMenu;
                    do {
                        Interficie.titolMenu("SUBMENÚ");
                        Interficie.mostrarMenu(opcions_del_sub_menu);
                        opcioSubMenu = s.nextInt();
                        switch (opcioSubMenu) {
                            case 1 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Empleat amb més salari.");
                                c.consultarEmpleatMesSalari(cbd, botiga.getEmpleats());
                            }
                            case 2-> {
                                Interficie.imprimirCapcalera("Has seleccionat: Instrument més barat.");
                                c.consultarInstrumentMesBarat(cbd, botiga.getInstruments());
                            }
                            case 3-> {
                                Interficie.imprimirCapcalera("Has seleccionat: Vinil més antic.");
                                c.consultarVinilMesAntic(cbd, botiga.getVinils());
                            }
                            case 4 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Mostrar informació.");
                                botiga.llistaEmpleat();
                                Interficie.mostrarPerPantalla("----------------------------------------------------------------------------------------");
                                botiga.llistatClients();
                                Interficie.mostrarPerPantalla("----------------------------------------------------------------------------------------");
                                botiga.llistaVinil();
                                Interficie.mostrarPerPantalla("----------------------------------------------------------------------------------------");
                                botiga.llistaInstruments();
                            }
                            case 0-> {
                                Interficie.imprimirSortida("Has tornat al Menú Principal");
                            }
                        }
                    } while (opcioSubMenu != 0);
                }
                case 3 -> {
                    Interficie.imprimirCapcalera("Has seleccionat: Afegir");
                    String[] opcions_del_sub_menu = {"1. Vinil", "2. Client", "3. Instrument","4. Empleat","0. Tornar al menú principal"};
                    Interficie.mostrarPerPantalla("Que vols afegir?");
                    int opcio_afegir;
                    do {
                        Interficie.titolMenu("SUBMENÚ");
                        Interficie.mostrarMenu(opcions_del_sub_menu);
                        opcio_afegir = s.nextInt();
                        switch (opcio_afegir){
                            case 1 -> ad.afegirVinils(s, botiga, inserirBd, cbd);
                            case 2 -> ad.afegirClients(s, botiga, inserirBd, cbd);
                            case 3 -> ad.afegirInstruments(s, botiga, inserirBd, cbd);
                            case 4 -> ad.afegirEmpleats(s, botiga, inserirBd, cbd);
                            case 0 -> Interficie.imprimirSortida("Has tornat al Menú Principal");
                        }
                    }while (opcio_afegir != 0);
                }
                case 4 -> {
                    Interficie.imprimirCapcalera("Has seleccionat: Esborrar");
                    Interficie.mostrarPerPantalla("Que vols esborrar?");
                    String[] opcionsEsborrar = {"1. Client", "2. Empleat", "3. Vinil", "4. Instrument", "0. Tornar al menú principal"};
                    int opcioSubMenuEsborrar;
                    do {
                        Interficie.titolMenu("SUBMENÚ");
                        Interficie.mostrarMenu(opcionsEsborrar);
                        opcioSubMenuEsborrar = s.nextInt();
                        switch (opcioSubMenuEsborrar) {
                            case 1 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Esborrar Client");
                                carregarGestorDades.esborrarClient(botiga, s);
                            }
                            case 2 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Esborrar Empleat");
                                carregarGestorDades.esborrarEmpleat(botiga, s);
                            }
                            case 3 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Esborrar Vinil");
                                carregarGestorDades.esborrarVinil(botiga, s);
                            }
                            case 4 -> {
                                Interficie.imprimirCapcalera("Has seleccionat: Esborrar Instrumen");
                                carregarGestorDades.esborrarInstrument(botiga, s);
                            }
                            case 0->
                                    Interficie.imprimirSortida("Has tornat al Menú Principal");
                        }
                    } while (opcioSubMenuEsborrar != 0);

                }
                case 0 -> {
                    Interficie.imprimirSortida("\t\tFins aviat!");
                }
            }
        } while (opcioMenu != 0);
    }
}
