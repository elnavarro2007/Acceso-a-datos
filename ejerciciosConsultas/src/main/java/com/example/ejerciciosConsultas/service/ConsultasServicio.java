package com.example.ejerciciosConsultas.service;

import com.example.ejerciciosConsultas.modelo.Cliente;
import com.example.ejerciciosConsultas.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ConsultasServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ConsultasServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public List<Cliente> clientesPorColor(String color) {

        return  clienteRepositorio.findByCochesColor(color);
    }
}
