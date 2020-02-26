package com.example.demo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
public class Usuario {
@Id    
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String dni;
    private Integer telefono;

    public Usuario() {
    }
    
    

    public Usuario (Integer id, String nombre, String apellido, String email, String dni, Integer telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    
    
}
