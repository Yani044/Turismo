
package com.example.demo.controladores;

import com.example.demo.entidades.Producto;
import com.example.demo.servicios.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductoControlador {
    
    @Autowired
    private ProductoService productoService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/productos")
    public List<Producto> index(ModelMap modelo) {
        List<Producto> productos = productoService.obtenerProductos();
        
        return productos;
    }
    
    
}
