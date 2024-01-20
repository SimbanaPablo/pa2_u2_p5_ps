package com.uce.edu.ec.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepository implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public Hotel seleccionarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM hotel c WHERE c.hote_nombre =:nombre",
				Hotel.class);
		tq.setParameter("nombre", nombre);
		return (Hotel) tq.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorNombreDueño(String dueño) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM hotel c WHERE c.hote_nombre_dueño =:dueño",
				Hotel.class);
		tq.setParameter("dueño", dueño);
		return (Hotel) tq.getSingleResult();
	}

	@Override
	public Hotel seleccionarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		Query tq = this.entityManager.createNativeQuery("SELECT * FROM hotel c WHERE c.hote_codigo =:codigo",
				Hotel.class);
		tq.setParameter("codigo", codigo);
		return (Hotel) tq.getSingleResult();
	}

	@Override
	public List<Hotel> seleccionarPorCalificacion(Float calificacion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> tq = this.entityManager
				.createQuery("SELECT l FROM Hotel l WHERE l.calificacion >=:calificacion", Hotel.class);
		tq.setParameter("calificacion", calificacion);
		return tq.getResultList();
	}

	@Override
	public List<Hotel> seleccionarPorConexion(String conexion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT l FROM Hotel l WHERE l.conexionWifi >=:conexion", Hotel.class);
		myQuery.setParameter("conexion", conexion);
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> seleccionarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT l FROM Hotel l WHERE l.direccion >=:direccion", Hotel.class);
		myQuery.setParameter("direccion", direccion);
		return myQuery.getResultList();
	}

}
