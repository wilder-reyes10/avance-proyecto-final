package co.edu.uniquindio.avanceProyectoFinal.model;

import java.util.Date;

public class Transaccion {
    private Date fecha;
    private double valorTransferencia;

    private Persona remitente;

    private Persona receptor;

    BancoNacional ownedByBancoNacional;

    public Transaccion() {
    }

    public Transaccion(Persona remitente, Persona receptor, double valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
        this.remitente = remitente;
        this.receptor = receptor;
        this.fecha= new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorTransferencia() {
        return valorTransferencia;
    }

    public void setValorTransferencia(double valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "fecha=" + fecha +
                ", valorTransferencia=" + valorTransferencia +
                ", remitente=" + remitente +
                ", receptor=" + receptor +
                '}';
    }
}
