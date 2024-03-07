package com.EjercicioPractico1.service;

import com.EjercicioPractico1.Domain.Libros;
import java.util.List;

public interface LibrosService {
    
    // Se obtiene un listado de categorias en un List
    public List<Libros> getLibros();
 
}