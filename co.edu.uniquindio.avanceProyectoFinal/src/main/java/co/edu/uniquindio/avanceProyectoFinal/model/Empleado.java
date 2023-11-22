package co.edu.uniquindio.avanceProyectoFinal.model;

import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoContrato;

public class Empleado extends Persona{
    private double salario;
    private int numDiasTrabajado;
    private TipoContrato tipoContrato;
    BancoNacional ownedByBancoNacional;


    //Constructor
    public Empleado() {
    }
    public Empleado(double salario, int numDiasTrabajado, TipoContrato tipoContrato) {
        this.salario = salario;
        this.numDiasTrabajado = numDiasTrabajado;
        this.tipoContrato = tipoContrato;
    }

    //Getters and Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumDiasTrabajado() {
        return numDiasTrabajado;
    }

    public void setNumDiasTrabajado(int numDiasTrabajado) {
        this.numDiasTrabajado = numDiasTrabajado;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public BancoNacional getOwnedByBancoNacional() {
        return ownedByBancoNacional;
    }

    public void setOwnedByBancoNacional(BancoNacional ownedByBancoNacional) {
        this.ownedByBancoNacional = ownedByBancoNacional;
    }
}

