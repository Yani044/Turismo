package turismo.entidades;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Direccion {
    @Id
    String id;
    String calle;
    Integer numero;
    String piso;
    String dto;
    Integer codigoPostal;

    public Direccion() {
    }

    public Direccion(String id, String calle, Integer numero, String piso, String dto, Integer codigoPostal) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.dto = dto;
        this.codigoPostal = codigoPostal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDto() {
        return dto;
    }

    public void setDto(String dto) {
        this.dto = dto;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}
