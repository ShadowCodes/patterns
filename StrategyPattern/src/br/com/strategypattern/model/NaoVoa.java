package br.com.strategypattern.model;

public class NaoVoa implements ModoDeVoo {

	public void voar() {
		System.out.println("It can't be flying. . . ");
	}

}
