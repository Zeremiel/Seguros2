package com.empresa.seguros2.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the enfermedad database table.
 * 
 */
@Entity
@NamedQuery(name="Enfermedad.findAll", query="SELECT e FROM Enfermedad e")
public class Enfermedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String alergia;

	private String corazon;

	private String estomacal;

	private String nombreAlergia;

	private String rinyones;

	public Enfermedad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlergia() {
		return this.alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getCorazon() {
		return this.corazon;
	}

	public void setCorazon(String corazon) {
		this.corazon = corazon;
	}

	public String getEstomacal() {
		return this.estomacal;
	}

	public void setEstomacal(String estomacal) {
		this.estomacal = estomacal;
	}

	public String getNombreAlergia() {
		return this.nombreAlergia;
	}

	public void setNombreAlergia(String nombreAlergia) {
		this.nombreAlergia = nombreAlergia;
	}

	public String getRinyones() {
		return this.rinyones;
	}

	public void setRinyones(String rinyones) {
		this.rinyones = rinyones;
	}

}