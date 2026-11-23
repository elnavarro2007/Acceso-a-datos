package com.example.ejerciciosConsultas.repositorio;

import com.example.ejerciciosConsultas.modelo.Cliente;
import com.example.ejerciciosConsultas.modelo.Revision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevisionRepositorio extends JpaRepository<Revision,Long> {
}
