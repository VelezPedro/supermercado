package com.mycompany.supermecardo.entidades;

import com.mycompany.supermecardo.persistencia.ControladorPresistencia;
import java.util.List;
import javax.swing.JTextField;

public class Controladora {

    ControladorPresistencia contPersis = new ControladorPresistencia();

    public Controladora() {
        contPersis= new ControladorPresistencia();
    }
    
    

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

    public Producto traerProducto(String codigoId) {
        return contPersis.traerProducto(codigoId);
    }

    public void modificarProducto(Producto producto, JTextField nbrProducto,
            JTextField stock, JTextField costo, JTextField precioVenta,
            String catego, String formaDeVenta) {

        producto.setNombre(nbrProducto.getText());
        producto.setStock(Integer.valueOf(stock.getText()));
        producto.setCosto(Integer.valueOf(costo.getText()));
        producto.setPrecio(Integer.valueOf(precioVenta.getText()));
        producto.setCategoria(catego);
        producto.setFromVenta(formaDeVenta);
        contPersis.modificarProducto(producto);
    }

    public Usuario validarUsuario(String usuario, String password) {
        //String mensaje="";
        Usuario user= null;
        
        List<Usuario> listaUsuarios= contPersis.traerUsuarios();
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getPassword().equals(password)){
                    //mensaje= "Usuario y contraseña correctos. Bienvenido/a!";
                    user = usu;
                    return user;
                }
                else{
                    user=null;
                    return user;
                }
            }
            else {
                
                user=null;
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
    

    

   

}
