package br.com.decorator.model;

public class ServicoMassagem extends PacoteDecorator {

	public ServicoMassagem(Pacote pacote, String descricao, double preco) {
		super(pacote, descricao, preco);
	}

}
