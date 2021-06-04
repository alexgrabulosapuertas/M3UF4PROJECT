package ProjectoUF4;

public class Vinil {
    private int vinilId;
    private int clientId;
    private int empleatId;
    private String nom;
    private float preu;
    private String autor;
    private int any;
    private String estil;
    private Estil estils;

    /**
     * Constructor de Vinil amb els atributs passats per paràmetre
     * @param vinilId
     * @param clientId
     * @param empleatId
     * @param nom_vinil
     * @param preu_vinil
     * @param autor_vinil
     * @param any_vinil
     * @param estil_vinil
     * @since 04/06/2021
     */
    public Vinil(int vinilId, int clientId, int empleatId, String nom_vinil, float preu_vinil, String autor_vinil, int any_vinil, String estil_vinil) {
        this.vinilId = vinilId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom_vinil;
        this.preu = preu_vinil;
        this.autor = autor_vinil;
        this.any = any_vinil;
        this.estil = estil_vinil;
    }

    /**
     * Constructor de Vinil amb menys atributs passats per paràmetre
     * @param vinilId
     * @param clientId
     * @param empleatId
     * @param nom
     * @param preu
     * @param autor
     * @param any
     * @param estils
     * @since 04/06/2021
     */
    public Vinil(int vinilId, int clientId, int empleatId, String nom, float preu, String autor, int any, Estil estils) {
        this.vinilId = vinilId;
        this.clientId = clientId;
        this.empleatId = empleatId;
        this.nom = nom;
        this.preu = preu;
        this.autor = autor;
        this.any = any;
        this.estils = estils;
    }

    /**
     * Obtenir el nom del Vinil
     * @return
     * @since 04/06/2021
     */
    public String getNom() {
        return nom;
    }

    /**
     * Substituir el nom del Vinil pel passat per paràmetre
     * @param nom
     * @since 04/06/2021
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Obtenir l'autor del Vinil
     * @return
     * @since 04/06/2021
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Substituir l'autor del Vinil pel passat per paràmetre
     * @param autor
     * @since 04/06/2021
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Obtenir l'any del Vinil
     * @return
     * @since 04/06/2021
     */
    public int getAny() {
        return any;
    }
    /**
     * Substituir l'any del Vinil pel passat per paràmetre
     * @param any
     * @since 04/06/2021
     */
    public void setAny(int any) {
        this.any = any;
    }
    /**
     * Obtenir el preu del Vinil
     * @return
     * @since 04/06/2021
     */
    public float getPreu() {
        return preu;
    }
    /**
     * Substituir el preu del Vinil pel passat per paràmetre
     * @param preu
     * @since 04/06/2021
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }
    /**
     * Obtenir l'ID del Vinil
     * @return
     * @since 04/06/2021
     */
    public int getVinilId() {
        return vinilId;
    }
    /**
     * Substituir l'ID del Vinil pel passat per paràmetre
     * @param vinilId
     * @since 04/06/2021
     */
    public void setVinilId(int vinilId) {
        this.vinilId = vinilId;
    }
    /**
     * Obtenir l'ID del Client
     * @return
     * @since 04/06/2021
     */
    public int getClientId() {
        return clientId;
    }
    /**
     * Substituir l'ID del Client pel passat per paràmetre
     * @param clientId
     * @since 04/06/2021
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    /**
     * Obtenir l'ID del Empleat
     * @return
     * @since 04/06/2021
     */
    public int getEmpleatId() {
        return empleatId;
    }
    /**
     * Substituir l'ID del Empleat pel passat per paràmetre
     * @param empleatId
     * @since 04/06/2021
     */
    public void setEmpleatId(int empleatId) {
        this.empleatId = empleatId;
    }
    /**
     * Obtenir l'estil del Vinil
     * @return
     * @since 04/06/2021
     */
    public String getEstil() {
        return estil;
    }
    /**
     * Substituir l'estil del Vinil pel passat per paràmetre
     * @param estil
     * @since 04/06/2021
     */
    public void setEstil(String estil) {
        this.estil = estil;
    }

    /**
     * Obtenir tots els atributs del Vinil
     * @return
     * @since 04/06/2021
     */
    @Override
    public String toString() {
        return "Vinil{" +
                "vinil_id=" + vinilId +
                ", client_id=" + clientId +
                ", empleat_id=" + empleatId +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                ", autor='" + autor + '\'' +
                ", any=" + any +
                ", estil='" + estil + '\'' +
                '}';
    }
}
enum Estil{ROCK, PUNK, POP, RAP, TRAP, CLASSIC}
