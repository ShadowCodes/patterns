package br.com.caelum.model;

public class Prefeito extends Incorporacao {

	public Prefeito(Cargo cargo) {
		super(cargo);
		nome = "Prefeito";
		salario = 4000;
	}
	
	public String getNome() {
		return cargo.getNome() + " incorporou o Prefeito";
	}
	
}
