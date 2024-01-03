package com.mycompany.supermecardo.entidades;

import com.mycompany.supermecardo.persistencia.ControladorPresistencia;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JTextField;

public class Controladora {

    ControladorPresistencia contPersis = new ControladorPresistencia();

    public Controladora() {
        contPersis = new ControladorPresistencia();
    }

    public void guardar(JTextField codigoId, JTextField nbrProducto, JTextField stock,
            JTextField costo, JTextField precioVenta, String catego, String formaDeVenta, Integer unidadesVendidas) throws Exception {
        Producto producto = new Producto();
        producto.setCodigoId(codigoId.getText());
        producto.setNombre(nbrProducto.getText());
        producto.setStock(Double.valueOf(stock.getText()));
        producto.setCosto(Integer.valueOf(costo.getText()));
        producto.setPrecio(Integer.valueOf(precioVenta.getText()));
        producto.setCategoria(catego);
        producto.setFromVenta(formaDeVenta);
        producto.setUnidadesVendidas(0.0);
        contPersis.guardar(producto);
    }

    public List<Producto> traerProductos() {
        return contPersis.traerProductos();
    }

    public void borrarProducto(String codigoId) {
        contPersis.borrarProducto(codigoId);
    }

    public Producto traerProducto(String codigoId) {
        return contPersis.traerProducto(codigoId);
    }

    public void modificarProducto(Producto producto, JTextField nbrProducto,
            JTextField stock, JTextField costo, JTextField precioVenta,
            String catego, String formaDeVenta) {

        producto.setNombre(nbrProducto.getText());
        producto.setStock(Double.valueOf(stock.getText()));
        producto.setCosto(Integer.valueOf(costo.getText()));
        producto.setPrecio(Integer.valueOf(precioVenta.getText()));
        producto.setCategoria(catego);
        producto.setFromVenta(formaDeVenta);
        contPersis.modificarProducto(producto);
    }

    public Usuario validarUsuario(String usuario, String password) {
        Usuario user = null;

        List<Usuario> listaUsuarios = contPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getPassword().equals(password)) {
                    user = usu;
                    return user;
                } else {
                    user = null;
                    return user;
                }
            } else {

                user = null;
            }

        }
        return user;
    }

    public List<Usuario> traerUsuarios() {
        return contPersis.traerUsuarios();
    }

    public List<String> traerRoles() {
        return contPersis.traerRoles();
    }

    public void crearVenta(List<Producto> listProducto, Double totalVentas, JTextField descPorcentaje,
            JTextField descPrecio, Usuario usuario, String formVenta, Date dia, String horario,Ticket tic) throws ParseException {

        Venta venta = new Venta();
        venta.setListaProductos(listProducto);
        venta.setDescuentoPorPorcentaje(Integer.valueOf(descPorcentaje.getText()));
        venta.setDescuentoPorPrecio(Integer.valueOf(descPrecio.getText()));
        venta.setVendedor(usuario);

        venta.setPrecio(totalVentas);

        SimpleDateFormat fechaSdf = new SimpleDateFormat("dd/MM/yyyy");
        venta.setHorario(horario);

        Date fecha = fechaSdf.parse(fechaSdf.format(dia));
        //Date hora= horaSdf.parse(horaSdf.format(horario));
        venta.setFecha(dia);
        venta.setFormpago(formVenta);
        venta.setTicket(tic);
        contPersis.guardarVenta(venta);
    }

    public void actualizarStock(Map<Producto, Double> unidadesVendidasPorProducto) {
        for (Map.Entry<Producto, Double> entry : unidadesVendidasPorProducto.entrySet()) {
            Producto key = entry.getKey();
            Double value = entry.getValue();
            Producto producto = contPersis.traerProducto(key.getCodigoId());
            producto.setStock(producto.getStock() - value);
            producto.setUnidadesVendidas(producto.getUnidadesVendidas() + value);
            contPersis.modificarProducto(producto);
        }
    }

    public void crearUsuario(String usuario, String password, String rol) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setPassword(password);
        usu.setRol(rol);

        contPersis.crearUsuario(usu);
    }

    public void borrarUsuario(int idUsuario) {
        contPersis.borrarUsuario(idUsuario);
    }

    public Usuario traerUsuario(int idUsuario) {
        return contPersis.traerUsuario(idUsuario);
    }

    public void editarUsuario(Usuario usu, String usuario, String password, String rol) {
        usu.setNombreUsuario(usuario);
        usu.setPassword(password);
        usu.setRol(rol);

        contPersis.editarUsuario(usu);
    }

    public Producto traerProductoXNombre(String nombre) {
        return contPersis.buscarXNombre(nombre);
    }

    public List<Venta> traerVentas() {
        return contPersis.traerListVentas();
    }

    public List<Venta> traerVentasVendedor(String vendedor) {
        return contPersis.traerVentasVendedor(vendedor);
    }

    public void agregarStock(Producto producto, Double stock) {
         producto.setStock(stock);
         contPersis.modificarProducto(producto);
    }

    public List<Venta> buscarYMostrarResultados(String vendedor, String anio, String mes, String dia, String formaDePago) {
        return contPersis.filtrarVentas(vendedor, anio, mes, dia, formaDePago);
    }

    public void crearTicket(Ticket ticket) {
        contPersis.crearTicket(ticket);
    }

    public Ticket buscarTicket(String idTicket) {
        return contPersis.buscarTicket(idTicket);
    }

    public void borrarVenta(String id) throws NonexistentEntityException {
        contPersis.borrarVenta(id);
    }

    public void borrarTicket(String id) throws NonexistentEntityException {
        contPersis.borrarTicket(id);
    }

    public List<Producto> traerListaProductosXNombre(String nombre) {
       return contPersis.traerListaProductosXNombre(nombre);
    }

    public void cerrarCaja(CajaTotal caja) {
        contPersis.cerrarCaja(caja);
    }

    public List<CajaTotal> traerTodasCajas() {
       return contPersis.traerTodasCajas();
    }
    public void cambiarFormaDePago(Venta venta) throws Exception {
        contPersis.cambiarFormaDePago(venta);
         }



}
