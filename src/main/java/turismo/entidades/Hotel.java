package turismo.entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hotel {
    @Id
    String id;
    String nombre;
    String habitacion;
    @OneToOne
    Direccion direccion;

    public Hotel() {
    }

    public Hotel(String id, String nombre, String habitacion, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.habitacion = habitacion;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
