package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Autor;
import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {
	
	@Autowired
	private ILibroService libroService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Libro libr = new Libro();
		libr.setTitulo("el mejor libro");
		libr.setFechaPublicacion(LocalDateTime.now());
	 
		Set<Autor> autores = new HashSet<Autor>();
		Set<Libro> libros = new HashSet<Libro>();
		
		Autor auto = new Autor();
		auto.setNombre("Edgar");
		auto.setNacionalidad("ES");
		
		Autor auto1 = new Autor();
		auto1.setNombre("Mario");
		auto1.setNacionalidad("UK");

		
		auto.setLibros(libros);
		auto1.setLibros(libros);
		autores.add(auto);
		autores.add(auto1);
		libr.setAutores(autores);
		libros.add(libr);
		
		this.libroService.guardar(libr);
	}

}
