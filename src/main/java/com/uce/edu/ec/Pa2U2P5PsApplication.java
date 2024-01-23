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
		Ciudadano ciu1 = this.ciudadanoService.buscarApellido("Simbaña");
		System.out.println(ciu1);

		Ciudadano ciu2 = this.ciudadanoService.buscarPorCriteria("Pablo", "Simbaña", "123456");
		System.out.println(ciu2);

		Ciudadano ciu3 = this.ciudadanoService.buscarPorCriteria("Pablo", "Simbaña", "053456");
		System.out.println(ciu3);

		System.out.println("Criteria API Query AND OR");
		
		//Hibernate: select c1_0.ciud_id,c1_0.ciud_apellido,c1_0.ciud_cedula,c1_0.ciud_nombre 
		//from ciudadano c1_0 where c1_0.ciud_cedula=?
		Ciudadano ciu4 = this.ciudadanoService.buscarPorCriteriaAndOr("Pablo", "Simbañaaa", "123456");
		System.out.println(ciu4);
//		
//		Ciudadano ciu5 = this.ciudadanoService.buscarPorCriteriaAndOr("Pablo", "Simbañaaa", "05123456");
//		System.out.println(ciu4);

	}

}
