package co.edu.uniquindio.projectjavafxtemplate.controller;

import co.edu.uniquindio.projectjavafxtemplate.model.*;

import java.util.Collection;

public class ClienteController implements ICrudCliente {
    Empresa empresa;

    public ClienteController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearCliente(Cliente cliente) {
        return empresa.crearCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return empresa.obtenerListaClientes();
    }

    public boolean eliminarCliente(String cedula) {
        return empresa.eliminarCliente(cedula);
    }

    public boolean actualizarCliente(String cedula, Cliente cliente) {
        return empresa.actualizarCliente(cedula, cliente);
    }

}
