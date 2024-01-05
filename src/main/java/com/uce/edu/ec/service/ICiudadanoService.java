package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Ciudadano;

public interface ICiudadanoService {
	public void guardar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void eliminar(Integer id);
}
