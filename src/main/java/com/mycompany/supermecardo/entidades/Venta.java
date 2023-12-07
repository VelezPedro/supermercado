package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;

@Entity
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @ManyToMany
    private List<Producto> productos;
    
    private Double precio;
    private Double descuento;
    private String vendedor;
    private String formpago;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    private String horario;

    public Venta(String id, List<Producto> productos, Double precio, Double descuento, String vendedor, String formpago, Date fecha, String horario) {
        this.id = id;
        this.productos = productos;
        this.precio = precio;
        this.descuento = descuento;
        this.vendedor = vendedor;
        this.formpago = formpago;
        this.fecha = fecha;
        this.horario = horario;
    }

    
    public Venta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
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
    
    
    
    
}
