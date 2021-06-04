package ProjectoUF4;

import java.util.Scanner;

public class AfegirDades {
    /**
     * Crea un objecte de Vinil i crida a dues funcions per a instrodurir-ho a l'ArrayList<Vinil> i a la BD
     * Se li pasan per paràmetre els objectes necessaris per a cridar a les funcions
     * @param s
     * @param b
     * @param ibd
     * @param cbd
     * @since 04/06/2021
     */
    public void afegirVinils(Scanner s, Botiga b, InserirBD ibd, ConnexioBD cbd){
        Interficie.imprimirCapcalera("Has seleccionat: Afegir vinils");
        Interficie.mostrarPerPantalla("Indica el vinil_id");
        int vinil_id = s.nextInt();
        Interficie.mostrarPerPantalla("Indica el client_id");
        int client_id = s.nextInt();
        Interficie.mostrarPerPantalla("Indica el empleat_id");
        int empleat_id = s.nextInt();
        Interficie.mostrarPerPantalla("Indica el nom del vinil");
        String nom_vinil = s.next();
        Interficie.mostrarPerPantalla("Indica el preu del vinil");
        float preu_vinil = s.nextFloat();
        Interficie.mostrarPerPantalla("Indica l'autor del vinil");
        String autor_vinil = s.next();
        Interficie.mostrarPerPantalla("Indica l'any que es va publicar el vinil");
        int any_vinil = s.nextInt();
        Interficie.mostrarPerPantalla("estil (1.ROCK/ 2.PUNK/ 3.POP/ 4.RAP/ 5.TRAP/ 6.CLASSIC)");
        int opcio_vinil = s.nextInt();
        String estil_vinil = "";
        switch (opcio_vinil){
            case 1 ->  estil_vinil = Estil.ROCK.name();
            case 2 -> estil_vinil = Estil.PUNK.name();
            case 3 -> estil_vinil = Estil.POP.name();
            case 4 -> estil_vinil = Estil.RAP.name();
            case 5 -> estil_vinil = Estil.TRAP.name();
            case 6 -> estil_vinil = Estil.CLASSIC.name();
        }
        Vinil vinil = new Vinil (vinil_id, client_id, empleat_id, nom_vinil, preu_vinil, autor_vinil, any_vinil, estil_vinil);
        b.afegirVinil(vinil);
        ibd.inserirVinils(vinil, cbd);
    }
    /**
     * Crea un objecte de Client i crida a dues funcions per a instrodurir-ho a l'ArrayList<Client> i a la BD
     * Se li pasan per paràmetre els objectes necessaris per a cridar a les funcions
     * @param s
     * @param b
     * @param ibd
     * @param cbd
     * @since 04/06/2021
     */
    public void afegirClients(Scanner s, Botiga b, InserirBD ibd, ConnexioBD cbd){
        Interficie.imprimirCapcalera("Has seleccionat: Afegir clients");
        Interficie.mostrarPerPantalla("Indica el client_id");
        int client_id = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el seu nom?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu primer cognom?");
        String cognom = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu DNI?");
        String dni = s.next();
        Interficie.mostrarPerPantalla("Quina és la seva edat?");
        int edat = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el seu sexe? (M/F)");
        char sexe = s.next().charAt(0);
        Interficie.mostrarPerPantalla("Quin és el seu telèfon?");
        String telefon = s.next();
        Interficie.mostrarPerPantalla("Quina és el seu email?");
        String email = s.next();
        Interficie.mostrarPerPantalla("Quina és la seva adreça?");
        String adreca = s.next();
        Interficie.mostrarPerPantalla("Quina és la teva població?");
        String poblacio = s.next();
        Client client = new Client(1, nom, cognom, dni, edat, sexe, telefon, email, adreca, poblacio,client_id);
        b.afegirClient(client);
        ibd.inserirClients(client, cbd);
    }

    /**
     * Crea un objecte de Instrument i crida a dues funcions per a instrodurir-ho a l'ArrayList<Instrument> i a la BD
     * Se li pasan per paràmetre els objectes necessaris per a cridar a les funcions
     * @param s
     * @param b
     * @param ibd
     * @param cbd
     * @since 04/06/2021
     */
    public void afegirInstruments(Scanner s, Botiga b, InserirBD ibd, ConnexioBD cbd){
        Interficie.imprimirCapcalera("Has seleccionat: Afegir instruments");
        Interficie.mostrarPerPantalla("Indica el instrument_id");
        int instrument_id = s.nextInt();
        Interficie.mostrarPerPantalla("Indica el client_id");
        int client_id = s.nextInt();
        Interficie.mostrarPerPantalla("Indica el empleat_id");
        int empleat_id = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el nom de l'instrument?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu tipus? (1.Corda/ 2.Vent/ 3.Percussió)");
        int tipus = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el seu color? (1.VERMELL/ 2.BLAU/ 3.BLANC/ 4.NEGRE/ 5.MARRO/ 6.OR)");
        int opcioColor = s.nextInt();
        String color = "";
        switch (opcioColor){
            case 1->
                    color = COLOR.VERMELL.name();
            case 2->
                    color = COLOR.BLAU.name();
            case 3->
                    color = COLOR.BLANC.name();
            case 4->
                    color = COLOR.NEGRE.name();
            case 5->
                    color = COLOR.MARRO.name();
            case 6->
                    color = COLOR.OR.name();
        }
        Interficie.mostrarPerPantalla("Quin és el seu preu?");
        float preu = s.nextFloat();
        Interficie.mostrarPerPantalla("Quin és el seu material?");
        String material = s.next();
        Instrument instrument = new Instrument(instrument_id, client_id, empleat_id,nom, tipus, color, material, preu);
        b.afegirInstrument(instrument);
        ibd.inserirInstruments(instrument, cbd);
    }
    /**
     * Crea un objecte de Empleat i crida a dues funcions per a instrodurir-ho a l'ArrayList<Empleat> i a la BD
     * Se li pasan per paràmetre els objectes necessaris per a cridar a les funcions
     * @param s
     * @param b
     * @param ibd
     * @param cbd
     * @since 04/06/2021
     */
    public void afegirEmpleats(Scanner s, Botiga b, InserirBD ibd, ConnexioBD cbd){
        Interficie.imprimirCapcalera("Has seleccionat: Afegir empleats");
        Interficie.mostrarPerPantalla("Indica el empleat_id");
        int empleat_id = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el seu nom?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu primer cognom?");
        String cognoms = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu DNI?");
        String DNI = s.next();
        Interficie.mostrarPerPantalla("Quina és la seva edat?");
        int edat = s.nextInt();
        Interficie.mostrarPerPantalla("Quin és el seu sexe? (M/F)");
        char sexe = s.next().charAt(0);
        Interficie.mostrarPerPantalla("Quin és el seu telèfon?");
        String telefon = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu email?");
        String email = s.next();
        Interficie.mostrarPerPantalla("Quina és la seva adreca?");
        String adreca = s.next();
        Interficie.mostrarPerPantalla("Quina és la seva població?");
        String poblacio = s.next();
        Interficie.mostrarPerPantalla("Quin és el seu salari?");
        float salari = s.nextFloat();
        Empleat empleat = new Empleat(1, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio, empleat_id, salari);
        b.afegirEmpleat(empleat);
        ibd.inserirEmpleats(empleat, cbd);
    }
}
