package br.com.caelum.view;

import br.com.caelum.model.Auxiliar;
import br.com.caelum.model.Cargo;
import br.com.caelum.model.Prefeito;
import br.com.caelum.model.Secretario;
import br.com.caelum.model.Vereador;

public class Main {
	public static void main(String[] args) {
		Cargo auxiliar = new Auxiliar();
		System.out.println(auxiliar.getNome() + " Salário: " + auxiliar.calculaSalario());
		
		auxiliar = new Vereador(auxiliar);
		System.out.println(auxiliar.getNome() + " Salário: " + auxiliar.calculaSalario());
		
		auxiliar = new Secretario(auxiliar);
		System.out.println(auxiliar.getNome() + " Salário: " + auxiliar.calculaSalario());
		
		auxiliar = new Prefeito(auxiliar);
		System.out.println(auxiliar.getNome() + " Salário: " + auxiliar.calculaSalario());
		
	}
}
