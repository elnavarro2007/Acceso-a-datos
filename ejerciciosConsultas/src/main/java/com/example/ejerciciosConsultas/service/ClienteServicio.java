package com.example.ejerciciosConsultas.service;


import com.example.ejerciciosConsultas.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ClienteServicio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }


}
