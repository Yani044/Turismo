
package com.example.demo.controladores;

import com.example.demo.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {
    
    @Autowired
    private UsuarioService usuarioService;
}
