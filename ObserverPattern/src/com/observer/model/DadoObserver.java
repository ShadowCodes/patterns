package com.observer.model;

public abstract class DadoObserver {
	protected DadoSubject dado;
	
	public DadoObserver(DadoSubject dado) {
		this.dado = dado;
	}
	
	public abstract void update();
}
