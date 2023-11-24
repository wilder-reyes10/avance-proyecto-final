package co.edu.uniquindio.avanceProyectoFinal.Dto;

public record TransaccionDto(
        String fecha,
        double valorTransferencia,
        String nombreRemitente,
        String nombreReceptor)
{
}
