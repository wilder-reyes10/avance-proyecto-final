package co.edu.uniquindio.avanceProyectoFinal.model;

import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoEstado;

import java.util.Date;

public class Cuenta {
    private int numeroCuenta;
    private String cedula;
    private Date fechaApertura;
    private double saldo;
    private TipoEstado tipoEstado;

    BancoNacional ownedByBancoNacional;

    //Constructor
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String cedula) {
        this.numeroCuenta = numeroCuenta;
        this.cedula = cedula;
        this.saldo = 0;
        this.tipoEstado = TipoEstado.ACTIVO;
        this.fechaApertura = new Date();
    }

    ////Getters and Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoEstado getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
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
                "numeroCuenta=" + numeroCuenta +
                ", cedula='" + cedula + '\'' +
                ", fechaApertura=" + fechaApertura +
                ", saldo=" + saldo +
                ", tipoEstado=" + tipoEstado +
                '}';
    }
}
