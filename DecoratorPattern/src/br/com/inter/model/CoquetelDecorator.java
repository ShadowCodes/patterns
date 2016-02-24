package br.com.inter.model;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel coquetel) {
		this.coquetel = coquetel;
	}
	
	public String getNome() {
		System.out.println(super.nome);
		System.out.println(this.nome);
		return coquetel.getNome()  + " + " + this.nome; //O nome do coquetel ainda � cacha�a, e o nome que est� dentro da classe � Refrigerante
	}
	
	public double getPreco() {
        return coquetel.getPreco() + preco;
    }
}
