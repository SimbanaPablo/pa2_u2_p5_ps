package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.transferencia.repository.ILibroRepository;

@Service
public class LibroServiceImpl implements ILibroService {
	@Autowired
	private ILibroRepository libroRepository;

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.insertar(libro);
	}

}
