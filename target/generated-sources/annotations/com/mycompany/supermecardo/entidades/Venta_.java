package com.mycompany.supermecardo.entidades;

import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Usuario;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-18T15:58:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile ListAttribute<Venta, Producto> listaProductos;
    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Double> precio;
    public static volatile SingularAttribute<Venta, Integer> descuentoPorPorcentaje;
    public static volatile SingularAttribute<Venta, Integer> descuentoPorPrecio;
    public static volatile SingularAttribute<Venta, Usuario> vendedor;
    public static volatile SingularAttribute<Venta, String> horario;
    public static volatile SingularAttribute<Venta, String> formpago;
    public static volatile SingularAttribute<Venta, String> id;

}