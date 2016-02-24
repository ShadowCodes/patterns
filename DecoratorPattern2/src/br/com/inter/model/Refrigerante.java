package br.com.inter.model;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel coquetel) {
		super(coquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}
