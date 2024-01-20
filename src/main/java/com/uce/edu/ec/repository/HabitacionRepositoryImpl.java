package com.uce.edu.ec.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(habitacion);
	}

	@Override
	public Habitacion seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM habitacion c WHERE c.habi_numero =:numero",
				Habitacion.class);
		tq.setParameter("numero", numero);
		return (Habitacion) tq.getSingleResult();
	}

	@Override
	public Habitacion seleccionarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM habitacion c WHERE c.habi_codigo =:codigo",
				Habitacion.class);
		tq.setParameter("codigo", codigo);
		return (Habitacion) tq.getSingleResult();
	}

	@Override
	public List<Habitacion> seleccionarPorNumeroCamas(String camas) {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> tq = this.entityManager.createQuery("SELECT l FROM Habitacion l WHERE l.nCamas =:camas",
				Habitacion.class);
		tq.setParameter("camas", camas);
		return tq.getResultList();
	}

	@Override
	public List<Habitacion> seleccionarPorClase(String clase) {
		// TODO Auto-generated method stub
		TypedQuery<Habitacion> tq = this.entityManager.createQuery("SELECT l FROM Habitacion l WHERE l.clase =:clase",
				Habitacion.class);
		tq.setParameter("clase", clase);
		return tq.getResultList();
	}

}
