package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Habitacion;

public interface IHabitacionRepository {
	public Habitacion seleccionar(Integer id);

	public void insertar(Habitacion habitacion);

	public void actualizar(Habitacion habitacion);

	public void eliminar(Integer id);
}
