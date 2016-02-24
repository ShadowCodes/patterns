package br.com.decorator.model;

public class DecoradorMoldura extends JanelaDecorator {

	public DecoradorMoldura(Janela janela) {
		super(janela);
	}
	
	public String desenha() {
		return janela.desenha() + "" + molduraJanela();
	}

	private String molduraJanela() {
		// TODO Auto-generated method stub
		return " e moldurando essa janela. . .";
	}

}
