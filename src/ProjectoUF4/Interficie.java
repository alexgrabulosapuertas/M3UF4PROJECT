package ProjectoUF4;

public class Interficie {
    public static final String colorblau = "\u001B[36m";
    public static final String colorvermell = "\u001B[31m";
    public static final String colorblaufosc = "\u001B[34m";
    public static final String nocolor = "\u001B[0m";

    /**
     * Li pasan un array i el printa com a menú
     * @param s
     * @since 04/06/2021
     */
    public static void mostrarMenu(String[] s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    /**
     * Mostra el missatge que li passis
     * @param s
     * @since 04/06/2021
     */
    public static void mostrarPerPantalla(String s){
        System.out.println(s);
    }

    /**
     * Mostra el missatge passat decorat i en blau
     * @param s
     * @since 04/06/2021
     */
    public static void titolMenu (String s){
        System.out.println( colorblau + "-------------------------------");
        System.out.println("\t\t\t"+s);
        System.out.println("-------------------------------" + nocolor);
    }
    /**
     * Mostra el missatge passat decorat i en blau fosc
     * @param s
     * @since 04/06/2021
     */
    public static void imprimirCapcalera (String s){
        System.out.println( colorblaufosc + "****************");
        System.out.println(s);
        System.out.println("****************" + nocolor);
    }

    /**
     * Mostra el missatge passat decorat i en vermell
     * @param s
     * @since 04/06/2021
     */
    public static void imprimirSortida(String s){
        System.out.println( colorvermell + "----------------------------");
        System.out.println(s);
        System.out.println("----------------------------" + nocolor);
    }
}
