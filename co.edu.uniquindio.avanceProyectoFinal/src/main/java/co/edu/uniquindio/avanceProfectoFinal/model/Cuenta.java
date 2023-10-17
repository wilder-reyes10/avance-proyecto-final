package co.edu.uniquindio.avanceProfectoFinal.model;

public class Cuenta {
    private String numeroCuenta;
    private int cedula;
    private String fechaApertura;
    private double saldo;

    BancoNacional ownedByBancoNacional;

    public Cuenta(String numeroCuenta, int cedula, String fechaApertura, double saldo,
                  BancoNacional ownedByBancoNacional) {
        this.numeroCuenta = numeroCuenta;
        this.cedula = cedula;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.ownedByBancoNacional = ownedByBancoNacional;
    }

    public Cuenta() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
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
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", cedula='" + cedula + '\'' +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", saldo=" +saldo +
                '}';
    }
}
