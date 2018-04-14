package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Chofer;

public class GuardandoHerencia {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();
		
		Chofer chofer = new Chofer();
		chofer.setNombre("Juan Perez");
		chofer.setCi("1504");
		chofer.setNumeroRegistro("2500");
		//chofer.setFechaNacimiento("1990-12-02");
		
		
		em.getTransaction().begin();
		em.persist(chofer);
		em.getTransaction().commit();
		
		System.out.println("Chofer guardado!");
		//em.close();
	}

}
