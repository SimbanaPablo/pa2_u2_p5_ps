package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Alumno;

public interface IAlumnoService {
	public Alumno buscar(Integer id);

	public void guardar(Alumno alumno);

	public void actualizar(Alumno alumno);

	public void eliminar(Integer id);
}
