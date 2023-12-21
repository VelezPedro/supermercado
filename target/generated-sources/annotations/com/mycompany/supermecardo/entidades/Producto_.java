package com.mycompany.supermecardo.entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-20T21:01:22", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> codigoId;
    public static volatile SingularAttribute<Producto, Double> unidadesVendidas;
    public static volatile SingularAttribute<Producto, Integer> precio;
    public static volatile SingularAttribute<Producto, Integer> costo;
    public static volatile SingularAttribute<Producto, String> categoria;
    public static volatile SingularAttribute<Producto, String> fromVenta;
    public static volatile SingularAttribute<Producto, Double> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}