package turismo.entidades;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Estado {
    @Id
String id;
@Temporal(TemporalType.TIMESTAMP)
Date dia;
@Temporal(TemporalType.TIMESTAMP)
Date hora;

    public Estado() {
    }

    public Estado(String id, Date dia, Date hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }


}
