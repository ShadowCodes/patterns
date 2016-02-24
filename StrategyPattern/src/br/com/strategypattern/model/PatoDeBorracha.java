package br.com.strategypattern.model;

public class PatoDeBorracha extends Pato {

	public PatoDeBorracha() {
		this.modoDeVoo = new NaoVoa();
		this.modoDeGrasno = new QuackMudo();
	}
	
	public void exibeNaTela() {
		System.out.println("Cabe�a de borracha!");
	}
	
}
