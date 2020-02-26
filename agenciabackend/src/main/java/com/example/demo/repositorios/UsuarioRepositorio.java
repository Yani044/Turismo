
package com.example.demo.repositorios;

import com.example.demo.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UsuarioRepositorio extends JpaRepository<Usuario, String>{
   
}
