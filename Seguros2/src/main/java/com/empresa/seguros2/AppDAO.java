package com.empresa.seguros2;

import javax.persistence.EntityManager;

import com.empresa.seguros2.persistencia.Utilidades;

public class AppDAO 
{
	public static void main(String[] args) 
	{
EntityManager em = null; 
		//Al menos esta parte tengo claro como funciona, creo
		try 
		{
			em = Utilidades.getEntityManagerFactory().createEntityManager();					
			SeguroController seguroController = new SeguroController();		
			seguroController.ej9();			
			AsistenciaController asistenciaController = new AsistenciaController();		
		}
		catch (Exception e )
		{
		if (em != null) {
			e.printStackTrace();
			System.out.println("Se va a hacer rollback de la transacción");
			em.getTransaction().rollback();
		}
	} 
		finally
		{
		if (em != null) 
		{
			em.close();
		}
	}
	Utilidades.closeEntityManagerFactory();
}
}


