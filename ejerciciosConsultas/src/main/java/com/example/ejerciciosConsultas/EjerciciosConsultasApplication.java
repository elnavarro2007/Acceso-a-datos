package com.example.ejerciciosConsultas;

import com.example.ejerciciosConsultas.modelo.Cliente;
import com.example.ejerciciosConsultas.repositorio.ClienteRepositorio;
import com.example.ejerciciosConsultas.repositorio.CocheRepositorio;
import com.example.ejerciciosConsultas.repositorio.RevisionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EjerciciosConsultasApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	@Autowired
	private CocheRepositorio cocheRepositorio;
	@Autowired
	private RevisionRepositorio revisionRepositorio;



	public static void main(String[] args) {
		SpringApplication.run(EjerciciosConsultasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
