package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    
    @ManyToMany
    private List<Producto> listaProductos;
    
    private Double precio;
    private Integer descuentoPorPorcentaje;
    private Integer descuentoPorPrecio;
    private String vendedor;
    private String formpago;
    

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    
    //@Temporal(TemporalType.TIMESTAMP)
    private String horario;
    
    


    public Venta(String id, List<Producto> listaProductos, Double precio, Integer descuentoPorPorcentaje, Integer descuentoPorPrecio, String vendedor, String formpago) {
        this.id = id;
        this.listaProductos = listaProductos;
        this.precio = precio;
        this.descuentoPorPorcentaje = descuentoPorPorcentaje;
        this.descuentoPorPrecio = descuentoPorPrecio;
        this.vendedor = vendedor;
        this.formpago = formpago;
        this.fecha = LocalDate.now();
        this.horario = LocalTime.now();
    }

 
    
    public Venta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFormpago() {
        return formpago;
    }

    public void setFormpago(String formpago) {
        this.formpago = formpago;
    }

    public Integer getDescuentoPorPorcentaje() {
        return descuentoPorPorcentaje;
    }

    public void setDescuentoPorPorcentaje(Integer descuentoPorPorcentaje) {
        this.descuentoPorPorcentaje = descuentoPorPorcentaje;
    }

    public Integer getDescuentoPorPrecio() {
        return descuentoPorPrecio;
    }

    public void setDescuentoPorPrecio(Integer descuentoPorPrecio) {
        this.descuentoPorPrecio = descuentoPorPrecio;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    
    
}