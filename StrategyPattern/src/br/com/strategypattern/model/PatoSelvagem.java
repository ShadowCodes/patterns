package br.com.strategypattern.model;

public class PatoSelvagem extends Pato {
	
	public PatoSelvagem() {
		this.modoDeGrasno = new Quack();
		this.modoDeVoo = new VoaComAsas();
	}
	
	public void exibeNaTela() {
		System.out.println("Pato do tipo Selvagem!");
	}
}
