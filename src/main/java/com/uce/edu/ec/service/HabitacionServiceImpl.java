package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IHabitacionRepository;
import com.uce.edu.ec.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepository habitacionRepository;

	@Override
	public void guardar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepository.insertar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepository.actualizar(habitacion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepository.eliminar(id);
	}

}
