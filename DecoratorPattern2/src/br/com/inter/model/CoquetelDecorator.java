package br.com.inter.model;

public class CoquetelDecorator implements Coquetel {
	Coquetel coquetel;
	protected String nome;
	protected double preco;
	
	public CoquetelDecorator(Coquetel coquetel) {
		this.coquetel = coquetel;
	}
	
	public String getNome() {
		return "Nome do meu Coquetel: " + coquetel.getNome() + " + " + " Ingrediente: " + nome;
	}


	public double getPreco() {
		return coquetel.getPreco() + preco;
	}

}
