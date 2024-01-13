package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		System.out.println("Query");

		Libro libr = this.libroService.buscarPorNombre("el mejor libro");
		System.out.println(libr);

		List<Libro> lista = this.libroService.buscarPorFecha(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro : lista) {
			System.out.println(libro);
		}

		System.out.println("TypedQuery");

		Libro l1 = this.libroService.buscarPorTitulo("Programcion Web");
		System.out.println(l1);

		List<Libro> lista2 = this.libroService.buscarPorFechaPubli(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro : lista2) {
			System.out.println(libro);
		}
		System.out.println("Named Query");

		Libro l2 = this.libroService.buscarPorTituloNamed("Programcion II");
		System.out.println(l2);

		List<Libro> lista3 = this.libroService.buscarPorFechaPubliNamed(LocalDateTime.of(2023, 1, 1, 7, 15));
		for (Libro libro : lista3) {
			System.out.println(libro);
		}

	}

}
