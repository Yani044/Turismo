package com.example.demo.entidades;

import com.example.demo.entidades.Reserva;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-03-02T09:48:51")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Boolean> tipoTarjeta;
    public static volatile SingularAttribute<Pago, Integer> codigoSeguridad;
    public static volatile SingularAttribute<Pago, Date> fechaVencimiento;
    public static volatile SingularAttribute<Pago, Integer> Id;
    public static volatile SingularAttribute<Pago, Reserva> reserva;
    public static volatile SingularAttribute<Pago, Integer> numeroTarjeta;

}