package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelRepository {
	public void insertar(Hotel hotel);

	public Hotel seleccionar(Integer id);

	public void actualizar(Hotel hotel);

	public void eliminar(Integer id);
}
