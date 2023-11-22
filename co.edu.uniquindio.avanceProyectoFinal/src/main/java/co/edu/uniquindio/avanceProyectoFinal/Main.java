package co.edu.uniquindio.avanceProyectoFinal;

import co.edu.uniquindio.avanceProyectoFinal.model.Cliente;
import co.edu.uniquindio.avanceProyectoFinal.model.BancoNacional;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BancoNacional bancoNacional = inializarDatosPrueba();

        //CRUD

        //Create - Crear
       // crearCliente("pedro", "marin", "1234", 20, bancoNacional);

        //crearCliente("shaira", "osorio", "4567", 30, bancoNacional);

        //Read - Mostrar
        mostrarInformacionCliente(bancoNacional);

        //Update - Actualizar

        //Delete - Eliminar
        elimimarCliente(bancoNacional, "1234");
        System.out.println("-----> Informacion luego de eliminar");
        mostrarInformacionCliente(bancoNacional);
    }

    private static BancoNacional inializarDatosPrueba() {
        BancoNacional bancoNacional = new BancoNacional();
        bancoNacional.setNombre("Banco Nacional");

        return bancoNacional;
    }

    private static void crearCliente(String nombre, String apellido,
                                     String cedula, int edad,
                                     BancoNacional bancoNacional) {

        bancoNacional.crearCliente(nombre, apellido, cedula, edad);
    }

    private static void mostrarInformacionCliente(BancoNacional bancoNacional) {
        List<Cliente> listaClientes = bancoNacional.obtenerClientes();

        int tamanioLista = listaClientes.size();
        for (int i = 0; i < tamanioLista; i++) {
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }

    private static void elimimarCliente(BancoNacional bancoNacional, String cedula) {
        bancoNacional.eliminarCliente(cedula);
    }
}