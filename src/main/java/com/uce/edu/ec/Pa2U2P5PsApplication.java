package com.uce.edu.ec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Habitacion;
import com.uce.edu.ec.repository.modelo.Hotel;
import com.uce.edu.ec.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Hotel hote = new Hotel();
		hote.setNombre("HOSTAL");
		hote.setDireccion("Quito");
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();

		Habitacion habi = new Habitacion();
		habi.setClase("VIP");
		habi.setHotel(hote);
		habi.setNumero("01");
		habitaciones.add(habi);

		Habitacion habi1 = new Habitacion();
		habi1.setClase("Economica");
		habi1.setHotel(hote);
		habi1.setNumero("02");
		habitaciones.add(habi1);

		hote.setHabitaciones(habitaciones);

		this.hotelService.guardar(hote);

	}

}
