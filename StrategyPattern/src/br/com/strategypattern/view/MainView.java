package br.com.strategypattern.view;

import br.com.strategypattern.model.Pato;
import br.com.strategypattern.model.PatoCabe�aVermelha;
import br.com.strategypattern.model.PatoDeBorracha;

public class MainView {
	public static void main(String[] args) {
		Pato pato = new PatoCabe�aVermelha();
		pato.voa();
		pato.grasna();
	}
}
