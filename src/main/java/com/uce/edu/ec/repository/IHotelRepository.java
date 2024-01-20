package com.uce.edu.ec.repository;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHotelRepository {
	public void insertar(Hotel hotel);

	public void actualizar(Hotel hotel);

	public Hotel seleccionarPorNombre(String nombre);

	public Hotel seleccionarPorNombreDueño(String dueño);

	public Hotel seleccionarPorCodigo(String codigo);

	public List<Hotel> seleccionarPorCalificacion(Float calificacion);

	public List<Hotel> seleccionarPorConexion(String conexion);

	public List<Hotel> seleccionarPorDireccion(String direccion);

}
