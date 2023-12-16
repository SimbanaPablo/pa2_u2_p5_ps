package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Alumno;
import com.uce.edu.ec.service.IAlumnoService;
import com.uce.edu.ec.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IAlumnoService alumnoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Estudiante estu = new Estudiante(); estu.setApellido("Simbana");
		 * estu.setCedula("1234"); estu.setFechaNacimiento(LocalDateTime.of(1, 1, 1, 1,
		 * 1)); estu.setNombre("Pablo");
		 * 
		 * this.estudianteService.guardar(estu);
		 */
		/*
		 * Estudiante buscar = this.estudianteService.buscar(19);
		 * buscar.setApellido("Simbaña Pulupa");
		 * this.estudianteService.actualizar(buscar); System.out.println(buscar); /* /*
		 * buscar.setNombre("Pablo Fernando --");
		 * this.estudianteService.actualizar(buscar);
		 */

		// this.estudianteService.eliminar(17);

		Alumno alum = new Alumno();
		alum.setNombre("Fernando Pulupa");

		this.alumnoService.guardar(alum);
		Alumno alum1 = this.alumnoService.buscar(2);
		alum1.setNombre("ADA");
		this.alumnoService.actualizar(alum1);
		System.out.println(alum1);

		this.alumnoService.eliminar(2);

	}

}
