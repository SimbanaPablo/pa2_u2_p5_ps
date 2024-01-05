package com.uce.edu.ec.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Habitacion seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(habitacion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.seleccionar(id));
	}

}
