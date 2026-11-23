package com.example.bloque2_Ej1.modelo;


import com.example.bloque2_Ej1.repositorio.CategoriaRepositorio;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categoria {
    Scanner sc = new Scanner(System.in);


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro (Libro libro){
        libros.add(libro);
    }



}
