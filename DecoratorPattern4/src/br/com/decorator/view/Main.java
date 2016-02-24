package br.com.decorator.view;

import br.com.decorator.model.DecoradorCor;
import br.com.decorator.model.DecoradorMoldura;
import br.com.decorator.model.Janela;
import br.com.decorator.model.JanelaApartamento;

public class Main {
	public static void main(String[] args) {
		Janela janela = new JanelaApartamento();
		System.out.println(janela.desenha());
		janela = new DecoradorCor(janela, "Vermelha");
		System.out.println(janela.desenha());
		janela = new DecoradorMoldura(janela);
		System.out.println(janela.desenha());
	}
}
