package com.uce.edu.ec.service;

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
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(id);
	}

}
