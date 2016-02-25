package com.model;

public class SlotD extends Slot {
	
	public SlotD() {
		valor = 0.5;
	}
	
	public void verificaDinheiroProduto(Refrigerante refrigerante, double valor) throws Exception {
		if (valor == this.valor) {
			if (acumulador > refrigerante.getValor()) {
				refrigerante.setValor(acumulador - refrigerante.getValor());
				System.out.println("Troco: R$" + refrigerante.getValor());
			}
		} else {
			throw new Exception("Slot não encontrado!");
		}
	}
}
