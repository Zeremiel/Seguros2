package com.empresa.seguros2;

import com.empresa.seguros2.modelo.Enfermedad;
import com.empresa.seguros2.persistencia.EnfermedadDAO;
import com.empresa.seguros2.persistencia.dao.impl.EnfermedadDAOImplJpa;

public class EnfermedadController
{
		EnfermedadDAO enfermedadDAO;
		
		public EnfermedadController()
		{
			enfermedadDAO = new EnfermedadDAOImplJpa();
		}
		
		public void guardar(Enfermedad enfermedad)
		{
			enfermedadDAO.persist(enfermedad);
		}
}

