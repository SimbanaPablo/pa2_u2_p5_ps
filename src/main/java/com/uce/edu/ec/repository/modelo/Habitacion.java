package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion")
public class Habitacion {

	@Column(name = "habi_id")
	@Id
	@SequenceGenerator(name = "seq_habitacion", sequenceName = "seq_habitacion", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_habitacion")
	private Integer id;

	@Column(name = "habi_numero")
	private String numero;

	@Column(name = "habi_codigo")
	private String codigo;

	@Column(name = "habi_clase")
	private String clase;

	@Column(name = "habi_numero_camas")
	private String nCamas;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "habi_id_hotel")
	private Hotel hotel;

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", codigo=" + codigo + ", clase=" + clase + ", nCamas="
				+ nCamas + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getnCamas() {
		return nCamas;
	}

	public void setnCamas(String nCamas) {
		this.nCamas = nCamas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}
