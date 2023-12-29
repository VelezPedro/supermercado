package com.mycompany.supermecardo.persistencia;

import com.mycompany.supermecardo.entidades.CajaTotal;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Ticket;
import com.mycompany.supermecardo.entidades.Usuario;
import com.mycompany.supermecardo.entidades.Venta;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ControladorPresistencia {

    ProductoJpaController prodJpa = new ProductoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    VentaJpaController ventaJpa = new VentaJpaController();
    TicketJpaController ticketJpa=new TicketJpaController();

    CajaTotalJpaController cajaTotalJpa = new CajaTotalJpaController();


    public void guardar(Producto producto) throws Exception {
        prodJpa.create(producto);
    }

    public List<Producto> traerProductos() {
        return prodJpa.findProductoEntities();
    }

    public void borrarProducto(String codigoId) {
        try {
            prodJpa.destroy(codigoId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPresistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(String codigoId) {
        return prodJpa.findProducto(codigoId);
    }

    public void modificarProducto(Producto producto) {
        try {
            prodJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPresistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Usuario> traerUsuarios() {
        //revisar si esta bien, min 2:03 vid
        return usuJpa.findUsuarioEntities();
    }

    public List<String> traerRoles() {
        List<Usuario> usuarios = usuJpa.findUsuarioEntities();
        List<String> rolesUnicos = usuarios.stream()
                .map(Usuario::getRol)
                .distinct()
                .collect(Collectors.toList());

        return rolesUnicos;
    }

    public void guardarVenta(Venta venta) {
        ventaJpa.create(venta);
    }

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public void borrarUsuario(int idUsuario) {
        try {
            usuJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPresistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUsuario) {
        return usuJpa.findUsuario(idUsuario);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPresistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto buscarXNombre(String nombre) {
        return prodJpa.findProductoPorNombre(nombre);
    }

    public List<Venta> traerListVentas() {
        return ventaJpa.findVentaEntities();
    }

    public List<Venta> traerVentasVendedor(String vendedor) {
        return ventaJpa.listaVentasVendedor(vendedor);
    }

    public List<Venta> filtrarVentas(String vendedor, String anio, String mes, String dia, String formaDePago){
        return ventaJpa.buscarTodo(vendedor,anio,mes,dia,formaDePago);  
    }

    public void crearTicket(Ticket ticket) {
        ticketJpa.create(ticket);
    }

    public Ticket buscarTicket(String idTicket) {
     return ticketJpa.findTicket(idTicket);
    }

    public void borrarVenta(String id) throws NonexistentEntityException {
        ventaJpa.destroy(id);
    }

    public void borrarTicket(String id) throws NonexistentEntityException {
        ticketJpa.destroy(id);
    }



    public List<Producto> traerListaProductosXNombre(String nombre) {
     return prodJpa.traerListaProductosXNombre(nombre);
    }

    public void cerrarCaja(CajaTotal caja) {
        cajaTotalJpa.create(caja);
    }
    
}
