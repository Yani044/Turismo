
package com.example.demo.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import com.example.demo.entidades.Producto;
import com.example.demo.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepositorio productoRepositorio;  
    
    public List<Producto> obtenerProductos() {
        return productoRepositorio.obtenerProductos();
        
    }
}
