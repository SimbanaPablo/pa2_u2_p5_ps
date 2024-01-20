package com.uce.edu.ec;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Habitacion;
import com.uce.edu.ec.repository.modelo.Hotel;
import com.uce.edu.ec.service.IHabitacionService;
import com.uce.edu.ec.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5PsApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5PsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		Hotel hote = new Hotel();
//		hote.setNombre("Hotel Finlandia");
//		hote.setDireccion("La Carolina, Quito");
//		hote.setCalificacion(8.8F);
//		hote.setConexionWifi("true");
//		hote.setNombreDueño("Carlos Jose");
//		hote.setCodigo("hot_01");
//		hote.setHabitaciones(null);
//
//		this.hotelService.guardar(hote);
//
//		Hotel hote1 = new Hotel();
//		hote1.setNombre("Wyndham Garden Quito");
//		hote1.setDireccion("La Carolina, Quito");
//		hote1.setCalificacion(9F);
//		hote1.setNombreDueño("Maria Jose");
//		hote1.setConexionWifi("true");
//		hote1.setCodigo("hot_02");
//		hote1.setHabitaciones(null);
//
//		this.hotelService.guardar(hote1);
//
//		Hotel hote2 = new Hotel();
//		hote2.setNombre("Hostal Yumbo Imperial");
//		hote2.setDireccion("Centro historico, Quito");
//		hote2.setCalificacion(8.3F);
//		hote2.setConexionWifi("true");
//		hote2.setNombreDueño("Marco Hun");
//		hote2.setCodigo("hot_03");
//		hote2.setHabitaciones(null);
//
//		this.hotelService.guardar(hote2);

		Hotel hoteConsulta1 = this.hotelService.buscarPorNombre("Hostal Yumbo Imperial");
		System.out.println(hoteConsulta1);

		Hotel hoteConsulta2 = this.hotelService.buscarPorNombreDueño("Marco Hun");
		System.out.println(hoteConsulta2);

		Hotel hoteConsulta3 = this.hotelService.buscarPorCodigo("hot_01");
		System.out.println(hoteConsulta3);

		List<Hotel> hoteConsulta4 = this.hotelService.buscarPorDireccion("La Carolina, Quito");
		for (Hotel e : hoteConsulta4) {
			System.out.println("   --" + e);
		}

		List<Hotel> hoteConsulta5 = this.hotelService.buscarPorConexion("true");
		for (Hotel e : hoteConsulta5) {
			System.out.println("   --" + e);
		}
		List<Hotel> hoteConsulta6 = this.hotelService.buscarPorCalificacion(1.0F);
		for (Hotel e : hoteConsulta6) {
			System.out.println("   --" + e);
		}

//		Hotel hot = this.hotelService.buscarPorNombre("Hotel Finlandia");
//		Hotel hot1 = this.hotelService.buscarPorNombre("Wyndham Garden Quito");
//		Hotel hot2 = this.hotelService.buscarPorNombre("Hostal Yumbo Imperial");

//		Habitacion habi = new Habitacion();
//		habi.setHotel(hot2);
//		habi.setClase("Doble");
//		habi.setNumero("9");
//		habi.setCodigo("hote_1");
//		habi.setnCamas("3");
//
//		Habitacion habi2 = new Habitacion();
//		habi2.setHotel(hot2);
//		habi2.setClase("Suite");
//		habi2.setNumero("10");
//		habi2.setCodigo("hote_2");
//		habi2.setnCamas("2");
//
//		Habitacion habi3 = new Habitacion();
//		habi3.setHotel(hot2);
//		habi3.setClase("Suite");
//		habi3.setNumero("11");
//		habi3.setCodigo("hote_3");
//		habi3.setnCamas("1");
////
//		List<Habitacion> listaHabita = new ArrayList<>();
//		listaHabita.add(habi);
//		listaHabita.add(habi2);
//		listaHabita.add(habi3);
//
//		hot2.setHabitaciones(listaHabita);
//		this.hotelService.actualizar(hot2);

		Habitacion habiConsulta7 = this.habitacionService.buscarPorNumero("10");
		System.out.println(habiConsulta7);

		Habitacion habiConsulta8 = this.habitacionService.buscarPorCodigo("hote_1");
		System.out.println(habiConsulta8);

		List<Habitacion> habiConsulta9 = this.habitacionService.buscarPorClase("Suite");
		for (Habitacion e : habiConsulta9) {
			System.out.println("   --" + e);
		}

		List<Habitacion> habiConsulta10 = this.habitacionService.buscarPorNumeroCamas("2");
		for (Habitacion e : habiConsulta10) {
			System.out.println("   --" + e);
		}

	}

}
