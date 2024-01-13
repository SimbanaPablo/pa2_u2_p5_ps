package com.uce.edu.ec.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

public interface ILibroService {
	public void guardar(Libro libro);

	public void guardar(Libro2 libro);

	public Libro buscarPorNombre(String nombre);

	public List<Libro> buscarPorFecha(LocalDateTime fecha);

	public Libro buscarPorTitulo(String titulo);

	public List<Libro> buscarPorFechaPubli(LocalDateTime fechaPublicacion);

	public Libro buscarPorTituloNamed(String titulo);

	public List<Libro> buscarPorFechaPubliNamed(LocalDateTime fechaPublicacion);
}
