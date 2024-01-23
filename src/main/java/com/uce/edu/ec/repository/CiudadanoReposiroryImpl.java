package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	@Override
	public Ciudadano seleccionarApellido(String apellido) {
		// TODO Auto-generated method stub
		// 0 Se crea una instancia de la interfaz criteria a partir deun EM
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		// 1. Determinamos el tipo de retorno que va ha tenrer mi consulta
		CriteriaQuery<Ciudadano> myCriteriaQuerry = myCriteriaBuilder.createQuery(Ciudadano.class);

		// 2 Contruir el SQL
		// 2.1 Determinar el FROM
		Root<Ciudadano> myFrom = myCriteriaQuerry.from(Ciudadano.class);

		// 2.2 Construimos las condiciones del (WHERE)
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		// 3 construimos el SQL final
		myCriteriaQuerry.select(myFrom).where(condicionApellido);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuerry);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		// determinamos el tipo de retorno que va ha tenrer mi consulta
		CriteriaQuery<Ciudadano> myCriteriaQuerry = myCriteriaBuilder.createQuery(Ciudadano.class);

		Root<Ciudadano> myFrom = myCriteriaQuerry.from(Ciudadano.class);

		Predicate condicionGenerica = null;

		if (cedula.startsWith("17")) {

			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {

			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenerica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}
		// 3 construimos el SQL final
		myCriteriaQuerry.select(myFrom).where(condicionGenerica);

		// 4 ejecutamos la consulta con un TypedQuery
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuerry);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();

		// determinamos el tipo de retorno que va ha tenrer mi consulta
		CriteriaQuery<Ciudadano> myCriteriaQuerry = myCriteriaBuilder.createQuery(Ciudadano.class);

		Root<Ciudadano> myFrom = myCriteriaQuerry.from(Ciudadano.class);

		Predicate condicionTotal = null;
		// c.apellid =: apellido;
		Predicate condicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		Predicate condicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(condicionNombre, condicionApellido);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(condicionNombre, condicionApellido);
		} else {
			condicionTotal = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}
		// 3 construimos el SQL final
		myCriteriaQuerry.select(myFrom).where(condicionTotal);

		// 4 ejecutamos la consulta con un TypedQuery
		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(myCriteriaQuerry);

		return myTypedQuery.getSingleResult();
	}

}
