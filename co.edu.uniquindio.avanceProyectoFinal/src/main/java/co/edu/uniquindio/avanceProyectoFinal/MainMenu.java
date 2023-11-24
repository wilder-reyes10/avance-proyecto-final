package co.edu.uniquindio.avanceProyectoFinal;

import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoContrato;
import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoEstado;
import co.edu.uniquindio.avanceProyectoFinal.model.Cliente;
import co.edu.uniquindio.avanceProyectoFinal.model.BancoNacional;
import co.edu.uniquindio.avanceProyectoFinal.model.Cuenta;
import co.edu.uniquindio.avanceProyectoFinal.model.Empleado;

import java.util.Date;

import static co.edu.uniquindio.avanceProyectoFinal.util.CapturaDatosUtil.*;
import static co.edu.uniquindio.avanceProyectoFinal.Constantes.BancoNacionalConstantes.*;
import static co.edu.uniquindio.avanceProyectoFinal.util.CapturaDatosUtil.leerStringConsola;

public class MainMenu {

    public static void main(String[] args) {
        BancoNacional bancoNacional = inicializarDatosPrueba();
        gestionarOpcionesAplicacionBancoNacional(bancoNacional);
    }
    private static void mostrarMenuPrincipal() {
        System.out.println("Elija una opcion del menú principal: ");
        System.out.println("1 - Gestion clientes");
        System.out.println("2 - Gestion empleados");
        System.out.println("3 - Gestion de cuentas");
        System.out.println("4 - Realizar transaccion");
        System.out.println("5 - Salir");
    }

    private static void gestionarOpcionesAplicacionBancoNacional(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            System.out.println("Bienvenido al Banco Nacional");
            mostrarMenuPrincipal();
            opcion= leerEntero("Seleccione una de las opciones del menú: ");
            switch (opcion) {
                case 1:
                    gestionarOpcionesCliente(bancoNacional);
                    break;
                case 2:
                    gestionarOpcionesEmpleado(bancoNacional);
                    break;
                case 3:
                    gestionarOpcionesCuenta(bancoNacional);
                    break;
                case 4:
                    gestionarOpcionesTransaccion(bancoNacional);
                    break;
                case 5:
                    System.out.println("Ha seleccionado salir");

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
                   gestionarOpcionesAplicacionBancoNacional(bancoNacional);
                    break;
               default:
                   System.out.println("la opción seleccionada no es valida");
                   break;
            }
        } while (opcion != 7);
    }
    private static void gestionarOpcionesEmpleado(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            mostrarMenuCrudEmpleado();
            opcion = leerEntero("Seleccione la opcion de gestion de empleados: ");
            switch (opcion) {
                case 1:
                    bancoNacional.mostrarInformacionEmpleados();
                    break;
                case 2:
                    crearEmpleado(bancoNacional);
                    break;
                case 3:
                    actualizarEmpleado(bancoNacional);
                    break;
                case 4:
                    eliminarEmpleado(bancoNacional);
                    break;
                case 5:
                    buscarEmpleado(bancoNacional);
                    break;
                case 6:
                    gestionarOpcionesAplicacionBancoNacional(bancoNacional);
                    break;
                default:
                    System.out.println("La opción seleccionada no es valida");
                    break;
            }
        } while (opcion != 6);
    }

    private static void gestionarOpcionesCuenta(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            mostrarMenuCrudCuenta();
            opcion = leerEntero("Seleccione la opcion de gestion de cuentas: ");
            switch (opcion) {
                case 1:
                    bancoNacional.mostrarInformacionCuentas();
                    break;
                case 2:
                    crearCuenta(bancoNacional);
                    break;
                case 3:
                    eliminarCuenta(bancoNacional);
                    break;
                case 4:
                    buscarCuenta(bancoNacional);
                    break;
                case 5:
                    gestionarOpcionesAplicacionBancoNacional(bancoNacional);
                    break;
                default:
                    System.out.println("la opción seleccionada no es valida");
                    break;
            }
        } while (opcion != 6);
    }

    private static void gestionarOpcionesTransaccion(BancoNacional bancoNacional) {
        int opcion = 0;
        do {
            mostrarMenuCrudTransaccion();
            opcion = leerEntero("Seleccione la opcion de gestion de clientes: ");
            switch (opcion) {
                case 1:
                    bancoNacional.mostrarInformacionTransacciones();
                    break;
                case 2:
                    realizarDeposito(bancoNacional);
                    break;
                case 3:
                    realizarTransferencia(bancoNacional);
                    break;
                case 4:
                    gestionarOpcionesAplicacionBancoNacional(bancoNacional);
                    break;
                default:
                    System.out.println("la opción seleccionada no es valida");
                    break;
            }
        } while (opcion != 6);
    }


    //Menu CRUD Gestión de clientes
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

    // Menu CRUD Gestion de empleados
    private static void mostrarMenuCrudEmpleado() {
        System.out.println("Elija que desea realizar en la gestion de empleados");
        System.out.println("1 - Mostrar información de los empleados");
        System.out.println("2 - Crear un empleado");
        System.out.println("3 - Actualizar un empleado");
        System.out.println("4 - Eliminar un empleado");
        System.out.println("5 - Buscar un empleado");
        System.out.println("6 - regresar al menú principal");
    }

    private static void crearEmpleado(BancoNacional bancoNacional) {
        String nombre = leerStringConsola(INGRESE_NOMBRE_EMPLEADO);
        String apellido = leerStringConsola(INGRESE_APELIIDO_EMPLEADO);
        String cedula = leerStringConsola(INGRESE_CEDULA_EMPLEADO);
        int edad = leerEntero(INGRESE_EDAD_EMPLEADO);

        boolean Creado = bancoNacional.crearEmpleado(nombre, apellido, cedula, edad);
        if(Creado == true){
            System.out.println(EMPLEADO_CREADO);
        }else{
            System.out.println(EMPLEADO_CREADO);
        }
    }

    private static void actualizarEmpleado(BancoNacional bancoNacional) {
        String cedulaActual = leerStringConsola(INGRESE_CEDULA_EMPLEADO_ACTUAL);
        String nombre = leerStringConsola(INGRESE_NOMBRE_EMPLEADO);
        String apellido = leerStringConsola(INGRESE_APELIIDO_EMPLEADO);
        String cedula = leerStringConsola(INGRESE_CEDULA_EMPLEADO);
        int edad = leerEntero(INGRESE_EDAD_EMPLEADO);
        boolean Actualizado = bancoNacional.actualizarEmpleado(cedulaActual, nombre, apellido, cedula,edad);
        if(Actualizado == true){
            System.out.println(EMPLEADO_ACTUALIZADO);
        }else{
            System.out.println(EMPLEADO_NO_ACTUALIZADO);
        }
    }

    private static void eliminarEmpleado(BancoNacional bancoNacional){
        String cedula = leerStringConsola(INGRESE_CEDULA_EMPLEADO);
        bancoNacional.eliminarEmpleado(cedula);
    }

    private static void buscarEmpleado(BancoNacional bancoNacional) {
        String cedula = leerStringConsola(INGRESE_CEDULA_EMPLEADO);
        bancoNacional.buscarEmpleado(cedula);
    }

    //CUENTA
    private static void mostrarMenuCrudCuenta() {
        System.out.println("Elija que desea realizar en la gestion de Cuenta");
        System.out.println("1 - Mostrar información de las Cuentas");
        System.out.println("2 - Crear una Cuenta");
        System.out.println("3 - Eliminar un Cuenta");
        System.out.println("4 - Buscar un Cuenta");
        System.out.println("5 - regresar al menú principal");
    }

    private static void crearCuenta(BancoNacional bancoNacional) {
        String cedula = leerStringConsola(INGRESE_CEDULA_CUENTA);

        boolean Creado = bancoNacional.crearCuenta(cedula);
        if(Creado == true){
            System.out.println(CUENTA_CREADO);
        }else{
            System.out.println(CUENTA_NO_CREADO);
        }
    }

    private static void eliminarCuenta(BancoNacional bancoNacional){
        String cedula = leerStringConsola(INGRESE_CEDULA_CUENTA);
        bancoNacional.eliminarCuenta(cedula);
    }

    private static void buscarCuenta(BancoNacional bancoNacional) {
        String cedula = leerStringConsola("Ingrese la cedula de la persona");
        bancoNacional.buscarCuenta(cedula);
    }

    //TRANSACCION
    private static void mostrarMenuCrudTransaccion() {
        System.out.println("Elija que desea realizar en la gestion de transaccion");
        System.out.println("1 - Mostrar información de las transacciones");
        System.out.println("2 - realizar un Deposito");
        System.out.println("3 - realizar una transferencia");
        System.out.println("4 - regresar al menú principal");
    }

    public static void realizarTransferencia(BancoNacional bancoNacional){
        String cedulaEmisor = leerStringConsola("ingrese cedula emisor");
        String cedulaReceptor = leerStringConsola("ingrese cedula receptor");
        double monto = leerDoubleConsola("ingrese un momto");
        bancoNacional.realizarTransferencia(cedulaEmisor,cedulaReceptor,monto);
    }

    public static void realizarDeposito(BancoNacional bancoNacional){
        String cedulaReceptor = leerStringConsola("ingrese cedula receptor");
        double monto = leerDoubleConsola("ingrese un momto");
        bancoNacional.realizarDeposito(cedulaReceptor,monto);
    }

    //METODOS ADICIONALES

    public static void mostrarSaldoCuenta(BancoNacional bancoNacional){

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
        cliente1.setCedula("2000");
        cliente1.setEdad(45);

        Empleado empleado = new Empleado();
        empleado.setNombre("Ramiro");
        empleado.setApellido("Gonzales");
        empleado.setCedula("78945");
        empleado.setEdad(45);
        empleado.setSalario(1500000);
        empleado.setTipoContrato(TipoContrato.MEDIO_TIEMPO);

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Jairo");
        empleado1.setApellido("Gomez");
        empleado1.setCedula("45612");
        empleado1.setEdad(25);
        empleado1.setSalario(2500000);
        empleado1.setTipoContrato(TipoContrato.HORAS);

        Cuenta cuenta= new Cuenta();
        cuenta.setCedula("123456");
        cuenta.setNumeroCuenta(1234567891);
        cuenta.setTipoEstado(TipoEstado.ACTIVO);

        Cuenta cuenta1= new Cuenta();
        cuenta1.setCedula("12345678");
        cuenta1.setNumeroCuenta(1234567890);
        cuenta1.setTipoEstado(TipoEstado.ACTIVO);

        bancoNacional.getListaCuentas().add(cuenta1);
        bancoNacional.getListaCuentas().add(cuenta);
        bancoNacional.getListaClientes().add(cliente);
        bancoNacional.getListaClientes().add(cliente1);
        bancoNacional.getListaEmpleados().add(empleado1);
        bancoNacional.getListaEmpleados().add(empleado);


        return bancoNacional;
    }

}
