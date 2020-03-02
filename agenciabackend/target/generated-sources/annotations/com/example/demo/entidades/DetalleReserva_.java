package com.example.demo.entidades;

import com.example.demo.entidades.Producto;
import com.example.demo.entidades.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-02T09:48:51")
@StaticMetamodel(DetalleReserva.class)
public class DetalleReserva_ { 

    public static volatile SingularAttribute<DetalleReserva, Date> fechaActividad;
    public static volatile SingularAttribute<DetalleReserva, Integer> cantidadDePersonas;
    public static volatile SingularAttribute<DetalleReserva, String> Aclaraciones;
    public static volatile SingularAttribute<DetalleReserva, Integer> id;
    public static volatile SingularAttribute<DetalleReserva, Producto> producto;
    public static volatile SingularAttribute<DetalleReserva, Reserva> reserva;

}