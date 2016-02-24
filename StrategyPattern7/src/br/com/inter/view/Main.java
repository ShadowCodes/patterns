package br.com.inter.view;

import br.com.inter.model.Brinquedo;
import br.com.inter.model.DVD;
import br.com.inter.model.Liquidacao;
import br.com.inter.model.Produto;
import br.com.inter.model.Promocao;
import br.com.inter.model.Regular;
import br.com.inter.model.SemPromocao;

public class Main {
	public static void main(String[] args) {
		Produto produto1 = new DVD("Home Teather", 1500);
		Produto produto2 = new Brinquedo("Cloth Myth", 325);
		
		Promocao promocao1 = new Liquidacao();
		Promocao promocao2 = new Regular(0.95);
		Promocao promocao3 = new SemPromocao();
		
		produto1.setPromocao(promocao1);
		System.out.println(produto1.calculaPreco());
		
		produto2.setPromocao(promocao3);
		System.out.println(produto2.calculaPreco());
	}
}
