package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;
import com.uce.edu.ec.service.ICiudadanoService;
import com.uce.edu.ec.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {

	@Autowired
	private ILibroService libroService;

	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Empleado empl = this.ciudadanoService.buscarPorCedula("123456");
		System.out.println(empl);

		Ciudadano ciud = this.ciudadanoService.buscarPorCedulaCiu("123456");
		System.out.println(ciud);
	}

}
