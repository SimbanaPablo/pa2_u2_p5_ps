package com.uce.edu.ec.transferencia.repository;

import com.uce.edu.ec.repository.modelo.Transferencia;

public interface ITransferenciaRepository {
	public Transferencia seleccionar(Integer id);

	public void insertar(Transferencia transf);

	public void actualizar(Transferencia transf);

	public void eliminar(Integer id);

}
