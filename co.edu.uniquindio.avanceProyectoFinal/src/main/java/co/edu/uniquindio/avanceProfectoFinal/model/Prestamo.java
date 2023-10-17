package co.edu.uniquindio.avanceProfectoFinal.model;

public class Prestamo {
    private String codigoPrestamo;
    private String fechaInicio;
    private String fechaFin;
    private double valorPrestamo;

    BancoNacional ownedByBancoNacional;

    public Prestamo() {
    }

    public Prestamo(String codigoPrestamo, String fechaInicio, String fechaFin, double valorPrestamo,
                    BancoNacional ownedByBancoNacional) {
        this.codigoPrestamo = codigoPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorPrestamo = valorPrestamo;
        this.ownedByBancoNacional = ownedByBancoNacional;
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(double valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    public BancoNacional getOwnedByBancoNacional() {
        return ownedByBancoNacional;
    }

    public void setOwnedByBancoNacional(BancoNacional ownedByBancoNacional) {
        this.ownedByBancoNacional = ownedByBancoNacional;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "codigoPrestamo='" + codigoPrestamo + '\'' +
                ", cfechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", valorPrestamo=" + valorPrestamo +
                '}';
    }
}
