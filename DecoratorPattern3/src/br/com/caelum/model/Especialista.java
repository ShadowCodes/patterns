package br.com.caelum.model;

public class Especialista extends Cargo {

	public Especialista() {
		nome = "Especialista";
	}
	
	public double calculaSalario() {
		return salario + 2500;
	}

}
