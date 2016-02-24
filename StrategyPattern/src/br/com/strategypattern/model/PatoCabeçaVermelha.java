package br.com.strategypattern.model;

public class PatoCabe�aVermelha extends Pato {

	public PatoCabe�aVermelha() {
		this.modoDeGrasno = new Squeak();
		this.modoDeVoo = new NaoVoa();
	}
	public void exibeNaTela() {
		System.out.println("Pato de cabe�a vermelha!");
	}
	
}
