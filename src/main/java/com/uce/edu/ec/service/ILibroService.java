package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroService {
	public void guardar(Libro libro);

	public void guardar(Libro2 libro);

	public Libro buscarPorNombre(String nombre);
}
