package com.empresa.seguros2.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobertura database table.
 * 
 */
@Entity
@NamedQuery(name="Cobertura.findAll", query="SELECT c FROM Cobertura c")
public class Cobertura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String dental;

	private String fecundacionInVitro;

	private String oftalmologia;

	public Cobertura() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDental() {
		return this.dental;
	}

	public void setDental(String dental) {
		this.dental = dental;
	}

	public String getFecundacionInVitro() {
		return this.fecundacionInVitro;
	}

	public void setFecundacionInVitro(String fecundacionInVitro) {
		this.fecundacionInVitro = fecundacionInVitro;
	}

	public String getOftalmologia() {
		return this.oftalmologia;
	}

	public void setOftalmologia(String oftalmologia) {
		this.oftalmologia = oftalmologia;
	}

}