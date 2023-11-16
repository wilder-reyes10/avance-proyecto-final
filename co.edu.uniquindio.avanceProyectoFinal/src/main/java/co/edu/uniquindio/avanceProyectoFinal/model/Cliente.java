package co.edu.uniquindio.avanceProyectoFinal.model;

public class Cliente extends Persona {
    BancoNacional ownedByBancoNacional;

    //Constructor
    public Cliente() {
    }

    public BancoNacional getOwnedByBancoNacional() {
        return ownedByBancoNacional;
    }

    public void setOwnedByBancoNacional(BancoNacional ownedByBancoNacional) {
        this.ownedByBancoNacional = ownedByBancoNacional;
    }
}


