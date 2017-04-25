package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Persona;;

public class ConsultandoObjetoHerencia {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemploPU");
		EntityManager em = emf.createEntityManager();
		
		Persona chofer = em.find(Persona.class, 3L);
		
		if (chofer != null) {
			System.out.println("Nombre: " + chofer
					.getNombre());
			//System.out.println("Edad: " + cliente.getEdad());
			//System.out.println("Profesion: " + cliente.getProfesion());
			//System.out.println("Sexo: " + cliente.getSexo());
		} else {
			System.out.println("Cliente no encontrado.");
		}
	}
	
	

}
