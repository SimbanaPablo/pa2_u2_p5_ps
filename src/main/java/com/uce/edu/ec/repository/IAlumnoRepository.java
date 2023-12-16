package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Alumno;

public interface IAlumnoRepository {
	public Alumno seleccionar(Integer id);

	public void insertar(Alumno alumno);

	public void actualizar(Alumno alumno);

	public void eliminar(Integer id);
}
