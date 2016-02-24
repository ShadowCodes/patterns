package br.com.decorator.view;

import br.com.decorator.model.Pacote;
import br.com.decorator.model.PacotePraia;
import br.com.decorator.model.ServicoBebidas;
import br.com.decorator.model.ServicoMassagem;

public class Main {
	public static void main(String[] args) {
		Pacote pacote1 = new PacotePraia("Pacote de Praia Luxo", 5000);
		System.out.println(pacote1.getDescricao() + " -  Preço: R$" + pacote1.getPreco());
		pacote1 = new ServicoBebidas(pacote1, "Pacote de Bebidas Extra", 450.75);
		System.out.println(pacote1.getDescricao() + " -  Preço: R$" + pacote1.getPreco());
		pacote1 = new ServicoMassagem(pacote1, "Pacote de Massagem", 335);
		System.out.println(pacote1.getDescricao() + " -  Preço: R$" + pacote1.getPreco());
	}
}
