
package com.example.demo.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.example.demo.entidades.Usuario;

public class UsuarioService {
    
    
     public void crearUsuario(String nombre, String apellido, String email, String dni, Integer telefono){
    
        EntityManager em = Persistence.createEntityManagerFactory("LIbreriaPU").createEntityManager();
        em.getTransaction().begin();

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setDni(dni);
        usuario.setEmail(email);
        usuario.setTelefono(telefono);
       
        

         
        
        em.persist(usuario);
        em.getTransaction().commit();
    
    
    }
}
