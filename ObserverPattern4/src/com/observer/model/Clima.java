package com.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Clima implements Observable {
	
	private List<Observer> observer;
	private double temperatura;
	private double umidade;
	private int pressao;

	
	
	public Clima(double temperatura, double umidade) {
		this.observer = new ArrayList<>();
		this.temperatura = temperatura;
		this.umidade = umidade;
	}
	
	//Getters and Setters
	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
		notifyObservers();
	}

	public double getUmidade() {
		return umidade;
	}
	
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}

	
	public void attach(Observer observer) {
		this.observer.add(observer);
	}

	public void detach(Observer observer) {
		this.observer.remove(observer);
		
	}

	public void notifyObservers() {
		for (Observer observer : observer) {
			observer.update(new Clima(temperatura, umidade));
		}
		
		System.out.println("Notificando observers. . .");
		
	}
	
}
