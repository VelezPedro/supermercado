package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    
    @Id
    private String codigoId;
    private String nombre;
    private Integer stock;
    private Integer costo;
    private Integer precio;
    private String categoria;
    private String fromVenta;

    public Producto() {
    }

    public Producto(String codigoId, String nombre, Integer stock, Integer costo, Integer precio, String categoria, String fromVenta) {
        this.codigoId = codigoId;
        this.nombre = nombre;
        this.stock = stock;
        this.costo = costo;
        this.precio = precio;
        this.categoria = categoria;
        this.fromVenta = fromVenta;
    }

    public String getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(String codigoId) {
        this.codigoId = codigoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFromVenta() {
        return fromVenta;
    }

    public void setFromVenta(String fromVenta) {
        this.fromVenta = fromVenta;
    }
    
    
}
