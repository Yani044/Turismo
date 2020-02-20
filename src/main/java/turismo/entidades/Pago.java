/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turismo.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Genesis
 */
@Entity
public class Pago {
    @Id
    String Id;
    Reserva reserva;
    boolean tipoTarjeta;
    Integer numeroTarjeta;
    int codigoSeguridad;
    Date fechaVencimiento;

    public Pago(String Id, Reserva reserva, boolean tipoTarjeta, Integer numeroTarjeta, int codigoSeguridad, Date fechaVencimiento) {
        this.Id = Id;
        this.reserva = reserva;
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
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
