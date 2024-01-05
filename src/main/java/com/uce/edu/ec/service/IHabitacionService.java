package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Habitacion;
import com.uce.edu.ec.repository.modelo.Hotel;

public interface IHabitacionService {
	public void guardar(Habitacion habitacion);

	public Habitacion buscar(Integer id);

	public void actualizar(Habitacion habitacion);

	public void eliminar(Integer id);
}
