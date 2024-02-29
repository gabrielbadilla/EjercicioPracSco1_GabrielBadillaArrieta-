package com.EjercicioPractico1.service.impl;

import com.EjercicioPractico1.Domain.Libros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.EjercicioPractico1.DAO.LibrosDao;
import com.EjercicioPractico1.service.LibrosService;

@Service
public class LibrosServiceimpl implements LibrosService {
    
    @Autowired
    private LibrosDao librosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libros> getLibros(boolean activos) {
        var lista=librosDao.findAll();
        return lista;
    }
}