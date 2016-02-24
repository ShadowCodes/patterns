package com.observer.model;

import java.util.ArrayList;
import java.util.List;

public class DadoSubject {
	ArrayList<DadoObserver> observer;
	Dado dado;
	
	public DadoSubject() {
		observer = new ArrayList<DadoObserver>();
	}
	
	public void attach(DadoObserver observer) {
		this.observer.add(observer);
	}
	
	public void detach(int indice) {
		this.observer.remove(indice);
	}
	
	public void setState(Dado dado) {
		this.dado = dado;
	}
	
	public void notifyObserver() {
		for (DadoObserver observer : this.observer) {
			observer.update();
		}
	}
	
	public Dado getState() {
		return dado;
	}
	
	public List getObserverList() {
		return observer;
	}
	
}
