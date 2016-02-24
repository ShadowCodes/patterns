package br.com.strategypattern.model;

public abstract class Pato {
	ModoDeVoo modoDeVoo;
	ModoDeGrasno modoDeGrasno;
	
	//Constructor
	public Pato() {}
	
	//Methods
	public void grasna() {
		modoDeGrasno.grasna();
	}
	
	public void nada() {
		System.out.println("Nadando. . .");
	}
	
	public void voa() {
		modoDeVoo.voar(); //Delegou o comportamento para outra classe
	}
	
	public abstract void exibeNaTela(); //Tipo mais gen�rico apenas fornece o corpo do m�todo! 
	//Todo mundo que herdar de pato tem que implementar este m�todo
	
}
