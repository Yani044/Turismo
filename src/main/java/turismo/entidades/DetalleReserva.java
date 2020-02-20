package turismo.entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class DetalleReserva {
    @Id
    private String id;
    @OneToMany
    private Estado estado;
    private Integer cantidadDePersonas;
    private String Aclaraciones;
    @ManyToOne
    private Reserva reserva;
    @ManyToOne
    private Producto producto;
    
    public DetalleReserva(){
    
    }

    public DetalleReserva(String id, Estado estado, Integer cantidadDePersonas, String Aclaraciones, Reserva reserva, Producto producto) {
        this.id = id;
        this.estado = estado;
        this.cantidadDePersonas = cantidadDePersonas;
        this.Aclaraciones = Aclaraciones;
        this.reserva = reserva;
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
    
    
    
    
}
