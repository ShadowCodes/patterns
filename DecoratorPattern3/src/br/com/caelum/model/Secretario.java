package br.com.caelum.model;

public class Secretario extends Incorporacao {

	public Secretario(Cargo cargo) {
		super(cargo);
		nome = "Secret�rio";
		salario = 2000;
	}
	
	public String getNome() {
		return cargo.getNome() + " incorporou o Secret�rio";
	}

}
