
package com.example.demo.controladores;

import com.example.demo.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UsuarioControlador {
    
    @Autowired
    private UsuarioService usuarioService;
}
