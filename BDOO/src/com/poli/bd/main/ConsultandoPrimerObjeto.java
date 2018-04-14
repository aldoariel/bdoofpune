package com.poli.bd.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Cliente;

public class ConsultandoPrimerObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 3L);
		
		if (cliente != null) {
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Edad: " + cliente.getEdad());
			System.out.println("Profesion: " + cliente.getProfesion());
			System.out.println("Sexo: " + cliente.getSexo());
		} else {
			System.out.println("Cliente no encontrado.");
		}
	}
	
	

}
