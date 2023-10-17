package co.edu.uniquindio.avanceProfectoFinal.model;

public class Transaccion {
    private String cedulaTransaccion;
    private String fecha;
    private double saldo;

    BancoNacional ownedByBancoNacional;

    public Transaccion() {
    }

    public Transaccion(String cedulaTransaccion, String fecha, double saldo, BancoNacional ownedByBancoNacional) {
        this.cedulaTransaccion = cedulaTransaccion;
        this.fecha = fecha;
        this.saldo = saldo;
        this.ownedByBancoNacional = ownedByBancoNacional;
    }

    public String getCedulaTransaccion() {
        return cedulaTransaccion;
    }

    public void setCedulaTransaccion(String cedulaTransaccion) {
        this.cedulaTransaccion = cedulaTransaccion;
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

    @Override
    public String toString() {
        return "Transaccion{" +
                "nombre='" + cedulaTransaccion + '\'' +
                ", apellido='" + fecha + '\'' +
                ", cedula='" + saldo +
                '}';
    }
}
