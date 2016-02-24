package com.observer.model;

public class TempoC implements Observer {


	public void update(Clima clima) {
		if (clima.getTemperatura() < 11) {
			System.out.println("O frio está intenso!");
		}
	}
	
}
