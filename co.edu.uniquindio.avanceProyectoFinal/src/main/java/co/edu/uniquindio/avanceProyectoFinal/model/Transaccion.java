package co.edu.uniquindio.avanceProyectoFinal.model;

public class Transaccion {
    private String codigoTransaccion;
    private String fecha;
    private double saldo;

    BancoNacional ownedByBancoNacional;

    public Transaccion() {
    }

    public Transaccion(String codigoTransaccion, String fecha, double saldo) {
        this.codigoTransaccion = codigoTransaccion;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public BancoNacional getOwnedByBancoNacional() {
        return ownedByBancoNacional;
    }

    public void setOwnedByBancoNacional(BancoNacional ownedByBancoNacional) {
        this.ownedByBancoNacional = ownedByBancoNacional;
    }


}
