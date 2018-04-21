package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Cliente;

public class GuardandoPrimerObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Maria ");
		cliente.setEdad(40);
		cliente.setProfesion("Estudiante");
		cliente.setSexo("M");
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente guardado!");
		//em.close();
	}

}
