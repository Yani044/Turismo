package turismo.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    private Integer id;
    @ManyToOne
    private Usuario usuario;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    private Hotel hotel;
    @OneToOne
    private Direccion direccion;

    @OneToOne
    private Pago pago;

    public Reserva() {

    }

    public Reserva(Integer id, Usuario usuario, Date fechaCreacion, Hotel hotel, Direccion direccion) {
        this.id = id;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.hotel = hotel;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Hotel getIdHotel() {
        return hotel;
    }

    public void setIdHotel(Hotel idHotel) {
        this.hotel = idHotel;
    }

    public Direccion getIdDireccion() {
        return direccion;
    }

    public void setIdDireccion(Direccion idDireccion) {
        this.direccion = idDireccion;
    }

}
