package com.uce.edu.ec.transferencia.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImp implements ITransferenciaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Transferencia seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id);
	}

	@Override
	public void insertar(Transferencia transf) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transf);
	}

	@Override
	public void actualizar(Transferencia transf) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transf);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

}
