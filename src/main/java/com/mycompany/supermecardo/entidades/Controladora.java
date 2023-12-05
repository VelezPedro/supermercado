package com.mycompany.supermecardo.entidades;

import com.mycompany.supermecardo.persistencia.ControladorPresistencia;
import java.util.List;
import javax.swing.JTextField;

public class Controladora {

    ControladorPresistencia contPersis = new ControladorPresistencia();

    public void guardar(JTextField codigoId, JTextField nbrProducto, JTextField stock,
            JTextField costo, JTextField precioVenta, String catego, String formaDeVenta) throws Exception {
        Producto producto = new Producto();
        producto.setCodigoId(codigoId.getText());
        producto.setNombre(nbrProducto.getText());
        producto.setStock(Integer.valueOf(stock.getText()));
        producto.setCosto(Integer.valueOf(costo.getText()));
        producto.setPrecio(Integer.valueOf(precioVenta.getText()));
        producto.setCategoria(catego);
        producto.setFromVenta(formaDeVenta);

        contPersis.guardar(producto);
    }

    public List<Producto> traerProductos() {
        return contPersis.traerProductos();
    }

    public void borrarProducto(String codigoId) {
        contPersis.borrarProducto(codigoId);
    }

}
