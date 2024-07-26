package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable {
    
    @Id
    private String codigoId;
    private String nombre;
    private Double stock;
    private Double costo;
    private Double precio;
    private String categoria;
    private String fromVenta;
    private Double unidadesVendidas;
    
    public Producto() {
    }

    public Producto(String codigoId, String nombre, Double stock,
            Double costo, Double precio, String categoria, 
            String fromVenta, Double unidadesVendidas) {
        this.codigoId = codigoId;
        this.nombre = nombre;
        this.stock = stock;
        this.costo = costo;
        this.precio = precio;
        this.categoria = categoria;
        this.fromVenta = fromVenta;
        this.unidadesVendidas = unidadesVendidas;
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

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }



    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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

    public Double getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(Double unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

   
}
