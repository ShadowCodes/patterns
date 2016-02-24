package br.com.inter.model;

public abstract class Produto {
	protected String nome;
	protected double preco;
	protected Promocao promocao;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}
	
	public double calculaPreco() {
		return promocao.desconta() * preco;
	}
	
	
}
