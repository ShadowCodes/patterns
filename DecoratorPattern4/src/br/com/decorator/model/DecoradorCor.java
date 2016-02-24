package br.com.decorator.model;

public class DecoradorCor extends JanelaDecorator {
	private String janelaCor;
	
	public DecoradorCor(Janela janela, String janelaCor) {
		super(janela);
		this.janelaCor = janelaCor;
	}
	
	public String desenha() {
		return janela.desenha() + " de cor: " + janelaCor;
	}
	
	
	
}
