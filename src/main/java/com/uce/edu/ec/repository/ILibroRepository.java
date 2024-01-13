package com.uce.edu.ec.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroRepository {
	public void insertar(Libro libro);

	public void insertar(Libro2 libro2);

	public Libro selecionarPorNombre(String nombre);

	public List<Libro> seleccionarPorFechaPublicacion(LocalDateTime fechaPublicacion);

	public Libro seleccionarPorTitulo(String titulo);

	public List<Libro> seleccionarPorFecha(LocalDateTime fechaPublicacion);

	public Libro seleccionarPorTituloNamed(String titulo);

	public List<Libro> seleccionarPorFechaNamed(LocalDateTime fechaPublicacion);
}
