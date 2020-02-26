package com.example.demo.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DetalleReserva {

    @Id
    private Integer id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActividad;
    private Integer cantidadDePersonas;
    private String Aclaraciones;
    @ManyToOne
    private Reserva reserva;
    @ManyToOne
    private Producto producto;

    public DetalleReserva() {

    }

    public DetalleReserva(Integer id, Date fechaActividad, Integer cantidadDePersonas, String Aclaraciones, Reserva reserva, Producto producto) {
        this.id = id;
        this.fechaActividad = fechaActividad;
        this.cantidadDePersonas = cantidadDePersonas;
        this.Aclaraciones = Aclaraciones;
        this.reserva = reserva;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public String getAclaraciones() {
        return Aclaraciones;
    }

    public void setAclaraciones(String Aclaraciones) {
        this.Aclaraciones = Aclaraciones;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

}
