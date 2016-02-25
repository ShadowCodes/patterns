package com.model;

public class SlotA extends Slot{

	public SlotA() {
		valor = 5.0;
	}
	
	public void verificaDinheiroProduto(Refrigerante refrigerante, double valor) throws Exception {
		if (valor == this.valor) {
			if (acumulador > refrigerante.getValor()) {
				refrigerante.setValor(acumulador - refrigerante.getValor());
				System.out.println("Troco: R$" + refrigerante.getValor());
			}	
		} else {
			this.next.verificaDinheiroProduto(refrigerante, valor);
		}
		
	}
	
}
