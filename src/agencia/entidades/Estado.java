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
    Date hora;
    @Temporal(TemporalType.TIMESTAMP)
    Date dia;
    @Temporal(TemporalType.TIMESTAMP)
    Date mes;
    @Temporal(TemporalType.TIMESTAMP)
    Date annio;

    public Estado() {
    }

    public Estado(String id, Date hora, Date dia, Date mes, Date annio) {
        this.id = id;
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
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

    public Date getMes() {
        return mes;
    }

    public void setMes(Date mes) {
        this.mes = mes;
    }

    public Date getAnnio() {
        return annio;
    }

    public void setAnnio(Date annio) {
        this.annio = annio;
    }

}
