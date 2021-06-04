package ProjectoUF4;

public interface BotigaI {
    void afegirClient(Client c);

    void eliminarClient(Client c);

    void afegirEmpleat(Empleat e);

    void eliminarEmpleat(Empleat e);

    void afegirInstrument(Instrument i);

    void eliminarInstrument(Instrument i);

    void afegirVinil(Vinil v);

    void eliminarVinil(Vinil v);

    void llistatClients();

    void llistaEmpleat();

    void llistaVinil();

    void llistaInstruments();
}
