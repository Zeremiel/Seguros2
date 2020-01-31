package com.empresa.seguros2.persistencia.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.empresa.seguros2.modelo.Asistencia;
import com.empresa.seguros2.persistencia.AsistenciaDAO;
import com.empresa.seguros2.persistencia.Utilidades;

public class AsistenciaDAOImplJpa extends GenericDAOImplJpa<Asistencia,Integer> implements  AsistenciaDAO {
	
	public BigDecimal sumaPrecios() 
	{
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		BigDecimal b =  (BigDecimal) em.createQuery(
				"select sum(A.importe) " +
				"from Asistencia A ")
				.getSingleResult();
		return b;
	}
	
	public List<Asistencia> EntrePrecios(BigDecimal menor, BigDecimal mayor) 
	{
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		@SuppressWarnings("unchecked")
		List<Asistencia> lista =  (List<Asistencia>) em.createQuery(
				"select A " +
				"from Asistencia A "+
				" where A.importe >= :menor and A.importe <=:mayor")
				.setParameter("menor", menor)
				.setParameter("mayor", mayor)
				.getResultList();
		return lista;
	}
	
	
	
	public List<Asistencia> Superior(BigDecimal importe)
	{
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		@SuppressWarnings("unchecked")
		List<Asistencia> Lista = (List<Asistencia>)em.createQuery(
				"select A " +
				"from Asistencia A "+
				"where A.importe >= 1000")
				.getResultList();
			return Lista;		
	}
	public double mediaPrecios() 
	{
		EntityManager em = Utilidades.getEntityManagerFactory().createEntityManager();
		double b =  (double) em.createQuery(
				"select avg(A.importe) " +
				"from Asistencia A ")
				.getSingleResult();
		return b;
	}
}