package co.edu.uniquindio.avanceProyectoFinal;

import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoContrato;
import co.edu.uniquindio.avanceProyectoFinal.model.Cliente;
import co.edu.uniquindio.avanceProyectoFinal.model.BancoNacional;
import co.edu.uniquindio.avanceProyectoFinal.model.Empleado;

import static co.edu.uniquindio.avanceProyectoFinal.util.CapturaDatosUtil.*;
import static co.edu.uniquindio.avanceProyectoFinal.Constantes.BancoNacionalConstantes.*;

public class MainMenu {

    public static void main(String[] args) {
        BancoNacional bancoNacional = inicializarDatosPrueba();
        gestionarOpcionesAplicacionBancoNacional(bancoNacional);
    }

    private static void gestionarOpcionesAplicacionBancoNacional(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            mostrarMenuPrincipal();
            opcion= leerEntero("Seleccione una de las opciones del menú: ");
            switch (opcion) {
                case 1:
                    gestionarOpcionesCliente(bancoNacional);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    int valorRespuesta = mostrarMensajeAlerta("Esta seguro de salir?");
                    if(valorRespuesta == 1){
                        opcion = 0;
                    }
                    break;
                default:
                    mostrarMensaje("La opción seleccionada no es valida");
                    break;
            }
        }while(opcion!=5);
    }

    private static void gestionarOpcionesCliente(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            mostrarMenuCrudCliente();
            opcion = leerEntero("Seleccione la opcion de gestion de clientes: ");
            switch (opcion) {
                case 1:
                    bancoNacional.mostrarInformacionClientes();
                    break;
                case 2:
                    crearCliente(bancoNacional);
                    break;
                case 3:
                    actualizarCliente(bancoNacional);
                    break;
                case 4:
                    eliminarCliente(bancoNacional);
                    break;
                case 5:
                    buscarCliente(bancoNacional);
                    break;
                case 6:
                    int valorRespuesta = mostrarMensajeAlerta("Esta seguro de desea salir");
                    if(valorRespuesta == 1){
                        opcion = 0;
                    }
                    break;
                default:
                    mostrarMensaje("La opción seleccionada no es valida");
                    break;
            }
        } while (opcion != 6);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Elija una opcion del menú principal: ");
        System.out.println("1 - Gestion clientes");
        System.out.println("2 - Gestion empleados");
        System.out.println("3 - Gestion de cuentas");
        System.out.println("4 - Solicitar prestamo");
        System.out.println("5 - Salir");
    }

    private static void mostrarMenuCrudCliente() {
        System.out.println("Elija que desea realizar en la gestion de clientes");
        System.out.println("1 - Mostrar información de los clientes");
        System.out.println("2 - Crear un Cliente");
        System.out.println("3 - Actualizar un cliente");
        System.out.println("4 - Eliminar un cliente");
        System.out.println("5 - Buscar un cliente");
        System.out.println("6 - regresar al menú principal");
    }


    private static void crearCliente(BancoNacional bancoNacional) {
        String nombre = leerStringConsola(INGRESE_NOMBRE_CLIENTE);
        String apellido = leerStringConsola(INGRESE_APELIIDO_CLIENTE);
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        int edad = leerEntero(INGRESE_EDAD_CLIENTE);

        boolean Creado = bancoNacional.crearCliente(nombre, apellido, cedula, edad);
        if(Creado == true){
            System.out.println(CLIENTE_CREADO);
        }else{
            System.out.println(CLIENTE_NO_CREADO);
        }
    }

    private static void actualizarCliente(BancoNacional bancoNacional) {
        String cedulaActual = leerStringConsola(INGRESE_CEDULA_CLIENTE_ACTUAL);
        String nombre = leerStringConsola(INGRESE_NOMBRE_CLIENTE);
        String apellido = leerStringConsola(INGRESE_APELIIDO_CLIENTE);
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        int edad = leerEntero(INGRESE_EDAD_CLIENTE);
        boolean Actualizado = bancoNacional.actualizarCliente(cedulaActual, nombre, apellido, cedula, edad);
        if(Actualizado == true){
            System.out.println(CLIENTE_ACTUALIZADO);
        }else{
            System.out.println(CLIENTE_NO_ACTUALIZADO);
        }
    }

    private static void eliminarCliente(BancoNacional bancoNacional){
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
       bancoNacional.eliminarCliente(cedula);
    }

    private static void buscarCliente(BancoNacional bancoNacional) {
        String cedula = leerStringConsola(INGRESE_CEDULA_CLIENTE);
        bancoNacional.buscarCliente(cedula);
    }

    /** Metodo para Inicializar datos de prueba
     * @return bancoNacional
     */
    private static BancoNacional inicializarDatosPrueba() {
        BancoNacional bancoNacional = new BancoNacional();
        bancoNacional.setNombre("Prestamos Banco Nacional");

        Cliente cliente = new Cliente();
        cliente.setNombre("Wilder");
        cliente.setApellido("Reyes");
        cliente.setCedula("1999");
        cliente.setEdad(24);

        Cliente cliente1 = new Cliente();
        cliente1.setNombre("juan");
        cliente1.setApellido("ramirez");
        cliente1.setCedula("1985");
        cliente1.setEdad(45);
        
        bancoNacional.getListaClientes().add(cliente);
        bancoNacional.getListaClientes().add(cliente1);

        return bancoNacional;
    }

}
