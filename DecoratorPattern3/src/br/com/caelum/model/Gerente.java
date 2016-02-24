package br.com.caelum.model;

public class Gerente extends Cargo {

	public Gerente() {
		nome = "Gerente";
	}

	public double calculaSalario() {
		return salario + 3000;
	}

}
