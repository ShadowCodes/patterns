package br.com.inter.model;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel coquetel) {
		this.coquetel = coquetel;
	}
	
	public String getNome() {
		System.out.println(super.nome);
		System.out.println(this.nome);
		return coquetel.getNome()  + " + " + this.nome; //O nome do coquetel ainda é cachaça, e o nome que está dentro da classe é Refrigerante
	}
	
	public double getPreco() {
        return coquetel.getPreco() + preco;
    }
}
