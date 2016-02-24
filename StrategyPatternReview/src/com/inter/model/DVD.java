package com.inter.model;

public class DVD extends Produto {

	public DVD(String nome, double preco) {
		super(nome, preco);
		promocao = new Liquidacao();
	}
	
	
	
}
