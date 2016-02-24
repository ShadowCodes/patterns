package br.com.caelum.model;

public class Incorporacao extends Cargo {
	Cargo cargo;
	
	public Incorporacao(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double calculaSalario() {
		return cargo.calculaSalario() + salario;
	}

}
