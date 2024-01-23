package com.uce.edu.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.service.ICiudadanoService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Ciudadano ciu1 = new Ciudadano();
//		ciu1.setApellido("Wallace");
//		ciu1.setCedula("178909");
//		ciu1.setEstadoCivil("casado");
//		ciu1.setGenero("masculino");
//		ciu1.setNombre("Antonio");
//		ciu1.setSegundoApellido("Smith");
//		ciu1.setSegundoNombre("Tenorio");
//		this.ciudadanoService.guardar(ciu1);
//
//		Ciudadano ciu2 = new Ciudadano();
//		ciu2.setApellido("Villa");
//		ciu2.setCedula("173467");
//		ciu2.setEstadoCivil("casada");
//		ciu2.setGenero("femenino");
//		ciu2.setNombre("Dayana");
//		ciu2.setSegundoApellido("Gomez");
//		ciu2.setSegundoNombre("Elizabeth");
//		this.ciudadanoService.guardar(ciu2);
//
//		Ciudadano ciu3 = new Ciudadano();
//		ciu3.setApellido("Hulliom");
//		ciu3.setCedula("172134");
//		ciu3.setEstadoCivil("soltero");
//		ciu3.setGenero("masculino");
//		ciu3.setNombre("Merlon");
//		ciu3.setSegundoApellido("Jull");
//		ciu3.setSegundoNombre("Camilo");
//		this.ciudadanoService.guardar(ciu3);

		Ciudadano ci1 = this.ciudadanoService.buscarPorCriteriaNombres("Dayana", "Elizabeth");
		System.out.println(ci1);

		Ciudadano ci2 = this.ciudadanoService.buscarPorCriteriaApellidos("Hulliom", "Jull");
		System.out.println(ci2);

		Ciudadano ci3 = this.ciudadanoService.buscarPorCriteriaHombre("masculino", "Wallace", "Antonio");
		System.out.println(ci3);

		Ciudadano ci4 = this.ciudadanoService.buscarPorCriteriaMujer("femenino", "Villa", "Dayana");
		System.out.println(ci4);

		Ciudadano ci5 = this.ciudadanoService.buscarPorCriteriaCasado("casado", "masculino", "178909");
		System.out.println(ci5);

		Ciudadano ci6 = this.ciudadanoService.buscarPorCriteriaSoltero("soltero","masculino","172134");
		System.out.println(ci6);
	}

}
