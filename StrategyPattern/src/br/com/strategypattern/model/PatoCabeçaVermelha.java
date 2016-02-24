package br.com.strategypattern.model;

public class PatoCabeçaVermelha extends Pato {

	public PatoCabeçaVermelha() {
		this.modoDeGrasno = new Squeak();
		this.modoDeVoo = new NaoVoa();
	}
	public void exibeNaTela() {
		System.out.println("Pato de cabeça vermelha!");
	}
	
}
