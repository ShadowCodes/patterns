package br.com.decorator.model;

public class PacoteDecorator extends Pacote {
	
	protected Pacote pacote;
	String teste;
	

	public PacoteDecorator(Pacote pacote, String descricao, double preco) {
		super(descricao, preco);
		printaParametros(descricao, preco);
		this.pacote = pacote;
	}
	

	
	public String getDescricao() {
		return pacote.getDescricao() + " + " + super.getDescricao(); //Tem de ser super porque não é possível pegar do próprio this, já que o
		//próprio this está sendo modificado
	}
	
	
	public double getPreco() {
		return pacote.getPreco() + super.getPreco();
	}
	
	public void printaParametros(String descricao, double preco) {
		System.out.println(descricao + " = " + preco);
	}
}
