package com.observer.model;

public class TabelaObserver extends DadoObserver {

	public TabelaObserver(DadoSubject dado) {
		super(dado);
	}


	public void update() {
		System.out.println("Tabela:\nValor A: " + dado.getState().valorA
                + "\nValor B: " + dado.getState().valorB + "\nValor C: "
                + dado.getState().valorC);
	}
	
}
