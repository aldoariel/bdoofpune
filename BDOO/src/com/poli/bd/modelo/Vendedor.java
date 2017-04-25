package com.poli.bd.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("VENDEDOR")
public class Vendedor extends Persona {

	private String numeroRuc;

	public String getNumeroRuc() {
		return numeroRuc;
	}
	public void setNumeroRuc(String numeroRuc) {
		this.numeroRuc = numeroRuc;
	}
	
}
