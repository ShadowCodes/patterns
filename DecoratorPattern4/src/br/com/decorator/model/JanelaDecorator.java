package br.com.decorator.model;

public class JanelaDecorator extends Janela {
	protected Janela janela;

	public JanelaDecorator(Janela janela) {
		this.janela = janela;
	}
	
}
