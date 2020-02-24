package turismo.entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hoteles")
public class Hotel {
    @Id
    private Integer id;
    private String nombre;
    private String habitacion;
    @OneToOne
    private Direccion direccion;

    public Hotel() {
    }

    public Hotel(Integer id, String nombre, String habitacion, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.habitacion = habitacion;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    

}
