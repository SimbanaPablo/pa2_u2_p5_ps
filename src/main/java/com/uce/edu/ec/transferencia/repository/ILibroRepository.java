package com.uce.edu.ec.transferencia.repository;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroRepository {
	public void insertar(Libro libro);

	public void insertar(Libro2 libro2);

	public Libro selecionarPorNombre(String nombre);
}
