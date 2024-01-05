package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Empleado;

public interface IEmpleadoService {
	public void guardar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void actualizar(Empleado empleado);

	public void eliminar(Integer id);
}
