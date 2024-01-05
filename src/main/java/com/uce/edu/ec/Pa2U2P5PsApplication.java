package com.uce.edu.ec;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;
import com.uce.edu.ec.service.ICiudadanoService;
import com.uce.edu.ec.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ciudadano ciud = new Ciudadano();
		ciud.setApellido("Simbaña");
		ciud.setNombre("Pablo");
		this.ciudadanoService.guardar(ciud);

		Ciudadano ciudB = this.ciudadanoService.buscar(15);
		ciudB.setNombre("Fernando");
		this.ciudadanoService.actualizar(ciudB);
//		this.ciudadanoService.eliminar(1);
		
		Ciudadano ciud1 = this.ciudadanoService.buscar(16);
		
		Empleado empl = new Empleado();
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setSalario(new BigDecimal(465));
		empl.setCiudadano(ciud1);

		this.empleadoService.guardar(empl);
		
		
		Empleado emplB = this.empleadoService.buscar(12);
		emplB.setSalario(new BigDecimal(500));
		this.empleadoService.actualizar(emplB);
		this.empleadoService.eliminar(12);
		
	}

}
