package com.empresa.seguros2.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the seguro database table.
 * 
 */
@Entity
@NamedQuery(name="Seguro.findAll", query="SELECT s FROM Seguro s")
public class Seguro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String ape1;

	private String ape2;

	private String casado;

	private int edad;

	private String embarazada;

	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;

	private String nif;

	private String nombre;

	private int numHijos;

	private int sexo;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="seguro")
	private List<Asistencia> asistencias;

	//uni-directional one-to-one association to Enfermedad
	@OneToOne
	@JoinColumn(name="enfermedadId")
	private Enfermedad enfermedad;

	//uni-directional one-to-one association to Cobertura
	@OneToOne
	@JoinColumn(name="coberturaId")
	private Cobertura cobertura;

	public Seguro() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApe1() {
		return this.ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return this.ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getCasado() {
		return this.casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmbarazada() {
		return this.embarazada;
	}

	public void setEmbarazada(String embarazada) {
		this.embarazada = embarazada;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumHijos() {
		return this.numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public int getSexo() {
		return this.sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setSeguro(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setSeguro(null);

		return asistencia;
	}

	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Cobertura getCobertura() {
		return this.cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}

}