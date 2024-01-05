package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelService {
	public void guardar(Hotel hotel);

	public Hotel buscar(Integer id);

	public void actualizar(Hotel hotel);

	public void eliminar(Integer id);
}
