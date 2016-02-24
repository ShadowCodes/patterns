package br.com.caelum.model;

public class Vereador extends Incorporacao {

	public Vereador(Cargo cargo) {
		super(cargo);
		nome = "Vereador";
		salario = 5000;
	}
	
	public String getNome() {
		return cargo.getNome() + " incorporou o Vereador";
	}
	
}
