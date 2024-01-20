package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoReposiroryImpl implements ICiudadanoRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.entityManager.persist(ciudadano);
	}

	@Override
	public Ciudadano seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public Empleado seleccionarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Empleado> tq = this.entityManager
				.createQuery("SELECT l FROM Empleado l WHERE l.ciudadano.cedula =:cedula", Empleado.class);
		tq.setParameter("cedula", cedula);
		return tq.getSingleResult();
	}
	
	
	@Override
	public Ciudadano seleccionarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE c.ciud_cedula =:cedula",
				Ciudadano.class);
		tq.setParameter("cedula", cedula);
		return (Ciudadano) tq.getSingleResult();
	}

}
