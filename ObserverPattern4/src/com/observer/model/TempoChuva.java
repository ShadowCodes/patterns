package com.observer.model;

public class TempoChuva implements Observer {


	public void update(Clima clima) {
		if (clima.getUmidade() > 50) {
			System.out.println("Chuvas vem aí!");
		}
		
	}

}
