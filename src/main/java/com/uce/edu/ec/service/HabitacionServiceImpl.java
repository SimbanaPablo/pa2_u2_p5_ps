package com.uce.edu.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.IHabitacionRepository;
import com.uce.edu.ec.repository.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepository habitacionRepository;

	@Override
	public Habitacion buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorNumero(numero);
	}

	@Override
	public Habitacion buscarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorCodigo(codigo);
	}

	@Override
	public List<Habitacion> buscarPorNumeroCamas(String camas) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorNumeroCamas(camas);
	}

	@Override
	public List<Habitacion> buscarPorClase(String clase) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorClase(clase);
	}

}
