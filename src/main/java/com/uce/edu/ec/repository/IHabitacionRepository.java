package com.uce.edu.ec.repository;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Habitacion;

public interface IHabitacionRepository {
	public void insertar(Habitacion habitacion);

	public Habitacion seleccionarPorNumero(String numero);

	public Habitacion seleccionarPorCodigo(String codigo);

	public List<Habitacion> seleccionarPorNumeroCamas(String camas);

	public List<Habitacion> seleccionarPorClase(String clase);

}
