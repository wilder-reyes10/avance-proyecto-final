package co.edu.uniquindio.avanceProyectoFinal.model;

public class Cliente extends Persona {

    private double saldoCliente ;
    BancoNacional ownedByBancoNacional;

    //Constructor
    public Cliente() {
    }

    //Getters and Setters
    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public BancoNacional getOwnedByBancoNacional() {
        return ownedByBancoNacional;
    }

    public void setOwnedByBancoNacional(BancoNacional ownedByBancoNacional) {
        this.ownedByBancoNacional = ownedByBancoNacional;
    }
}


