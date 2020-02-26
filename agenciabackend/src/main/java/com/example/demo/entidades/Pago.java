/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Genesis
 */
@Entity
public class Pago {

    @Id
    private Integer Id;
    @OneToOne(mappedBy = "pago")
    private Reserva reserva;
    private boolean tipoTarjeta;
    private Integer numeroTarjeta;
    private int codigoSeguridad;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaVencimiento;

    public Pago() {
    }

    public Pago(Integer Id, Reserva reserva, boolean tipoTarjeta, Integer numeroTarjeta, int codigoSeguridad, Date fechaVencimiento) {
        this.Id = Id;
        this.reserva = reserva;
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public boolean isTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(boolean tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
