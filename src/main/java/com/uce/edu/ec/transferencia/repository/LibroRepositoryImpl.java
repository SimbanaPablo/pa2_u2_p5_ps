package com.uce.edu.ec.transferencia.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Libro;
import com.uce.edu.ec.repository.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements ILibroRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public Libro selecionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		//SQL:  select * FROM libro l WHERE l.libr_titulo = ?
		//JPQL: select l FROM libro l WHERE l.titulo = :nombre 
		Query myQuery = this.entityManager.createQuery("select l FROM libro l WHERE l.titulo = :nombre");
		myQuery.setParameter("nombre",nombre);
		return (Libro) myQuery.getSingleResult();
	}

}
