package com.EjercicioPractico1.Domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="libros")
public class Libros implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String autor;
    private String titulo;
    private String precio;
    private String categoria;

    public Libros() {
    }

    public Libros(String titulo) {
        this.titulo = titulo;
    }
}