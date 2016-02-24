package br.com.strategypattern.view;

import br.com.strategypattern.model.Pato;
import br.com.strategypattern.model.PatoCabeçaVermelha;
import br.com.strategypattern.model.PatoDeBorracha;

public class MainView {
	public static void main(String[] args) {
		Pato pato = new PatoCabeçaVermelha();
		pato.voa();
		pato.grasna();
	}
}
