package com.uce.edu.ec.transferencia.repository;

import com.uce.edu.ec.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	public CuentaBancaria seleccionar(Integer id);

	public void insertar(CuentaBancaria cuenta);

	public void actualizar(CuentaBancaria cuenta);

	public void eliminar(Integer id);

}
