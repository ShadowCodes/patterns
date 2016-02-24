package com.observer.model;

public class Balanca implements Observer {

	public void update(double peso) {
		if (peso >= 100) {
			System.out.println("Voc� ultrapassou o peso limite no sistema!");
		}
	}
}

