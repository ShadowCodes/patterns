package com.model;

import com.view.MaquinaDeRefrigerante;

public abstract class Slot {
	protected double valor;
	protected Slot next;
	public static double acumulador = 0;
	
	public void setNext(Slot slot) {
		this.next = slot;
	}
	
	
	public void verificaMaquinaDinheiro(Refrigerante refrigerante) throws Exception {
		
		while (acumulador < refrigerante.getValor()) { //Enquanto acumulador for menor do que máquina de refrigerante
			double value = MaquinaDeRefrigerante.maquinaInterface();
			acumulador = acumulador + value;
			verificaDinheiroProduto(refrigerante, value); //Ele vai verificar o dinheiro e o produto
		}
		
	}
	
	
	public abstract void verificaDinheiroProduto(Refrigerante refrigerante, double valor) throws Exception;
}
