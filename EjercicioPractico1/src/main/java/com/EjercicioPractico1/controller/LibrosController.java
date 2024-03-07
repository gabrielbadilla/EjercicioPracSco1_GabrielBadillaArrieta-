package com.EjercicioPractico1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.EjercicioPractico1.service.LibrosService;

@Controller
@Slf4j
@RequestMapping("/libros")
public class LibrosController {
    
    @Autowired
    private LibrosService librosService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var libro = librosService.getLibros();
        
        System.out.print(librosService.getLibros());

        model.addAttribute("libro", libro);
        model.addAttribute("totallibro", libro.size());
        return "/libros/listado";
        
    }
}