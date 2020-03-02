package com.example.demo.entidades;

import com.example.demo.entidades.Direccion;
import com.example.demo.entidades.Hotel;
import com.example.demo.entidades.Pago;
import com.example.demo.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-02T09:48:51")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Direccion> direccion;
    public static volatile SingularAttribute<Reserva, Date> fechaCreacion;
    public static volatile SingularAttribute<Reserva, Hotel> hotel;
    public static volatile SingularAttribute<Reserva, Usuario> usuario;
    public static volatile SingularAttribute<Reserva, Integer> id;
    public static volatile SingularAttribute<Reserva, Pago> pago;

}