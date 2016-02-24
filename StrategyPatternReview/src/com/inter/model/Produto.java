package com.inter.model;

public abstract class Produto {
	private String nome;
	private double preco;
	protected Promocao promocao;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}
	
	public double calcPreco() {
		double newValue = preco * promocao.desconta();
		return preco - newValue;
	}
}
