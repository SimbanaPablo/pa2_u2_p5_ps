package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

public interface ICiudadanoRepository {
	public void insertar(Ciudadano ciudadano);

	public Ciudadano seleccionar(Integer id);

	public Empleado seleccionarPorCedula(String cedula);

	public Ciudadano seleccionarPorCedulaCiu(String cedula);
}
