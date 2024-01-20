package com.uce.edu.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IHotelRepository;
import com.uce.edu.ec.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public Hotel buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNombre(nombre);
	}

	@Override
	public Hotel buscarPorNombreDueño(String dueño) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorNombreDueño(dueño);
	}

	@Override
	public Hotel buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCodigo(codigo);
	}

	@Override
	public List<Hotel> buscarPorCalificacion(Float calificacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorCalificacion(calificacion);
	}

	@Override
	public List<Hotel> buscarPorConexion(String conexion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorConexion(conexion);
	}

	@Override
	public List<Hotel> buscarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionarPorDireccion(direccion);
	}

}
