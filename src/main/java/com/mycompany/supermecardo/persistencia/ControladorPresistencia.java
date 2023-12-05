package com.mycompany.supermecardo.persistencia;

import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPresistencia {
    
    ProductoJpaController prodJpa = new ProductoJpaController();

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
    
    
}
