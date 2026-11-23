package com.example.bloque2_Ej1.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Libro {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String autor;

    @OneToMany
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
