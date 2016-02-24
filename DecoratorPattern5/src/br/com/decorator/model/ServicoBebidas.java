package br.com.decorator.model;

public class ServicoBebidas extends PacoteDecorator {


	public ServicoBebidas(Pacote pacote, String descricao, double preco) {
		super(pacote, descricao, preco);
	}
	
}
