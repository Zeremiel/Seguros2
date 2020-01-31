package com.empresa.seguros2.persistencia;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.empresa.seguros2.modelo.Asistencia;

@SuppressWarnings("unused")
public interface AsistenciaDAO extends GenericDAO<Asistencia,Integer> 
{
	
	public static List<Asistencia> mostrarSuperiorImporte(BigDecimal importe) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
    public List<Asistencia> Importe(BigDecimal menor,BigDecimal mayor);
	
	public BigDecimal mostrarSumaImportes();
	
	public double mostrarMediaImportes();
	
}