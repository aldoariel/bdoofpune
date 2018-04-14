package com.poli.bd.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Cliente;

public class ConsultaConJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();
		
		List<Cliente> clientes = em.createQuery("from Cliente where sexo = 'M'", Cliente.class)
									.getResultList();
		System.out.println("----------------------------");
		for (Cliente cliente : clientes) {
			System.out.println("Codigo: " + cliente.getCodigo());
			System.out.println("Nombre: " + cliente.getNombre());
			
			System.out.println("----------------------------");
		}
	}

}
