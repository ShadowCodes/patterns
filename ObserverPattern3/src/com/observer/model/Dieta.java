package com.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Dieta implements Observable {
	private List<Observer> observer;
	private double peso;
	
	public Dieta(double peso) {
		this.observer = new ArrayList<>();
		this.peso = peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
		notifyObservers();
	}
	

	public void attach(Observer observer) {
		this.observer.add(observer);
		
	}

	
	public void detach(Observer observer) {
		this.observer.remove(observer);
		
	}


	public void notifyObservers() {
		for (Observer observer : this.observer) {
			System.out.println("Notificando observers!");
			observer.update(peso);
		}
		
	}

}
