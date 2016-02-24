package com.observer.model;

public class TempoA implements Observer {


	public void update(Clima clima) {
		if ((clima.getTemperatura() < 19) && (clima.getTemperatura() >= 17)) {
			System.out.println("Est� mediano, com um pouco de calor");
		}
	}

}
