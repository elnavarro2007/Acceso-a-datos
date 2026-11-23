package com.example.ejerciciosConsultas.repositorio;

import com.example.ejerciciosConsultas.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {


    List<Cliente> findByCochesColor(String color);

    List<Cliente> findByCochesPrecioGreaterThan(int precio);


    List<Cliente> buscarClientesConMasCoches();

}
