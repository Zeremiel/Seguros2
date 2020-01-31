package com.empresa.seguros2;


import com.empresa.seguros2.persistencia.dao.impl.CoberturaDAOImplJpa;
import com.empresa.seguros2.modelo.Cobertura;

import com.empresa.seguros2.persistencia.CoberturaDAO;
public class CoberturaController 
{	
	CoberturaDAO coberturaDAO;
	public CoberturaController()
	{
		coberturaDAO = new CoberturaDAOImplJpa();
	}
	
	public void guardar(Cobertura cobertura)
	{
		coberturaDAO.persist(cobertura);
	}
	
}
