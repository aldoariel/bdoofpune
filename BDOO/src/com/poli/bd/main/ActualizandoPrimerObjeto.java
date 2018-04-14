package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Cliente;

public class ActualizandoPrimerObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 3L);
		em.getTransaction().begin();
		cliente.setNombre("Juan Perez Modfi");
		cliente.setEdad(28);
		em.getTransaction().commit();
		
		System.out.println("Cliente actualizado!");
	}

}
