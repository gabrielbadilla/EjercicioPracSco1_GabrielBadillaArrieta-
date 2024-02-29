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
        var libro1 = librosService.getLibros(false);
        System.out.print(librosService.getLibros(false));

        model.addAttribute("libro1", libro1);
        model.addAttribute("totallibro1", libro1.size());
        return "/libros/listado";
    }
}