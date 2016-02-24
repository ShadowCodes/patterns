package br.com.caelum.model;

public abstract class Cargo {
	protected String nome;
	protected double salario;
	
	public Cargo() {
		salario = 1000;
	}

	public String getNome() {
		return nome;
	}

	
	public abstract double calculaSalario();
}
