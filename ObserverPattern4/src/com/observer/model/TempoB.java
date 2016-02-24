package com.observer.model;

public class TempoB implements Observer {


	public void update(Clima clima) {
		if ((clima.getTemperatura() < 17)) {
			System.out.println("O frio vem aí!");
		}
	}

}
