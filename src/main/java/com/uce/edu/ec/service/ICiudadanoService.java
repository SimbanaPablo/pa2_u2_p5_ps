package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

public interface ICiudadanoService {
	public void guardar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public Empleado buscarPorCedula(String cedula);

	public Ciudadano buscarPorCedulaCiu(String cedula);
}
