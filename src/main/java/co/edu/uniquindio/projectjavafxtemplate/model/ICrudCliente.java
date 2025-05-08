package co.edu.uniquindio.projectjavafxtemplate.model;

import java.util.Collection;

public interface ICrudCliente {
    boolean eliminarCliente(String cedula);
    boolean crearCliente(Cliente cliente);
    boolean actualizarCliente(String cedula, Cliente cliente);
    Collection<Cliente> obtenerListaClientes();
}
