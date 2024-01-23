package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.ICiudadanoRepository;
import com.uce.edu.ec.repository.modelo.Ciudadano;
import com.uce.edu.ec.repository.modelo.Empleado;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {
	@Autowired
	private ICiudadanoRepository ciudadanoRepository;

	@Override
	public void guardar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepository.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionar(id);
	}

	@Override
	public Empleado buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCedula(cedula);
	}

	@Override
	public Ciudadano buscarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCedulaCiu(cedula);
	}

	@Override
	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteria(nombre, apellido, cedula);
	}

	@Override
	public Ciudadano buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarApellido(apellido);
	}

	@Override
	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaAndOr(nombre, apellido, cedula);
	}

	@Override
	public Ciudadano buscarPorCriteriaNombres(String primerNombre, String segundoNombre) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaNombres(primerNombre, segundoNombre);
	}

	@Override
	public Ciudadano buscarPorCriteriaApellidos(String primerApellido, String segundoApellido) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaApellidos(primerApellido, segundoApellido);
	}

	@Override
	public Ciudadano buscarPorCriteriaHombre(String genero, String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaHombre(genero, apellido, nombre);
	}

	@Override
	public Ciudadano buscarPorCriteriaMujer(String genero, String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaMujer(genero, apellido, nombre);
	}

	@Override
	public Ciudadano buscarPorCriteriaCasado(String estadoCivil, String genero, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaCasado(estadoCivil, genero, cedula);
	}

	@Override
	public Ciudadano buscarPorCriteriaSoltero(String estadoCivil, String genero, String cedula) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepository.seleccionarPorCriteriaSoltero(estadoCivil, genero, cedula);
	}

}
