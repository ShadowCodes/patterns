package br.com.caelum.model;

public class Auxiliar extends Cargo {
	
	public Auxiliar() {
		nome = "Auxiliar";
	}

	public double calculaSalario() {
		return salario + 1000;
	}
	
}
