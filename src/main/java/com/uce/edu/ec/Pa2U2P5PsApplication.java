package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Autor2;
import com.uce.edu.ec.repository.modelo.AutorLibro;
import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;
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
		Libro2 libr = new Libro2();
		libr.setTitulo("el mejor libro");
		libr.setFechaPublicacion(LocalDateTime.now());
			
		Autor2 auto = new Autor2();
		auto.setNombre("Edgar");
		auto.setNacionalidad("ES");
		
		Autor2 auto1 = new Autor2();
		auto1.setNombre("Mario");
		auto1.setNacionalidad("UK");
		
		List<Autor2> autores = new ArrayList<Autor2>();
		autores.add(auto);
		autores.add(auto1);
		
		AutorLibro autoLibro = new AutorLibro();
		autoLibro.setLibro2(libr);
		autoLibro.setAutor2(auto);
		
		AutorLibro autoLibro1 = new AutorLibro();
		autoLibro1.setLibro2(libr);
		autoLibro1.setAutor2(auto1);
		
		List<AutorLibro> list = new ArrayList<AutorLibro>();
		list.add(autoLibro);
		list.add(autoLibro1);
		
		libr.setAutoresLibros(list);
		
//		this.libroService.guardar(libr);
		Libro libroFinal = this.libroService.buscarPorNombre("el mejor libro");
		System.out.println(libroFinal);

	}

}
