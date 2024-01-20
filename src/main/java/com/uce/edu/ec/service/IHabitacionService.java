package com.uce.edu.ec.service;

import java.util.List;

import com.uce.edu.ec.repository.modelo.Habitacion;

public interface IHabitacionService {
	public Habitacion buscarPorNumero(String numero);

	public Habitacion buscarPorCodigo(String codigo);

	public List<Habitacion> buscarPorNumeroCamas(String camas);

	public List<Habitacion> buscarPorClase(String clase);
}
