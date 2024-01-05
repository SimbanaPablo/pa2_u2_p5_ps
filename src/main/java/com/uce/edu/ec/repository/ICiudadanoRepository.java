package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;

public interface ICiudadanoRepository {
	public void insertar(Ciudadano ciudadano);

	public Ciudadano seleccionar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);
}
