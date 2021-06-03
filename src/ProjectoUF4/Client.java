package ProjectoUF4;

public class Client extends Persona {
    private int clientId;


    public Client(int botigaId, String nom, String cognoms, String DNI, int edat, char sexe, String telefon, String email, String adreca, String poblacio, int clientId) {
        super(botigaId, nom, cognoms, DNI, edat, sexe, telefon, email, adreca, poblacio);
        this.clientId = clientId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


    @Override
    public String toString() {
        return "Client{" +
                "botigaId=" + botigaId +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edat=" + edat +
                ", sexe=" + sexe +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", adreca='" + adreca + '\'' +
                ", poblacio='" + poblacio + '\'' +
                ", clientId=" + clientId +
                '}';
    }
}

