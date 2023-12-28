package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CajaTotal implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idCaja;
    
    @OneToOne
    private List<Venta> listaDeVentas;    
    private String horaCierre;
    private String observacion;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public CajaTotal() {
    }

    public CajaTotal(String idCaja, List<Venta> listaDeVentas, String horaCierre, String observacion, Date fecha) {
        this.idCaja = idCaja;
        this.listaDeVentas = listaDeVentas;
        this.horaCierre = horaCierre;
        this.observacion = observacion;
        this.fecha = fecha;
    }

    public String getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(String idCaja) {
        this.idCaja = idCaja;
    }

    public List<Venta> getListaDeVentas() {
        return listaDeVentas;
    }

    public void setListaDeVentas(List<Venta> listaDeVentas) {
        this.listaDeVentas = listaDeVentas;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
        
}
