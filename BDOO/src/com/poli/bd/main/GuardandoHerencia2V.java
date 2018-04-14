package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Vendedor;

public class GuardandoHerencia2V {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNombre("Luis Perez");
		vendedor.setCi("1504");
		vendedor.setNumeroRuc("e122");
		//vendedor.setFechaNacimiento("1990-12-02");
		
		
		em.getTransaction().begin();
		em.persist(vendedor);
		em.getTransaction().commit();
		
		System.out.println("Vendedor guardado!");
		//em.close();
	}

}
