
package com.example.demo.servicios;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.example.demo.entidades.Usuario;
import com.example.demo.repositorios.ProductoRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioService {
    @Autowired
    private ProductoRepositorio productoRepositorio;
            
  
    
     
}
