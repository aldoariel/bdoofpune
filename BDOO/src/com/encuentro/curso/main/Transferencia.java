package com.encuentro.curso.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.poli.bd.modelo.Cuenta;



public class Transferencia {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("etcPU");
		EntityManager em = emf.createEntityManager();

		Scanner entrada = new Scanner(System.in);
		Cuenta cuenta1 = em.find(Cuenta.class, 1L);
		if (cuenta1 == null) {
			System.out.print("Indique  saldo inicial de la  cuenta 1: ");
			Double saldoInicialCuenta1 = entrada.nextDouble();
			cuenta1 = new Cuenta();
			cuenta1.setSaldo(saldoInicialCuenta1);
		}
		
		
		Cuenta cuenta2 = em.find(Cuenta.class, 2L);
		if (cuenta2 == null) {
			System.out.print("Indique  saldo inicial de la cuenta 2: ");
			Double saldoInicialCuenta2 = entrada.nextDouble();
			cuenta2 = new Cuenta();
			cuenta2.setSaldo(saldoInicialCuenta2);
		}
		
		em.getTransaction().begin();
		em.persist(cuenta1);
		em.persist(cuenta2);
		em.getTransaction().commit();
		System.out.println("Saldo de la  cuenta 1: " + cuenta1.getSaldo() 
				+ ". Saldo cuenta2: " + cuenta2.getSaldo());
		
		System.out.println("---------------------");
		System.out.print("indique el valor a retirar de la  cuenta 1 y depositar en cuenta 2: ");
		Double valorTransferencia = entrada.nextDouble();
		
		em.getTransaction().begin();
		cuenta1.setSaldo(cuenta1.getSaldo() - valorTransferencia);
		cuenta2.setSaldo(cuenta2.getSaldo() + valorTransferencia);
		
		
		
		if (cuenta1.getSaldo() > 0) {
			em.getTransaction().commit();
			System.out.println("Se realizo transferencia!");
		} else {
			em.getTransaction().rollback();
			System.err.println("transferencia no realizada, saldo insuficiente!");
		}
	}

}
