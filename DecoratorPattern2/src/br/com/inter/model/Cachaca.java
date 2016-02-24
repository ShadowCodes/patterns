package br.com.inter.model;

public class Cachaca implements Coquetel {
	private String nome;
	private double preco;
	
	public Cachaca() {
		nome = "Cachaça 51";
		preco = 2.0;
	}

	public String getNome() {
		return nome;
	}


	public double getPreco() {
		return preco;
	}

}
