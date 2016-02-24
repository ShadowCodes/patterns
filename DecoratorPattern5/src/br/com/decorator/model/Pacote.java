package br.com.decorator.model;

public abstract class Pacote {
	private String descricao;
	private double preco;
	
		
	public Pacote(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public double getPreco() {
		return preco;
	}
	
	
}
