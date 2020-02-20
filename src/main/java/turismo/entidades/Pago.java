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
}
