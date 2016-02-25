package com.model;

public class SlotC extends Slot {

	public SlotC() {
		valor = 1.0;
	}
	
	public void verificaDinheiroProduto(Refrigerante refrigerante, double valor) throws Exception {
		if (valor == this.valor) {
			if (acumulador > refrigerante.getValor()) {
				refrigerante.setValor(acumulador - refrigerante.getValor());
				System.out.println("Troco: R$" + refrigerante.getValor());
			}
			
		} else {
			next.verificaDinheiroProduto(refrigerante, valor);
		}
		
	}
	
}
