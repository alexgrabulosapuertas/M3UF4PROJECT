package ProjectoUF4;

import java.util.Scanner;

public class AfegirDades {
    public void afegirVinils(Scanner s, Botiga b, InserirBD ibd, ConnexioBD cbd){
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
    public void afegirClients(Scanner s, Botiga b, InserirBD inserirBd, ConnexioBD cbd){
        Interficie.mostrarPerPantalla("Has seleccionat: Afegir clients");
        Interficie.mostrarPerPantalla("Quin es el teu nom?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quins son els teus cognoms?");
        String cognoms = s.next() + " " + s.next();
        Interficie.mostrarPerPantalla("Quin es el teu DNI?");
        String dni = s.next();
        Interficie.mostrarPerPantalla("Quants anys tens?");
        int edat = s.nextInt();
        Interficie.mostrarPerPantalla("Quin es el teu sexe? (M/F)");
        char sexe = s.next().charAt(0);
        Interficie.mostrarPerPantalla("Quin es el teu telefon?");
        String telefon = s.next();
        Interficie.mostrarPerPantalla("Quina es el teu email?");
        String email = s.next();
        Interficie.mostrarPerPantalla("Quina es la teva adreça?");
        String adreca = s.next();
        Interficie.mostrarPerPantalla("Quina es la teva poblacio?");
        String poblacio = s.next();
        Client client = new Client(1, nom, cognoms, dni, edat, sexe, telefon, email, adreca, poblacio, 1);
        b.afegirClient(client);
        inserirBd.inserirClients(client, cbd);
    }

    //private String nom, tipus, color;
    //    private float preu;
    public void afegirInstruments(Scanner s, Botiga b, InserirBD inserirBd, ConnexioBD cbd){
        Interficie.mostrarPerPantalla("Has seleccionat: Afegir instruments");
        Interficie.mostrarPerPantalla("Quin es el nom del instrument?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quin es el seu tipus? (1.Corda/ 2.Vent/ 3.Percussió)");
        int tipus = s.nextInt();
        Interficie.mostrarPerPantalla("Quin es el seu color? (1.VERMELL/ 2.BLAU/ 3.BLANC/ 4.NEGRE/ 5.MARRO/ 6.OR)");
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
        Interficie.mostrarPerPantalla("Quin es el seu preu?");
        float preu = s.nextFloat();
        Interficie.mostrarPerPantalla("Quin es el seu material?");
        String material = s.next();
        Instrument instrument = new Instrument(nom, tipus, color, material, preu);
        b.afegirInstrument(instrument);
        inserirBd.inserirInstruments(instrument, cbd);
    }
    public void afegirEmpleats(Scanner s, Botiga b, InserirBD inserirBd, ConnexioBD cbd){
        Interficie.mostrarPerPantalla("Has seleccionat: Afegir empleats");
        Interficie.mostrarPerPantalla("Quin es el seu nom?");
        String nom = s.next();
        Interficie.mostrarPerPantalla("Quins son els seus cognoms?");
        String cognoms = s.next() + " " + s.next();
        Interficie.mostrarPerPantalla("Quin es el seu DNI?");
        String DNI = s.next();
        Interficie.mostrarPerPantalla("Quina es la seva edat?");
        int edat = s.nextInt();
        Interficie.mostrarPerPantalla("Quin es el seu sexe?");
        char sexe = s.next().charAt(0);
        Interficie.mostrarPerPantalla("Quin es el seu telefon?");
        String telefon = s.next();
        Interficie.mostrarPerPantalla("Quin es el seu email?");
        String email = s.next();
        Interficie.mostrarPerPantalla("Quina es la seva adreca?");
        String adreca = s.next();
        Interficie.mostrarPerPantalla("Quina es la seva poblacio?");
        String poblacio = s.next();
        Interficie.mostrarPerPantalla("Quin es el teu salari?");
        float salari = s.nextFloat();
        Empleat empleat = new Empleat(1, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio, 1, salari);
        b.afegirEmpleat(empleat);
        inserirBd.inserirEmpleats(empleat, cbd);
    }
}
