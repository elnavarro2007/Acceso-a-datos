package com.example.jpaEj1;

import com.example.jpaEj1.modelo.Perfil;
import com.example.jpaEj1.modelo.Socio;
import com.example.jpaEj1.repositorio.PerfilRepositorio;
import com.example.jpaEj1.repositorio.SocioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;




@SpringBootApplication
public class JpaEj1Application implements CommandLineRunner {

	@Autowired
	private  PerfilRepositorio perfilRepositorio;


	@Autowired
	private SocioRepositorio socioRepositorio;


	public static void main(String[] args) {



		SpringApplication.run(JpaEj1Application.class, args);





	}

	@Override
	public void run(String... args) throws Exception {
		Socio socio =new Socio();
		socio.setBiografia("Paco el de la charcuteria");
		socio.setFechaNac(LocalDate.of(2000,10,10));
		socio.setPreferencias("los hombres negros");


		socioRepositorio.save(socio);

		Perfil perfil = new Perfil();

		perfil.setSocio(socio);

		perfilRepositorio.save(perfil);
	}
}
