package br.com.inter.view;

import br.com.inter.model.Cachaca;
import br.com.inter.model.Coquetel;
import br.com.inter.model.Refrigerante;

public class Main {
	public static void main(String[] args) {
		Coquetel coquetel = new Cachaca();
		System.out.println(coquetel.getNome() + " = R$" + coquetel.getPreco());
		
		coquetel = new Refrigerante(coquetel);
		System.out.println(coquetel.getNome() + " = R$" + coquetel.getPreco());
	}
}
