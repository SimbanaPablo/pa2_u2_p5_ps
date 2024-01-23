package com.uce.edu.ec.repository.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {
	@Column(name = "ciud_id")
	@Id
	@SequenceGenerator(name = "seq_ciudadano", sequenceName = "seq_ciudadano", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciudadano")
	private Integer id;

	@Column(name = "ciud_nombre")
	private String nombre;

	@Column(name = "ciud_apellido")
	private String apellido;

	@Column(name = "ciud_segundo_apellido")
	private String segundoApellido;

	@Column(name = "ciud_segundo_nombre")
	private String segundoNombre;

	@Column(name = "cid_genero")
	private String genero;

	@Column(name = "cid_estado_civil")
	private String estadoCivil;

	@OneToOne(mappedBy = "ciudadano", cascade = CascadeType.ALL)
	private Empleado empleado;

	@Column(name = "ciud_cedula")
	private String cedula;

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", segundoApellido="
				+ segundoApellido + ", segundoNombre=" + segundoNombre + ", genero=" + genero + ", estadoCivil="
				+ estadoCivil + ", cedula=" + cedula + "]";
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
