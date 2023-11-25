package co.edu.uniquindio.avanceProyectoFinal.Servicios;

public interface IBancoNacional {

    void mostrarInformacionClientes();
    boolean crearCliente(String nombre, String apellido, String cedula, int edad);
    void buscarCliente(String cedula);
    boolean actualizarCliente(String cedulaActual, String nombre, String apellido, String cedula, int edad);
    void eliminarCliente(String cedula);

    void mostrarInformacionEmpleados();
    boolean crearEmpleado(String nombre, String apellido,
                  String cedula, int edad);
    void buscarEmpleado(String cedula);
    boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, int edad);
    void eliminarEmpleado(String cedula);

    void mostrarInformacionCuentas();
    boolean crearCuenta(String cedula);
    void buscarCuenta(String cedula);
    void eliminarCuenta(String cedula);

    boolean realizarTransferencia(String cedulaRemitente, String cedulaReceptor, double monto);
    boolean realizarDeposito(String cedula, double monto);
    void mostrarInformacionTransacciones();













}
