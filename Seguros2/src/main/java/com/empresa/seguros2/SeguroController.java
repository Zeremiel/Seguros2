package com.empresa.seguros2;


import com.empresa.seguros2.persistencia.SeguroDAO;
import com.empresa.seguros2.persistencia.dao.impl.SeguroDAOImplJpa;
import java.util.List;

import com.empresa.seguros2.modelo.Seguro;
public class SeguroController 
{

		SeguroDAO seguroDAO;
		
		public SeguroController()
		{
			seguroDAO = new SeguroDAOImplJpa();
		}
		public void guardar(Seguro seguro)
		{
			seguroDAO.persist(seguro);
		}
		
		public void ej1()
		{
			List<Seguro> seguros = seguroDAO.findAll();
			for(Seguro s: seguros)
			{
				System.out.println("seguros: " + s.toString());
			}
		}
		public void ej2()
		{
			List<Object[]> seguros = seguroDAO.NombreNif();
				for (Object[] s: seguros)
				{
					System.out.println("NIF: " + s[0]+ ", Nombre: " + s[1]);
				}
		}
		
		public void ej3(String nombre,String apellido1,String apellido2) 
		{
	    	Seguro s = seguroDAO.Nombre(nombre, apellido1, apellido2);
	    	System.out.println(s);
		}
		public void ej8() 
		{
	    	Long i = seguroDAO.NumSeguros();
	    	System.out.println("Nº: " +i);
			
	    }
		public void ej9()
		{
	    	List<Object[]> lista= seguroDAO.NombreNifAsis();
	    	for(Object[] o : lista)
	    	{
	    		System.out.println("Nombre: " + o[0]);
	    		System.out.println("Nif: " + o[1]);
	    		System.out.println("Asistencias: " + o[2]);
	    		System.out.println();

	    	}
	    }

	}

