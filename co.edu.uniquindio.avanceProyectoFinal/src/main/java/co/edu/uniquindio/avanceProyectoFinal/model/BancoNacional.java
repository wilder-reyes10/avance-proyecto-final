package co.edu.uniquindio.avanceProyectoFinal.model;

import java.util.ArrayList;
import java.util.List;

import static co.edu.uniquindio.avanceProyectoFinal.Constantes.BancoNacionalConstantes.*;

public class BancoNacional {
    private String nombre;

    List<Cliente> listaClientes = new ArrayList<>();
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Prestamo> listaPrestamos = new ArrayList<>();
    List<Cuenta> listaCuentas= new ArrayList<>();

    //Constructor
    public BancoNacional() {
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    /**
     * Metodo para obtener la lista de todos los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }
    public List<Empleado> obtenerEmpleados() { return getListaEmpleados(); }


    // CLIENTES

    /**
     * Metodo para mostrar la informacion de todos los clientes existentes
     */
    public void mostrarInformacionClientes() {
        //Opcion 1
        //System.out.println(getListaClientes().toString());

        for (Cliente cliente : getListaClientes()) {
            System.out.println(cliente.toString());
        }
    }
    public Cliente obtenerCliente(String cedula){
        Cliente clienteEncontrado = null;
        for (Cliente cliente : getListaClientes()) {
            if (cliente.getCedula().equalsIgnoreCase(cedula)){
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

    /**
     * Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */

    public boolean crearCliente(String nombre, String apellido,
                                String cedula, int edad) {
        Cliente clienteActual = obtenerCliente(cedula);
        if (clienteActual == null) {
            Cliente cliente = new Cliente();
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            cliente.setEdad(edad);

            getListaClientes().add(cliente);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para buscar y mostrar la informacion de un cliente
     * @param cedula
     */
    public void buscarCliente(String cedula) {
        Cliente clienteEncontrado = obtenerCliente(cedula);
        if(clienteEncontrado != null){
            System.out.println(CLIENTE_ENCONTRADO);
            System.out.println(clienteEncontrado.toString());
        }else{
            System.out.println(CLIENTE_NO_EXISTE);
        }
    }

    /**
     * Metodo para actualizar la información de un cliente
     * @param cedulaActual
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return
     */
    public boolean actualizarCliente(String cedulaActual, String nombre, String apellido, String cedula, int edad) {
        Cliente clienteEncontrado = obtenerCliente(cedulaActual);
        if(clienteEncontrado != null){
            clienteEncontrado.setNombre(nombre);
            clienteEncontrado.setApellido(apellido);
            clienteEncontrado.setCedula(cedula);
            clienteEncontrado.setEdad(edad);

            return true;
        }else{
            return false;
        }
    }

    /**
     * Metodo para eliminar un cliente buscado por la cédula
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        Cliente clienteEncontrado = obtenerCliente(cedula);
        if (clienteEncontrado != null){
            System.out.println(CLIENTE_ELIMINADO);
            getListaClientes().remove(clienteEncontrado);
        }else{
            System.out.println(CLIENTE_NO_EXISTE);
        }
    }

    //EMPLEADOS

    /**
     * Metodo para mostrar la informacion de todos los empleados existentes
     */
    public void mostrarInformacionEmpleados(){
        //Opcion 1
        //System.out.println(getListaEmpleados().toString());

        for (Empleado empleado : getListaEmpleados()) {
            System.out.println(empleado.toString());
        }
    }
    public Empleado obtenerEmpleado(String cedula){
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : getListaEmpleados()){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    /**
     * Metodo pára crear un empleaado
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param salario
     * @param numDiasTrabajado
     * @return
     */
    public boolean crearEmpleado(String nombre, String apellido,
                                 String cedula, int edad,
                                 double salario, int numDiasTrabajado) {
        Empleado empleadoActual = obtenerEmpleado(cedula);
        if (empleadoActual == null) {
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setEdad(edad);
            empleado.setSalario(salario);
            empleado.setNumDiasTrabajado(numDiasTrabajado);

            getListaEmpleados().add(empleado);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para buscar y mostrar la informacion de un empleado
     * @param cedula
     */
    public void buscarEmpleado(String cedula) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedula);
        if(empleadoEncontrado != null){
            System.out.println(EMPLEADO_ENCONTRADO);
            System.out.println(empleadoEncontrado.toString());
        }else{
            System.out.println(EMPLEADO_NO_EXISTE);
        }
    }

    /**
     * Metodo para actualizar la información de un empleado
     * @param cedulaActual
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return
     */
    public boolean actualizarEmpleado(String cedulaActual, String nombre, String apellido, String cedula, int edad) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedulaActual);
        if(empleadoEncontrado != null){
            empleadoEncontrado.setNombre(nombre);
            empleadoEncontrado.setApellido(apellido);
            empleadoEncontrado.setCedula(cedula);
            empleadoEncontrado.setEdad(edad);

            return true;
        }else{
            return false;
        }
    }

    /**
     * Metodo para eliminar un empleado buscado por la cédula
     * @param cedula
     */
    public void eliminarEmpleado(String cedula) {
        Empleado empleadoEncontrado = obtenerEmpleado(cedula);
        if (empleadoEncontrado != null){
            System.out.println(EMPLEADO_ELIMINADO);
            getListaEmpleados().remove(empleadoEncontrado);
        }else{
            System.out.println(EMPLEADO_NO_EXISTE);
        }
    }



}
