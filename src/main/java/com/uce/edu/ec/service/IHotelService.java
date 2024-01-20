package com.uce.edu.ec.service;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelService {
	public void guardar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public Hotel buscarPorNombre(String nombre);

	public Hotel buscarPorNombreDueño(String dueño);

	public Hotel buscarPorCodigo(String codigo);

	public List<Hotel> buscarPorCalificacion(Float calificacion);

	public List<Hotel> buscarPorConexion(String conexion);

	public List<Hotel> buscarPorDireccion(String direccion);

}
