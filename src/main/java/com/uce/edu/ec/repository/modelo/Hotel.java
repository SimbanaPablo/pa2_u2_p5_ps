package com.uce.edu.ec.repository.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	@Column(name = "hote_id")
	@Id
	@SequenceGenerator(name = "seq_hotel", sequenceName = "seq_hotel", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hotel")
	private Integer id;

	@Column(name = "hote_nombre")
	private String nombre;

	@Column(name = "hote_codigo")
	private String codigo;

	@Column(name = "hote_direccion")
	private String direccion;

	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<Habitacion> habitaciones;

	@Column(name = "hote_conexion_wifi")
	private String conexionWifi;

	@Column(name = "hote_calificacion")
	private Float calificacion;

	@Column(name = "hote_nombre_dueño")
	private String nombreDueño;

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", direccion=" + direccion
				+ ", conexionWifi=" + conexionWifi + ", calificacion=" + calificacion + ", nombreDueño=" + nombreDueño
				+ "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

	public Float getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Float calificacion) {
		this.calificacion = calificacion;
	}

	public String getConexionWifi() {
		return conexionWifi;
	}

	public void setConexionWifi(String conexionWifi) {
		this.conexionWifi = conexionWifi;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

}
