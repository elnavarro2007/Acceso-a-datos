package com.example.bloque2_Ej1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepositorio extends JpaRepository<CategoriaRepositorio,Long> {


}
