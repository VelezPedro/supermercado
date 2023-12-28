package com.mycompany.supermecardo.entidades;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CajaTotal implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String idCaja;
    
    
}
