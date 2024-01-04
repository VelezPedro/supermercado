package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    
    List<Object> listaDeInfo;

    public Ticket() {
    }
    
    public Ticket(String id, List<Object> listaDeInfo) {
        this.id = id;
        this.listaDeInfo = listaDeInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getListaDeInfo() {
        return listaDeInfo;
    }

    public void setListaDeInfo(List<Object> listaDeInfo) {
        this.listaDeInfo = listaDeInfo;
    }
    
    
}
